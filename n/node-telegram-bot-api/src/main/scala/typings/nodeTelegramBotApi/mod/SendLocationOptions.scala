package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendLocationOptions
  extends StObject
     with SendBasicOptions {
  
  var heading: js.UndefOr[Double] = js.undefined
  
  var horizontal_accuracy: js.UndefOr[Double] = js.undefined
  
  var live_period: js.UndefOr[Double] = js.undefined
  
  var proximity_alert_radius: js.UndefOr[Double] = js.undefined
}
object SendLocationOptions {
  
  inline def apply(): SendLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendLocationOptions]
  }
  
  extension [Self <: SendLocationOptions](x: Self) {
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHorizontal_accuracy(value: Double): Self = StObject.set(x, "horizontal_accuracy", value.asInstanceOf[js.Any])
    
    inline def setHorizontal_accuracyUndefined: Self = StObject.set(x, "horizontal_accuracy", js.undefined)
    
    inline def setLive_period(value: Double): Self = StObject.set(x, "live_period", value.asInstanceOf[js.Any])
    
    inline def setLive_periodUndefined: Self = StObject.set(x, "live_period", js.undefined)
    
    inline def setProximity_alert_radius(value: Double): Self = StObject.set(x, "proximity_alert_radius", value.asInstanceOf[js.Any])
    
    inline def setProximity_alert_radiusUndefined: Self = StObject.set(x, "proximity_alert_radius", js.undefined)
  }
}
