package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////FILTERS///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "filters")
@js.native
object filters extends js.Object {
  @js.native
  class AlphaFilter ()
    extends typings.pixiDotJs.PIXI.filters.AlphaFilter {
    def this(alpha: Double) = this()
  }
  
  @js.native
  class BlurFilter ()
    extends typings.pixiDotJs.PIXI.filters.BlurFilter {
    def this(strength: Double) = this()
    def this(strength: Double, quality: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  }
  
  @js.native
  class BlurXFilter ()
    extends typings.pixiDotJs.PIXI.filters.BlurXFilter {
    def this(strength: Double) = this()
    def this(strength: Double, quality: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  }
  
  @js.native
  class BlurYFilter ()
    extends typings.pixiDotJs.PIXI.filters.BlurYFilter {
    def this(strength: Double) = this()
    def this(strength: Double, quality: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  }
  
  @js.native
  class ColorMatrixFilter ()
    extends typings.pixiDotJs.PIXI.filters.ColorMatrixFilter
  
  @js.native
  class DisplacementFilter protected ()
    extends typings.pixiDotJs.PIXI.filters.DisplacementFilter {
    def this(sprite: typings.pixiDotJs.PIXI.Sprite) = this()
    def this(sprite: typings.pixiDotJs.PIXI.Sprite, scale: Double) = this()
  }
  
  @js.native
  class FXAAFilter ()
    extends typings.pixiDotJs.PIXI.filters.FXAAFilter
  
  // pixi-filters.d.ts todo
  // https://github.com/pixijs/pixi-filters/
  @js.native
  class NoiseFilter ()
    extends typings.pixiDotJs.PIXI.filters.NoiseFilter {
    def this(noise: Double) = this()
    def this(noise: Double, seed: Double) = this()
  }
  
}

