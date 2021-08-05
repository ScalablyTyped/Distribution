package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleEmitterFrameConfig extends StObject {
  
  /**
    * Whether texture frames will be assigned consecutively (true) or at random (false).
    */
  var cycle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more texture frames.
    */
  var frames: js.UndefOr[Double | (js.Array[Double | Frame | String]) | String | Frame] = js.undefined
  
  /**
    * The number of consecutive particles receiving each texture frame, when `cycle` is true.
    */
  var quantity: js.UndefOr[integer] = js.undefined
}
object ParticleEmitterFrameConfig {
  
  inline def apply(): ParticleEmitterFrameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticleEmitterFrameConfig]
  }
  
  extension [Self <: ParticleEmitterFrameConfig](x: Self) {
    
    inline def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    inline def setFrames(value: Double | (js.Array[Double | Frame | String]) | String | Frame): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: (Double | Frame | String)*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
