package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocComment extends js.Object {
  /**
    * The string that appears on the last line and closes the doc comment (e.g. ' * /').
    */
  var close: js.UndefOr[String] = js.undefined
  /**
    * The string that starts a doc comment (e.g. '/ **')
    */
  var open: String
}

object IDocComment {
  @scala.inline
  def apply(open: String, close: String = null): IDocComment = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocComment]
  }
}

