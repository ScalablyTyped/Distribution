package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Shine FX Controller.
  * 
  * This FX controller manages the shift effect for a Game Object.
  * 
  * The shine effect is a visual technique that simulates the appearance of reflective
  * or glossy surfaces by passing a light beam across a Game Object. This effect is used to
  * enhance visual appeal, emphasize certain features, and create a sense of depth or
  * material properties.
  * 
  * A Shine effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addShine();
  * sprite.postFX.addShine();
  * ```
  */
trait Shine
  extends StObject
     with Controller {
  
  /**
    * The gradient of the Shine effect.
    */
  var gradient: Double
  
  /**
    * The line width of the Shine effect.
    */
  var lineWidth: Double
  
  /**
    * Does this Shine effect reveal or get added to its target?
    */
  var reveal: Boolean
  
  /**
    * The speed of the Shine effect.
    */
  var speed: Double
}
object Shine {
  
  inline def apply(
    active: Boolean,
    destroy: () => Unit,
    gameObject: GameObject,
    gradient: Double,
    lineWidth: Double,
    reveal: Boolean,
    setActive: Boolean => Shine,
    speed: Double,
    `type`: Double
  ): Shine = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], reveal = reveal.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shine] (val x: Self) extends AnyVal {
    
    inline def setGradient(value: Double): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setReveal(value: Boolean): Self = StObject.set(x, "reveal", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
