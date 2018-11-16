package typings
package parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs

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

