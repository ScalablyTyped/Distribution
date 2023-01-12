package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidWorkProfileCustomConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // OMA settings. This collection can contain a maximum of 500 elements.
  var omaSettings: js.UndefOr[NullableOption[js.Array[OmaSetting]]] = js.undefined
}
object AndroidWorkProfileCustomConfiguration {
  
  inline def apply(): AndroidWorkProfileCustomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidWorkProfileCustomConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndroidWorkProfileCustomConfiguration] (val x: Self) extends AnyVal {
    
    inline def setOmaSettings(value: NullableOption[js.Array[OmaSetting]]): Self = StObject.set(x, "omaSettings", value.asInstanceOf[js.Any])
    
    inline def setOmaSettingsNull: Self = StObject.set(x, "omaSettings", null)
    
    inline def setOmaSettingsUndefined: Self = StObject.set(x, "omaSettings", js.undefined)
    
    inline def setOmaSettingsVarargs(value: OmaSetting*): Self = StObject.set(x, "omaSettings", js.Array(value*))
  }
}
