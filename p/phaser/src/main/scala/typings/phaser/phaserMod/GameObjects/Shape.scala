package typings.phaser.phaserMod.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Shape Game Object is a base class for the various different shapes, such as the Arc, Star or Polygon.
  * You cannot add a Shape directly to your Scene, it is meant as a base for your own custom Shape classes.
  */
@JSImport("phaser", "GameObjects.Shape")
@js.native
class Shape protected ()
  extends typings.phaser.Phaser.GameObjects.Shape {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param type The internal type of the Shape.
    * @param data The data of the source shape geometry, if any.
    */
  def this(scene: typings.phaser.Phaser.Scene) = this()
  def this(scene: typings.phaser.Phaser.Scene, `type`: String) = this()
  def this(scene: typings.phaser.Phaser.Scene, `type`: String, data: js.Any) = this()
}

