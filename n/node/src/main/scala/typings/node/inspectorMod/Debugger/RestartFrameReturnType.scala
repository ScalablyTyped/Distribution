package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTrace
import typings.node.inspectorMod.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartFrameReturnType extends StObject {
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Async stack trace, if any.
    * @experimental
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  
  /**
    * New stack trace.
    */
  var callFrames: js.Array[CallFrame]
}
object RestartFrameReturnType {
  
  @scala.inline
  def apply(callFrames: js.Array[CallFrame]): RestartFrameReturnType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameReturnType]
  }
  
  @scala.inline
  implicit class RestartFrameReturnTypeMutableBuilder[Self <: RestartFrameReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncStackTrace(value: StackTrace): Self = StObject.set(x, "asyncStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncStackTraceIdUndefined: Self = StObject.set(x, "asyncStackTraceId", js.undefined)
    
    @scala.inline
    def setAsyncStackTraceUndefined: Self = StObject.set(x, "asyncStackTrace", js.undefined)
    
    @scala.inline
    def setCallFrames(value: js.Array[CallFrame]): Self = StObject.set(x, "callFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallFramesVarargs(value: CallFrame*): Self = StObject.set(x, "callFrames", js.Array(value :_*))
  }
}
