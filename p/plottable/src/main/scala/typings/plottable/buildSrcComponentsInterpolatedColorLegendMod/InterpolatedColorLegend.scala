package typings.plottable.buildSrcComponentsInterpolatedColorLegendMod

import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcCoreFormattersMod.Formatter
import typings.plottable.buildSrcScalesMod.InterpolatedColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/interpolatedColorLegend", "InterpolatedColorLegend")
@js.native
class InterpolatedColorLegend protected () extends Component {
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
  var _expands: js.Any = js.native
  var _formatter: js.Any = js.native
  var _lowerLabel: js.Any = js.native
  var _measurer: js.Any = js.native
  var _orientation: js.Any = js.native
  var _redrawCallback: js.Any = js.native
  var _scale: js.Any = js.native
  var _swatchBoundingBox: js.Any = js.native
  var _swatchContainer: js.Any = js.native
  var _textPadding: js.Any = js.native
  var _upperLabel: js.Any = js.native
  var _wrapper: js.Any = js.native
  var _writer: js.Any = js.native
  /* private */ def _generateTicks(): js.Any = js.native
  /* private */ def _generateTicks(numSwatches: js.Any): js.Any = js.native
  /* private */ def _isVertical(): js.Any = js.native
  /**
    * Gets whether the InterpolatedColorLegend expands to occupy all offered space in the long direction
    */
  def expands(): Boolean = js.native
  /**
    * Sets whether the InterpolatedColorLegend expands to occupy all offered space in the long direction
    *
    * @param {expands} boolean
    * @returns {InterpolatedColorLegend} The calling InterpolatedColorLegend.
    */
  def expands(expands: Boolean): this.type = js.native
  /**
    * Gets the Formatter for the labels. The domain ticks will be passed through the formatter
    * before being displayed.
    */
  def formatter(): Formatter = js.native
  /**
    * Sets the Formatter for the labels. The domain ticks will be passed through the formatter
    * before being displayed.
    *
    * @param {Formatter} formatter
    * @returns {InterpolatedColorLegend} The calling InterpolatedColorLegend.
    */
  def formatter(formatter: Formatter): this.type = js.native
  /**
    * Gets the orientation.
    */
  def orientation(): String = js.native
  /**
    * Sets the orientation.
    *
    * @param {string} orientation One of "horizontal"/"left"/"right".
    * @returns {InterpolatedColorLegend} The calling InterpolatedColorLegend.
    */
  def orientation(orientation: String): this.type = js.native
}

/* static members */
@JSImport("plottable/build/src/components/interpolatedColorLegend", "InterpolatedColorLegend")
@js.native
object InterpolatedColorLegend extends js.Object {
  /**
    * The css class applied to the legend labels.
    */
  var LEGEND_LABEL_CLASS: String = js.native
  var _DEFAULT_NUM_SWATCHES: js.Any = js.native
  /* private */ def _ensureOrientation(orientation: js.Any): js.Any = js.native
}

