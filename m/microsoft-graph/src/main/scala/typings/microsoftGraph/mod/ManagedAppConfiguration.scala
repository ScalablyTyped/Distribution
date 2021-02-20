package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAppConfiguration extends ManagedAppPolicy {
  
  /**
    * A set of string key and string value pairs to be sent to apps for users to whom the configuration is scoped, unalterned
    * by this service
    */
  var customSettings: js.UndefOr[js.Array[KeyValuePair]] = js.native
}
object ManagedAppConfiguration {
  
  @scala.inline
  def apply(): ManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppConfiguration]
  }
  
  @scala.inline
  implicit class ManagedAppConfigurationMutableBuilder[Self <: ManagedAppConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSettings(value: js.Array[KeyValuePair]): Self = StObject.set(x, "customSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSettingsUndefined: Self = StObject.set(x, "customSettings", js.undefined)
    
    @scala.inline
    def setCustomSettingsVarargs(value: KeyValuePair*): Self = StObject.set(x, "customSettings", js.Array(value :_*))
  }
}
