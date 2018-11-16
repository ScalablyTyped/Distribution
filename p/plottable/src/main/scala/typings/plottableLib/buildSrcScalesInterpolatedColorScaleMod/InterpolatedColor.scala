package typings
package plottableLib.buildSrcScalesInterpolatedColorScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales/interpolatedColorScale", "InterpolatedColor")
@js.native
class InterpolatedColor ()
  extends plottableLib.buildSrcScalesScaleMod.Scale[scala.Double, java.lang.String] {
  /**
       * An InterpolatedColor Scale maps numbers to color hex values, expressed as strings.
       *
       * @param {string} [scaleType="linear"] One of "linear"/"log"/"sqrt"/"pow".
       */
  def this(scaleType: java.lang.String) = this()
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

@JSImport("plottable/build/src/scales/interpolatedColorScale", "InterpolatedColor")
@js.native
object InterpolatedColor extends js.Object {
  var BLUES: js.Array[java.lang.String] = js.native
  var POSNEG: js.Array[java.lang.String] = js.native
  var REDS: js.Array[java.lang.String] = js.native
}

