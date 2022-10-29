package typings.pixiFilterBlur

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/filter-blur", "BlurFilter")
  @js.native
  /**
    * @param strength - The strength of the blur filter.
    * @param quality - The quality of the blur filter.
    * @param [resolution=PIXI.settings.FILTER_RESOLUTION] - The resolution of the blur filter.
    * @param kernelSize - The kernelSize of the blur filter.Options: 5, 7, 9, 11, 13, 15.
    */
  open class BlurFilter ()
    extends typings.pixiFilterBlur.libBlurFilterMod.BlurFilter {
    def this(strength: Double) = this()
    def this(strength: Double, quality: Double) = this()
    def this(strength: Unit, quality: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double) = this()
    def this(strength: Double, quality: Unit, resolution: Double) = this()
    def this(strength: Unit, quality: Double, resolution: Double) = this()
    def this(strength: Unit, quality: Unit, resolution: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
    def this(strength: Double, quality: Double, resolution: Unit, kernelSize: Double) = this()
    def this(strength: Double, quality: Unit, resolution: Double, kernelSize: Double) = this()
    def this(strength: Double, quality: Unit, resolution: Unit, kernelSize: Double) = this()
    def this(strength: Unit, quality: Double, resolution: Double, kernelSize: Double) = this()
    def this(strength: Unit, quality: Double, resolution: Unit, kernelSize: Double) = this()
    def this(strength: Unit, quality: Unit, resolution: Double, kernelSize: Double) = this()
    def this(strength: Unit, quality: Unit, resolution: Unit, kernelSize: Double) = this()
  }
  
  @JSImport("@pixi/filter-blur", "BlurFilterPass")
  @js.native
  open class BlurFilterPass protected ()
    extends typings.pixiFilterBlur.libBlurFilterPassMod.BlurFilterPass {
    /**
      * @param horizontal - Do pass along the x-axis (`true`) or y-axis (`false`).
      * @param strength - The strength of the blur filter.
      * @param quality - The quality of the blur filter.
      * @param resolution - The resolution of the blur filter.
      * @param kernelSize - The kernelSize of the blur filter.Options: 5, 7, 9, 11, 13, 15.
      */
    def this(horizontal: Boolean) = this()
    def this(horizontal: Boolean, strength: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Double) = this()
    def this(horizontal: Boolean, strength: Unit, quality: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Double, resolution: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Unit, resolution: Double) = this()
    def this(horizontal: Boolean, strength: Unit, quality: Double, resolution: Double) = this()
    def this(horizontal: Boolean, strength: Unit, quality: Unit, resolution: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Double, resolution: Unit, kernelSize: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Unit, resolution: Double, kernelSize: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Unit, resolution: Unit, kernelSize: Double) = this()
    def this(horizontal: Boolean, strength: Unit, quality: Double, resolution: Double, kernelSize: Double) = this()
    def this(horizontal: Boolean, strength: Unit, quality: Double, resolution: Unit, kernelSize: Double) = this()
    def this(horizontal: Boolean, strength: Unit, quality: Unit, resolution: Double, kernelSize: Double) = this()
    def this(horizontal: Boolean, strength: Unit, quality: Unit, resolution: Unit, kernelSize: Double) = this()
  }
}
