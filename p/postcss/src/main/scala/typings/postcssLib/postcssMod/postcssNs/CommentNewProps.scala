package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentNewProps extends js.Object {
  /**
    * The comment's text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object CommentNewProps {
  @scala.inline
  def apply(text: java.lang.String = null): CommentNewProps = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CommentNewProps]
  }
}

