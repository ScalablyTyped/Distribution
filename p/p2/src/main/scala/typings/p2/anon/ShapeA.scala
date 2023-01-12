package typings.p2.anon

import typings.p2.mod.Shape
import typings.p2.p2Strings.endContact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeA extends StObject {
  
  var bodyA: typings.p2.mod.Body
  
  var bodyB: typings.p2.mod.Body
  
  var shapeA: Shape
  
  var shapeB: Shape
  
  var `type`: endContact
}
object ShapeA {
  
  inline def apply(bodyA: typings.p2.mod.Body, bodyB: typings.p2.mod.Body, shapeA: Shape, shapeB: Shape): ShapeA = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("endContact")
    __obj.asInstanceOf[ShapeA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeA] (val x: Self) extends AnyVal {
    
    inline def setBodyA(value: typings.p2.mod.Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyB(value: typings.p2.mod.Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setShapeA(value: Shape): Self = StObject.set(x, "shapeA", value.asInstanceOf[js.Any])
    
    inline def setShapeB(value: Shape): Self = StObject.set(x, "shapeB", value.asInstanceOf[js.Any])
    
    inline def setType(value: endContact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
