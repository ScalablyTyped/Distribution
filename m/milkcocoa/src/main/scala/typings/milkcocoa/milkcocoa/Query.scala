package typings.milkcocoa.milkcocoa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  def done(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  
  def limit(number: Double): Query = js.native
  
  def skip(index: Double): Query = js.native
  
  // mode  asc, desc
  def sort(mode: String): Query = js.native
}
object Query {
  
  @scala.inline
  def apply(
    done: js.Function1[/* data */ js.Any, Unit] => Unit,
    limit: Double => Query,
    skip: Double => Query,
    sort: String => Query
  ): Query = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), limit = js.Any.fromFunction1(limit), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    
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
    def setDone(value: js.Function1[/* data */ js.Any, Unit] => Unit): Self = this.set("done", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLimit(value: Double => Query): Self = this.set("limit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: Double => Query): Self = this.set("skip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: String => Query): Self = this.set("sort", js.Any.fromFunction1(value))
  }
}
