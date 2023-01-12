package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.mjmlReact.mjmlReactStrings.left
import typings.mjmlReact.mjmlReactStrings.right
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlAccordionProps extends StObject {
  
  /**
    * @deprecated backgroundColor doesn't exist on the mj-accordion element.
    * It is included for backwards compatibility with an erroneous version of the mjml-react types.
    */
  var backgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var border: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var iconAlign: js.UndefOr[String] = js.undefined
  
  var iconHeight: js.UndefOr[String] = js.undefined
  
  var iconPosition: js.UndefOr[left | right] = js.undefined
  
  var iconUnwrappedAlt: js.UndefOr[String] = js.undefined
  
  var iconUnwrappedUrl: js.UndefOr[String] = js.undefined
  
  var iconWidth: js.UndefOr[String] = js.undefined
  
  var iconWrappedAlt: js.UndefOr[String] = js.undefined
  
  var iconWrappedUrl: js.UndefOr[String] = js.undefined
}
object MjmlAccordionProps {
  
  inline def apply(): MjmlAccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlAccordionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MjmlAccordionProps] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContainerBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setIconAlign(value: String): Self = StObject.set(x, "iconAlign", value.asInstanceOf[js.Any])
    
    inline def setIconAlignUndefined: Self = StObject.set(x, "iconAlign", js.undefined)
    
    inline def setIconHeight(value: String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    inline def setIconPosition(value: left | right): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
    
    inline def setIconUnwrappedAlt(value: String): Self = StObject.set(x, "iconUnwrappedAlt", value.asInstanceOf[js.Any])
    
    inline def setIconUnwrappedAltUndefined: Self = StObject.set(x, "iconUnwrappedAlt", js.undefined)
    
    inline def setIconUnwrappedUrl(value: String): Self = StObject.set(x, "iconUnwrappedUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUnwrappedUrlUndefined: Self = StObject.set(x, "iconUnwrappedUrl", js.undefined)
    
    inline def setIconWidth(value: String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    inline def setIconWrappedAlt(value: String): Self = StObject.set(x, "iconWrappedAlt", value.asInstanceOf[js.Any])
    
    inline def setIconWrappedAltUndefined: Self = StObject.set(x, "iconWrappedAlt", js.undefined)
    
    inline def setIconWrappedUrl(value: String): Self = StObject.set(x, "iconWrappedUrl", value.asInstanceOf[js.Any])
    
    inline def setIconWrappedUrlUndefined: Self = StObject.set(x, "iconWrappedUrl", js.undefined)
  }
}
