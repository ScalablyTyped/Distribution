package typings
package momentDashTimezoneLib.momentDashTimezoneMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MomentZone extends js.Object {
  var abbrs: js.Array[java.lang.String]
  var name: java.lang.String
  var offsets: js.Array[scala.Double]
  var population: scala.Double
  var untils: js.Array[scala.Double]
  def abbr(timestamp: scala.Double): java.lang.String
  def offset(timestamp: scala.Double): scala.Double
  def parse(timestamp: scala.Double): scala.Double
  def utcOffset(timestamp: scala.Double): scala.Double
}

