package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Bloom FX Controller.
  * 
  * This FX controller manages the bloom effect for a Game Object.
  * 
  * Bloom is an effect used to reproduce an imaging artifact of real-world cameras.
  * The effect produces fringes of light extending from the borders of bright areas in an image,
  * contributing to the illusion of an extremely bright light overwhelming the
  * camera or eye capturing the scene.
  * 
  * A Bloom effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addBloom();
  * sprite.postFX.addBloom();
  * ```
  */
trait Bloom
  extends StObject
     with Controller {
  
  /**
    * The strength of the blur process of the bloom effect.
    */
  var blurStrength: Double
  
  /**
    * The color of the bloom as a number value.
    */
  var color: Double
  
  /**
    * The internal gl color array.
    */
  var glcolor: js.Array[Double]
  
  /**
    * The horizontal offset of the bloom effect.
    */
  var offsetX: Double
  
  /**
    * The vertical offset of the bloom effect.
    */
  var offsetY: Double
  
  /**
    * The number of steps to run the Bloom effect for.
    * 
    * This value should always be an integer.
    * 
    * It defaults to 4. The higher the value, the smoother the Bloom,
    * but at the cost of exponentially more gl operations.
    * 
    * Keep this to the lowest possible number you can have it, while
    * still looking correct for your game.
    */
  var steps: Double
  
  /**
    * The strength of the blend process of the bloom effect.
    */
  var strength: Double
}
object Bloom {
  
  inline def apply(
    active: Boolean,
    blurStrength: Double,
    color: Double,
    destroy: () => Unit,
    gameObject: GameObject,
    glcolor: js.Array[Double],
    offsetX: Double,
    offsetY: Double,
    setActive: Boolean => Bloom,
    steps: Double,
    strength: Double,
    `type`: Double
  ): Bloom = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], blurStrength = blurStrength.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], glcolor = glcolor.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), steps = steps.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bloom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bloom] (val x: Self) extends AnyVal {
    
    inline def setBlurStrength(value: Double): Self = StObject.set(x, "blurStrength", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setGlcolor(value: js.Array[Double]): Self = StObject.set(x, "glcolor", value.asInstanceOf[js.Any])
    
    inline def setGlcolorVarargs(value: Double*): Self = StObject.set(x, "glcolor", js.Array(value*))
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
  }
}
