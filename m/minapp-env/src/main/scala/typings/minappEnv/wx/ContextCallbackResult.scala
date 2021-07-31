package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextCallbackResult extends StObject {
  
  /** 节点对应的 Context 对象 */
  var context: js.Object
}
object ContextCallbackResult {
  
  @scala.inline
  def apply(context: js.Object): ContextCallbackResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextCallbackResult]
  }
  
  @scala.inline
  implicit class ContextCallbackResultMutableBuilder[Self <: ContextCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
