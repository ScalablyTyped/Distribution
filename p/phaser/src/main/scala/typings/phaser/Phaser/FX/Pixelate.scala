package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Pixelate FX Controller.
  * 
  * This FX controller manages the pixelate effect for a Game Object.
  * 
  * The pixelate effect is a visual technique that deliberately reduces the resolution or detail of an image,
  * creating a blocky or mosaic appearance composed of large, visible pixels. This effect can be used for stylistic
  * purposes, as a homage to retro gaming, or as a means to obscure certain elements within the game, such as
  * during a transition or to censor specific content.
  * 
  * A Pixelate effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addPixelate();
  * sprite.postFX.addPixelate();
  * ```
  */
trait Pixelate
  extends StObject
     with Controller {
  
  /**
    * The amount of pixelation to apply.
    */
  var amount: Double
}
object Pixelate {
  
  inline def apply(
    active: Boolean,
    amount: Double,
    destroy: () => Unit,
    gameObject: GameObject,
    setActive: Boolean => Pixelate,
    `type`: Double
  ): Pixelate = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pixelate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pixelate] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
  }
}
