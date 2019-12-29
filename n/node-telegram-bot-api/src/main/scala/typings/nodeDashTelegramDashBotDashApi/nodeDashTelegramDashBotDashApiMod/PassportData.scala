package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassportData extends js.Object {
  var credentials: EncryptedCredentials
  var data: js.Array[EncryptedPassportElement]
}

object PassportData {
  @scala.inline
  def apply(credentials: EncryptedCredentials, data: js.Array[EncryptedPassportElement]): PassportData = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PassportData]
  }
}

