package typings
package parse5DashSaxDashParserLib.parse5DashSaxDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTagToken extends js.Object {
  /**
    * List of attributes.
    */
  var attrs: js.Array[parse5Lib.parse5Mod.Attribute]
  /**
    * Indicates if the tag is self-closing.
    */
  var selfClosing: scala.Boolean
  /**
    * Start tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[parse5Lib.parse5Mod.StartTagLocation] = js.undefined
  /**
    * Tag name.
    */
  var tagName: java.lang.String
}

object StartTagToken {
  @scala.inline
  def apply(
    attrs: js.Array[parse5Lib.parse5Mod.Attribute],
    selfClosing: scala.Boolean,
    tagName: java.lang.String,
    sourceCodeLocation: parse5Lib.parse5Mod.StartTagLocation = null
  ): StartTagToken = {
    val __obj = js.Dynamic.literal(attrs = attrs, selfClosing = selfClosing, tagName = tagName)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[StartTagToken]
  }
}

