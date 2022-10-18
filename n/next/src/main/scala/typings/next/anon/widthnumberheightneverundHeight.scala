package typings.next.anon

import typings.next.distServerLibSquooshMainMod.ResizeOperation
import typings.next.nextStrings.resize_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  width :number,   height :never | undefined} & {  type :'resize'} */
trait widthnumberheightneverundHeight
  extends StObject
     with ResizeOperation {
  
  var height: js.UndefOr[scala.Nothing] = js.undefined
  
  var `type`: resize_
  
  var width: Double
}
object widthnumberheightneverundHeight {
  
  inline def apply(width: Double): widthnumberheightneverundHeight = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("resize")
    __obj.asInstanceOf[widthnumberheightneverundHeight]
  }
  
  extension [Self <: widthnumberheightneverundHeight](x: Self) {
    
    inline def setType(value: resize_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
