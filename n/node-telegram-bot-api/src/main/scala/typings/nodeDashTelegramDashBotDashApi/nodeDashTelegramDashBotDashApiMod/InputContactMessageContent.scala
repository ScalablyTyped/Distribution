package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ trait InputContactMessageContent extends js.Object {
  var first_name: String
  var last_name: js.UndefOr[String] = js.undefined
  var phone_number: String
}

object InputContactMessageContent {
  @scala.inline
  def apply(first_name: String, phone_number: String, last_name: String = null): InputContactMessageContent = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContactMessageContent]
  }
}

