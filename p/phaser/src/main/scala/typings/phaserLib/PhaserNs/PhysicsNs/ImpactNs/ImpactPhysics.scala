package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Physics.Impact.ImpactPhysics")
@js.native
class ImpactPhysics protected () extends js.Object {
  /**
    * 
    * @param scene [description]
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  /**
    * [description]
    */
  var add: Factory = js.native
  /**
    * [description]
    */
  var config: js.Object = js.native
  /**
    * [description]
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * [description]
    */
  var systems: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * [description]
    */
  var world: World = js.native
  /**
    * [description]
    */
  def getConfig(): js.Object = js.native
  /**
    * [description]
    */
  def pause(): World = js.native
  /**
    * [description]
    */
  def resume(): World = js.native
}

