package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojconfig", JSImport.Namespace)
@js.native
object ojconfigMod extends js.Object {
  def getAutomationMode(): java.lang.String = js.native
  def getDeviceType(): atOracleOraclejetLib.atOracleOraclejetLibStrings.phone | atOracleOraclejetLib.atOracleOraclejetLibStrings.tablet | atOracleOraclejetLib.atOracleOraclejetLibStrings.others = js.native
  def getLocale(): java.lang.String = js.native
  def getResourceUrl(relativePath: java.lang.String): java.lang.String = js.native
  def getVersionInfo(): java.lang.String = js.native
  def logVersionInfo(): js.UndefOr[scala.Nothing] = js.native
  def setAutomationMode(mode: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def setLocale(locale: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def setLocale(locale: java.lang.String, callback: js.Function0[scala.Unit]): js.UndefOr[scala.Nothing] = js.native
  def setResourceBaseUrl(baseUrl: java.lang.String): js.UndefOr[scala.Nothing] = js.native
}

