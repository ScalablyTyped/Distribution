package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppConfiguration
  extends StObject
     with ManagedAppPolicy {
  
  /**
    * A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned
    * by this service
    */
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.undefined
}
object ManagedAppConfiguration {
  
  inline def apply(): ManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppConfiguration]
  }
  
  extension [Self <: ManagedAppConfiguration](x: Self) {
    
    inline def setCustomSettings(value: js.Array[KeyValuePair]): Self = StObject.set(x, "customSettings", value.asInstanceOf[js.Any])
    
    inline def setCustomSettingsUndefined: Self = StObject.set(x, "customSettings", js.undefined)
    
    inline def setCustomSettingsVarargs(value: KeyValuePair*): Self = StObject.set(x, "customSettings", js.Array(value :_*))
  }
}
