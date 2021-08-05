package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Models extends StObject {
  
  var models: js.UndefOr[Account] = js.undefined
}
object Models {
  
  inline def apply(): Models = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Models]
  }
  
  extension [Self <: Models](x: Self) {
    
    inline def setModels(value: Account): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
  }
}
