package typings.phaser.mod

import typings.phaser.MatterJS.ICollisionData
import typings.phaser.MatterJS.ICollisionFilter
import typings.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter", "DetectorFactory")
@js.native
class DetectorFactory ()
  extends StObject
     with typings.phaser.MatterJS.DetectorFactory {
  
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  /* CompleteClass */
  override def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = js.native
  
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  /* CompleteClass */
  override def collisions(broadphasePairs: js.Array[IPair], engine: typings.phaser.MatterJS.Engine): js.Array[ICollisionData] = js.native
}
