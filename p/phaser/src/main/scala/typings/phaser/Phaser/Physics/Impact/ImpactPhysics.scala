package typings.phaser.Phaser.Physics.Impact

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
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
  def this(scene: Scene) = this()
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
  var scene: Scene = js.native
  /**
    * [description]
    */
  var systems: Systems = js.native
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

