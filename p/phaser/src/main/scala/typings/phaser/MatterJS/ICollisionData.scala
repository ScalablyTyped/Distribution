package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollisionData extends StObject {
  
  var axisBody: Body
  
  var axisNumber: Double
  
  var bodyA: Body
  
  var bodyB: Body
  
  var collided: Boolean
  
  var depth: Double
  
  var friction: Double
  
  var frictionStatic: Double
  
  var inverseMass: Double
  
  var normal: Vector
  
  var parentA: Body
  
  var parentB: Body
  
  var penetration: Vector
  
  var restitution: Double
  
  var slop: Double
  
  var supports: js.Array[Vector]
  
  var tangent: Vector
}
object ICollisionData {
  
  @scala.inline
  def apply(
    axisBody: Body,
    axisNumber: Double,
    bodyA: Body,
    bodyB: Body,
    collided: Boolean,
    depth: Double,
    friction: Double,
    frictionStatic: Double,
    inverseMass: Double,
    normal: Vector,
    parentA: Body,
    parentB: Body,
    penetration: Vector,
    restitution: Double,
    slop: Double,
    supports: js.Array[Vector],
    tangent: Vector
  ): ICollisionData = {
    val __obj = js.Dynamic.literal(axisBody = axisBody.asInstanceOf[js.Any], axisNumber = axisNumber.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collided = collided.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], parentA = parentA.asInstanceOf[js.Any], parentB = parentB.asInstanceOf[js.Any], penetration = penetration.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], tangent = tangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionData]
  }
  
  @scala.inline
  implicit class ICollisionDataMutableBuilder[Self <: ICollisionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisBody(value: Body): Self = StObject.set(x, "axisBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisNumber(value: Double): Self = StObject.set(x, "axisNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyA(value: Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyB(value: Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollided(value: Boolean): Self = StObject.set(x, "collided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionStatic(value: Double): Self = StObject.set(x, "frictionStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseMass(value: Double): Self = StObject.set(x, "inverseMass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: Vector): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentA(value: Body): Self = StObject.set(x, "parentA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentB(value: Body): Self = StObject.set(x, "parentB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPenetration(value: Vector): Self = StObject.set(x, "penetration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlop(value: Double): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports(value: js.Array[Vector]): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsVarargs(value: Vector*): Self = StObject.set(x, "supports", js.Array(value :_*))
    
    @scala.inline
    def setTangent(value: Vector): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
  }
}
