package typings.phaser.global

import typings.phaser.Phaser.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SpineGameObject")
@js.native
class SpineGameObject protected ()
  extends typings.phaser.SpineGameObject {
  def this(scene: Scene, pluginManager: typings.phaser.SpinePlugin, x: Double, y: Double) = this()
  def this(scene: Scene, pluginManager: typings.phaser.SpinePlugin, x: Double, y: Double, key: String) = this()
  def this(
    scene: Scene,
    pluginManager: typings.phaser.SpinePlugin,
    x: Double,
    y: Double,
    key: String,
    animationName: String
  ) = this()
  def this(
    scene: Scene,
    pluginManager: typings.phaser.SpinePlugin,
    x: Double,
    y: Double,
    key: String,
    animationName: String,
    loop: Boolean
  ) = this()
}

