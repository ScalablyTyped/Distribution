package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextCallbackResult extends StObject {
  
  /** 节点对应的 Context 对象 */
  var context: js.Object
}
object ContextCallbackResult {
  
  inline def apply(context: js.Object): ContextCallbackResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextCallbackResult]
  }
  
  extension [Self <: ContextCallbackResult](x: Self) {
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
