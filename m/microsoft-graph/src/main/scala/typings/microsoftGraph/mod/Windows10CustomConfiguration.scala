package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows10CustomConfiguration extends DeviceConfiguration {
  
  // OMA settings. This collection can contain a maximum of 1000 elements.
  var omaSettings: js.UndefOr[NullableOption[js.Array[OmaSetting]]] = js.native
}
object Windows10CustomConfiguration {
  
  @scala.inline
  def apply(): Windows10CustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10CustomConfiguration]
  }
  
  @scala.inline
  implicit class Windows10CustomConfigurationMutableBuilder[Self <: Windows10CustomConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOmaSettings(value: NullableOption[js.Array[OmaSetting]]): Self = StObject.set(x, "omaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmaSettingsNull: Self = StObject.set(x, "omaSettings", null)
    
    @scala.inline
    def setOmaSettingsUndefined: Self = StObject.set(x, "omaSettings", js.undefined)
    
    @scala.inline
    def setOmaSettingsVarargs(value: OmaSetting*): Self = StObject.set(x, "omaSettings", js.Array(value :_*))
  }
}
