package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Scene plugin that provides a {@link Phaser.GameObjects.LightsManager} for the Light2D pipeline.
  * 
  * Available from within a Scene via `this.lights`.
  * 
  * Add Lights using the {@link Phaser.GameObjects.LightsManager#addLight} method:
  * 
  * ```javascript
  * // Enable the Lights Manager because it is disabled by default
  * this.lights.enable();
  * 
  * // Create a Light at [400, 300] with a radius of 200
  * this.lights.addLight(400, 300, 200);
  * ```
  * 
  * For Game Objects to be affected by the Lights when rendered, you will need to set them to use the `Light2D` pipeline like so:
  * 
  * ```javascript
  * sprite.setPipeline('Light2D');
  * ```
  */
@JSGlobal("Phaser.GameObjects.LightsPlugin")
@js.native
class LightsPlugin protected () extends LightsManager {
  /**
    * 
    * @param scene The Scene that this Lights Plugin belongs to.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  /**
    * A reference to the Scene that this Lights Plugin belongs to.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * A reference to the Scene's systems.
    */
  var systems: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * Boot the Lights Plugin.
    */
  def boot(): scala.Unit = js.native
}

