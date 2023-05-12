package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Glow FX Controller.
  * 
  * This FX controller manages the glow effect for a Game Object.
  * 
  * The glow effect is a visual technique that creates a soft, luminous halo around game objects,
  * characters, or UI elements. This effect is used to emphasize importance, enhance visual appeal,
  * or convey a sense of energy, magic, or otherworldly presence. The effect can also be set on
  * the inside of the Game Object. The color and strength of the glow can be modified.
  * 
  * A Glow effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addGlow();
  * sprite.postFX.addGlow();
  * ```
  */
trait Glow
  extends StObject
     with Controller {
  
  /**
    * The color of the glow as a number value.
    */
  var color: Double
  
  /**
    * A 4 element array of gl color values.
    */
  var glcolor: js.Array[Double]
  
  /**
    * The strength of the glow inward from the edge of the Sprite.
    */
  var innerStrength: Double
  
  /**
    * If `true` only the glow is drawn, not the texture itself.
    */
  var knockout: Double
  
  /**
    * The strength of the glow outward from the edge of the Sprite.
    */
  var outerStrength: Double
}
object Glow {
  
  inline def apply(
    active: Boolean,
    color: Double,
    destroy: () => Unit,
    gameObject: GameObject,
    glcolor: js.Array[Double],
    innerStrength: Double,
    knockout: Double,
    outerStrength: Double,
    setActive: Boolean => Glow,
    `type`: Double
  ): Glow = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], glcolor = glcolor.asInstanceOf[js.Any], innerStrength = innerStrength.asInstanceOf[js.Any], knockout = knockout.asInstanceOf[js.Any], outerStrength = outerStrength.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Glow] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setGlcolor(value: js.Array[Double]): Self = StObject.set(x, "glcolor", value.asInstanceOf[js.Any])
    
    inline def setGlcolorVarargs(value: Double*): Self = StObject.set(x, "glcolor", js.Array(value*))
    
    inline def setInnerStrength(value: Double): Self = StObject.set(x, "innerStrength", value.asInstanceOf[js.Any])
    
    inline def setKnockout(value: Double): Self = StObject.set(x, "knockout", value.asInstanceOf[js.Any])
    
    inline def setOuterStrength(value: Double): Self = StObject.set(x, "outerStrength", value.asInstanceOf[js.Any])
  }
}
