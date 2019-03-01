package typings
package parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextToken extends js.Object {
  /**
    * Text content source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[parse5Lib.parse5Mod.Location] = js.undefined
  /**
    * Text content.
    */
  var text: java.lang.String
}

object TextToken {
  @scala.inline
  def apply(text: java.lang.String, sourceCodeLocation: parse5Lib.parse5Mod.Location = null): TextToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[TextToken]
  }
}

