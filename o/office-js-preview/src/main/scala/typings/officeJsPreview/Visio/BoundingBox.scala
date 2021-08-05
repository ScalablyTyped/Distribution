package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the BoundingBox of the shape.
  *
  * [Api set:  1.1]
  */
trait BoundingBox extends StObject {
  
  /**
    *
    * The distance between the top and bottom edges of the bounding box of the shape, excluding any data graphics associated with the shape.
    *
    * [Api set:  1.1]
    */
  var height: Double
  
  /**
    *
    * The distance between the left and right edges of the bounding box of the shape, excluding any data graphics associated with the shape.
    *
    * [Api set:  1.1]
    */
  var width: Double
  
  /**
    *
    * An integer that specifies the x-coordinate of the bounding box.
    *
    * [Api set:  1.1]
    */
  var x: Double
  
  /**
    *
    * An integer that specifies the y-coordinate of the bounding box.
    *
    * [Api set:  1.1]
    */
  var y: Double
}
object BoundingBox {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
  
  extension [Self <: BoundingBox](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
