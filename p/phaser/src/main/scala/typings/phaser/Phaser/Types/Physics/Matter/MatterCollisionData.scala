package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterCollisionData extends StObject {
  
  /**
    * A reference to the dominant axis body.
    */
  var axisBody: BodyType = js.native
  
  /**
    * The index of the dominant collision axis vector (edge normal)
    */
  var axisNumber: Double = js.native
  
  /**
    * A reference to the first body involved in the collision.
    */
  var bodyA: BodyType = js.native
  
  /**
    * A reference to the second body involved in the collision.
    */
  var bodyB: BodyType = js.native
  
  /**
    * Have the pair collided or not?
    */
  var collided: Boolean = js.native
  
  /**
    * The depth of the collision on the minimum overlap.
    */
  var depth: Double = js.native
  
  /**
    * The resulting friction from the collision.
    */
  var friction: Double = js.native
  
  /**
    * The resulting static friction from the collision.
    */
  var frictionStatic: Double = js.native
  
  /**
    * The resulting inverse mass from the collision.
    */
  var inverseMass: Double = js.native
  
  /**
    * The collision normal, facing away from Body A.
    */
  var normal: Vector = js.native
  
  /**
    * A reference to the parent of Body A, or to Body A itself if it has no parent.
    */
  var parentA: BodyType = js.native
  
  /**
    * A reference to the parent of Body B, or to Body B itself if it has no parent.
    */
  var parentB: BodyType = js.native
  
  /**
    * The penetration distances between the two bodies.
    */
  var penetration: Vector = js.native
  
  /**
    * The resulting restitution from the collision.
    */
  var restitution: Double = js.native
  
  /**
    * The resulting slop from the collision.
    */
  var slop: Double = js.native
  
  /**
    * An array of support points, either exactly one or two points.
    */
  var supports: js.Array[Vector] = js.native
  
  /**
    * The tangent of the collision normal.
    */
  var tangent: Vector = js.native
}
object MatterCollisionData {
  
  @scala.inline
  def apply(
    axisBody: BodyType,
    axisNumber: Double,
    bodyA: BodyType,
    bodyB: BodyType,
    collided: Boolean,
    depth: Double,
    friction: Double,
    frictionStatic: Double,
    inverseMass: Double,
    normal: Vector,
    parentA: BodyType,
    parentB: BodyType,
    penetration: Vector,
    restitution: Double,
    slop: Double,
    supports: js.Array[Vector],
    tangent: Vector
  ): MatterCollisionData = {
    val __obj = js.Dynamic.literal(axisBody = axisBody.asInstanceOf[js.Any], axisNumber = axisNumber.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collided = collided.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], parentA = parentA.asInstanceOf[js.Any], parentB = parentB.asInstanceOf[js.Any], penetration = penetration.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any], tangent = tangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterCollisionData]
  }
  
  @scala.inline
  implicit class MatterCollisionDataMutableBuilder[Self <: MatterCollisionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisBody(value: BodyType): Self = StObject.set(x, "axisBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisNumber(value: Double): Self = StObject.set(x, "axisNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyA(value: BodyType): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyB(value: BodyType): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
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
    def setParentA(value: BodyType): Self = StObject.set(x, "parentA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentB(value: BodyType): Self = StObject.set(x, "parentB", value.asInstanceOf[js.Any])
    
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
