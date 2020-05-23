package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListInstallationsResponseData extends js.Object {
  var installations: js.Array[Account]
  var total_count: Double
}

object OrgsListInstallationsResponseData {
  @scala.inline
  def apply(installations: js.Array[Account], total_count: Double): OrgsListInstallationsResponseData = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListInstallationsResponseData]
  }
}

