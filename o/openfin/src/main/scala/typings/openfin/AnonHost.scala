package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var isProxy: Boolean
  var port: Double
  var realm: String
  var scheme: String
}

object AnonHost {
  @scala.inline
  def apply(host: String, isProxy: Boolean, port: Double, realm: String, scheme: String): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], isProxy = isProxy.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHost]
  }
}

