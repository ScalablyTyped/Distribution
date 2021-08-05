package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterBounds extends StObject {
  
  /**
    * The height of the rectangle.
    */
  var height: Double
  
  /**
    * The width of the rectangle.
    */
  var width: Double
  
  /**
    * The left edge of the rectangle.
    */
  var x: Double
  
  /**
    * The top edge of the rectangle.
    */
  var y: Double
}
object ParticleEmitterBounds {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): ParticleEmitterBounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterBounds]
  }
  
  extension [Self <: ParticleEmitterBounds](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
