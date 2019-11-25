package typings.phonegapDashPluginDashPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplicationServerKey extends js.Object {
  /**
  			 * Your GCM API key if you are using VAPID keys.
  			 */
  var applicationServerKey: js.UndefOr[String] = js.undefined
  /**
  			 * URL for the push server you want to use. Default is 'http://push.api.phonegap.com/v1/push'.
  			 */
  var pushServiceURL: js.UndefOr[String] = js.undefined
}

object Anon_ApplicationServerKey {
  @scala.inline
  def apply(applicationServerKey: String = null, pushServiceURL: String = null): Anon_ApplicationServerKey = {
    val __obj = js.Dynamic.literal()
    if (applicationServerKey != null) __obj.updateDynamic("applicationServerKey")(applicationServerKey.asInstanceOf[js.Any])
    if (pushServiceURL != null) __obj.updateDynamic("pushServiceURL")(pushServiceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApplicationServerKey]
  }
}

