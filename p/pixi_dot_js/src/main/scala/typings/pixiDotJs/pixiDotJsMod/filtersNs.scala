package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////FILTERS///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSImport("pixi.js", "filters")
@js.native
object filtersNs extends js.Object {
  @js.native
  class AlphaFilter ()
    extends typings.pixiDotJs.PIXINs.filtersNs.AlphaFilter {
    def this(alpha: Double) = this()
  }
  
  @js.native
  class BlurFilter ()
    extends typings.pixiDotJs.PIXINs.filtersNs.BlurFilter {
    def this(strength: Double) = this()
    def this(strength: Double, quality: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  }
  
  @js.native
  class BlurXFilter ()
    extends typings.pixiDotJs.PIXINs.filtersNs.BlurXFilter {
    def this(strength: Double) = this()
    def this(strength: Double, quality: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  }
  
  @js.native
  class BlurYFilter ()
    extends typings.pixiDotJs.PIXINs.filtersNs.BlurYFilter {
    def this(strength: Double) = this()
    def this(strength: Double, quality: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  }
  
  @js.native
  class ColorMatrixFilter ()
    extends typings.pixiDotJs.PIXINs.filtersNs.ColorMatrixFilter
  
  @js.native
  class DisplacementFilter protected ()
    extends typings.pixiDotJs.PIXINs.filtersNs.DisplacementFilter {
    def this(sprite: typings.pixiDotJs.PIXINs.Sprite) = this()
    def this(sprite: typings.pixiDotJs.PIXINs.Sprite, scale: Double) = this()
  }
  
  @js.native
  class FXAAFilter ()
    extends typings.pixiDotJs.PIXINs.filtersNs.FXAAFilter
  
  // pixi-filters.d.ts todo
  // https://github.com/pixijs/pixi-filters/
  @js.native
  class NoiseFilter ()
    extends typings.pixiDotJs.PIXINs.filtersNs.NoiseFilter {
    def this(noise: Double) = this()
    def this(noise: Double, seed: Double) = this()
  }
  
}

