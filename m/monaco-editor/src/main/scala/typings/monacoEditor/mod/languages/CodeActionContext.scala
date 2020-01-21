package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.editor.IMarkerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionContext extends js.Object {
  /**
    * An array of diagnostics.
    */
  val markers: js.Array[IMarkerData]
  /**
    * Requested kind of actions to return.
    */
  val only: js.UndefOr[String] = js.undefined
}

object CodeActionContext {
  @scala.inline
  def apply(markers: js.Array[IMarkerData], only: String = null): CodeActionContext = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
}

