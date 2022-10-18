package typings.next.anon

import typings.next.distServerLibSquooshImageDataMod.default
import typings.next.distServerLibSquooshImplMod.ResizeOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  width :number,   height :never | undefined} & {  image :next.next/dist/server/lib/squoosh/image_data.default} */
trait widthnumberheightneverund
  extends StObject
     with ResizeOpts {
  
  var height: js.UndefOr[scala.Nothing] = js.undefined
  
  var image: default
  
  var width: Double
}
object widthnumberheightneverund {
  
  inline def apply(image: default, width: Double): widthnumberheightneverund = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[widthnumberheightneverund]
  }
  
  extension [Self <: widthnumberheightneverund](x: Self) {
    
    inline def setImage(value: default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
