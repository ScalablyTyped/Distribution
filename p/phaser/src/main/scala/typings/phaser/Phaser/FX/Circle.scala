package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Circle FX Controller.
  * 
  * This FX controller manages the circle effect for a Game Object.
  * 
  * This effect will draw a circle around the texture of the Game Object, effectively masking off
  * any area outside of the circle without the need for an actual mask. You can control the thickness
  * of the circle, the color of the circle and the color of the background, should the texture be
  * transparent. You can also control the feathering applied to the circle, allowing for a harsh or soft edge.
  * 
  * Please note that adding this effect to a Game Object will not change the input area or physics body of
  * the Game Object, should it have one.
  * 
  * A Circle effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addCircle();
  * sprite.postFX.addCircle();
  * ```
  */
trait Circle
  extends StObject
     with Controller {
  
  /**
    * The color of the background, behind the texture, given as a number value.
    */
  var backgroundColor: Double
  
  /**
    * The color of the circular ring, given as a number value.
    */
  var color: Double
  
  /**
    * The amount of feathering to apply to the circle from the ring,
    * extending into the middle of the circle. The default is 0.005,
    * which is a very low amount of feathering just making sure the ring
    * has a smooth edge. Increase this amount to a value such as 0.5
    * or 0.025 for larger amounts of feathering.
    */
  var feather: Double
  
  /**
    * The internal gl color array for the ring color.
    */
  var glcolor: js.Array[Double]
  
  /**
    * The internal gl color array for the background color.
    */
  var glcolor2: js.Array[Double]
  
  /**
    * The scale of the circle. The default scale is 1, which is a circle
    * the full size of the underlying texture. Reduce this value to create
    * a smaller circle, or increase it to create a circle that extends off
    * the edges of the texture.
    */
  var scale: Double
  
  /**
    * The width of the circle around the texture, in pixels. This value
    * doesn't factor in the feather, which can extend the thickness
    * internally depending on its value.
    */
  var thickness: Double
}
object Circle {
  
  inline def apply(
    active: Boolean,
    backgroundColor: Double,
    color: Double,
    destroy: () => Unit,
    feather: Double,
    gameObject: GameObject,
    glcolor: js.Array[Double],
    glcolor2: js.Array[Double],
    scale: Double,
    setActive: Boolean => Circle,
    thickness: Double,
    `type`: Double
  ): Circle = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), feather = feather.asInstanceOf[js.Any], gameObject = gameObject.asInstanceOf[js.Any], glcolor = glcolor.asInstanceOf[js.Any], glcolor2 = glcolor2.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), thickness = thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFeather(value: Double): Self = StObject.set(x, "feather", value.asInstanceOf[js.Any])
    
    inline def setGlcolor(value: js.Array[Double]): Self = StObject.set(x, "glcolor", value.asInstanceOf[js.Any])
    
    inline def setGlcolor2(value: js.Array[Double]): Self = StObject.set(x, "glcolor2", value.asInstanceOf[js.Any])
    
    inline def setGlcolor2Varargs(value: Double*): Self = StObject.set(x, "glcolor2", js.Array(value*))
    
    inline def setGlcolorVarargs(value: Double*): Self = StObject.set(x, "glcolor", js.Array(value*))
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
