package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticleEmitterFrameConfig extends StObject {
  
  /**
    * Whether texture frames will be assigned consecutively (true) or at random (false).
    */
  var cycle: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more texture frames.
    */
  var frames: js.UndefOr[Double | (js.Array[Double | Frame | String]) | String | Frame] = js.native
  
  /**
    * The number of consecutive particles receiving each texture frame, when `cycle` is true.
    */
  var quantity: js.UndefOr[integer] = js.native
}
object ParticleEmitterFrameConfig {
  
  @scala.inline
  def apply(): ParticleEmitterFrameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticleEmitterFrameConfig]
  }
  
  @scala.inline
  implicit class ParticleEmitterFrameConfigMutableBuilder[Self <: ParticleEmitterFrameConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCycle(value: Boolean): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    @scala.inline
    def setFrames(value: Double | (js.Array[Double | Frame | String]) | String | Frame): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: (Double | Frame | String)*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
