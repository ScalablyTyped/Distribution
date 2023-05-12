package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Gradient FX Controller.
  * 
  * This FX controller manages the gradient effect for a Game Object.
  * 
  * The gradient overlay effect is a visual technique where a smooth color transition is applied over Game Objects,
  * such as sprites or UI components. This effect is used to enhance visual appeal, emphasize depth, or create
  * stylistic and atmospheric variations. It can also be utilized to convey information, such as representing
  * progress or health status through color changes.
  * 
  * A Gradient effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addGradient();
  * sprite.postFX.addGradient();
  * ```
  */
trait Gradient
  extends StObject
     with Controller {
  
  /**
    * The alpha value of the gradient effect.
    */
  var alpha: Double
  
  /**
    * The first gradient color, given as a number value.
    */
  var color1: Double
  
  /**
    * The second gradient color, given as a number value.
    */
  var color2: Double
  
  /**
    * The horizontal position the gradient will start from. This value is noralized, between 0 and 1 and is not in pixels.
    */
  var fromX: Double
  
  /**
    * The vertical position the gradient will start from. This value is noralized, between 0 and 1 and is not in pixels.
    */
  var fromY: Double
  
  /**
    * The internal gl color array for the starting color.
    */
  var glcolor1: js.Array[Double]
  
  /**
    * The internal gl color array for the ending color.
    */
  var glcolor2: js.Array[Double]
  
  /**
    * Sets how many 'chunks' the gradient is divided in to, as spread over the
    * entire height of the texture. Leave this at zero for a smooth gradient,
    * or set to a higher number to split the gradient into that many sections, giving
    * a more banded 'retro' effect.
    */
  var size: Double
  
  /**
    * The horizontal position the gradient will end. This value is noralized, between 0 and 1 and is not in pixels.
    */
  var toX: Double
  
  /**
    * The vertical position the gradient will end. This value is noralized, between 0 and 1 and is not in pixels.
    */
  var toY: Double
}
object Gradient {
  
  inline def apply(
    active: Boolean,
    alpha: Double,
    color1: Double,
    color2: Double,
    destroy: () => Unit,
    fromX: Double,
    fromY: Double,
    gameObject: GameObject,
    glcolor1: js.Array[Double],
    glcolor2: js.Array[Double],
    setActive: Boolean => Gradient,
    size: Double,
    toX: Double,
    toY: Double,
    `type`: Double
  ): Gradient = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], color1 = color1.asInstanceOf[js.Any], color2 = color2.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), fromX = fromX.asInstanceOf[js.Any], fromY = fromY.asInstanceOf[js.Any], gameObject = gameObject.asInstanceOf[js.Any], glcolor1 = glcolor1.asInstanceOf[js.Any], glcolor2 = glcolor2.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), size = size.asInstanceOf[js.Any], toX = toX.asInstanceOf[js.Any], toY = toY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setColor1(value: Double): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
    
    inline def setColor2(value: Double): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
    
    inline def setFromX(value: Double): Self = StObject.set(x, "fromX", value.asInstanceOf[js.Any])
    
    inline def setFromY(value: Double): Self = StObject.set(x, "fromY", value.asInstanceOf[js.Any])
    
    inline def setGlcolor1(value: js.Array[Double]): Self = StObject.set(x, "glcolor1", value.asInstanceOf[js.Any])
    
    inline def setGlcolor1Varargs(value: Double*): Self = StObject.set(x, "glcolor1", js.Array(value*))
    
    inline def setGlcolor2(value: js.Array[Double]): Self = StObject.set(x, "glcolor2", value.asInstanceOf[js.Any])
    
    inline def setGlcolor2Varargs(value: Double*): Self = StObject.set(x, "glcolor2", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setToX(value: Double): Self = StObject.set(x, "toX", value.asInstanceOf[js.Any])
    
    inline def setToY(value: Double): Self = StObject.set(x, "toY", value.asInstanceOf[js.Any])
  }
}
