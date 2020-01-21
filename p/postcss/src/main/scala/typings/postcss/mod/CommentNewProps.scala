package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentNewProps extends js.Object {
  /**
    * The comment's text.
    */
  var text: js.UndefOr[String] = js.undefined
}

object CommentNewProps {
  @scala.inline
  def apply(text: String = null): CommentNewProps = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentNewProps]
  }
}

