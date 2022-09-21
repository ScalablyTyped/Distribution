package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Scenes.Systems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * 
  * Note that you cannot use this pipeline on Graphics Game Objects or Shape Game Objects.
  */
@js.native
trait LightsPlugin
  extends StObject
     with LightsManager {
  
  /**
    * Boot the Lights Plugin.
    */
  def boot(): Unit = js.native
  
  /**
    * A reference to the Scene that this Lights Plugin belongs to.
    */
  var scene: Scene = js.native
  
  /**
    * A reference to the Scene's systems.
    */
  var systems: Systems = js.native
}
