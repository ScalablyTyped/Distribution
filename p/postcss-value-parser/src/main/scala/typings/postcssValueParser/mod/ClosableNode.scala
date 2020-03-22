package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosableNode extends js.Object {
  /**
    * Whether the parsed CSS value ended before the node was properly closed
    */
  var unclosed: js.UndefOr[`true`] = js.undefined
}

object ClosableNode {
  @scala.inline
  def apply(unclosed: `true` = null): ClosableNode = {
    val __obj = js.Dynamic.literal()
    if (unclosed != null) __obj.updateDynamic("unclosed")(unclosed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosableNode]
  }
}

