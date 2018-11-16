package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeErrorOptions extends js.Object {
  /**
           * An index inside a node's string that should be highlighted as source
           * of error.
           */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
           * Plugin name that created this error. PostCSS will set it automatically.
           */
  var plugin: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A word inside a node's string, that should be highlighted as source
           * of error.
           */
  var word: js.UndefOr[java.lang.String] = js.undefined
}

