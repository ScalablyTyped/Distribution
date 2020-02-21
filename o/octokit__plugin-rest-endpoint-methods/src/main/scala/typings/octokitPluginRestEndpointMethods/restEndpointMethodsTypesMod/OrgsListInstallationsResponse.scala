package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListInstallationsResponse extends js.Object {
  var installations: js.Array[OrgsListInstallationsResponseInstallationsItem]
  var total_count: Double
}

object OrgsListInstallationsResponse {
  @scala.inline
  def apply(installations: js.Array[OrgsListInstallationsResponseInstallationsItem], total_count: Double): OrgsListInstallationsResponse = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsListInstallationsResponse]
  }
}

