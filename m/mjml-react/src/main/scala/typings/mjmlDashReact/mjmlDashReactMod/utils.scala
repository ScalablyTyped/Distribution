package typings.mjmlDashReact.mjmlDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.mjmlDashReact.mjmlDashReactMod.utils.TextAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mjml-react", "utils")
@js.native
object utils extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.mjmlDashReact.mjmlDashReactStrings.left
    - typings.mjmlDashReact.mjmlDashReactStrings.right
    - typings.mjmlDashReact.mjmlDashReactStrings.center
    - typings.mjmlDashReact.mjmlDashReactStrings.justify
    - typings.mjmlDashReact.mjmlDashReactStrings.inherit
  */
  trait TextAlignment extends js.Object
  
  def addQueryParams(url: String, params: StringDictionary[js.Any]): String = js.native
  def fixConditionalComment(html: String, havingContent: String, newCondition: String): String = js.native
  def getTextAlign(value: String): TextAlignment = js.native
  def getTextAlign(value: String, fallback: TextAlignment): TextAlignment = js.native
  def namedEntityToHexCode(html: String): String = js.native
  def toMobileFontSize(sizeWithUnit: String): Double = js.native
  def useHttps(): js.UndefOr[String] = js.native
  def useHttps(url: String): js.UndefOr[String] = js.native
}

