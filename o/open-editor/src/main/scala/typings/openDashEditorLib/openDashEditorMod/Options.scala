package typings
package openDashEditorLib.openDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Name, command, or binary path of the editor.
  		Default: [Auto-detected](https://github.com/sindresorhus/env-editor).
  		__Only use this option if you really have to.__ Can be useful if you want to force a specific editor or implement your own auto-detection.
  		*/
  val editor: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(editor: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor)
    __obj.asInstanceOf[Options]
  }
}

