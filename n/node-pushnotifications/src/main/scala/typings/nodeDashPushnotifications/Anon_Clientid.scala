package typings.nodeDashPushnotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientid extends js.Object {
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
}

object Anon_Clientid {
  @scala.inline
  def apply(client_id: String = null, client_secret: String = null): Anon_Clientid = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clientid]
  }
}

