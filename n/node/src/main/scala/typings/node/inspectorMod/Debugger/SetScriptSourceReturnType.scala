package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ExceptionDetails
import typings.node.inspectorMod.Runtime.StackTrace
import typings.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetScriptSourceReturnType extends js.Object {
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.native
  
  /**
    * Async stack trace, if any.
    * @experimental
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.native
  
  /**
    * New stack trace in case editing has happened while VM was stopped.
    */
  var callFrames: js.UndefOr[js.Array[CallFrame]] = js.native
  
  /**
    * Exception details if any.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  
  /**
    * Whether current call stack  was modified after applying the changes.
    */
  var stackChanged: js.UndefOr[Boolean] = js.native
}
object SetScriptSourceReturnType {
  
  @scala.inline
  def apply(): SetScriptSourceReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetScriptSourceReturnType]
  }
  
  @scala.inline
  implicit class SetScriptSourceReturnTypeOps[Self <: SetScriptSourceReturnType] (val x: Self) extends AnyVal {
    
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
    def setAsyncStackTrace(value: StackTrace): Self = this.set("asyncStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncStackTrace: Self = this.set("asyncStackTrace", js.undefined)
    
    @scala.inline
    def setAsyncStackTraceId(value: StackTraceId): Self = this.set("asyncStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncStackTraceId: Self = this.set("asyncStackTraceId", js.undefined)
    
    @scala.inline
    def setCallFramesVarargs(value: CallFrame*): Self = this.set("callFrames", js.Array(value :_*))
    
    @scala.inline
    def setCallFrames(value: js.Array[CallFrame]): Self = this.set("callFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallFrames: Self = this.set("callFrames", js.undefined)
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = this.set("exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionDetails: Self = this.set("exceptionDetails", js.undefined)
    
    @scala.inline
    def setStackChanged(value: Boolean): Self = this.set("stackChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackChanged: Self = this.set("stackChanged", js.undefined)
  }
}
