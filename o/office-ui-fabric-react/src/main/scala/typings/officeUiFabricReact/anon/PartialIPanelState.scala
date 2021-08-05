package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.base.IPanelState> */
trait PartialIPanelState extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var isFooterSticky: js.UndefOr[Boolean] = js.undefined
  
  var visibility: js.UndefOr[PanelVisibilityState] = js.undefined
}
object PartialIPanelState {
  
  inline def apply(): PartialIPanelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIPanelState]
  }
  
  extension [Self <: PartialIPanelState](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsFooterSticky(value: Boolean): Self = StObject.set(x, "isFooterSticky", value.asInstanceOf[js.Any])
    
    inline def setIsFooterStickyUndefined: Self = StObject.set(x, "isFooterSticky", js.undefined)
    
    inline def setVisibility(value: PanelVisibilityState): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
