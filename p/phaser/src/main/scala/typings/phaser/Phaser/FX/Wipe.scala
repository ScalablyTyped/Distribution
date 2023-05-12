package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Wipe FX Controller.
  * 
  * This FX controller manages the wipe effect for a Game Object.
  * 
  * The wipe or reveal effect is a visual technique that gradually uncovers or conceals elements
  * in the game, such as images, text, or scene transitions. This effect is often used to create
  * a sense of progression, reveal hidden content, or provide a smooth and visually appealing transition
  * between game states.
  * 
  * You can set both the direction and the axis of the wipe effect. The following combinations are possible:
  * 
  * * left to right: direction 0, axis 0
  * * right to left: direction 1, axis 0
  * * top to bottom: direction 1, axis 1
  * * bottom to top: direction 1, axis 0
  * 
  * It is up to you to set the `progress` value yourself, i.e. via a Tween, in order to transition the effect.
  * 
  * A Wipe effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addWipe();
  * sprite.postFX.addWipe();
  * sprite.preFX.addReveal();
  * sprite.postFX.addReveal();
  * ```
  */
trait Wipe
  extends StObject
     with Controller {
  
  /**
    * The axis of the wipe effect. Either 0 or 1. Set in conjunction with the direction property.
    */
  var axis: Double
  
  /**
    * The direction of the wipe effect. Either 0 or 1. Set in conjunction with the axis property.
    */
  var direction: Double
  
  /**
    * The progress of the Wipe effect. This value is normalized to the range 0 to 1.
    * 
    * Adjust this value to make the wipe transition (i.e. via a Tween)
    */
  var progress: Double
  
  /**
    * Is this a reveal (true) or a fade (false) effect?
    */
  var reveal: Boolean
  
  /**
    * The width of the wipe effect. This value is normalized in the range 0 to 1.
    */
  var wipeWidth: Double
}
object Wipe {
  
  inline def apply(
    active: Boolean,
    axis: Double,
    destroy: () => Unit,
    direction: Double,
    gameObject: GameObject,
    progress: Double,
    reveal: Boolean,
    setActive: Boolean => Wipe,
    `type`: Double,
    wipeWidth: Double
  ): Wipe = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), direction = direction.asInstanceOf[js.Any], gameObject = gameObject.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], reveal = reveal.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), wipeWidth = wipeWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wipe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Wipe] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setReveal(value: Boolean): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
    
    inline def setWipeWidth(value: Double): Self = StObject.set(x, "wipeWidth", value.asInstanceOf[js.Any])
  }
}
