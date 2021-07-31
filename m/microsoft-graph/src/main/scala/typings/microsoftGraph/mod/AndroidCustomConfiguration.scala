package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidCustomConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // OMA settings. This collection can contain a maximum of 1000 elements.
  var omaSettings: js.UndefOr[NullableOption[js.Array[OmaSetting]]] = js.undefined
}
object AndroidCustomConfiguration {
  
  @scala.inline
  def apply(): AndroidCustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidCustomConfiguration]
  }
  
  @scala.inline
  implicit class AndroidCustomConfigurationMutableBuilder[Self <: AndroidCustomConfiguration] (val x: Self) extends AnyVal {
    
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
