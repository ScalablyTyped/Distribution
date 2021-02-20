package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointBoundsObjectLiteral extends StObject {
  
  var maxX: Double = js.native
  
  var maxY: Double = js.native
  
  var minX: Double = js.native
  
  var minY: Double = js.native
}
object PointBoundsObjectLiteral {
  
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): PointBoundsObjectLiteral = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointBoundsObjectLiteral]
  }
  
  @scala.inline
  implicit class PointBoundsObjectLiteralMutableBuilder[Self <: PointBoundsObjectLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
  }
}
