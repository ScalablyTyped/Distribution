package typings.phaser.Phaser.Types.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterCollisionPair extends StObject {
  
  /**
    * An array containing all of the active contacts between bodies A and B.
    */
  var activeContacts: js.Array[Vector]
  
  /**
    * A reference to the first body involved in the collision.
    */
  var bodyA: BodyType
  
  /**
    * A reference to the second body involved in the collision.
    */
  var bodyB: BodyType
  
  /**
    * The collision data object.
    */
  var collision: MatterCollisionData
  
  /**
    * Has Matter determined the collision are being active yet?
    */
  var confirmedActive: Boolean
  
  /**
    * The resulting friction from the collision.
    */
  var friction: Double
  
  /**
    * The resulting static friction from the collision.
    */
  var frictionStatic: Double
  
  /**
    * The unique auto-generated collision pair id. A combination of the body A and B IDs.
    */
  var id: String
  
  /**
    * The resulting inverse mass from the collision.
    */
  var inverseMass: Double
  
  /**
    * Is the collision still active or not?
    */
  var isActive: Boolean
  
  /**
    * Is either body A or B a sensor?
    */
  var isSensor: Boolean
  
  /**
    * The resulting restitution from the collision.
    */
  var restitution: Double
  
  /**
    * The amount of separation that occured between bodies A and B.
    */
  var separation: Double
  
  /**
    * The resulting slop from the collision.
    */
  var slop: Double
  
  /**
    * The timestamp when the collision pair was created.
    */
  var timeCreated: Double
  
  /**
    * The timestamp when the collision pair was most recently updated.
    */
  var timeUpdated: Double
}
object MatterCollisionPair {
  
  inline def apply(
    activeContacts: js.Array[Vector],
    bodyA: BodyType,
    bodyB: BodyType,
    collision: MatterCollisionData,
    confirmedActive: Boolean,
    friction: Double,
    frictionStatic: Double,
    id: String,
    inverseMass: Double,
    isActive: Boolean,
    isSensor: Boolean,
    restitution: Double,
    separation: Double,
    slop: Double,
    timeCreated: Double,
    timeUpdated: Double
  ): MatterCollisionPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collision = collision.asInstanceOf[js.Any], confirmedActive = confirmedActive.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterCollisionPair]
  }
  
  extension [Self <: MatterCollisionPair](x: Self) {
    
    inline def setActiveContacts(value: js.Array[Vector]): Self = StObject.set(x, "activeContacts", value.asInstanceOf[js.Any])
    
    inline def setActiveContactsVarargs(value: Vector*): Self = StObject.set(x, "activeContacts", js.Array(value :_*))
    
    inline def setBodyA(value: BodyType): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyB(value: BodyType): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setCollision(value: MatterCollisionData): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setConfirmedActive(value: Boolean): Self = StObject.set(x, "confirmedActive", value.asInstanceOf[js.Any])
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionStatic(value: Double): Self = StObject.set(x, "frictionStatic", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInverseMass(value: Double): Self = StObject.set(x, "inverseMass", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsSensor(value: Boolean): Self = StObject.set(x, "isSensor", value.asInstanceOf[js.Any])
    
    inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    inline def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    inline def setSlop(value: Double): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    inline def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeUpdated(value: Double): Self = StObject.set(x, "timeUpdated", value.asInstanceOf[js.Any])
  }
}
