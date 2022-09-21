package typings.mjmlReact.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Border
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlImageProps extends StObject {
  
  var align: js.UndefOr[String] = js.undefined
  
  var alt: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[Border[String | Double]] = js.undefined
  
  var borderRadius: js.UndefOr[String | Double] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var containerBackgroundColor: js.UndefOr[BackgroundColor] = js.undefined
  
  var fluidOnMobile: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srcset: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object MjmlImageProps {
  
  inline def apply(): MjmlImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlImageProps]
  }
  
  extension [Self <: MjmlImageProps](x: Self) {
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setBorder(value: Border[String | Double]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContainerBackgroundColor(value: BackgroundColor): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setFluidOnMobile(value: String): Self = StObject.set(x, "fluidOnMobile", value.asInstanceOf[js.Any])
    
    inline def setFluidOnMobileUndefined: Self = StObject.set(x, "fluidOnMobile", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
    
    inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
