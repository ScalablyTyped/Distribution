package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosDeviceFile extends StObject {
  
  /** The bundle id of the app where this file lives. iOS apps sandbox their own filesystem, so app files must specify which app installed on the device. */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /** The source file */
  var content: js.UndefOr[FileReference] = js.undefined
  
  /** Location of the file on the device, inside the app's sandboxed filesystem */
  var devicePath: js.UndefOr[String] = js.undefined
}
object IosDeviceFile {
  
  inline def apply(): IosDeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosDeviceFile] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setContent(value: FileReference): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDevicePath(value: String): Self = StObject.set(x, "devicePath", value.asInstanceOf[js.Any])
    
    inline def setDevicePathUndefined: Self = StObject.set(x, "devicePath", js.undefined)
  }
}
