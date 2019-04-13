package typings
package openDashEditorLib.openDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var editor: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(editor: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor)
    __obj.asInstanceOf[Options]
  }
}

