package typings.node.inspectorMod.Runtime

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
  var hasBody: Boolean
  var header: String
}

object CustomPreview {
  @scala.inline
  def apply(
    bindRemoteObjectFunctionId: RemoteObjectId,
    formatterObjectId: RemoteObjectId,
    hasBody: Boolean,
    header: String,
    configObjectId: RemoteObjectId = null
  ): CustomPreview = {
    val __obj = js.Dynamic.literal(bindRemoteObjectFunctionId = bindRemoteObjectFunctionId.asInstanceOf[js.Any], formatterObjectId = formatterObjectId.asInstanceOf[js.Any], hasBody = hasBody.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    if (configObjectId != null) __obj.updateDynamic("configObjectId")(configObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreview]
  }
}

