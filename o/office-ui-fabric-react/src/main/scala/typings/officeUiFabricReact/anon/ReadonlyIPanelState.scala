package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Panel/Panel.base.IPanelState> */
trait ReadonlyIPanelState extends StObject {
  
  val id: js.UndefOr[String] = js.undefined
  
  val isFooterSticky: js.UndefOr[Boolean] = js.undefined
  
  val visibility: PanelVisibilityState
}
object ReadonlyIPanelState {
  
  inline def apply(visibility: PanelVisibilityState): ReadonlyIPanelState = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIPanelState]
  }
  
  extension [Self <: ReadonlyIPanelState](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsFooterSticky(value: Boolean): Self = StObject.set(x, "isFooterSticky", value.asInstanceOf[js.Any])
    
    inline def setIsFooterStickyUndefined: Self = StObject.set(x, "isFooterSticky", js.undefined)
    
    inline def setVisibility(value: PanelVisibilityState): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
