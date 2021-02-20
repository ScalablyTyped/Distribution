package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomRightCorner extends StObject {
  
  var bottomRightCorner: Double = js.native
  
  var sides: js.UndefOr[Left] = js.native
  
  var size: Double = js.native
}
object BottomRightCorner {
  
  @scala.inline
  def apply(bottomRightCorner: Double, size: Double): BottomRightCorner = {
    val __obj = js.Dynamic.literal(bottomRightCorner = bottomRightCorner.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRightCorner]
  }
  
  @scala.inline
  implicit class BottomRightCornerMutableBuilder[Self <: BottomRightCorner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomRightCorner(value: Double): Self = StObject.set(x, "bottomRightCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSides(value: Left): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
