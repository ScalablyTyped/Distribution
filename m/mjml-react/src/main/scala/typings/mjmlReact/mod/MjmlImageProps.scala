package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BorderProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlImageProps extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var alt: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[BorderProperty[String | Double]] = js.native
  
  var borderRadius: js.UndefOr[String | Double] = js.native
  
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var fluidOnMobile: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[String | Double] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var srcset: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object MjmlImageProps {
  
  @scala.inline
  def apply(): MjmlImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlImageProps]
  }
  
  @scala.inline
  implicit class MjmlImagePropsMutableBuilder[Self <: MjmlImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setBorder(value: BorderProperty[String | Double]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    @scala.inline
    def setFluidOnMobile(value: String): Self = StObject.set(x, "fluidOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFluidOnMobileUndefined: Self = StObject.set(x, "fluidOnMobile", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
