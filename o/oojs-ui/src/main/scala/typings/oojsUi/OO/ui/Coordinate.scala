package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinate extends StObject {
  
  var left: Double
  
  var top: Double
}
object Coordinate {
  
  inline def apply(left: Double, top: Double): Coordinate = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
