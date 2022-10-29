package typings.pixiFilterBlur

import typings.pixiConstants.mod.CLEAR_MODES
import typings.pixiCore.mod.Filter
import typings.pixiCore.mod.FilterSystem
import typings.pixiCore.mod.RenderTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlurFilterPassMod {
  
  @JSImport("@pixi/filter-blur/lib/BlurFilterPass", "BlurFilterPass")
  @js.native
  open class BlurFilterPass protected () extends Filter {
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
    
    /* private */ var _quality: Any = js.native
    
    /**
      * Applies the filter.
      * @param filterManager - The manager.
      * @param input - The input target.
      * @param output - The output target.
      * @param clearMode - How to clear
      */
    @JSName("apply")
    def apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clearMode: CLEAR_MODES): Unit = js.native
    
    /**
      * Sets the strength of both the blur.
      * @default 16
      */
    def blur: Double = js.native
    def blur_=(value: Double): Unit = js.native
    
    var horizontal: Boolean = js.native
    
    var passes: Double = js.native
    
    /**
      * Sets the quality of the blur by modifying the number of passes. More passes means higher
      * quality bluring but the lower the performance.
      * @default 4
      */
    def quality: Double = js.native
    def quality_=(value: Double): Unit = js.native
    
    var strength: Double = js.native
  }
}
