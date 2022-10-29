package typings.pixiFilterBlur

import typings.pixiConstants.mod.CLEAR_MODES
import typings.pixiCore.mod.Filter
import typings.pixiCore.mod.FilterSystem
import typings.pixiCore.mod.RenderTexture
import typings.pixiFilterBlur.libBlurFilterPassMod.BlurFilterPass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBlurFilterMod {
  
  @JSImport("@pixi/filter-blur/lib/BlurFilter", "BlurFilter")
  @js.native
  /**
    * @param strength - The strength of the blur filter.
    * @param quality - The quality of the blur filter.
    * @param [resolution=PIXI.settings.FILTER_RESOLUTION] - The resolution of the blur filter.
    * @param kernelSize - The kernelSize of the blur filter.Options: 5, 7, 9, 11, 13, 15.
    */
  open class BlurFilter () extends Filter {
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
    
    /* private */ var _repeatEdgePixels: Any = js.native
    
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
      * Sets the strength of both the blurX and blurY properties simultaneously
      * @default 2
      */
    def blur: Double = js.native
    
    /**
      * Sets the strength of the blurX property
      * @default 2
      */
    def blurX: Double = js.native
    
    var blurXFilter: BlurFilterPass = js.native
    
    def blurX_=(value: Double): Unit = js.native
    
    /**
      * Sets the strength of the blurY property
      * @default 2
      */
    def blurY: Double = js.native
    
    var blurYFilter: BlurFilterPass = js.native
    
    def blurY_=(value: Double): Unit = js.native
    
    def blur_=(value: Double): Unit = js.native
    
    /**
      * Sets the number of passes for blur. More passes means higher quality bluring.
      * @default 1
      */
    def quality: Double = js.native
    def quality_=(value: Double): Unit = js.native
    
    /**
      * If set to true the edge of the target will be clamped
      * @default false
      */
    def repeatEdgePixels: Boolean = js.native
    def repeatEdgePixels_=(value: Boolean): Unit = js.native
    
    /* protected */ def updatePadding(): Unit = js.native
  }
}
