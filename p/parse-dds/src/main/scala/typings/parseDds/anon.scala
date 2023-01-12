package typings.parseDds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Length extends StObject {
    
    // by length
    var length: Double
    
    // byte offset
    var offset: Double
    
    // width, height
    var shape: js.Tuple2[Double, Double]
  }
  object Length {
    
    inline def apply(length: Double, offset: Double, shape: js.Tuple2[Double, Double]): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
}
