package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononDeviceObject extends StObject {
  
  var ANDROID: String
  
  var IOS: String
  
  var os: String
  
  var osVersion: String
}
object PhononDeviceObject {
  
  inline def apply(ANDROID: String, IOS: String, os: String, osVersion: String): PhononDeviceObject = {
    val __obj = js.Dynamic.literal(ANDROID = ANDROID.asInstanceOf[js.Any], IOS = IOS.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononDeviceObject]
  }
  
  extension [Self <: PhononDeviceObject](x: Self) {
    
    inline def setANDROID(value: String): Self = StObject.set(x, "ANDROID", value.asInstanceOf[js.Any])
    
    inline def setIOS(value: String): Self = StObject.set(x, "IOS", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
  }
}
