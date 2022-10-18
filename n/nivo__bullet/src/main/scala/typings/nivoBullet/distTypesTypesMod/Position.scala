package typings.nivoBullet.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position
  extends StObject
     with Point {
  
  var rotation: Double
  
  var size: Double
}
object Position {
  
  inline def apply(rotation: Double, size: Double, x: Double, y: Double): Position = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
