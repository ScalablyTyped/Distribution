package typings
package postcssLib.postcssMod

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

object NodeErrorOptions {
  @scala.inline
  def apply(
    index: scala.Int | scala.Double = null,
    plugin: java.lang.String = null,
    word: java.lang.String = null
  ): NodeErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (word != null) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[NodeErrorOptions]
  }
}

