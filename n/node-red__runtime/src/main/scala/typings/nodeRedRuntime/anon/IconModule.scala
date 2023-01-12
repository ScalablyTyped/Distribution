package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconModule extends StObject {
  
  var icon: String
  
  var module: String
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object IconModule {
  
  inline def apply(icon: String, module: String): IconModule = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconModule] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
