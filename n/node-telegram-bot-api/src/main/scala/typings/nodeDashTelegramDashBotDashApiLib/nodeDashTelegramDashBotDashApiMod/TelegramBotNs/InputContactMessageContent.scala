package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ trait InputContactMessageContent extends js.Object {
  var first_name: java.lang.String
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  var phone_number: java.lang.String
}

object InputContactMessageContent {
  @scala.inline
  def apply(first_name: java.lang.String, phone_number: java.lang.String, last_name: java.lang.String = null): InputContactMessageContent = {
    val __obj = js.Dynamic.literal(first_name = first_name, phone_number = phone_number)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    __obj.asInstanceOf[InputContactMessageContent]
  }
}

