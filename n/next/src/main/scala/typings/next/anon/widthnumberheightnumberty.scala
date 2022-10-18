package typings.next.anon

import typings.next.distServerLibSquooshMainMod.ResizeOperation
import typings.next.nextStrings.resize_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  width :number,   height :number} & {  type :'resize'} */
trait widthnumberheightnumberty
  extends StObject
     with ResizeOperation {
  
  var height: Double
  
  var `type`: resize_
  
  var width: Double
}
object widthnumberheightnumberty {
  
  inline def apply(height: Double, width: Double): widthnumberheightnumberty = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("resize")
    __obj.asInstanceOf[widthnumberheightnumberty]
  }
  
  extension [Self <: widthnumberheightnumberty](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setType(value: resize_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
