package typings.next.anon

import typings.next.distServerLibSquooshImageDataMod.default
import typings.next.distServerLibSquooshImplMod.ResizeOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  height :number,   width :number} & {  image :next.next/dist/server/lib/squoosh/image_data.default} */
trait heightnumberwidthnumberim
  extends StObject
     with ResizeOpts {
  
  var height: Double
  
  var image: default
  
  var width: Double
}
object heightnumberwidthnumberim {
  
  inline def apply(height: Double, image: default, width: Double): heightnumberwidthnumberim = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[heightnumberwidthnumberim]
  }
  
  extension [Self <: heightnumberwidthnumberim](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImage(value: default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
