package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommandsEvents extends IEvents {
  
  var OnCustomCommand: js.UndefOr[js.Function1[/* commandID */ Double, Unit]] = js.native
}
object ICommandsEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): ICommandsEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[ICommandsEvents]
  }
  
  @scala.inline
  implicit class ICommandsEventsOps[Self <: ICommandsEvents] (val x: Self) extends AnyVal {
    
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
    def setOnCustomCommand(value: /* commandID */ Double => Unit): Self = this.set("OnCustomCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCustomCommand: Self = this.set("OnCustomCommand", js.undefined)
  }
}
