package typings.plotlyJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.plotlyJs.plotlyJsStrings.component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentModule
  extends StObject
     with /* key */ StringDictionary[Any]
     with PlotlyModule {
  
  var moduleType: component
  
  var name: String
}
object ComponentModule {
  
  inline def apply(name: String): ComponentModule = {
    val __obj = js.Dynamic.literal(moduleType = "component", name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentModule] (val x: Self) extends AnyVal {
    
    inline def setModuleType(value: component): Self = StObject.set(x, "moduleType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
