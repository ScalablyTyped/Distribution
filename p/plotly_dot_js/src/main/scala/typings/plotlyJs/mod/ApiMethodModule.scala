package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.apiMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiMethodModule
  extends StObject
     with PlotlyModule {
  
  var fn: Any
  
  var moduleType: apiMethod
  
  var name: String
}
object ApiMethodModule {
  
  inline def apply(fn: Any, name: String): ApiMethodModule = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], moduleType = "apiMethod", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiMethodModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiMethodModule] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setModuleType(value: apiMethod): Self = StObject.set(x, "moduleType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
