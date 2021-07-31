package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTrace
import typings.node.inspectorMod.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PausedEventDataType extends StObject {
  
  /**
    * Just scheduled async call will have this stack trace as parent stack during async execution. This field is available only after <code>Debugger.stepInto</code> call with <code>breakOnAsynCall</code> flag.
    * @experimental
    */
  var asyncCallStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  
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
    * Call stack the virtual machine stopped on.
    */
  var callFrames: js.Array[CallFrame]
  
  /**
    * Object containing break-specific auxiliary properties.
    */
  var data: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Hit breakpoints IDs
    */
  var hitBreakpoints: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Pause reason.
    */
  var reason: String
}
object PausedEventDataType {
  
  @scala.inline
  def apply(callFrames: js.Array[CallFrame], reason: String): PausedEventDataType = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PausedEventDataType]
  }
  
  @scala.inline
  implicit class PausedEventDataTypeMutableBuilder[Self <: PausedEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncCallStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncCallStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncCallStackTraceIdUndefined: Self = StObject.set(x, "asyncCallStackTraceId", js.undefined)
    
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
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHitBreakpoints(value: js.Array[String]): Self = StObject.set(x, "hitBreakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitBreakpointsUndefined: Self = StObject.set(x, "hitBreakpoints", js.undefined)
    
    @scala.inline
    def setHitBreakpointsVarargs(value: String*): Self = StObject.set(x, "hitBreakpoints", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
