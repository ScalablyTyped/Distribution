package typings.meteor.mongoMod.Mongo

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserveChangesCallbacks[T] extends js.Object {
  
  var added: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.native
  
  var addedBefore: js.UndefOr[
    js.Function3[/* id */ String, /* fields */ Partial[T], /* before */ T | Null, Unit]
  ] = js.native
  
  var changed: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.native
  
  var movedBefore: js.UndefOr[js.Function2[/* id */ String, /* before */ T | Null, Unit]] = js.native
  
  var removed: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
}
object ObserveChangesCallbacks {
  
  @scala.inline
  def apply[T](): ObserveChangesCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveChangesCallbacks[T]]
  }
  
  @scala.inline
  implicit class ObserveChangesCallbacksOps[Self <: ObserveChangesCallbacks[_], T] (val x: Self with ObserveChangesCallbacks[T]) extends AnyVal {
    
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
    def setAdded(value: (/* id */ String, /* fields */ Partial[T]) => Unit): Self = this.set("added", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    
    @scala.inline
    def setAddedBefore(value: (/* id */ String, /* fields */ Partial[T], /* before */ T | Null) => Unit): Self = this.set("addedBefore", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAddedBefore: Self = this.set("addedBefore", js.undefined)
    
    @scala.inline
    def setChanged(value: (/* id */ String, /* fields */ Partial[T]) => Unit): Self = this.set("changed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChanged: Self = this.set("changed", js.undefined)
    
    @scala.inline
    def setMovedBefore(value: (/* id */ String, /* before */ T | Null) => Unit): Self = this.set("movedBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMovedBefore: Self = this.set("movedBefore", js.undefined)
    
    @scala.inline
    def setRemoved(value: /* id */ String => Unit): Self = this.set("removed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
  }
}
