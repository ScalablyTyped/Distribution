package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.GameObjects")
@js.native
object ^ extends js.Object {
  /**
    * Builds a Game Object using the provided configuration object.
    * @param scene A reference to the Scene.
    * @param gameObject The initial GameObject.
    * @param config The config to build the GameObject with.
    */
  def BuildGameObject(
    scene: phaserLib.PhaserNs.Scene,
    gameObject: GameObject,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GameObjectConfig
  ): GameObject = js.native
  /**
    * Adds an Animation component to a Sprite and populates it based on the given config.
    * @param sprite The sprite to add an Animation component to.
    * @param config The animation config.
    */
  def BuildGameObjectAnimation(sprite: Sprite, config: js.Object): Sprite = js.native
}

