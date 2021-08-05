package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProblemLocation extends StObject {
  
  var document: js.UndefOr[String] = js.undefined
  
  var element: js.UndefOr[String] = js.undefined
  
  var elementId: js.UndefOr[String] = js.undefined
  
  var module: js.UndefOr[String] = js.undefined
  
  var unitId: js.UndefOr[String] = js.undefined
}
object IProblemLocation {
  
  inline def apply(): IProblemLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProblemLocation]
  }
  
  extension [Self <: IProblemLocation](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
    
    inline def setElementIdUndefined: Self = StObject.set(x, "elementId", js.undefined)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setUnitId(value: String): Self = StObject.set(x, "unitId", value.asInstanceOf[js.Any])
    
    inline def setUnitIdUndefined: Self = StObject.set(x, "unitId", js.undefined)
  }
}
