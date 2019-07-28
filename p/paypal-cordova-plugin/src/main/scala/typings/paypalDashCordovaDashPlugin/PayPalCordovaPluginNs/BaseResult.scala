package typings.paypalDashCordovaDashPlugin.PayPalCordovaPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResult extends js.Object {
  var client: Client
  var response_type: String
}

object BaseResult {
  @scala.inline
  def apply(client: Client, response_type: String): BaseResult = {
    val __obj = js.Dynamic.literal(client = client, response_type = response_type)
  
    __obj.asInstanceOf[BaseResult]
  }
}

