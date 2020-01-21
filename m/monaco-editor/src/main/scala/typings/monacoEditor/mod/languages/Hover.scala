package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hover extends js.Object {
  /**
    * The contents of this hover.
    */
  var contents: js.Array[IMarkdownString]
  /**
    * The range to which this hover applies. When missing, the
    * editor will use the range at the current position or the
    * current position itself.
    */
  var range: js.UndefOr[IRange] = js.undefined
}

object Hover {
  @scala.inline
  def apply(contents: js.Array[IMarkdownString], range: IRange = null): Hover = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
}

