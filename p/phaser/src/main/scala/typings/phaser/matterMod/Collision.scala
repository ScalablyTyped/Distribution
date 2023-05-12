package typings.phaser.matterMod

import typings.phaser.MatterJS.BodyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  v0.18 Release Updates
@JSImport("matter", "Collision")
@js.native
open class Collision ()
  extends StObject
     with typings.phaser.MatterJS.Collision {
  
  /**
    * Detect collision between two bodies.
    * @method collides
    * @param {BodyType} bodyA
    * @param {BodyType} bodyB
    * @param {Pairs} [pairs] Optionally reuse collision records from existing pairs.
    * @return {collision|null} A collision record if detected, otherwise null
    */
  /* CompleteClass */
  override def collides(bodyA: BodyType, bodyB: BodyType, pairs: typings.phaser.MatterJS.Pairs): Any = js.native
  
  /**
    * Creates a new collision record.
    * @method create
    * @param {BodyType} bodyA The first body part represented by the collision record
    * @param {BodyType} bodyB The second body part represented by the collision record
    * @return {collision} A new collision record
    */
  /* CompleteClass */
  override def create(bodyA: BodyType, bodyB: BodyType): Any = js.native
}
