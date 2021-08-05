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
  
  inline def apply(): MjmlCarouselImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlCarouselImageProps]
  }
  
  extension [Self <: MjmlCarouselImageProps](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setThumbnailsSrc(value: String): Self = StObject.set(x, "thumbnailsSrc", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsSrcUndefined: Self = StObject.set(x, "thumbnailsSrc", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
