package typings.mongodb.mod

import typings.mongodb.anon.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientMetadataOptions extends StObject {
  
  var appName: js.UndefOr[String] = js.undefined
  
  var driverInfo: js.UndefOr[Platform] = js.undefined
}
object ClientMetadataOptions {
  
  inline def apply(): ClientMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientMetadataOptions]
  }
  
  extension [Self <: ClientMetadataOptions](x: Self) {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setDriverInfo(value: Platform): Self = StObject.set(x, "driverInfo", value.asInstanceOf[js.Any])
    
    inline def setDriverInfoUndefined: Self = StObject.set(x, "driverInfo", js.undefined)
  }
}
