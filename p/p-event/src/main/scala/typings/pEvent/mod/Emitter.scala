package typings.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emitter[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */] extends js.Object {
  
  var addEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  
  var addListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  
  var off: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  
  var on: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  
  var removeEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
  
  var removeListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.native
}
object Emitter {
  
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](): Emitter[EventName, EmittedType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emitter[EventName, EmittedType]]
  }
  
  @scala.inline
  implicit class EmitterOps[Self <: Emitter[_, _], EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */] (val x: Self with (Emitter[EventName, EmittedType])) extends AnyVal {
    
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
    def setAddEventListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddEventListener: Self = this.set("addEventListener", js.undefined)
    
    @scala.inline
    def setAddListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddListener: Self = this.set("addListener", js.undefined)
    
    @scala.inline
    def setOff(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOff: Self = this.set("off", js.undefined)
    
    @scala.inline
    def setOn(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setRemoveEventListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveEventListener: Self = this.set("removeEventListener", js.undefined)
    
    @scala.inline
    def setRemoveListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = this.set("removeListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveListener: Self = this.set("removeListener", js.undefined)
  }
}
