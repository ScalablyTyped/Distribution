package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Img extends StObject {
  
  var img: Any
  
  var paintHeight: Any
  
  var paintWidth: Any
}
object Img {
  
  inline def apply(img: Any, paintHeight: Any, paintWidth: Any): Img = {
    val __obj = js.Dynamic.literal(img = img.asInstanceOf[js.Any], paintHeight = paintHeight.asInstanceOf[js.Any], paintWidth = paintWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Img]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Img] (val x: Self) extends AnyVal {
    
    inline def setImg(value: Any): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setPaintHeight(value: Any): Self = StObject.set(x, "paintHeight", value.asInstanceOf[js.Any])
    
    inline def setPaintWidth(value: Any): Self = StObject.set(x, "paintWidth", value.asInstanceOf[js.Any])
  }
}
