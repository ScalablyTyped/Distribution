package typings.parse5SaxParser.mod

import typings.parse5.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentToken extends js.Object {
  /**
    * Comment source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  /**
    * Comment text.
    */
  var text: String
}

object CommentToken {
  @scala.inline
  def apply(text: String, sourceCodeLocation: Location = null): CommentToken = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentToken]
  }
}

