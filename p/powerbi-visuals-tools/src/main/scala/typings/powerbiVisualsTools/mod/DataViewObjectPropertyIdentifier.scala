package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewObjectPropertyIdentifier extends StObject {
  
  var objectName: String
  
  var propertyName: String
}
object DataViewObjectPropertyIdentifier {
  
  inline def apply(objectName: String, propertyName: String): DataViewObjectPropertyIdentifier = {
    val __obj = js.Dynamic.literal(objectName = objectName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewObjectPropertyIdentifier]
  }
  
  extension [Self <: DataViewObjectPropertyIdentifier](x: Self) {
    
    inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
