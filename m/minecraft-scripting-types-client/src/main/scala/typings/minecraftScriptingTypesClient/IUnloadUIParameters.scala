package typings.minecraftScriptingTypesClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to remove a UI screen from the stack of the specific player running the client script. The event data contains the name of the screen to remove as a string. After the event is triggered the screen will be scheduled to be removed from the stack the next time the UI Engine can do so. Only screens defined in a HTML file can be removed using this event.
  */
@js.native
trait IUnloadUIParameters extends js.Object {
  /**
    * The file path to the screen's HTML file
    */
  var path: String = js.native
}

object IUnloadUIParameters {
  @scala.inline
  def apply(path: String): IUnloadUIParameters = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnloadUIParameters]
  }
  @scala.inline
  implicit class IUnloadUIParametersOps[Self <: IUnloadUIParameters] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

