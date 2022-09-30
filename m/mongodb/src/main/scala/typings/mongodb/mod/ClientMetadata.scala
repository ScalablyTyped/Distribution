package typings.mongodb.mod

import typings.mongodb.anon.Architecture
import typings.mongodb.anon.Name
import typings.mongodb.anon.NameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientMetadata extends StObject {
  
  var application: js.UndefOr[NameString] = js.undefined
  
  var driver: Name
  
  var os: Architecture
  
  var platform: String
  
  var version: js.UndefOr[String] = js.undefined
}
object ClientMetadata {
  
  inline def apply(driver: Name, os: Architecture, platform: String): ClientMetadata = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  
  extension [Self <: ClientMetadata](x: Self) {
    
    inline def setApplication(value: NameString): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setDriver(value: Name): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setOs(value: Architecture): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
