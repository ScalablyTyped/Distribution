package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ trait InputLocationMessageContent extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object InputLocationMessageContent {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): InputLocationMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[InputLocationMessageContent]
  }
}

