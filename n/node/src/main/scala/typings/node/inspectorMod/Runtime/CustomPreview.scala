package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @experimental
  */
@js.native
trait CustomPreview extends js.Object {
  var bindRemoteObjectFunctionId: RemoteObjectId = js.native
  var configObjectId: js.UndefOr[RemoteObjectId] = js.native
  var formatterObjectId: RemoteObjectId = js.native
  var hasBody: Boolean = js.native
  var header: String = js.native
}

object CustomPreview {
  @scala.inline
  def apply(
    bindRemoteObjectFunctionId: RemoteObjectId,
    formatterObjectId: RemoteObjectId,
    hasBody: Boolean,
    header: String
  ): CustomPreview = {
    val __obj = js.Dynamic.literal(bindRemoteObjectFunctionId = bindRemoteObjectFunctionId.asInstanceOf[js.Any], formatterObjectId = formatterObjectId.asInstanceOf[js.Any], hasBody = hasBody.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPreview]
  }
  @scala.inline
  implicit class CustomPreviewOps[Self <: CustomPreview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindRemoteObjectFunctionId(value: RemoteObjectId): Self = this.set("bindRemoteObjectFunctionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatterObjectId(value: RemoteObjectId): Self = this.set("formatterObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasBody(value: Boolean): Self = this.set("hasBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigObjectId(value: RemoteObjectId): Self = this.set("configObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigObjectId: Self = this.set("configObjectId", js.undefined)
  }
  
}

