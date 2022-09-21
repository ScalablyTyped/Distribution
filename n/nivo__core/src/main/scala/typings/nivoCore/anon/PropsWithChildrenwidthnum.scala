package typings.nivoCore.anon

import typings.nivoCore.mod.Margin
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.PropsWithChildren<{  width :number,   height :number,   margin :@nivo/core.@nivo/core.Margin,   defs :any | undefined,   role :string | undefined,   ariaLabel :react.react.AriaAttributes['aria-label'] | undefined,   ariaLabelledBy :react.react.AriaAttributes['aria-labelledby'] | undefined,   ariaDescribedBy :react.react.AriaAttributes['aria-describedby'] | undefined,   isFocusable :boolean | undefined}> */
trait PropsWithChildrenwidthnum extends StObject {
  
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var defs: js.UndefOr[Any] = js.undefined
  
  var height: Double
  
  var isFocusable: js.UndefOr[Boolean] = js.undefined
  
  var margin: Margin
  
  var role: js.UndefOr[String] = js.undefined
  
  var width: Double
}
object PropsWithChildrenwidthnum {
  
  inline def apply(height: Double, margin: Margin, width: Double): PropsWithChildrenwidthnum = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildrenwidthnum]
  }
  
  extension [Self <: PropsWithChildrenwidthnum](x: Self) {
    
    inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDefs(value: Any): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsFocusable(value: Boolean): Self = StObject.set(x, "isFocusable", value.asInstanceOf[js.Any])
    
    inline def setIsFocusableUndefined: Self = StObject.set(x, "isFocusable", js.undefined)
    
    inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
