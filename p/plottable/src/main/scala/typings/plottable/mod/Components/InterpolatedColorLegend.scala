package typings.plottable.mod.Components

import typings.plottable.scalesMod.InterpolatedColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Components.InterpolatedColorLegend")
@js.native
class InterpolatedColorLegend protected ()
  extends typings.plottable.componentsMod.InterpolatedColorLegend {
  /**
    * Creates an InterpolatedColorLegend.
    *
    * The InterpolatedColorLegend consists of a sequence of swatches that show the
    * associated InterpolatedColor Scale sampled at various points.
    * Two labels show the maximum and minimum values of the InterpolatedColor Scale.
    *
    * @constructor
    * @param {Scales.InterpolatedColor} interpolatedColorScale
    */
  def this(interpolatedColorScale: InterpolatedColor) = this()
}

/* static members */
@JSImport("plottable", "Components.InterpolatedColorLegend")
@js.native
object InterpolatedColorLegend extends js.Object {
  /**
    * The css class applied to the legend labels.
    */
  var LEGEND_LABEL_CLASS: String = js.native
  var _DEFAULT_NUM_SWATCHES: js.Any = js.native
  /* private */ def _ensureOrientation(orientation: js.Any): js.Any = js.native
}

