package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Barrel FX Controller.
  * 
  * This FX controller manages the barrel distortion effect for a Game Object.
  * 
  * A barrel effect allows you to apply either a 'pinch' or 'expand' distortion to
  * a Game Object. The amount of the effect can be modified in real-time.
  * 
  * A Barrel effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addBarrel();
  * sprite.postFX.addBarrel();
  * ```
  */
trait Barrel
  extends StObject
     with Controller {
  
  /**
    * The amount of distortion applied to the barrel effect.
    * 
    * Typically keep this within the range 1 (no distortion) to +- 1.
    */
  var amount: Double
}
object Barrel {
  
  inline def apply(
    active: Boolean,
    amount: Double,
    destroy: () => Unit,
    gameObject: GameObject,
    setActive: Boolean => Barrel,
    `type`: Double
  ): Barrel = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Barrel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Barrel] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
  }
}
