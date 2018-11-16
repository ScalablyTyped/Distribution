package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

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

