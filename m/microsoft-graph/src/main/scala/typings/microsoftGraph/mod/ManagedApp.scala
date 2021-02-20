package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedApp extends MobileApp {
  
  // The Application's availability. Possible values are: global, lineOfBusiness.
  var appAvailability: js.UndefOr[ManagedAppAvailability] = js.native
  
  // The Application's version.
  var version: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedApp {
  
  @scala.inline
  def apply(): ManagedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedApp]
  }
  
  @scala.inline
  implicit class ManagedAppMutableBuilder[Self <: ManagedApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppAvailability(value: ManagedAppAvailability): Self = StObject.set(x, "appAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppAvailabilityUndefined: Self = StObject.set(x, "appAvailability", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
