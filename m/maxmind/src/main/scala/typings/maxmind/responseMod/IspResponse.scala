package typings.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.maxmind.responseMod.Response because Already inherited */ trait IspResponse extends AsnResponse {
  val isp: String
  val organization: String
}

object IspResponse {
  @scala.inline
  def apply(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String,
    ip_address: String = null
  ): IspResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[IspResponse]
  }
}

