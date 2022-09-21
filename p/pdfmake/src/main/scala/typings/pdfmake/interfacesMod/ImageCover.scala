package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCover extends StObject {
  
  /**
    * Horizontal alignment of the image inside the cover container if it is wider.
    *
    * Defaults to `center`.
    */
  var align: js.UndefOr[ImageAlignment] = js.undefined
  
  /**
    * Container height in `pt`.
    *
    * Defaults to the image's (specified or native) width.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Vertical alignment of the image inside the cover container if it is higher.
    *
    * Defaults to `center`.
    */
  var valign: js.UndefOr[ImageVerticalAlignment] = js.undefined
  
  /**
    * Container width in `pt`.
    *
    * Defaults to the image's (specified or native) width.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ImageCover {
  
  inline def apply(): ImageCover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageCover]
  }
  
  extension [Self <: ImageCover](x: Self) {
    
    inline def setAlign(value: ImageAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setValign(value: ImageVerticalAlignment): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
