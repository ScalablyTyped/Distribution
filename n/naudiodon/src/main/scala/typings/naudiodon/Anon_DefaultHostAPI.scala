package typings.naudiodon

import typings.naudiodon.naudiodonMod.HostAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultHostAPI extends js.Object {
  var HostAPIs: js.Array[HostAPI]
  var defaultHostAPI: Double
}

object Anon_DefaultHostAPI {
  @scala.inline
  def apply(HostAPIs: js.Array[HostAPI], defaultHostAPI: Double): Anon_DefaultHostAPI = {
    val __obj = js.Dynamic.literal(HostAPIs = HostAPIs.asInstanceOf[js.Any], defaultHostAPI = defaultHostAPI.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultHostAPI]
  }
}

