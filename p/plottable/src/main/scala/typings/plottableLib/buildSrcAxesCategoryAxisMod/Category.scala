package typings
package plottableLib.buildSrcAxesCategoryAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes/categoryAxis", "Category")
@js.native
class Category protected ()
  extends plottableLib.buildSrcAxesAxisMod.Axis[java.lang.String] {
  /**
       * Constructs a Category Axis.
       *
       * A Category Axis is a visual representation of a Category Scale.
       *
       * @constructor
       * @param {Scales.Category} scale
       * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
       */
  def this(scale: plottableLib.buildSrcScalesMod.Category) = this()
  /**
       * Constructs a Category Axis.
       *
       * A Category Axis is a visual representation of a Category Scale.
       *
       * @constructor
       * @param {Scales.Category} scale
       * @param {AxisOrientation} [orientation="bottom"] Orientation of this Category Axis.
       */
  def this(scale: plottableLib.buildSrcScalesMod.Category, orientation: plottableLib.buildSrcAxesAxisMod.AxisOrientation) = this()
  var _measurer: js.Any = js.native
  /**
       * The rotation angle of tick label text. Only 0, 90, -90 are supported
       */
  var _tickLabelAngle: js.Any = js.native
  /**
       * Maximum allowable number of wrapped lines for tick labels.
       */
  var _tickLabelMaxLines: js.Any = js.native
  /**
       * Maximum allowable px width of tick labels.
       */
  var _tickLabelMaxWidth: js.Any = js.native
  /**
       * The shear angle of the tick label text. Only values -80 <= x <= 80 are supported
       */
  var _tickLabelShearAngle: js.Any = js.native
  var _typesetterContext: js.Any = js.native
  /**
       * A Wrapper configured according to the other properties on this axis.
       * @returns {Typesettable.Wrapper}
       */
  val _wrapper: js.Any = js.native
  /**
       * A Writer attached to this measurer and wrapper.
       * @returns {Typesettable.Writer}
       */
  val _writer: js.Any = js.native
  /**
       * Write ticks to the DOM.
       * @param {Plottable.Scales.Category} scale The scale this axis is representing.
       * @param {d3.Selection} ticks The tick elements to write.
       */
  /* private */ def _drawTicks(stepWidth: js.Any, ticks: js.Any): js.Any = js.native
  /**
       * Measures the size of the tick labels without making any (permanent) DOM changes.
       *
       * @param {number} axisWidth Width available for this axis.
       * @param {number} axisHeight Height available for this axis.
       * @param {Plottable.Scales.Category} scale The scale this axis is representing.
       * @param {string[]} ticks The strings that will be printed on the ticks.
       */
  /* private */ def _measureTickLabels(axisWidth: js.Any, axisHeight: js.Any): js.Any = js.native
  /**
       * Return the space required by the ticks, padding included.
       * @returns {number}
       */
  /* private */ def _tickSpaceRequired(): js.Any = js.native
  /**
       * Take the scale and drop ticks at regular intervals such that the resultant ticks are all a reasonable minimum
       * distance apart. Return the resultant ticks to render, as well as the new stepWidth between them.
       *
       * @param {Scales.Category} scale - The scale being downsampled. Defaults to this Axis' scale.
       * @return {DownsampleInfo} an object holding the resultant domain and new stepWidth.
       */
  def getDownsampleInfo(): IDownsampleInfo = js.native
  /**
       * Take the scale and drop ticks at regular intervals such that the resultant ticks are all a reasonable minimum
       * distance apart. Return the resultant ticks to render, as well as the new stepWidth between them.
       *
       * @param {Scales.Category} scale - The scale being downsampled. Defaults to this Axis' scale.
       * @return {DownsampleInfo} an object holding the resultant domain and new stepWidth.
       */
  def getDownsampleInfo(scale: plottableLib.buildSrcScalesMod.Category): IDownsampleInfo = js.native
  /**
       * Take the scale and drop ticks at regular intervals such that the resultant ticks are all a reasonable minimum
       * distance apart. Return the resultant ticks to render, as well as the new stepWidth between them.
       *
       * @param {Scales.Category} scale - The scale being downsampled. Defaults to this Axis' scale.
       * @return {DownsampleInfo} an object holding the resultant domain and new stepWidth.
       */
  def getDownsampleInfo(scale: plottableLib.buildSrcScalesMod.Category, domain: js.Array[java.lang.String]): IDownsampleInfo = js.native
  /**
       * Gets the tick label angle in degrees.
       */
  def tickLabelAngle(): scala.Double = js.native
  /**
       * Sets the tick label angle in degrees.
       * Right now only -90/0/90 are supported. 0 is horizontal.
       *
       * @param {number} angle
       * @returns {Category} The calling Category Axis.
       */
  def tickLabelAngle(angle: scala.Double): this.type = js.native
  /**
       * Get the tick label max number of wrapped lines on this axis.
       */
  def tickLabelMaxLines(): scala.Double = js.native
  /**
       * Set the tick label's max number of wrapped lines on this axis. By default, a Category Axis will line-wrap
       * long tick labels onto multiple lines in order to fit the width of the axis. When set, long tick labels will be
       * rendered on at most `tickLabelMaxLines()` lines. This ensures the axis doesn't grow to an undesirable height.
       *
       * Pass undefined to un-set the max lines.
       * @param maxLines
       */
  def tickLabelMaxLines(maxLines: scala.Double): this.type = js.native
  /**
       * Get the tick label max width on this axis.
       */
  def tickLabelMaxWidth(): scala.Double = js.native
  /**
       * Set the tick label's max width on this axis. When set, tick labels will be truncated with ellipsis to be
       * at most `tickLabelMaxWidth()` pixels wide. This ensures the axis doesn't grow to an undesirable width.
       *
       * Pass undefined to un-set the max width.
       * @param maxWidth
       */
  def tickLabelMaxWidth(maxWidth: scala.Double): this.type = js.native
  /**
       * Gets the tick label shear angle in degrees.
       */
  def tickLabelShearAngle(): scala.Double = js.native
  /**
       * Sets the tick label shear angle in degrees.
       * Only angles between -80 and 80 are supported.
       *
       * @param {number} angle
       * @returns {Category} The calling Category Axis.
       */
  def tickLabelShearAngle(angle: scala.Double): this.type = js.native
}

@JSImport("plottable/build/src/axes/categoryAxis", "Category")
@js.native
object Category extends js.Object {
  /**
       * How many pixels to give labels at minimum before downsampling takes effect.
       */
  var _MINIMUM_WIDTH_PER_LABEL_PX: js.Any = js.native
}

