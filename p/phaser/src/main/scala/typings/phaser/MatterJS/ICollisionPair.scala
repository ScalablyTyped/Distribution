package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollisionPair extends StObject {
  
  var activeContacts: js.Array[Vector]
  
  var bodyA: Body
  
  var bodyB: Body
  
  var collision: ICollisionData
  
  var confirmedActive: Boolean
  
  var friction: Double
  
  var frictionStatic: Double
  
  var id: String
  
  var inverseMass: Double
  
  var isActive: Boolean
  
  var isSensor: Boolean
  
  var restitution: Double
  
  var separation: Double
  
  var slop: Double
  
  var timeCreated: Double
  
  var timeUpdated: Double
}
object ICollisionPair {
  
  @scala.inline
  def apply(
    activeContacts: js.Array[Vector],
    bodyA: Body,
    bodyB: Body,
    collision: ICollisionData,
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
  ): ICollisionPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collision = collision.asInstanceOf[js.Any], confirmedActive = confirmedActive.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], frictionStatic = frictionStatic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inverseMass = inverseMass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], slop = slop.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeUpdated = timeUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionPair]
  }
  
  @scala.inline
  implicit class ICollisionPairMutableBuilder[Self <: ICollisionPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveContacts(value: js.Array[Vector]): Self = StObject.set(x, "activeContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveContactsVarargs(value: Vector*): Self = StObject.set(x, "activeContacts", js.Array(value :_*))
    
    @scala.inline
    def setBodyA(value: Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyB(value: Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollision(value: ICollisionData): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmedActive(value: Boolean): Self = StObject.set(x, "confirmedActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionStatic(value: Double): Self = StObject.set(x, "frictionStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseMass(value: Double): Self = StObject.set(x, "inverseMass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSensor(value: Boolean): Self = StObject.set(x, "isSensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlop(value: Double): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUpdated(value: Double): Self = StObject.set(x, "timeUpdated", value.asInstanceOf[js.Any])
  }
}
