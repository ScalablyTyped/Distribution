package typings.plottable

import typings.plottable.scaleMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales/interpolatedColorScale", JSImport.Namespace)
@js.native
object interpolatedColorScaleMod extends js.Object {
  @js.native
  /**
    * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
    *
    * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
    */
  class InterpolatedColor () extends Scale[Double, String] {
    def this(scaleType: String) = this()
    var _colorRange: js.Any = js.native
    var _colorScale: js.Any = js.native
    var _d3Scale: js.Any = js.native
    /**
      * Generates the converted QuantitativeScale.
      */
    /* private */ def _d3InterpolatedScale(): js.Any = js.native
    /**
      * Generates the d3 interpolator for colors.
      */
    /* private */ def _interpolateColors(): js.Any = js.native
    /* private */ def _resetScale(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object InterpolatedColor extends js.Object {
    var BLUES: js.Array[String] = js.native
    var POSNEG: js.Array[String] = js.native
    var REDS: js.Array[String] = js.native
  }
  
}

