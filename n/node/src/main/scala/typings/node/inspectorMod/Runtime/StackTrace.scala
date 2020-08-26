package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Call frames for assertions or error messages.
  */
@js.native
trait StackTrace extends js.Object {
  /**
    * JavaScript function name.
    */
  var callFrames: js.Array[CallFrame] = js.native
  /**
    * String label of this stack trace. For async traces this may be a name of the function that initiated the async call.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Asynchronous JavaScript stack trace that preceded this stack, if available.
    */
  var parent: js.UndefOr[StackTrace] = js.native
  /**
    * Asynchronous JavaScript stack trace that preceded this stack, if available.
    * @experimental
    */
  var parentId: js.UndefOr[StackTraceId] = js.native
}

object StackTrace {
  @scala.inline
  def apply(callFrames: js.Array[CallFrame]): StackTrace = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTrace]
  }
  @scala.inline
  implicit class StackTraceOps[Self <: StackTrace] (val x: Self) extends AnyVal {
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
    def setCallFramesVarargs(value: CallFrame*): Self = this.set("callFrames", js.Array(value :_*))
    @scala.inline
    def setCallFrames(value: js.Array[CallFrame]): Self = this.set("callFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setParent(value: StackTrace): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setParentId(value: StackTraceId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
  }
  
}

