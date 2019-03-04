package typings
package parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndTagToken extends js.Object {
  /**
    * End tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[parse5Lib.parse5Mod.Location] = js.undefined
  /**
    * Tag name.
    */
  var tagName: java.lang.String
}

object EndTagToken {
  @scala.inline
  def apply(tagName: java.lang.String, sourceCodeLocation: parse5Lib.parse5Mod.Location = null): EndTagToken = {
    val __obj = js.Dynamic.literal(tagName = tagName)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[EndTagToken]
  }
}

