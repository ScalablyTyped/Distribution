package typings.parse5DashSaxDashParser.parse5DashSaxDashParserMod

import typings.parse5.parse5Mod.Attribute
import typings.parse5.parse5Mod.StartTagLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTagToken extends js.Object {
  /**
    * List of attributes.
    */
  var attrs: js.Array[Attribute]
  /**
    * Indicates if the tag is self-closing.
    */
  var selfClosing: Boolean
  /**
    * Start tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[StartTagLocation] = js.undefined
  /**
    * Tag name.
    */
  var tagName: String
}

object StartTagToken {
  @scala.inline
  def apply(
    attrs: js.Array[Attribute],
    selfClosing: Boolean,
    tagName: String,
    sourceCodeLocation: StartTagLocation = null
  ): StartTagToken = {
    val __obj = js.Dynamic.literal(attrs = attrs, selfClosing = selfClosing, tagName = tagName)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[StartTagToken]
  }
}

