package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ICollisionData
import typings.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MatterJS.PairFactory")
@js.native
open class PairFactory ()
  extends StObject
     with typings.phaser.MatterJS.PairFactory {
  
  /**
    * Creates a pair.
    * @method create
    * @param {ICollisionData} collision
    * @param {number} timestamp
    * @return {IPair} A new pair
    */
  /* CompleteClass */
  override def create(collision: ICollisionData, timestamp: Double): IPair = js.native
  
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @return {string} Unique pairId
    */
  /* CompleteClass */
  override def id(bodyA: BodyType, bodyB: BodyType): String = js.native
  
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {IPair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  /* CompleteClass */
  override def setActive(pair: IPair, isActive: Boolean, timestamp: Double): Unit = js.native
  
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {IPair} pair
    * @param {ICollisionData} collision
    * @param {number} timestamp
    */
  /* CompleteClass */
  override def update(pair: IPair, collision: ICollisionData, timestamp: Double): Unit = js.native
}
