package typings
package plottableLib.buildSrcAxesAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/axes/axis", "Axis")
@js.native
class Axis[D] protected ()
  extends plottableLib.buildSrcComponentsComponentMod.Component {
  /**
       * Constructs an Axis.
       * An Axis is a visual representation of a Scale.
       *
       * @constructor
       * @param {Scale} scale
       * @param {AxisOrientation} orientation Orientation of this Axis.
       */
  def this(scale: plottableLib.buildSrcScalesScaleMod.Scale[D, scala.Double], orientation: AxisOrientation) = this()
  var _annotatedTicks: js.Any = js.native
  var _annotationContainer: js.Any = js.native
  var _annotationFormatter: js.Any = js.native
  var _annotationMeasurer: js.Any = js.native
  var _annotationTierCount: js.Any = js.native
  var _annotationWriter: js.Any = js.native
  var _annotationsEnabled: js.Any = js.native
  var _baseline: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[scala.Unit] = js.native
  var _endTickLength: js.Any = js.native
  var _formatter: js.Any = js.native
  var _innerTickLength: js.Any = js.native
  var _margin: js.Any = js.native
  var _orientation: js.Any = js.native
  var _rescaleCallback: js.Any = js.native
  var _scale: plottableLib.buildSrcScalesScaleMod.Scale[D, scala.Double] = js.native
  var _showEndTickLabels: js.Any = js.native
  var _tickLabelContainer: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[scala.Unit] = js.native
  var _tickLabelPadding: js.Any = js.native
  var _tickMarkContainer: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[scala.Unit] = js.native
  /* private */ def _annotatedTicksToRender(): js.Any = js.native
  /* protected */ def _annotationTierHeight(): scala.Double = js.native
  /* private */ def _annotationToTier(measurements: js.Any): js.Any = js.native
  /* protected */ def _computeHeight(): scala.Double = js.native
  /* protected */ def _computeWidth(): scala.Double = js.native
  /**
       * Retrieves the size of the core pieces.
       *
       * The core pieces include the labels, the end tick marks, the inner tick marks, and the tick label padding.
       */
  /* protected */ def _coreSize(): scala.Double = js.native
  /* protected */ def _drawAnnotations(): scala.Unit = js.native
  /* protected */ def _generateBaselineAttrHash(): org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /* protected */ def _generateTickMarkAttrHash(): org.scalablytyped.runtime.StringDictionary[scala.Double | (js.Function1[/* d */ js.Any, scala.Double])] = js.native
  /* protected */ def _generateTickMarkAttrHash(isEndTickMark: scala.Boolean): org.scalablytyped.runtime.StringDictionary[scala.Double | (js.Function1[/* d */ js.Any, scala.Double])] = js.native
  /* protected */ def _getTickValues(): js.Array[D] = js.native
  /**
       * Responsible for hiding any tick labels that break out of the bounding
       * container.
       */
  /* protected */ def _hideOverflowingTickLabels(): scala.Unit = js.native
  /**
       * Hides the Tick Marks which have no corresponding Tick Labels
       */
  /* protected */ def _hideTickMarksWithoutLabel(): scala.Unit = js.native
  /**
       * Gets the maximum pixel length over all ticks on this axis.
       * @returns {number}
       */
  /* protected */ def _maxLabelTickLength(): scala.Double = js.native
  /* protected */ def _removeAnnotations(): scala.Unit = js.native
  /* protected */ def _rescale(): scala.Unit = js.native
  /* protected */ def _setDefaultAlignment(): scala.Unit = js.native
  /* protected */ def _showAllTickLabels(): scala.Unit = js.native
  /* protected */ def _showAllTickMarks(): scala.Unit = js.native
  /**
       * Gets the annotated ticks.
       */
  def annotatedTicks(): js.Array[D] = js.native
  /**
       * Sets the annotated ticks.
       *
       * @returns {Axis} The calling Axis.
       */
  def annotatedTicks(annotatedTicks: js.Array[D]): this.type = js.native
  /**
       * Gets the Formatter for the annotations. The annotationFormatter will be passed
       * each value in annotatedTicks.
       */
  def annotationFormatter(): plottableLib.buildSrcCoreFormattersMod.Formatter = js.native
  /**
       * Sets the Formatter for the annotations. The annotationFormatter will be passed
       * each value in annotatedTicks.
       *
       * @returns {Axis} The calling Axis.
       */
  def annotationFormatter(annotationFormatter: plottableLib.buildSrcCoreFormattersMod.Formatter): this.type = js.native
  /**
       * Gets the count of annotation tiers to render.
       */
  def annotationTierCount(): scala.Double = js.native
  /**
       * Sets the count of annotation tiers to render.
       *
       * @returns {Axis} The calling Axis.
       */
  def annotationTierCount(annotationTierCount: scala.Double): this.type = js.native
  /**
       * Gets if annotations are enabled.
       */
  def annotationsEnabled(): scala.Boolean = js.native
  /**
       * Sets if annotations are enabled.
       *
       * @returns {Axis} The calling Axis.
       */
  def annotationsEnabled(annotationsEnabled: scala.Boolean): this.type = js.native
  /**
       * Gets the end tick mark length in pixels.
       */
  def endTickLength(): scala.Double = js.native
  /**
       * Sets the end tick mark length in pixels.
       *
       * @param {number} length
       * @returns {Axis} The calling Axis.
       */
  def endTickLength(length: scala.Double): this.type = js.native
  /**
       * Gets the Formatter on the Axis. Tick values are passed through the
       * Formatter before being displayed.
       */
  def formatter(): plottableLib.buildSrcCoreFormattersMod.Formatter = js.native
  /**
       * Sets the Formatter on the Axis. Tick values are passed through the
       * Formatter before being displayed.
       *
       * @param {Formatter} formatter
       * @returns {Axis} The calling Axis.
       */
  def formatter(formatter: plottableLib.buildSrcCoreFormattersMod.Formatter): this.type = js.native
  /**
       * Get the scale that this axis is associated with.
       * @returns {Scale<D, number>}
       */
  def getScale(): plottableLib.buildSrcScalesScaleMod.Scale[D, scala.Double] = js.native
  /**
       * Gets the tick mark length in pixels.
       */
  def innerTickLength(): scala.Double = js.native
  /**
       * Sets the tick mark length in pixels.
       *
       * @param {number} length
       * @returns {Axis} The calling Axis.
       */
  def innerTickLength(length: scala.Double): this.type = js.native
  /**
       * Get whether this axis is horizontal (orientation is "top" or "bottom") or vertical.
       * @returns {boolean} - true for horizontal, false for vertical.
       */
  def isHorizontal(): scala.Boolean = js.native
  /**
       * Gets the margin in pixels.
       * The margin is the amount of space between the tick labels and the outer edge of the Axis.
       * The margin also determines the space that annotations will reside in if annotations are enabled.
       */
  def margin(): scala.Double = js.native
  /**
       * Sets the margin in pixels.
       * The margin is the amount of space between the tick labels and the outer edge of the Axis.
       * The margin also determines the space that annotations will reside in if annotations are enabled.
       *
       * @param {number} size
       * @returns {Axis} The calling Axis.
       */
  def margin(size: scala.Double): this.type = js.native
  /**
       * Gets the orientation of the Axis.
       */
  def orientation(): AxisOrientation = js.native
  /**
       * Sets the orientation of the Axis.
       *
       * @param {AxisOrientation} orientation The orientation to apply to this axis.
       * @returns {Axis} The calling Axis.
       */
  def orientation(orientation: AxisOrientation): this.type = js.native
  /**
       * Gets whether the Axis shows the end tick labels.
       */
  def showEndTickLabels(): scala.Boolean = js.native
  /**
       * Sets whether the Axis shows the end tick labels.
       *
       * @param {boolean} show
       * @returns {Axis} The calling Axis.
       */
  def showEndTickLabels(show: scala.Boolean): this.type = js.native
  /**
       * Gets the tick label data on a element. Element in argument must be a descendent of a tick label element.
       *
       * @param {Element} element
       */
  def tickLabelDataOnElement(element: stdLib.Element): js.Object = js.native
  /**
       * Gets the padding between each tick mark and its associated label in pixels.
       */
  def tickLabelPadding(): scala.Double = js.native
  /**
       * Sets the padding between each tick mark and its associated label in pixels.
       *
       * @param {number} padding
       * @returns {Axis} The calling Axis.
       */
  def tickLabelPadding(padding: scala.Double): this.type = js.native
}

@JSImport("plottable/build/src/axes/axis", "Axis")
@js.native
object Axis extends js.Object {
  /**
       * The css class applied to each annotation circle, which denotes which tick is being annotated.
       */
  var ANNOTATION_CIRCLE_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each annotation label, which shows the formatted annotation text.
       */
  var ANNOTATION_LABEL_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each annotation line, which extends from the axis to the rect.
       */
  var ANNOTATION_LINE_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each annotation rect, which surrounds the annotation label.
       */
  var ANNOTATION_RECT_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each end tick mark (the line on the end tick).
       */
  var END_TICK_MARK_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each tick label (the text associated with the tick).
       */
  var TICK_LABEL_CLASS: java.lang.String = js.native
  /**
       * The css class applied to each tick mark (the line on the tick).
       */
  var TICK_MARK_CLASS: java.lang.String = js.native
  var _ANNOTATION_LABEL_PADDING: js.Any = js.native
}

