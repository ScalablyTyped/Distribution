package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BorderProperty
import typings.csstype.mod.BorderRadiusProperty
import typings.mjmlReact.mjmlReactStrings.hidden
import typings.mjmlReact.mjmlReactStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlCarouselProps extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  
  var iconWidth: js.UndefOr[String] = js.undefined
  
  var leftIcon: js.UndefOr[String] = js.undefined
  
  var rightIcon: js.UndefOr[String] = js.undefined
  
  var tbBorder: js.UndefOr[BorderProperty[String | Double]] = js.undefined
  
  var tbBorderRadius: js.UndefOr[BorderRadiusProperty[String | Double]] = js.undefined
  
  var tbHoverBorderColor: js.UndefOr[String] = js.undefined
  
  var tbSelectedBorderColor: js.UndefOr[String] = js.undefined
  
  var tbWidth: js.UndefOr[String] = js.undefined
  
  var thumbnails: js.UndefOr[hidden | visible] = js.undefined
}
object MjmlCarouselProps {
  
  inline def apply(): MjmlCarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlCarouselProps]
  }
  
  extension [Self <: MjmlCarouselProps](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setIconWidth(value: String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    inline def setLeftIcon(value: String): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    inline def setRightIcon(value: String): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    inline def setTbBorder(value: BorderProperty[String | Double]): Self = StObject.set(x, "tbBorder", value.asInstanceOf[js.Any])
    
    inline def setTbBorderRadius(value: BorderRadiusProperty[String | Double]): Self = StObject.set(x, "tbBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setTbBorderRadiusUndefined: Self = StObject.set(x, "tbBorderRadius", js.undefined)
    
    inline def setTbBorderUndefined: Self = StObject.set(x, "tbBorder", js.undefined)
    
    inline def setTbHoverBorderColor(value: String): Self = StObject.set(x, "tbHoverBorderColor", value.asInstanceOf[js.Any])
    
    inline def setTbHoverBorderColorUndefined: Self = StObject.set(x, "tbHoverBorderColor", js.undefined)
    
    inline def setTbSelectedBorderColor(value: String): Self = StObject.set(x, "tbSelectedBorderColor", value.asInstanceOf[js.Any])
    
    inline def setTbSelectedBorderColorUndefined: Self = StObject.set(x, "tbSelectedBorderColor", js.undefined)
    
    inline def setTbWidth(value: String): Self = StObject.set(x, "tbWidth", value.asInstanceOf[js.Any])
    
    inline def setTbWidthUndefined: Self = StObject.set(x, "tbWidth", js.undefined)
    
    inline def setThumbnails(value: hidden | visible): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
  }
}
