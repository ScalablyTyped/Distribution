package typings.phaser.Phaser.FX

import typings.phaser.Phaser.GameObjects.GameObject
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Displacement FX Controller.
  * 
  * This FX controller manages the displacement effect for a Game Object.
  * 
  * The displacement effect is a visual technique that alters the position of pixels in an image
  * or texture based on the values of a displacement map. This effect is used to create the illusion
  * of depth, surface irregularities, or distortion in otherwise flat elements. It can be applied to
  * characters, objects, or backgrounds to enhance realism, convey movement, or achieve various
  * stylistic appearances.
  * 
  * A Displacement effect is added to a Game Object via the FX component:
  * 
  * ```js
  * const sprite = this.add.sprite();
  * 
  * sprite.preFX.addDisplacement();
  * sprite.postFX.addDisplacement();
  * ```
  */
trait Displacement
  extends StObject
     with Controller {
  
  /**
    * The underlying WebGLTexture used for displacement.
    */
  var glTexture: WebGLTexture
  
  /**
    * The amount of horizontal displacement to apply.
    */
  var x: Double
  
  /**
    * The amount of vertical displacement to apply.
    */
  var y: Double
}
object Displacement {
  
  inline def apply(
    active: Boolean,
    destroy: () => Unit,
    gameObject: GameObject,
    glTexture: WebGLTexture,
    setActive: Boolean => Displacement,
    `type`: Double,
    x: Double,
    y: Double
  ): Displacement = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), gameObject = gameObject.asInstanceOf[js.Any], glTexture = glTexture.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displacement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Displacement] (val x: Self) extends AnyVal {
    
    inline def setGlTexture(value: WebGLTexture): Self = StObject.set(x, "glTexture", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
