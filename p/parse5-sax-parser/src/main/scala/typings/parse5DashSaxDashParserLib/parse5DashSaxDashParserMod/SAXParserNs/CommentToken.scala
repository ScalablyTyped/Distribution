package typings
package parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentToken extends js.Object {
  /**
    * Comment source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[parse5Lib.parse5Mod.Location] = js.undefined
  /**
    * Comment text.
    */
  var text: java.lang.String
}

object CommentToken {
  @scala.inline
  def apply(text: java.lang.String, sourceCodeLocation: parse5Lib.parse5Mod.Location = null): CommentToken = {
    val __obj = js.Dynamic.literal(text = text)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[CommentToken]
  }
}

