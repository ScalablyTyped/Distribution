package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdmType extends StObject {
  
  /**
    * the type has to be "Edm.Time"
    */
  var __edmType: String
  
  /**
    * the time in milliseconds
    */
  var ms: Double
}
object EdmType {
  
  inline def apply(__edmType: String, ms: Double): EdmType = {
    val __obj = js.Dynamic.literal(__edmType = __edmType.asInstanceOf[js.Any], ms = ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdmType]
  }
  
  extension [Self <: EdmType](x: Self) {
    
    inline def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    inline def set__edmType(value: String): Self = StObject.set(x, "__edmType", value.asInstanceOf[js.Any])
  }
}
