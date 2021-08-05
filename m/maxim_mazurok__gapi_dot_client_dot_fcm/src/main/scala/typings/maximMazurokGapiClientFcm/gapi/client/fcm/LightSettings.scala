package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightSettings extends StObject {
  
  /** Required. Set `color` of the LED with [google.type.Color](https://github.com/googleapis/googleapis/blob/master/google/type/color.proto). */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Required. Along with `light_on_duration `, define the blink rate of LED flashes. Resolution defined by
    * [proto.Duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration)
    */
  var lightOffDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Along with `light_off_duration`, define the blink rate of LED flashes. Resolution defined by
    * [proto.Duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration)
    */
  var lightOnDuration: js.UndefOr[String] = js.undefined
}
object LightSettings {
  
  inline def apply(): LightSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightSettings]
  }
  
  extension [Self <: LightSettings](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLightOffDuration(value: String): Self = StObject.set(x, "lightOffDuration", value.asInstanceOf[js.Any])
    
    inline def setLightOffDurationUndefined: Self = StObject.set(x, "lightOffDuration", js.undefined)
    
    inline def setLightOnDuration(value: String): Self = StObject.set(x, "lightOnDuration", value.asInstanceOf[js.Any])
    
    inline def setLightOnDurationUndefined: Self = StObject.set(x, "lightOnDuration", js.undefined)
  }
}
