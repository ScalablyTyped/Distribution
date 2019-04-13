package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpOptions extends js.Object {
  /**
    * Used to determine if a CIDR is allowed or not. Valid values: optional, required, forbidden
    */
  var cidr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * One or more IP address versions to validate against. Valid values: ipv4, ipv6, ipvfuture
    */
  var version: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object IpOptions {
  @scala.inline
  def apply(cidr: java.lang.String = null, version: java.lang.String | js.Array[java.lang.String] = null): IpOptions = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpOptions]
  }
}

