package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @experimental
  */
trait CustomPreview extends js.Object {
  var bindRemoteObjectFunctionId: RemoteObjectId
  var configObjectId: js.UndefOr[RemoteObjectId] = js.undefined
  var formatterObjectId: RemoteObjectId
  var hasBody: scala.Boolean
  var header: java.lang.String
}

object CustomPreview {
  @scala.inline
  def apply(
    bindRemoteObjectFunctionId: RemoteObjectId,
    formatterObjectId: RemoteObjectId,
    hasBody: scala.Boolean,
    header: java.lang.String,
    configObjectId: RemoteObjectId = null
  ): CustomPreview = {
    val __obj = js.Dynamic.literal(bindRemoteObjectFunctionId = bindRemoteObjectFunctionId, formatterObjectId = formatterObjectId, hasBody = hasBody, header = header)
    if (configObjectId != null) __obj.updateDynamic("configObjectId")(configObjectId)
    __obj.asInstanceOf[CustomPreview]
  }
}

