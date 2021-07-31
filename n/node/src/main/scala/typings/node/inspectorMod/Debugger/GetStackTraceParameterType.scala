package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStackTraceParameterType extends StObject {
  
  var stackTraceId: StackTraceId
}
object GetStackTraceParameterType {
  
  @scala.inline
  def apply(stackTraceId: StackTraceId): GetStackTraceParameterType = {
    val __obj = js.Dynamic.literal(stackTraceId = stackTraceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackTraceParameterType]
  }
  
  @scala.inline
  implicit class GetStackTraceParameterTypeMutableBuilder[Self <: GetStackTraceParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackTraceId(value: StackTraceId): Self = StObject.set(x, "stackTraceId", value.asInstanceOf[js.Any])
  }
}
