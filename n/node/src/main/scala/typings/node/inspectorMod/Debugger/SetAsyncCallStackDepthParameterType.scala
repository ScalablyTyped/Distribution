package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAsyncCallStackDepthParameterType extends StObject {
  
  /**
    * Maximum depth of async call stacks. Setting to <code>0</code> will effectively disable collecting async call stacks (default).
    */
  var maxDepth: Double = js.native
}
object SetAsyncCallStackDepthParameterType {
  
  @scala.inline
  def apply(maxDepth: Double): SetAsyncCallStackDepthParameterType = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAsyncCallStackDepthParameterType]
  }
  
  @scala.inline
  implicit class SetAsyncCallStackDepthParameterTypeMutableBuilder[Self <: SetAsyncCallStackDepthParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
  }
}
