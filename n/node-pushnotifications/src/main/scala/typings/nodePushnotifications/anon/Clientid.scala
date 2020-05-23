package typings.nodePushnotifications.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clientid extends js.Object {
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
}

object Clientid {
  @scala.inline
  def apply(client_id: String = null, client_secret: String = null): Clientid = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientid]
  }
}

