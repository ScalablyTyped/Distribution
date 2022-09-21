package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedApp
  extends StObject
     with Entity {
  
  // The number of devices that have installed this application
  var deviceCount: js.UndefOr[Double] = js.undefined
  
  // Name of the discovered application. Read-only
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The devices that have the discovered application installed
  var managedDevices: js.UndefOr[NullableOption[js.Array[ManagedDevice]]] = js.undefined
  
  // Discovered application size in bytes. Read-only
  var sizeInByte: js.UndefOr[Double] = js.undefined
  
  // Version of the discovered application. Read-only
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object DetectedApp {
  
  inline def apply(): DetectedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedApp]
  }
  
  extension [Self <: DetectedApp](x: Self) {
    
    inline def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
    
    inline def setDeviceCountUndefined: Self = StObject.set(x, "deviceCount", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setManagedDevices(value: NullableOption[js.Array[ManagedDevice]]): Self = StObject.set(x, "managedDevices", value.asInstanceOf[js.Any])
    
    inline def setManagedDevicesNull: Self = StObject.set(x, "managedDevices", null)
    
    inline def setManagedDevicesUndefined: Self = StObject.set(x, "managedDevices", js.undefined)
    
    inline def setManagedDevicesVarargs(value: ManagedDevice*): Self = StObject.set(x, "managedDevices", js.Array(value*))
    
    inline def setSizeInByte(value: Double): Self = StObject.set(x, "sizeInByte", value.asInstanceOf[js.Any])
    
    inline def setSizeInByteUndefined: Self = StObject.set(x, "sizeInByte", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
