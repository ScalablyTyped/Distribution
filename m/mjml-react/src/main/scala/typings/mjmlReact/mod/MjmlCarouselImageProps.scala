package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlCarouselImageProps extends StObject {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var thumbnailsSrc: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object MjmlCarouselImageProps {
  
  @scala.inline
  def apply(): MjmlCarouselImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlCarouselImageProps]
  }
  
  @scala.inline
  implicit class MjmlCarouselImagePropsMutableBuilder[Self <: MjmlCarouselImageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setThumbnailsSrc(value: String): Self = StObject.set(x, "thumbnailsSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsSrcUndefined: Self = StObject.set(x, "thumbnailsSrc", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
