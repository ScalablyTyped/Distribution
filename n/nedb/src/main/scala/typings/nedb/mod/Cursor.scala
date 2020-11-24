package typings.nedb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cursor[T] extends js.Object {
  
  def exec(callback: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit]): Unit = js.native
  
  def limit(n: Double): Cursor[T] = js.native
  
  def projection(query: js.Any): Cursor[T] = js.native
  
  def skip(n: Double): Cursor[T] = js.native
  
  def sort(query: js.Any): Cursor[T] = js.native
}
object Cursor {
  
  @scala.inline
  def apply[T](
    exec: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit] => Unit,
    limit: Double => Cursor[T],
    projection: js.Any => Cursor[T],
    skip: Double => Cursor[T],
    sort: js.Any => Cursor[T]
  ): Cursor[T] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), limit = js.Any.fromFunction1(limit), projection = js.Any.fromFunction1(projection), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[Cursor[T]]
  }
  
  @scala.inline
  implicit class CursorOps[Self <: Cursor[_], T] (val x: Self with Cursor[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExec(value: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit] => Unit): Self = this.set("exec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLimit(value: Double => Cursor[T]): Self = this.set("limit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProjection(value: js.Any => Cursor[T]): Self = this.set("projection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: Double => Cursor[T]): Self = this.set("skip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: js.Any => Cursor[T]): Self = this.set("sort", js.Any.fromFunction1(value))
  }
}
