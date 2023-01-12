package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FeatureEvent
  */
trait FeatureEvent extends StObject {
  
  var feature: Feature
}
object FeatureEvent {
  
  inline def apply(feature: Feature): FeatureEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureEvent] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
