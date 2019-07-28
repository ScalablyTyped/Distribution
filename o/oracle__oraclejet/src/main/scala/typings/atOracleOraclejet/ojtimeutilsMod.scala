package typings.atOracleOraclejet

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojtimeutils", JSImport.Namespace)
@js.native
object ojtimeutilsMod extends js.Object {
  def getDate(pos: Double, rangeStartTime: String, rangeEndTime: String, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: String, rangeEndTime: Double, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: String, rangeEndTime: Date, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Double, rangeEndTime: String, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Double, rangeEndTime: Double, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Double, rangeEndTime: Date, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Date, rangeEndTime: String, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Date, rangeEndTime: Double, rangeWidth: Double): Double = js.native
  def getDate(pos: Double, rangeStartTime: Date, rangeEndTime: Date, rangeWidth: Double): Double = js.native
  def getLength(
    startTime: Date | String | Double,
    endTime: Date | String | Double,
    rangeStartTime: Date | String | Double,
    rangeEndTime: Date | String | Double,
    rangeWidth: Double
  ): Double = js.native
  def getPosition(
    time: Date | String | Double,
    rangeStartTime: Date | String | Double,
    rangeEndTime: Date | String | Double,
    rangeWidth: Double
  ): Double = js.native
}

