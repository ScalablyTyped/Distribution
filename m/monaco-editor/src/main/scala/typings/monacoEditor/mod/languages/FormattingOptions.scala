package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattingOptions extends js.Object {
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: Boolean
  /**
    * Size of a tab in spaces.
    */
  var tabSize: Double
}

object FormattingOptions {
  @scala.inline
  def apply(insertSpaces: Boolean, tabSize: Double): FormattingOptions = {
    val __obj = js.Dynamic.literal(insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormattingOptions]
  }
}

