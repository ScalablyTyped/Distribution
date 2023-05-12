package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Bokeh FX Controller.
  * 
  * This FX controller manages the bokeh effect for a Game Object.
  * 
  * Bokeh refers to a visual effect that mimics the photographic technique of creating a shallow depth of field.
  * This effect is used to emphasize the game's main subject or action, by blurring the background or foreground
  * elements, resulting in a more immersive and visually appealing experience. It is achieved through rendering
  * techniques that simulate the out-of-focus areas, giving a sense of depth and realism to the game's graphics.
  * 
  * This effect can also be used to generate a Tilt Shift effect, which is a technique used to create a miniature
  * effect by blurring everything except a small area of the image. This effect is achieved by blurring the
  * top and bottom elements, while keeping the center area in focus.
  * 
  * A Bokeh effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addBokeh();
  * sprite.postFX.addBokeh();
  * ```
  */
trait Bokeh
  extends StObject
     with Controller {
  
  /**
    * The amount, or strength, of the bokeh effect. Defaults to 1.
    */
  var amount: Double
  
  /**
    * If a Tilt Shift effect this controls the amount of horizontal blur.
    * 
    * Setting this value on a non-Tilt Shift effect will have no effect.
    */
  var blurX: Double
  
  /**
    * If a Tilt Shift effect this controls the amount of vertical blur.
    * 
    * Setting this value on a non-Tilt Shift effect will have no effect.
    */
  var blurY: Double
  
  /**
    * The color contrast, or brightness, of the bokeh effect. Defaults to 0.2.
    */
  var contrast: Double
  
  /**
    * Is this a Tilt Shift effect or a standard bokeh effect?
    */
  var isTiltShift: Boolean
  
  /**
    * The radius of the bokeh effect.
    * 
    * This is a float value, where a radius of 0 will result in no effect being applied,
    * and a radius of 1 will result in a strong bokeh. However, you can exceed this value
    * for even stronger effects.
    */
  var radius: Double
  
  /**
    * If a Tilt Shift effect this controls the strength of the blur.
    * 
    * Setting this value on a non-Tilt Shift effect will have no effect.
    */
  var strength: Double
}
object Bokeh {
  
  inline def apply(
    active: Boolean,
    amount: Double,
    blurX: Double,
    blurY: Double,
    contrast: Double,
    destroy: () => Unit,
    gameObject: GameObject,
    isTiltShift: Boolean,
    radius: Double,
    setActive: Boolean => Bokeh,
    strength: Double,
    `type`: Double
  ): Bokeh = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], blurX = blurX.asInstanceOf[js.Any], blurY = blurY.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], isTiltShift = isTiltShift.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), strength = strength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bokeh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bokeh] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBlurX(value: Double): Self = StObject.set(x, "blurX", value.asInstanceOf[js.Any])
    
    inline def setBlurY(value: Double): Self = StObject.set(x, "blurY", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setIsTiltShift(value: Boolean): Self = StObject.set(x, "isTiltShift", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
  }
}
