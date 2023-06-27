package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetInfo extends StObject {
  
  var control: default
  
  var name: String
  
  var targetInfo: typings.openui5.sapUiCoreRoutingTargetsMod.TargetInfo
  
  var view: typings.openui5.sapUiCoreMvcViewMod.default
}
object TargetInfo {
  
  inline def apply(
    control: default,
    name: String,
    targetInfo: typings.openui5.sapUiCoreRoutingTargetsMod.TargetInfo,
    view: typings.openui5.sapUiCoreMvcViewMod.default
  ): TargetInfo = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetInfo = targetInfo.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetInfo] (val x: Self) extends AnyVal {
    
    inline def setControl(value: default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTargetInfo(value: typings.openui5.sapUiCoreRoutingTargetsMod.TargetInfo): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
    
    inline def setView(value: typings.openui5.sapUiCoreMvcViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
