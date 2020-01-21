package typings.naudiodon

import typings.naudiodon.mod.HostAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultHostAPI extends js.Object {
  var HostAPIs: js.Array[HostAPI]
  var defaultHostAPI: Double
}

object AnonDefaultHostAPI {
  @scala.inline
  def apply(HostAPIs: js.Array[HostAPI], defaultHostAPI: Double): AnonDefaultHostAPI = {
    val __obj = js.Dynamic.literal(HostAPIs = HostAPIs.asInstanceOf[js.Any], defaultHostAPI = defaultHostAPI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultHostAPI]
  }
}

