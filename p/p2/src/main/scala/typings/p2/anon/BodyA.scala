package typings.p2.anon

import typings.p2.mod.ContactEquation
import typings.p2.mod.Shape
import typings.p2.p2Strings.impact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyA extends StObject {
  
  var bodyA: typings.p2.mod.Body
  
  var bodyB: typings.p2.mod.Body
  
  var contactEquation: ContactEquation
  
  var shapeA: Shape
  
  var shapeB: Shape
  
  var `type`: impact
}
object BodyA {
  
  inline def apply(
    bodyA: typings.p2.mod.Body,
    bodyB: typings.p2.mod.Body,
    contactEquation: ContactEquation,
    shapeA: Shape,
    shapeB: Shape
  ): BodyA = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contactEquation = contactEquation.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("impact")
    __obj.asInstanceOf[BodyA]
  }
  
  extension [Self <: BodyA](x: Self) {
    
    inline def setBodyA(value: typings.p2.mod.Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyB(value: typings.p2.mod.Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setContactEquation(value: ContactEquation): Self = StObject.set(x, "contactEquation", value.asInstanceOf[js.Any])
    
    inline def setShapeA(value: Shape): Self = StObject.set(x, "shapeA", value.asInstanceOf[js.Any])
    
    inline def setShapeB(value: Shape): Self = StObject.set(x, "shapeB", value.asInstanceOf[js.Any])
    
    inline def setType(value: impact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
