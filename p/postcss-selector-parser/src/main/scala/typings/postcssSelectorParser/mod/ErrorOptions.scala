package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* copied from postcss -- so we don't need to add a dependency */
trait ErrorOptions extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var plugin: js.UndefOr[String] = js.undefined
  var word: js.UndefOr[String] = js.undefined
}

object ErrorOptions {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, plugin: String = null, word: String = null): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOptions]
  }
}

