package typings.phaser.mod

import typings.phaser.MatterJS.ICollisionData
import typings.phaser.MatterJS.ICollisionFilter
import typings.phaser.MatterJS.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Detector` module contains methods for detecting collisions given a set of pairs.
  *
  * @class Detector
  */
@JSImport("matter", "Detector")
@js.native
class Detector ()
  extends typings.phaser.MatterJS.Detector

/* static members */
@JSImport("matter", "Detector")
@js.native
object Detector extends js.Object {
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = js.native
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  def collisions(broadphasePairs: js.Array[IPair], engine: typings.phaser.MatterJS.Engine): js.Array[ICollisionData] = js.native
}

