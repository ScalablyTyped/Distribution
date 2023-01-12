package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PropertyEvent
  */
trait PropertyEvent extends StObject {
  
  var feature: Feature
  
  var name: String
  
  var newValue: Any
  
  var oldValue: Any
}
object PropertyEvent {
  
  inline def apply(feature: Feature, name: String, newValue: Any, oldValue: Any): PropertyEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyEvent] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
