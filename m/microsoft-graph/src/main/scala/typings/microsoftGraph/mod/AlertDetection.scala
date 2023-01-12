package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertDetection extends StObject {
  
  var detectionType: js.UndefOr[NullableOption[String]] = js.undefined
  
  var method: js.UndefOr[NullableOption[String]] = js.undefined
  
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object AlertDetection {
  
  inline def apply(): AlertDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertDetection] (val x: Self) extends AnyVal {
    
    inline def setDetectionType(value: NullableOption[String]): Self = StObject.set(x, "detectionType", value.asInstanceOf[js.Any])
    
    inline def setDetectionTypeNull: Self = StObject.set(x, "detectionType", null)
    
    inline def setDetectionTypeUndefined: Self = StObject.set(x, "detectionType", js.undefined)
    
    inline def setMethod(value: NullableOption[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
