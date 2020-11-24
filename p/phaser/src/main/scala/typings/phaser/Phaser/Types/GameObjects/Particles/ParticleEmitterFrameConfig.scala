package typings.phaser.Phaser.Types.GameObjects.Particles

import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticleEmitterFrameConfig extends js.Object {
  
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
  implicit class ParticleEmitterFrameConfigOps[Self <: ParticleEmitterFrameConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCycle(value: Boolean): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: (Double | Frame | String)*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: Double | (js.Array[Double | Frame | String]) | String | Frame): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setQuantity(value: integer): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
}
