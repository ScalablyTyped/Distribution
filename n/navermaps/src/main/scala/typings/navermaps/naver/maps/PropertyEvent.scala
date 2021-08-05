package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyEvent extends StObject {
  
  var feature: Feature
  
  var name: String
  
  var newValue: js.Any
  
  var oldValue: js.Any
}
object PropertyEvent {
  
  inline def apply(feature: Feature, name: String, newValue: js.Any, oldValue: js.Any): PropertyEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyEvent]
  }
  
  extension [Self <: PropertyEvent](x: Self) {
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
