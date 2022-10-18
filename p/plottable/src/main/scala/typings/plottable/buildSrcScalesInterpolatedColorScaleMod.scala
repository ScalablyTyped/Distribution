package typings.plottable

import typings.plottable.buildSrcScalesScaleMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcScalesInterpolatedColorScaleMod {
  
  @JSImport("plottable/build/src/scales/interpolatedColorScale", "InterpolatedColor")
  @js.native
  /**
    * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
    *
    * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
    */
  open class InterpolatedColor () extends Scale[Double, String] {
    def this(scaleType: String) = this()
    
    /* private */ var _colorRange: Any = js.native
    
    /* private */ var _colorScale: Any = js.native
    
    /**
      * Generates the converted QuantitativeScale.
      */
    /* private */ var _d3InterpolatedScale: Any = js.native
    
    /* private */ var _d3Scale: Any = js.native
    
    /**
      * Generates the d3 interpolator for colors.
      */
    /* private */ var _interpolateColors: Any = js.native
    
    /* private */ var _resetScale: Any = js.native
  }
  /* static members */
  object InterpolatedColor {
    
    @JSImport("plottable/build/src/scales/interpolatedColorScale", "InterpolatedColor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/scales/interpolatedColorScale", "InterpolatedColor.BLUES")
    @js.native
    def BLUES: js.Array[String] = js.native
    inline def BLUES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUES")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales/interpolatedColorScale", "InterpolatedColor.POSNEG")
    @js.native
    def POSNEG: js.Array[String] = js.native
    inline def POSNEG_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSNEG")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales/interpolatedColorScale", "InterpolatedColor.REDS")
    @js.native
    def REDS: js.Array[String] = js.native
    inline def REDS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REDS")(x.asInstanceOf[js.Any])
  }
}
