package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.abbreviated
import typings.atOracleOraclejet.atOracleOraclejetStrings.narrow
import typings.atOracleOraclejet.atOracleOraclejetStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojlocaledata", JSImport.Namespace)
@js.native
object ojlocaledataMod extends js.Object {
  def getDayNames(): js.Array[String] = js.native
  @JSName("getDayNames")
  def getDayNames_abbreviated(`type`: abbreviated): js.Array[String] = js.native
  @JSName("getDayNames")
  def getDayNames_narrow(`type`: narrow): js.Array[String] = js.native
  @JSName("getDayNames")
  def getDayNames_wide(`type`: wide): js.Array[String] = js.native
  def getFirstDayOfWeek(): Double = js.native
  def getMonthNames(): js.Array[String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_abbreviated(`type`: abbreviated): js.Array[String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_narrow(`type`: narrow): js.Array[String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_wide(`type`: wide): js.Array[String] = js.native
  def getWeekendEnd(): Double = js.native
  def getWeekendStart(): Double = js.native
  def isMonthPriorToYear(): Boolean = js.native
  def setBundle(bundle: js.Object): Unit = js.native
}

