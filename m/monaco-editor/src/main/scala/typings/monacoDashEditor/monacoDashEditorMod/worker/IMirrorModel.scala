package typings.monacoDashEditor.monacoDashEditorMod.worker

import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMirrorModel extends js.Object {
  val uri: Uri
  val version: Double
  def getValue(): String
}

object IMirrorModel {
  @scala.inline
  def apply(getValue: () => String, uri: Uri, version: Double): IMirrorModel = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMirrorModel]
  }
}

