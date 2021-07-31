package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.mjmlReact.mjmlReactStrings.left
import typings.mjmlReact.mjmlReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlAccordionElementProps extends StObject {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
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
object MjmlAccordionElementProps {
  
  @scala.inline
  def apply(): MjmlAccordionElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlAccordionElementProps]
  }
  
  @scala.inline
  implicit class MjmlAccordionElementPropsMutableBuilder[Self <: MjmlAccordionElementProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setIconAlign(value: String): Self = StObject.set(x, "iconAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconAlignUndefined: Self = StObject.set(x, "iconAlign", js.undefined)
    
    @scala.inline
    def setIconHeight(value: String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    @scala.inline
    def setIconPosition(value: left | right): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
    
    @scala.inline
    def setIconUnwrappedAlt(value: String): Self = StObject.set(x, "iconUnwrappedAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUnwrappedAltUndefined: Self = StObject.set(x, "iconUnwrappedAlt", js.undefined)
    
    @scala.inline
    def setIconUnwrappedUrl(value: String): Self = StObject.set(x, "iconUnwrappedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUnwrappedUrlUndefined: Self = StObject.set(x, "iconUnwrappedUrl", js.undefined)
    
    @scala.inline
    def setIconWidth(value: String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    @scala.inline
    def setIconWrappedAlt(value: String): Self = StObject.set(x, "iconWrappedAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconWrappedAltUndefined: Self = StObject.set(x, "iconWrappedAlt", js.undefined)
    
    @scala.inline
    def setIconWrappedUrl(value: String): Self = StObject.set(x, "iconWrappedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconWrappedUrlUndefined: Self = StObject.set(x, "iconWrappedUrl", js.undefined)
  }
}
