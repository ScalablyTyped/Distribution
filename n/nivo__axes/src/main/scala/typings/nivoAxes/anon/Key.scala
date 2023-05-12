package typings.nivoAxes.anon

import typings.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key[Value /* <: ScaleValue */] extends StObject {
  
  var key: String
  
  var lineX: Double
  
  var lineY: Double
  
  var textX: Double
  
  var textY: Double
  
  var value: Value
  
  var x: Double
  
  var y: Double
}
object Key {
  
  inline def apply[Value /* <: ScaleValue */](
    key: String,
    lineX: Double,
    lineY: Double,
    textX: Double,
    textY: Double,
    value: Value,
    x: Double,
    y: Double
  ): Key[Value] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], lineX = lineX.asInstanceOf[js.Any], lineY = lineY.asInstanceOf[js.Any], textX = textX.asInstanceOf[js.Any], textY = textY.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key[?], Value /* <: ScaleValue */] (val x: Self & Key[Value]) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLineX(value: Double): Self = StObject.set(x, "lineX", value.asInstanceOf[js.Any])
    
    inline def setLineY(value: Double): Self = StObject.set(x, "lineY", value.asInstanceOf[js.Any])
    
    inline def setTextX(value: Double): Self = StObject.set(x, "textX", value.asInstanceOf[js.Any])
    
    inline def setTextY(value: Double): Self = StObject.set(x, "textY", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
