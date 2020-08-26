package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/process-message/
@js.native
trait ProcessMessage[P, R, E] extends js.Object {
  val errorCode: Double | Null = js.native
  val errorData: E | Null = js.native
  val errorReason: String | Null = js.native
  val method: String | Null = js.native
  val parameters: js.UndefOr[P] = js.native
  val result: js.UndefOr[R | Null] = js.native
}

object ProcessMessage {
  @scala.inline
  def apply[P, R, E](): ProcessMessage[P, R, E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessMessage[P, R, E]]
  }
  @scala.inline
  implicit class ProcessMessageOps[Self <: ProcessMessage[_, _, _], P, R, E] (val x: Self with (ProcessMessage[P, R, E])) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCodeNull: Self = this.set("errorCode", null)
    @scala.inline
    def setErrorData(value: E): Self = this.set("errorData", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorDataNull: Self = this.set("errorData", null)
    @scala.inline
    def setErrorReason(value: String): Self = this.set("errorReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorReasonNull: Self = this.set("errorReason", null)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodNull: Self = this.set("method", null)
    @scala.inline
    def setParameters(value: P): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setResult(value: R): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setResultNull: Self = this.set("result", null)
  }
  
}

