package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PairFactory extends StObject {
  
  /**
    * Creates a pair.
    * @method create
    * @param {ICollisionData} collision
    * @param {number} timestamp
    * @return {IPair} A new pair
    */
  def create(collision: ICollisionData, timestamp: Double): IPair
  
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @return {string} Unique pairId
    */
  def id(bodyA: BodyType, bodyB: BodyType): String
  
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {IPair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  def setActive(pair: IPair, isActive: Boolean, timestamp: Double): Unit
  
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {IPair} pair
    * @param {ICollisionData} collision
    * @param {number} timestamp
    */
  def update(pair: IPair, collision: ICollisionData, timestamp: Double): Unit
}
object PairFactory {
  
  @scala.inline
  def apply(
    create: (ICollisionData, Double) => IPair,
    id: (BodyType, BodyType) => String,
    setActive: (IPair, Boolean, Double) => Unit,
    update: (IPair, ICollisionData, Double) => Unit
  ): PairFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), id = js.Any.fromFunction2(id), setActive = js.Any.fromFunction3(setActive), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[PairFactory]
  }
  
  @scala.inline
  implicit class PairFactoryMutableBuilder[Self <: PairFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (ICollisionData, Double) => IPair): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setId(value: (BodyType, BodyType) => String): Self = StObject.set(x, "id", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetActive(value: (IPair, Boolean, Double) => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdate(value: (IPair, ICollisionData, Double) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
