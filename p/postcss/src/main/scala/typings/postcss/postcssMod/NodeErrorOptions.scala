package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeErrorOptions extends js.Object {
  /**
    * An index inside a node's string that should be highlighted as source
    * of error.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Plugin name that created this error. PostCSS will set it automatically.
    */
  var plugin: js.UndefOr[String] = js.undefined
  /**
    * A word inside a node's string, that should be highlighted as source
    * of error.
    */
  var word: js.UndefOr[String] = js.undefined
}

object NodeErrorOptions {
  @scala.inline
  def apply(index: Int | Double = null, plugin: String = null, word: String = null): NodeErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeErrorOptions]
  }
}

