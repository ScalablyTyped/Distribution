package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  // Device information associated with the callee endpoint of this media.
  var calleeDevice: js.UndefOr[NullableOption[DeviceInfo]] = js.undefined
  
  // Network information associated with the callee endpoint of this media.
  var calleeNetwork: js.UndefOr[NullableOption[NetworkInfo]] = js.undefined
  
  // Device information associated with the caller endpoint of this media.
  var callerDevice: js.UndefOr[NullableOption[DeviceInfo]] = js.undefined
  
  // Network information associated with the caller endpoint of this media.
  var callerNetwork: js.UndefOr[NullableOption[NetworkInfo]] = js.undefined
  
  // How the media was identified during media negotiation stage.
  var label: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Network streams associated with this media.
  var streams: js.UndefOr[NullableOption[js.Array[MediaStream]]] = js.undefined
}
object Media {
  
  inline def apply(): Media = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setCalleeDevice(value: NullableOption[DeviceInfo]): Self = StObject.set(x, "calleeDevice", value.asInstanceOf[js.Any])
    
    inline def setCalleeDeviceNull: Self = StObject.set(x, "calleeDevice", null)
    
    inline def setCalleeDeviceUndefined: Self = StObject.set(x, "calleeDevice", js.undefined)
    
    inline def setCalleeNetwork(value: NullableOption[NetworkInfo]): Self = StObject.set(x, "calleeNetwork", value.asInstanceOf[js.Any])
    
    inline def setCalleeNetworkNull: Self = StObject.set(x, "calleeNetwork", null)
    
    inline def setCalleeNetworkUndefined: Self = StObject.set(x, "calleeNetwork", js.undefined)
    
    inline def setCallerDevice(value: NullableOption[DeviceInfo]): Self = StObject.set(x, "callerDevice", value.asInstanceOf[js.Any])
    
    inline def setCallerDeviceNull: Self = StObject.set(x, "callerDevice", null)
    
    inline def setCallerDeviceUndefined: Self = StObject.set(x, "callerDevice", js.undefined)
    
    inline def setCallerNetwork(value: NullableOption[NetworkInfo]): Self = StObject.set(x, "callerNetwork", value.asInstanceOf[js.Any])
    
    inline def setCallerNetworkNull: Self = StObject.set(x, "callerNetwork", null)
    
    inline def setCallerNetworkUndefined: Self = StObject.set(x, "callerNetwork", js.undefined)
    
    inline def setLabel(value: NullableOption[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setStreams(value: NullableOption[js.Array[MediaStream]]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsNull: Self = StObject.set(x, "streams", null)
    
    inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    inline def setStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "streams", js.Array(value :_*))
  }
}
