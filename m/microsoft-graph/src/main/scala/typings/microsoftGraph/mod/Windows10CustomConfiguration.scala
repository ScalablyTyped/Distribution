package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Windows10CustomConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // OMA settings. This collection can contain a maximum of 1000 elements.
  var omaSettings: js.UndefOr[NullableOption[js.Array[OmaSetting]]] = js.undefined
}
object Windows10CustomConfiguration {
  
  inline def apply(): Windows10CustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10CustomConfiguration]
  }
  
  extension [Self <: Windows10CustomConfiguration](x: Self) {
    
    inline def setOmaSettings(value: NullableOption[js.Array[OmaSetting]]): Self = StObject.set(x, "omaSettings", value.asInstanceOf[js.Any])
    
    inline def setOmaSettingsNull: Self = StObject.set(x, "omaSettings", null)
    
    inline def setOmaSettingsUndefined: Self = StObject.set(x, "omaSettings", js.undefined)
    
    inline def setOmaSettingsVarargs(value: OmaSetting*): Self = StObject.set(x, "omaSettings", js.Array(value*))
  }
}
