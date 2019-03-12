package typings
package monacoDashEditorLib.monacoDashEditorMod.workerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMirrorModel extends js.Object {
  val uri: monacoDashEditorLib.monacoDashEditorMod.Uri
  val version: scala.Double
  def getValue(): java.lang.String
}

object IMirrorModel {
  @scala.inline
  def apply(
    getValue: () => java.lang.String,
    uri: monacoDashEditorLib.monacoDashEditorMod.Uri,
    version: scala.Double
  ): IMirrorModel = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), uri = uri, version = version)
  
    __obj.asInstanceOf[IMirrorModel]
  }
}

