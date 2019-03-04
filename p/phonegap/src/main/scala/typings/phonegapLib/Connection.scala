package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var CELL_2G: scala.Double
  var CELL_3G: scala.Double
  var CELL_4G: scala.Double
  var ETHERNET: scala.Double
  var NONE: scala.Double
  var UNKNOWN: scala.Double
  var WIFI: scala.Double
  var `type`: scala.Double
}

object Connection {
  @scala.inline
  def apply(
    CELL_2G: scala.Double,
    CELL_3G: scala.Double,
    CELL_4G: scala.Double,
    ETHERNET: scala.Double,
    NONE: scala.Double,
    UNKNOWN: scala.Double,
    WIFI: scala.Double,
    `type`: scala.Double
  ): Connection = {
    val __obj = js.Dynamic.literal(CELL_2G = CELL_2G, CELL_3G = CELL_3G, CELL_4G = CELL_4G, ETHERNET = ETHERNET, NONE = NONE, UNKNOWN = UNKNOWN, WIFI = WIFI)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Connection]
  }
}

