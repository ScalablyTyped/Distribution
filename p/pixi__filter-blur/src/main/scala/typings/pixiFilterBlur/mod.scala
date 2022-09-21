package typings.pixiFilterBlur

import typings.pixiCore.mod.Filter
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
  
  @JSImport("@pixi/filter-blur", "BlurFilterPass")
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
