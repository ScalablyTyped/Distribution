package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedApp
  extends StObject
     with MobileApp {
  
  // The Application's availability. Possible values are: global, lineOfBusiness.
  var appAvailability: js.UndefOr[ManagedAppAvailability] = js.undefined
  
  // The Application's version.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedApp {
  
  inline def apply(): ManagedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedApp]
  }
  
  extension [Self <: ManagedApp](x: Self) {
    
    inline def setAppAvailability(value: ManagedAppAvailability): Self = StObject.set(x, "appAvailability", value.asInstanceOf[js.Any])
    
    inline def setAppAvailabilityUndefined: Self = StObject.set(x, "appAvailability", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
