package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apk extends StObject {
  
  /** The path to an APK to be installed on the device before the test begins. */
  var location: js.UndefOr[FileReference] = js.undefined
  
  /** The java package for the APK to be installed. Value is determined by examining the application's manifest. */
  var packageName: js.UndefOr[String] = js.undefined
}
object Apk {
  
  inline def apply(): Apk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apk]
  }
  
  extension [Self <: Apk](x: Self) {
    
    inline def setLocation(value: FileReference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
