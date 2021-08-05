package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new SingleContactResult.
  * @property a - The first entity involved in the contact.
  * @property b - The second entity involved in the contact.
  * @property localPointA - The point on Entity A where the contact occurred, relative to A.
  * @property localPointB - The point on Entity B where the contact occurred, relative to B.
  * @property pointA - The point on Entity A where the contact occurred, in world space.
  * @property pointB - The point on Entity B where the contact occurred, in world space.
  * @property normal - The normal vector of the contact on Entity B, in world space.
  * @param a - The first entity involved in the contact.
  * @param b - The second entity involved in the contact.
  * @param contactPoint - The contact point between the two entities.
  */
trait SingleContactResult extends StObject {
  
  /**
    * The first entity involved in the contact.
    */
  var a: Entity
  
  /**
    * The second entity involved in the contact.
    */
  var b: Entity
  
  /**
    * The point on Entity A where the contact occurred, relative to A.
    */
  var localPointA: Vec3
  
  /**
    * The point on Entity B where the contact occurred, relative to B.
    */
  var localPointB: Vec3
  
  /**
    * The normal vector of the contact on Entity B, in world space.
    */
  var normal: Vec3
  
  /**
    * The point on Entity A where the contact occurred, in world space.
    */
  var pointA: Vec3
  
  /**
    * The point on Entity B where the contact occurred, in world space.
    */
  var pointB: Vec3
}
object SingleContactResult {
  
  inline def apply(
    a: Entity,
    b: Entity,
    localPointA: Vec3,
    localPointB: Vec3,
    normal: Vec3,
    pointA: Vec3,
    pointB: Vec3
  ): SingleContactResult = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], localPointA = localPointA.asInstanceOf[js.Any], localPointB = localPointB.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], pointA = pointA.asInstanceOf[js.Any], pointB = pointB.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleContactResult]
  }
  
  extension [Self <: SingleContactResult](x: Self) {
    
    inline def setA(value: Entity): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Entity): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setLocalPointA(value: Vec3): Self = StObject.set(x, "localPointA", value.asInstanceOf[js.Any])
    
    inline def setLocalPointB(value: Vec3): Self = StObject.set(x, "localPointB", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: Vec3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setPointA(value: Vec3): Self = StObject.set(x, "pointA", value.asInstanceOf[js.Any])
    
    inline def setPointB(value: Vec3): Self = StObject.set(x, "pointB", value.asInstanceOf[js.Any])
  }
}
