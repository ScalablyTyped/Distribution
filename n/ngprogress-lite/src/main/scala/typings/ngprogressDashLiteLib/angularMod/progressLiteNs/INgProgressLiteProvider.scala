package typings
package ngprogressDashLiteLib.angularMod.progressLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgProgressLiteProvider extends js.Object {
  var settings: IConfigurationOptions
}

object INgProgressLiteProvider {
  @scala.inline
  def apply(settings: IConfigurationOptions): INgProgressLiteProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[INgProgressLiteProvider]
  }
}

