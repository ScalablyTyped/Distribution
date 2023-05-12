package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Blur FX Controller.
  * 
  * This FX controller manages the blur effect for a Game Object.
  * 
  * A Gaussian blur is the result of blurring an image by a Gaussian function. It is a widely used effect,
  * typically to reduce image noise and reduce detail. The visual effect of this blurring technique is a
  * smooth blur resembling that of viewing the image through a translucent screen, distinctly different
  * from the bokeh effect produced by an out-of-focus lens or the shadow of an object under usual illumination.
  * 
  * A Blur effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addBlur();
  * sprite.postFX.addBlur();
  * ```
  */
trait Blur
  extends StObject
     with Controller {
  
  /**
    * The color of the blur as a number value.
    */
  var color: Double
  
  /**
    * The internal gl color array.
    */
  var glcolor: js.Array[Double]
  
  /**
    * The quality of the blur effect.
    * 
    * This can be:
    * 
    * 0 for Low Quality
    * 1 for Medium Quality
    * 2 for High Quality
    * 
    * The higher the quality, the more complex shader is used
    * and the more processing time is spent on the GPU calculating
    * the final blur. This value is used in conjunction with the
    * `steps` value, as one has a direct impact on the other.
    * 
    * Keep this value as low as you can, while still achieving the
    * desired effect you need for your game.
    */
  var quality: Double
  
  /**
    * The number of steps to run the Blur effect for.
    * 
    * This value should always be an integer.
    * 
    * It defaults to 4. The higher the value, the smoother the blur,
    * but at the cost of exponentially more gl operations.
    * 
    * Keep this to the lowest possible number you can have it, while
    * still looking correct for your game.
    */
  var steps: Double
  
  /**
    * The strength of the blur effect.
    */
  var strength: Double
  
  /**
    * The horizontal offset of the blur effect.
    */
  var x: Double
  
  /**
    * The vertical offset of the blur effect.
    */
  var y: Double
}
object Blur {
  
  inline def apply(
    active: Boolean,
    color: Double,
    destroy: () => Unit,
    gameObject: GameObject,
    glcolor: js.Array[Double],
    quality: Double,
    setActive: Boolean => Blur,
    steps: Double,
    strength: Double,
    `type`: Double,
    x: Double,
    y: Double
  ): Blur = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], glcolor = glcolor.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), steps = steps.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blur]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blur] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setGlcolor(value: js.Array[Double]): Self = StObject.set(x, "glcolor", value.asInstanceOf[js.Any])
    
    inline def setGlcolorVarargs(value: Double*): Self = StObject.set(x, "glcolor", js.Array(value*))
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
