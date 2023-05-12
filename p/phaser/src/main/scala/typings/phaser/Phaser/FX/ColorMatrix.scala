package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ColorMatrix FX Controller.
  * 
  * This FX controller manages the color matrix effect for a Game Object.
  * 
  * The color matrix effect is a visual technique that involves manipulating the colors of an image
  * or scene using a mathematical matrix. This process can adjust hue, saturation, brightness, and contrast,
  * allowing developers to create various stylistic appearances or mood settings within the game.
  * Common applications include simulating different lighting conditions, applying color filters,
  * or achieving a specific visual style.
  * 
  * A ColorMatrix effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addColorMatrix();
  * sprite.postFX.addColorMatrix();
  * ```
  */
@js.native
trait ColorMatrix
  extends StObject
     with typings.phaser.Phaser.Display.ColorMatrix {
  
  /**
    * Toggle this boolean to enable or disable this effect,
    * without removing and adding it from the Game Object.
    */
  var active: Boolean = js.native
  
  /**
    * A reference to the Game Object that owns this effect.
    */
  var gameObject: GameObject = js.native
  
  /**
    * The FX_CONST type of this effect.
    */
  var `type`: Double = js.native
}
