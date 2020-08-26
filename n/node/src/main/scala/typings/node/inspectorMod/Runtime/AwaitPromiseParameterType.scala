package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwaitPromiseParameterType extends js.Object {
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  /**
    * Identifier of the promise.
    */
  var promiseObjectId: RemoteObjectId = js.native
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
}

object AwaitPromiseParameterType {
  @scala.inline
  def apply(promiseObjectId: RemoteObjectId): AwaitPromiseParameterType = {
    val __obj = js.Dynamic.literal(promiseObjectId = promiseObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitPromiseParameterType]
  }
  @scala.inline
  implicit class AwaitPromiseParameterTypeOps[Self <: AwaitPromiseParameterType] (val x: Self) extends AnyVal {
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
    def setPromiseObjectId(value: RemoteObjectId): Self = this.set("promiseObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = this.set("generatePreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneratePreview: Self = this.set("generatePreview", js.undefined)
    @scala.inline
    def setReturnByValue(value: Boolean): Self = this.set("returnByValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnByValue: Self = this.set("returnByValue", js.undefined)
  }
  
}

