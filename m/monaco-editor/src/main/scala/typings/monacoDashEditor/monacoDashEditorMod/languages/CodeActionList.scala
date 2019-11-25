package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionList extends IDisposable {
  val actions: js.Array[CodeAction]
}

object CodeActionList {
  @scala.inline
  def apply(actions: js.Array[CodeAction], dispose: () => Unit): CodeActionList = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[CodeActionList]
  }
}

