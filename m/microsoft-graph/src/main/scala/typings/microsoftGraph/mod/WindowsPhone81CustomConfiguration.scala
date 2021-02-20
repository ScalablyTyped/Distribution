package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsPhone81CustomConfiguration extends DeviceConfiguration {
  
  // OMA settings. This collection can contain a maximum of 1000 elements.
  var omaSettings: js.UndefOr[NullableOption[js.Array[OmaSetting]]] = js.native
}
object WindowsPhone81CustomConfiguration {
  
  @scala.inline
  def apply(): WindowsPhone81CustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsPhone81CustomConfiguration]
  }
  
  @scala.inline
  implicit class WindowsPhone81CustomConfigurationMutableBuilder[Self <: WindowsPhone81CustomConfiguration] (val x: Self) extends AnyVal {
    
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
