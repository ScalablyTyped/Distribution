package typings.phaser.mod

import typings.phaser.MatterJS.ICollisionData
import typings.phaser.MatterJS.ICollisionFilter
import typings.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Detector` module contains methods for detecting collisions given a set of pairs.
  *
  * @class Detector
  */
@JSImport("matter", "Detector")
@js.native
class Detector ()
  extends StObject
     with typings.phaser.MatterJS.Detector
object Detector {
  
  @JSImport("matter", "Detector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  /* static member */
  @scala.inline
  def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canCollide")(filterA.asInstanceOf[js.Any], filterB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  /* static member */
  @scala.inline
  def collisions(broadphasePairs: js.Array[IPair], engine: typings.phaser.MatterJS.Engine): js.Array[ICollisionData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collisions")(broadphasePairs.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Array[ICollisionData]]
}
