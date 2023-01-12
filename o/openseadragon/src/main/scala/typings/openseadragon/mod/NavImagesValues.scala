package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavImagesValues extends StObject {
  
  var DOWN: String
  
  var GROUP: String
  
  var HOVER: String
  
  var REST: String
}
object NavImagesValues {
  
  inline def apply(DOWN: String, GROUP: String, HOVER: String, REST: String): NavImagesValues = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], GROUP = GROUP.asInstanceOf[js.Any], HOVER = HOVER.asInstanceOf[js.Any], REST = REST.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavImagesValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavImagesValues] (val x: Self) extends AnyVal {
    
    inline def setDOWN(value: String): Self = StObject.set(x, "DOWN", value.asInstanceOf[js.Any])
    
    inline def setGROUP(value: String): Self = StObject.set(x, "GROUP", value.asInstanceOf[js.Any])
    
    inline def setHOVER(value: String): Self = StObject.set(x, "HOVER", value.asInstanceOf[js.Any])
    
    inline def setREST(value: String): Self = StObject.set(x, "REST", value.asInstanceOf[js.Any])
  }
}
