package typings
package pixiDotJsLib.pixiDotJsMod

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
    extends pixiDotJsLib.PIXINs.filtersNs.AlphaFilter {
    def this(alpha: scala.Double) = this()
  }
  
  @js.native
  class BlurFilter ()
    extends pixiDotJsLib.PIXINs.filtersNs.BlurFilter {
    def this(strength: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double, kernelSize: scala.Double) = this()
  }
  
  @js.native
  class BlurXFilter ()
    extends pixiDotJsLib.PIXINs.filtersNs.BlurXFilter {
    def this(strength: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double, kernelSize: scala.Double) = this()
  }
  
  @js.native
  class BlurYFilter ()
    extends pixiDotJsLib.PIXINs.filtersNs.BlurYFilter {
    def this(strength: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double) = this()
    def this(strength: scala.Double, quality: scala.Double, resolution: scala.Double, kernelSize: scala.Double) = this()
  }
  
  @js.native
  class ColorMatrixFilter ()
    extends pixiDotJsLib.PIXINs.filtersNs.ColorMatrixFilter
  
  @js.native
  class DisplacementFilter protected ()
    extends pixiDotJsLib.PIXINs.filtersNs.DisplacementFilter {
    def this(sprite: pixiDotJsLib.PIXINs.Sprite) = this()
    def this(sprite: pixiDotJsLib.PIXINs.Sprite, scale: scala.Double) = this()
  }
  
  @js.native
  class FXAAFilter ()
    extends pixiDotJsLib.PIXINs.filtersNs.FXAAFilter
  
  // pixi-filters.d.ts todo
  // https://github.com/pixijs/pixi-filters/
  @js.native
  class NoiseFilter ()
    extends pixiDotJsLib.PIXINs.filtersNs.NoiseFilter {
    def this(noise: scala.Double) = this()
    def this(noise: scala.Double, seed: scala.Double) = this()
  }
  
}

