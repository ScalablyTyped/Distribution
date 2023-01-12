package typings.nivoBar.anon

import typings.nivoBar.distTypesTypesMod.BarDatum
import typings.nivoBar.distTypesTypesMod.ComputedDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbsX[RawDatum /* <: BarDatum */] extends StObject {
  
  var absX: Double
  
  var absY: Double
  
  var color: String
  
  var data: ComputedDatum[RawDatum] & Value
  
  var height: Double
  
  var index: Double
  
  var key: String
  
  var label: String
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object AbsX {
  
  inline def apply[RawDatum /* <: BarDatum */](
    absX: Double,
    absY: Double,
    color: String,
    data: ComputedDatum[RawDatum] & Value,
    height: Double,
    index: Double,
    key: String,
    label: String,
    width: Double,
    x: Double,
    y: Double
  ): AbsX[RawDatum] = {
    val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsX[RawDatum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbsX[?], RawDatum /* <: BarDatum */] (val x: Self & AbsX[RawDatum]) extends AnyVal {
    
    inline def setAbsX(value: Double): Self = StObject.set(x, "absX", value.asInstanceOf[js.Any])
    
    inline def setAbsY(value: Double): Self = StObject.set(x, "absY", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setData(value: ComputedDatum[RawDatum] & Value): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
