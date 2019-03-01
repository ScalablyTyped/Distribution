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
    getValue: js.Function0[java.lang.String],
    uri: monacoDashEditorLib.monacoDashEditorMod.Uri,
    version: scala.Double
  ): IMirrorModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IMirrorModel]
  }
}

