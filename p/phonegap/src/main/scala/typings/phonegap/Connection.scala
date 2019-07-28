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
    val __obj = js.Dynamic.literal(CELL_2G = CELL_2G, CELL_3G = CELL_3G, CELL_4G = CELL_4G, ETHERNET = ETHERNET, NONE = NONE, UNKNOWN = UNKNOWN, WIFI = WIFI)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Connection]
  }
}

