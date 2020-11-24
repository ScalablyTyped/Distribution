package typings.ow.hasItemsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionLike[T] extends js.Object {
  
  def has(item: T): Boolean = js.native
}
object CollectionLike {
  
  @scala.inline
  def apply[T](has: T => Boolean): CollectionLike[T] = {
    val __obj = js.Dynamic.literal(has = js.Any.fromFunction1(has))
    __obj.asInstanceOf[CollectionLike[T]]
  }
  
  @scala.inline
  implicit class CollectionLikeOps[Self <: CollectionLike[_], T] (val x: Self with CollectionLike[T]) extends AnyVal {
    
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
    def setHas(value: T => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
  }
}
