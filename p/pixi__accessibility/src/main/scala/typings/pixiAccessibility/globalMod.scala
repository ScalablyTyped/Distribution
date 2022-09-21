package typings.pixiAccessibility

import typings.pixiAccessibility.mod.IAccessibleHTMLElement
import typings.pixiAccessibility.mod.PointerEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  object GlobalMixins {
    
    // eslint-disable-next-line @typescript-eslint/no-empty-interface
    /* Inlined parent std.Partial<@pixi/accessibility.@pixi/accessibility.IAccessibleTarget> */
    trait DisplayObject extends StObject {
      
      var _accessibleActive: js.UndefOr[Boolean] = js.undefined
      
      var _accessibleDiv: js.UndefOr[IAccessibleHTMLElement] = js.undefined
      
      var accessible: js.UndefOr[Boolean] = js.undefined
      
      var accessibleChildren: js.UndefOr[Boolean] = js.undefined
      
      var accessibleHint: js.UndefOr[String] = js.undefined
      
      var accessiblePointerEvents: js.UndefOr[PointerEvents] = js.undefined
      
      var accessibleTitle: js.UndefOr[String] = js.undefined
      
      var accessibleType: js.UndefOr[String] = js.undefined
      
      var renderId: js.UndefOr[Double] = js.undefined
      
      var tabIndex: js.UndefOr[Double] = js.undefined
    }
    object DisplayObject {
      
      inline def apply(): DisplayObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DisplayObject]
      }
      
      extension [Self <: DisplayObject](x: Self) {
        
        inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
        
        inline def setAccessibleChildren(value: Boolean): Self = StObject.set(x, "accessibleChildren", value.asInstanceOf[js.Any])
        
        inline def setAccessibleChildrenUndefined: Self = StObject.set(x, "accessibleChildren", js.undefined)
        
        inline def setAccessibleHint(value: String): Self = StObject.set(x, "accessibleHint", value.asInstanceOf[js.Any])
        
        inline def setAccessibleHintUndefined: Self = StObject.set(x, "accessibleHint", js.undefined)
        
        inline def setAccessiblePointerEvents(value: PointerEvents): Self = StObject.set(x, "accessiblePointerEvents", value.asInstanceOf[js.Any])
        
        inline def setAccessiblePointerEventsUndefined: Self = StObject.set(x, "accessiblePointerEvents", js.undefined)
        
        inline def setAccessibleTitle(value: String): Self = StObject.set(x, "accessibleTitle", value.asInstanceOf[js.Any])
        
        inline def setAccessibleTitleUndefined: Self = StObject.set(x, "accessibleTitle", js.undefined)
        
        inline def setAccessibleType(value: String): Self = StObject.set(x, "accessibleType", value.asInstanceOf[js.Any])
        
        inline def setAccessibleTypeUndefined: Self = StObject.set(x, "accessibleType", js.undefined)
        
        inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
        
        inline def setRenderId(value: Double): Self = StObject.set(x, "renderId", value.asInstanceOf[js.Any])
        
        inline def setRenderIdUndefined: Self = StObject.set(x, "renderId", js.undefined)
        
        inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        inline def set_accessibleActive(value: Boolean): Self = StObject.set(x, "_accessibleActive", value.asInstanceOf[js.Any])
        
        inline def set_accessibleActiveUndefined: Self = StObject.set(x, "_accessibleActive", js.undefined)
        
        inline def set_accessibleDiv(value: IAccessibleHTMLElement): Self = StObject.set(x, "_accessibleDiv", value.asInstanceOf[js.Any])
        
        inline def set_accessibleDivUndefined: Self = StObject.set(x, "_accessibleDiv", js.undefined)
      }
    }
  }
}
