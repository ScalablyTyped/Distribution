package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Face extends StObject {
  
  /**
    * Are the vertices counter-clockwise?
    */
  var isCounterClockwise: Boolean
  
  /**
    * The first face vertex.
    */
  var vertex1: Vertex
  
  /**
    * The second face vertex.
    */
  var vertex2: Vertex
  
  /**
    * The third face vertex.
    */
  var vertex3: Vertex
}
object Face {
  
  inline def apply(isCounterClockwise: Boolean, vertex1: Vertex, vertex2: Vertex, vertex3: Vertex): Face = {
    val __obj = js.Dynamic.literal(isCounterClockwise = isCounterClockwise.asInstanceOf[js.Any], vertex1 = vertex1.asInstanceOf[js.Any], vertex2 = vertex2.asInstanceOf[js.Any], vertex3 = vertex3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Face]
  }
  
  extension [Self <: Face](x: Self) {
    
    inline def setIsCounterClockwise(value: Boolean): Self = StObject.set(x, "isCounterClockwise", value.asInstanceOf[js.Any])
    
    inline def setVertex1(value: Vertex): Self = StObject.set(x, "vertex1", value.asInstanceOf[js.Any])
    
    inline def setVertex2(value: Vertex): Self = StObject.set(x, "vertex2", value.asInstanceOf[js.Any])
    
    inline def setVertex3(value: Vertex): Self = StObject.set(x, "vertex3", value.asInstanceOf[js.Any])
  }
}
