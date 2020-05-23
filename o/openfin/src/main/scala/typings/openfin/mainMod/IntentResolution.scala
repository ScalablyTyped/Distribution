package typings.openfin.mainMod

import typings.openfin.directoryMod.AppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentResolution extends js.Object {
  /**
    * Any data returned by the target application's intent listener.
    *
    * If the target application registered multiple listeners, this will be the first non-`undefined` value returned
    * by a listener.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The machine-readable name of the app that resolved this intent.
    */
  var source: AppName
  /**
    * For future use. Right now always the string `'1.0.0'`.
    */
  var version: String
}

object IntentResolution {
  @scala.inline
  def apply(source: AppName, version: String, data: js.Any = null): IntentResolution = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentResolution]
  }
}

