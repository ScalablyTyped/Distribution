package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedApp extends Entity {
  
  // The number of devices that have installed this application
  var deviceCount: js.UndefOr[Double] = js.native
  
  // Name of the discovered application. Read-only
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The devices that have the discovered application installed
  var managedDevices: js.UndefOr[NullableOption[js.Array[ManagedDevice]]] = js.native
  
  // Discovered application size in bytes. Read-only
  var sizeInByte: js.UndefOr[Double] = js.native
  
  // Version of the discovered application. Read-only
  var version: js.UndefOr[NullableOption[String]] = js.native
}
object DetectedApp {
  
  @scala.inline
  def apply(): DetectedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedApp]
  }
  
  @scala.inline
  implicit class DetectedAppMutableBuilder[Self <: DetectedApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCountUndefined: Self = StObject.set(x, "deviceCount", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setManagedDevices(value: NullableOption[js.Array[ManagedDevice]]): Self = StObject.set(x, "managedDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedDevicesNull: Self = StObject.set(x, "managedDevices", null)
    
    @scala.inline
    def setManagedDevicesUndefined: Self = StObject.set(x, "managedDevices", js.undefined)
    
    @scala.inline
    def setManagedDevicesVarargs(value: ManagedDevice*): Self = StObject.set(x, "managedDevices", js.Array(value :_*))
    
    @scala.inline
    def setSizeInByte(value: Double): Self = StObject.set(x, "sizeInByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInByteUndefined: Self = StObject.set(x, "sizeInByte", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
