package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojlocaledata", JSImport.Namespace)
@js.native
object ojlocaledataMod extends js.Object {
  def getDayNames(): js.Array[java.lang.String] = js.native
  @JSName("getDayNames")
  def getDayNames_abbreviated(`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.abbreviated): js.Array[java.lang.String] = js.native
  @JSName("getDayNames")
  def getDayNames_narrow(`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.narrow): js.Array[java.lang.String] = js.native
  @JSName("getDayNames")
  def getDayNames_wide(`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.wide): js.Array[java.lang.String] = js.native
  def getFirstDayOfWeek(): scala.Double = js.native
  def getMonthNames(): js.Array[java.lang.String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_abbreviated(`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.abbreviated): js.Array[java.lang.String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_narrow(`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.narrow): js.Array[java.lang.String] = js.native
  @JSName("getMonthNames")
  def getMonthNames_wide(`type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.wide): js.Array[java.lang.String] = js.native
  def getWeekendEnd(): scala.Double = js.native
  def getWeekendStart(): scala.Double = js.native
  def isMonthPriorToYear(): scala.Boolean = js.native
  def setBundle(bundle: js.Object): scala.Unit = js.native
}

