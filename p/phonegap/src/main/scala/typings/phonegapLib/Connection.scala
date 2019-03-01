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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("CELL_2G")(CELL_2G)
    __obj.updateDynamic("CELL_3G")(CELL_3G)
    __obj.updateDynamic("CELL_4G")(CELL_4G)
    __obj.updateDynamic("ETHERNET")(ETHERNET)
    __obj.updateDynamic("NONE")(NONE)
    __obj.updateDynamic("UNKNOWN")(UNKNOWN)
    __obj.updateDynamic("WIFI")(WIFI)
    __obj.asInstanceOf[Connection]
  }
}

