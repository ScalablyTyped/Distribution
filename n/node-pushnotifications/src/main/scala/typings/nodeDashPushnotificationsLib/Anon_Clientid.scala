package typings
package nodeDashPushnotificationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientid extends js.Object {
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var client_secret: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Clientid {
  @scala.inline
  def apply(client_id: java.lang.String = null, client_secret: java.lang.String = null): Anon_Clientid = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    __obj.asInstanceOf[Anon_Clientid]
  }
}

