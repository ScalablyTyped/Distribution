package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterBoundsAlt extends StObject {
  
  /**
    * The height of the rectangle.
    */
  var h: Double
  
  /**
    * The width of the rectangle.
    */
  var w: Double
  
  /**
    * The left edge of the rectangle.
    */
  var x: Double
  
  /**
    * The top edge of the rectangle.
    */
  var y: Double
}
object ParticleEmitterBoundsAlt {
  
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): ParticleEmitterBoundsAlt = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterBoundsAlt]
  }
  
  @scala.inline
  implicit class ParticleEmitterBoundsAltMutableBuilder[Self <: ParticleEmitterBoundsAlt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
