package typings.next.anon

import typings.next.distServerLibSquooshMainMod.ResizeOperation
import typings.next.nextStrings.resize_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  height :number,   width :never | undefined} & {  type :'resize'} */
trait heightnumberwidthneverundHeight
  extends StObject
     with ResizeOperation {
  
  var height: Double
  
  var `type`: resize_
  
  var width: js.UndefOr[scala.Nothing] = js.undefined
}
object heightnumberwidthneverundHeight {
  
  inline def apply(height: Double): heightnumberwidthneverundHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("resize")
    __obj.asInstanceOf[heightnumberwidthneverundHeight]
  }
  
  extension [Self <: heightnumberwidthneverundHeight](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setType(value: resize_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
