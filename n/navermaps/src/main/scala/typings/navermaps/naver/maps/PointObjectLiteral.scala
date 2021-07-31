package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointObjectLiteral extends StObject {
  
  var x: Double
  
  var y: Double
}
object PointObjectLiteral {
  
  @scala.inline
  def apply(x: Double, y: Double): PointObjectLiteral = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointObjectLiteral]
  }
  
  @scala.inline
  implicit class PointObjectLiteralMutableBuilder[Self <: PointObjectLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
