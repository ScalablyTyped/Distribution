package typings.meteor.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserveCallbacks[T] extends js.Object {
  
  var added: js.UndefOr[js.Function1[/* document */ T, Unit]] = js.native
  
  var addedAt: js.UndefOr[
    js.Function3[/* document */ T, /* atIndex */ Double, /* before */ T | Null, Unit]
  ] = js.native
  
  var changed: js.UndefOr[js.Function2[/* newDocument */ T, /* oldDocument */ T, Unit]] = js.native
  
  var changedAt: js.UndefOr[
    js.Function3[/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double, Unit]
  ] = js.native
  
  var movedTo: js.UndefOr[
    js.Function4[
      /* document */ T, 
      /* fromIndex */ Double, 
      /* toIndex */ Double, 
      /* before */ T | Null, 
      Unit
    ]
  ] = js.native
  
  var removed: js.UndefOr[js.Function1[/* oldDocument */ T, Unit]] = js.native
  
  var removedAt: js.UndefOr[js.Function2[/* oldDocument */ T, /* atIndex */ Double, Unit]] = js.native
}
object ObserveCallbacks {
  
  @scala.inline
  def apply[T](): ObserveCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveCallbacks[T]]
  }
  
  @scala.inline
  implicit class ObserveCallbacksOps[Self <: ObserveCallbacks[_], T] (val x: Self with ObserveCallbacks[T]) extends AnyVal {
    
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
    def setAdded(value: /* document */ T => Unit): Self = this.set("added", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    
    @scala.inline
    def setAddedAt(value: (/* document */ T, /* atIndex */ Double, /* before */ T | Null) => Unit): Self = this.set("addedAt", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAddedAt: Self = this.set("addedAt", js.undefined)
    
    @scala.inline
    def setChanged(value: (/* newDocument */ T, /* oldDocument */ T) => Unit): Self = this.set("changed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChanged: Self = this.set("changed", js.undefined)
    
    @scala.inline
    def setChangedAt(value: (/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double) => Unit): Self = this.set("changedAt", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteChangedAt: Self = this.set("changedAt", js.undefined)
    
    @scala.inline
    def setMovedTo(
      value: (/* document */ T, /* fromIndex */ Double, /* toIndex */ Double, /* before */ T | Null) => Unit
    ): Self = this.set("movedTo", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteMovedTo: Self = this.set("movedTo", js.undefined)
    
    @scala.inline
    def setRemoved(value: /* oldDocument */ T => Unit): Self = this.set("removed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
    
    @scala.inline
    def setRemovedAt(value: (/* oldDocument */ T, /* atIndex */ Double) => Unit): Self = this.set("removedAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemovedAt: Self = this.set("removedAt", js.undefined)
  }
}
