package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.goto
import typings.monacoEditor.monacoEditorStrings.gotoAndPeek
import typings.monacoEditor.monacoEditorStrings.peek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGotoLocationOptions extends js.Object {
  /**
    * Control how goto-command work when having multiple results.
    */
  var multiple: js.UndefOr[peek | gotoAndPeek | goto] = js.undefined
}

object IGotoLocationOptions {
  @scala.inline
  def apply(multiple: peek | gotoAndPeek | goto = null): IGotoLocationOptions = {
    val __obj = js.Dynamic.literal()
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGotoLocationOptions]
  }
}

