package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedMobileApp
  extends StObject
     with Entity {
  
  // The identifier for an app with it's operating system type.
  var mobileAppIdentifier: js.UndefOr[NullableOption[MobileAppIdentifier]] = js.undefined
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedMobileApp {
  
  inline def apply(): ManagedMobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedMobileApp]
  }
  
  extension [Self <: ManagedMobileApp](x: Self) {
    
    inline def setMobileAppIdentifier(value: NullableOption[MobileAppIdentifier]): Self = StObject.set(x, "mobileAppIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMobileAppIdentifierNull: Self = StObject.set(x, "mobileAppIdentifier", null)
    
    inline def setMobileAppIdentifierUndefined: Self = StObject.set(x, "mobileAppIdentifier", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
