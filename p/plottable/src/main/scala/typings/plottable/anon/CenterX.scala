package typings.plottable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CenterX extends StObject {
  
  var centerX: Double = js.native
  
  var centerY: Double = js.native
}
object CenterX {
  
  @scala.inline
  def apply(centerX: Double, centerY: Double): CenterX = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterX]
  }
  
  @scala.inline
  implicit class CenterXMutableBuilder[Self <: CenterX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
  }
}
