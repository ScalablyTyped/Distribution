package typings.nodeSpriteGenerator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {  x :number,   y :number} & node-sprite-generator.node-sprite-generator.Image */
  trait xnumberynumberImage extends StObject {
    
    var data: Any
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object xnumberynumberImage {
    
    inline def apply(data: Any, height: Double, width: Double, x: Double, y: Double): xnumberynumberImage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[xnumberynumberImage]
    }
    
    extension [Self <: xnumberynumberImage](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
