package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesClient.anon.Absorbsinput
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
  var options: js.UndefOr[Absorbsinput] = js.undefined
  /**
    * The file path to the screen's HTML file
    */
  var path: String
}

object ILoadUIParameters {
  @scala.inline
  def apply(path: String, options: Absorbsinput = null): ILoadUIParameters = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadUIParameters]
  }
}

