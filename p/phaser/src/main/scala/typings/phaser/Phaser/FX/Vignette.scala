package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Vignette FX Controller.
  * 
  * This FX controller manages the vignette effect for a Game Object.
  * 
  * The vignette effect is a visual technique where the edges of the screen, or a Game Object, gradually darken or blur,
  * creating a frame-like appearance. This effect is used to draw the player's focus towards the central action or subject,
  * enhance immersion, and provide a cinematic or artistic quality to the game's visuals.
  * 
  * A Vignette effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addVignette();
  * sprite.postFX.addVignette();
  * ```
  */
trait Vignette
  extends StObject
     with Controller {
  
  /**
    * The radius of the vignette effect. This value is normalized to the range 0 to 1.
    */
  var radius: Double
  
  /**
    * The strength of the vignette effect.
    */
  var strength: Double
  
  /**
    * The horizontal offset of the vignette effect. This value is normalized to the range 0 to 1.
    */
  var x: Double
  
  /**
    * The vertical offset of the vignette effect. This value is normalized to the range 0 to 1.
    */
  var y: Double
}
object Vignette {
  
  inline def apply(
    active: Boolean,
    destroy: () => Unit,
    gameObject: GameObject,
    radius: Double,
    setActive: Boolean => Vignette,
    strength: Double,
    `type`: Double,
    x: Double,
    y: Double
  ): Vignette = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), strength = strength.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vignette]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vignette] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
