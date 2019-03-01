package typings
package maxmindLib.maxmindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- maxmindLib.maxmindMod.Response because Already inherited */ trait IspResponse extends AsnResponse {
  val isp: java.lang.String
  val organization: java.lang.String
}

object IspResponse {
  @scala.inline
  def apply(
    autonomous_system_number: scala.Double,
    autonomous_system_organization: java.lang.String,
    isp: java.lang.String,
    organization: java.lang.String,
    ip_address: java.lang.String = null
  ): IspResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autonomous_system_number")(autonomous_system_number)
    __obj.updateDynamic("autonomous_system_organization")(autonomous_system_organization)
    __obj.updateDynamic("isp")(isp)
    __obj.updateDynamic("organization")(organization)
    if (ip_address != null) __obj.updateDynamic("ip_address")(ip_address)
    __obj.asInstanceOf[IspResponse]
  }
}

