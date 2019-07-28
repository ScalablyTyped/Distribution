package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ trait InputLocationMessageContent extends js.Object {
  var latitude: Double
  var longitude: Double
}

object InputLocationMessageContent {
  @scala.inline
  def apply(latitude: Double, longitude: Double): InputLocationMessageContent = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[InputLocationMessageContent]
  }
}

