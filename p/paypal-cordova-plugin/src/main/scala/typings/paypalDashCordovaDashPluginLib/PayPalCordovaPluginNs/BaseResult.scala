package typings
package paypalDashCordovaDashPluginLib.PayPalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResult extends js.Object {
  var client: Client
  var response_type: java.lang.String
}

object BaseResult {
  @scala.inline
  def apply(client: Client, response_type: java.lang.String): BaseResult = {
    val __obj = js.Dynamic.literal(client = client, response_type = response_type)
  
    __obj.asInstanceOf[BaseResult]
  }
}

