package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Shadow FX Controller.
  * 
  * This FX controller manages the shadow effect for a Game Object.
  * 
  * The shadow effect is a visual technique used to create the illusion of depth and realism by adding darker,
  * offset silhouettes or shapes beneath game objects, characters, or environments. These simulated shadows
  * help to enhance the visual appeal and immersion, making the 2D game world appear more dynamic and three-dimensional.
  * 
  * A Shadow effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addShadow();
  * sprite.postFX.addShadow();
  * ```
  */
trait Shadow
  extends StObject
     with Controller {
  
  /**
    * The color of the shadow.
    */
  var color: Double
  
  /**
    * The amount of decay for the shadow effect.
    */
  var decay: Double
  
  /**
    * The internal gl color array.
    */
  var glcolor: js.Array[Double]
  
  /**
    * The intensity of the shadow effect.
    */
  var intensity: Double
  
  /**
    * The power of the shadow effect.
    */
  var power: Double
  
  /**
    * The number of samples that the shadow effect will run for.
    * 
    * This should be an integer with a minimum value of 1 and a maximum of 12.
    */
  var samples: Double
  
  /**
    * The horizontal offset of the shadow effect.
    */
  var x: Double
  
  /**
    * The vertical offset of the shadow effect.
    */
  var y: Double
}
object Shadow {
  
  inline def apply(
    active: Boolean,
    color: Double,
    decay: Double,
    destroy: () => Unit,
    gameObject: GameObject,
    glcolor: js.Array[Double],
    intensity: Double,
    power: Double,
    samples: Double,
    setActive: Boolean => Shadow,
    `type`: Double,
    x: Double,
    y: Double
  ): Shadow = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], decay = decay.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], glcolor = glcolor.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shadow] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
    
    inline def setGlcolor(value: js.Array[Double]): Self = StObject.set(x, "glcolor", value.asInstanceOf[js.Any])
    
    inline def setGlcolorVarargs(value: Double*): Self = StObject.set(x, "glcolor", js.Array(value*))
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
