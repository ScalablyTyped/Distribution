package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionContextCreatedEventDataType extends StObject {
  
  /**
    * A newly created execution context.
    */
  var context: ExecutionContextDescription = js.native
}
object ExecutionContextCreatedEventDataType {
  
  @scala.inline
  def apply(context: ExecutionContextDescription): ExecutionContextCreatedEventDataType = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextCreatedEventDataType]
  }
  
  @scala.inline
  implicit class ExecutionContextCreatedEventDataTypeMutableBuilder[Self <: ExecutionContextCreatedEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: ExecutionContextDescription): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
