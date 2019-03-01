package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mjml-react", "utils")
@js.native
object utilsNs extends js.Object {
  trait TextAlignment extends js.Object
  
  def addQueryParams(url: java.lang.String, params: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
  def fixConditionalComment(html: java.lang.String, havingContent: java.lang.String, newCondition: java.lang.String): java.lang.String = js.native
  def getTextAlign(value: java.lang.String): TextAlignment = js.native
  def getTextAlign(value: java.lang.String, fallback: TextAlignment): TextAlignment = js.native
  def namedEntityToHexCode(html: java.lang.String): java.lang.String = js.native
  def toMobileFontSize(sizeWithUnit: java.lang.String): scala.Double = js.native
  def useHttps(): js.UndefOr[java.lang.String] = js.native
  def useHttps(url: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

