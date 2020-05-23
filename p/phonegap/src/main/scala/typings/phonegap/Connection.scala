package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var CELL_2G: Double
  var CELL_3G: Double
  var CELL_4G: Double
  var ETHERNET: Double
  var NONE: Double
  var UNKNOWN: Double
  var WIFI: Double
  var `type`: Double
}

object Connection {
  @scala.inline
  def apply(
    CELL_2G: Double,
    CELL_3G: Double,
    CELL_4G: Double,
    ETHERNET: Double,
    NONE: Double,
    UNKNOWN: Double,
    WIFI: Double,
    `type`: Double
  ): Connection = {
    val __obj = js.Dynamic.literal(CELL_2G = CELL_2G.asInstanceOf[js.Any], CELL_3G = CELL_3G.asInstanceOf[js.Any], CELL_4G = CELL_4G.asInstanceOf[js.Any], ETHERNET = ETHERNET.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], WIFI = WIFI.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
}

