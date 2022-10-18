package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexSettings extends StObject {
  
  /**
    * Map with flex-related settings
    */
  var flexSettings: js.UndefOr[DeveloperMode] = js.undefined
  
  /**
    * Control instance to get the AppComponent. This then is used to start UI adaptation.
    */
  var rootControl: default | typings.openui5.sapUiCoreUicomponentMod.default
}
object FlexSettings {
  
  inline def apply(rootControl: default | typings.openui5.sapUiCoreUicomponentMod.default): FlexSettings = {
    val __obj = js.Dynamic.literal(rootControl = rootControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexSettings]
  }
  
  extension [Self <: FlexSettings](x: Self) {
    
    inline def setFlexSettings(value: DeveloperMode): Self = StObject.set(x, "flexSettings", value.asInstanceOf[js.Any])
    
    inline def setFlexSettingsUndefined: Self = StObject.set(x, "flexSettings", js.undefined)
    
    inline def setRootControl(value: default | typings.openui5.sapUiCoreUicomponentMod.default): Self = StObject.set(x, "rootControl", value.asInstanceOf[js.Any])
  }
}
