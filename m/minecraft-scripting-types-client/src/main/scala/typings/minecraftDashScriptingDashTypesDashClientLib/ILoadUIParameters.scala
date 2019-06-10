package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to show a UI screen to the specific player running the client script. This event will add the UI screen to the top of the UI screen stack. The screen will be shown immediately after the event is triggered. Only screens defined in a HTML file can be shown using this event.
  */
trait ILoadUIParameters extends js.Object {
  /**
    * You can define the following options for the screen by setting their value to true or false:
    */
  var options: js.UndefOr[Anon_Absorbsinput] = js.undefined
  /**
    * The file path to the screen's HTML file
    */
  var path: java.lang.String
}

object ILoadUIParameters {
  @scala.inline
  def apply(path: java.lang.String, options: Anon_Absorbsinput = null): ILoadUIParameters = {
    val __obj = js.Dynamic.literal(path = path)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ILoadUIParameters]
  }
}

