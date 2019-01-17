package typings
package atOracleOraclejetLib.ojvalidationDashDatetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-datetime", "DateTimeConverter")
@js.native
abstract class DateTimeConverter ()
  extends atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] {
  def calculateWeek(value: java.lang.String): js.UndefOr[scala.Double] = js.native
  def compareISODates(isoStr: java.lang.String, isoStr2: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def format(value: java.lang.String): java.lang.String | scala.Null = js.native
  def getAvailableTimeZones(): js.Array[_] = js.native
  def isDayNameSet(): scala.Boolean = js.native
  def isDaySet(): scala.Boolean = js.native
  def isHourInAMPMSet(): scala.Boolean = js.native
  def isHourInDaySet(): scala.Boolean = js.native
  def isMilliSecondSet(): scala.Boolean = js.native
  def isMinuteSet(): scala.Boolean = js.native
  def isMonthSet(): scala.Boolean = js.native
  def isSecondSet(): scala.Boolean = js.native
  def isYearSet(): scala.Boolean = js.native
  /* CompleteClass */
  override def parse(value: java.lang.String): java.lang.String | scala.Null = js.native
}

