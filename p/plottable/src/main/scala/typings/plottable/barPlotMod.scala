package typings.plottable

import typings.plottable.commonsMod.ITransformableAccessorScaleBinding
import typings.plottable.datasetMod.Dataset
import typings.plottable.drawersMod.ProxyDrawer
import typings.plottable.formattersMod.DatumFormatter
import typings.plottable.interfacesMod.AttributeToProjector
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.xyPlotMod.XYPlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/barPlot", JSImport.Namespace)
@js.native
object barPlotMod extends js.Object {
  @js.native
  /**
    * A Bar Plot draws bars growing out from a baseline to some value
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  class Bar[X, Y] () extends XYPlot[X, Y] {
    def this(orientation: BarOrientation) = this()
    var _barAlignment: js.Any = js.native
    var _baseline: js.Any = js.native
    var _baselineValue: js.Any = js.native
    var _baselineValueProvider: js.Any = js.native
    var _computeBarPixelThickness: js.Any = js.native
    /**
      * Whether all the bars in this barPlot have the same pixel thickness.
      * If so, use the _barPixelThickness property to access the thickness.
      */
    var _fixedBarPixelThickness: js.Any = js.native
    var _hideBarsIfAnyAreTooWide: js.Any = js.native
    var _isVertical: Boolean = js.native
    var _labelConfig: js.Any = js.native
    var _labelFormatter: js.Any = js.native
    var _labelsEnabled: js.Any = js.native
    var _labelsPosition: js.Any = js.native
    /* private */ def _barPixelThickness(): js.Any = js.native
    /* private */ def _calculateLabelProperties(
      barCoordinates: js.Any,
      barDimensions: js.Any,
      measurement: js.Any,
      showLabelOnBar: js.Any,
      aboveOrLeftOfBaseline: js.Any
    ): js.Any = js.native
    /* protected */ def _createDrawer(): ProxyDrawer = js.native
    /* private */ def _createLabelContainer(
      labelArea: js.Any,
      labelContainerOrigin: js.Any,
      labelOrigin: js.Any,
      measurement: js.Any,
      showLabelOnBar: js.Any,
      color: js.Any
    ): js.Any = js.native
    /* private */ def _drawLabel(datum: js.Any, index: js.Any, dataset: js.Any, attrToProjector: js.Any): js.Any = js.native
    /* protected */ def _drawLabels(): Unit = js.native
    /* private */ def _entitiesIntersecting(xValOrRange: js.Any, yValOrRange: js.Any): js.Any = js.native
    /**
      * Return the <rect>'s x or y attr value given the position and thickness of
      * that bar. This method is responsible for account for barAlignment, in particular.
      */
    /* protected */ def _getPositionAttr(position: Double, thickness: Double): Double = js.native
    /* protected */ def _isDatumOnScreen(
      attrToProjector: AttributeToProjector,
      plotWidth: Double,
      plotHeight: Double,
      d: js.Any,
      i: Double,
      dataset: Dataset
    ): Boolean = js.native
    /**
      * The rectangular bounds of a bar. Note that the x/y coordinates are not the
      * same as the "pixel point" because they are always at the top/left of the
      * bar.
      */
    /* protected */ def _pixelBounds(datum: js.Any, index: Double, dataset: Dataset): AnonY = js.native
    /* private */ def _pixelPointBar(originalPosition: js.Any, scaledBaseline: js.Any, rect: js.Any): js.Any = js.native
    /**
      * Labels are "on-bar" by default, but if the bar is not long enough to fit the text,
      * we can try putting the label "off-bar", if there's enough space outside of the bar
      * to fit it.
      */
    /* private */ def _shouldShowLabelOnBar(barCoordinates: js.Any, barDimensions: js.Any, labelDimensions: js.Any): js.Any = js.native
    /* private */ def _updateLengthScale(): js.Any = js.native
    /* protected */ def _updateThicknessAttr(): Unit = js.native
    /**
      * Gets the current bar alignment
      */
    def barAlignment(): BarAlignment = js.native
    /**
      * Sets the bar alignment. Valid values are `"start"`, `"middle"`, and
      * `"end"`, which determines the meaning of the accessor of the bar's scale
      * coordinate (e.g. "x" for vertical bars).
      *
      * For example, a value of "start" means the x coordinate accessor sets the
      * left hand side of the rect.
      *
      * The default value is "middle", which aligns to rect so that it centered on
      * the x coordinate
      */
    def barAlignment(align: BarAlignment): this.type = js.native
    /**
      * Gets the accessor for the bar "end", which is used to compute the width of
      * each bar on the independent axis.
      */
    def barEnd(): ITransformableAccessorScaleBinding[X, Double] = js.native
    def barEnd(end: X): this.type = js.native
    /**
      * Sets the accessor for the bar "end", which is used to compute the width of
      * each bar on the x axis (y axis if horizontal).
      *
      * If a `Scale` has been set for the independent axis via the `x` method (`y`
      * if horizontal), it will also be used to scale `barEnd`.
      *
      * Additionally, calling this setter will set `barAlignment` to `"start"`,
      * indicating that `x` and `barEnd` now define the left and right x
      * coordinates of a bar (bottom/top if horizontal).
      *
      * Normally, a single bar width for all bars is determined by how many bars
      * can fit in the given space (minus some padding). Settings this accessor
      * will override this behavior and manually set the start and end coordinates
      * for each bar.
      *
      * This means it will totally ignore the range band width of category scales,
      * so this probably doesn't make sense to use with category axes.
      */
    def barEnd(end: Double): this.type = js.native
    def barEnd(end: IAccessor[Double | X]): this.type = js.native
    /**
      * Gets the baseline value.
      * The baseline is the line that the bars are drawn from.
      *
      * @returns {X|Y}
      */
    def baselineValue(): X | Y = js.native
    /**
      * Sets the baseline value.
      * The baseline is the line that the bars are drawn from.
      *
      * @param {X|Y} value
      * @returns {Bar} The calling Bar Plot.
      */
    def baselineValue(value: X | Y): this.type = js.native
    /**
      * Gets the Formatter for the labels.
      */
    def labelFormatter(): DatumFormatter = js.native
    /**
      * Sets the Formatter for the labels. The labelFormatter will be fed each bar's
      * computed height as defined by the `.y()` accessor for vertical bars, or the
      * width as defined by the `.x()` accessor for horizontal bars, as well as the
      * datum, datum index, and dataset associated with that bar.
      *
      * @param {Formatter} formatter
      * @returns {Bar} The calling Bar Plot.
      */
    def labelFormatter(formatter: DatumFormatter): this.type = js.native
    /**
      * Get whether bar labels are enabled.
      *
      * @returns {boolean} Whether bars should display labels or not.
      */
    def labelsEnabled(): Boolean = js.native
    /**
      * Sets whether labels are enabled. If enabled, also sets their position relative to the baseline.
      *
      * @param {boolean} labelsEnabled
      * @param {LabelsPosition} labelsPosition
      * @returns {Bar} The calling Bar Plot.
      */
    def labelsEnabled(enabled: Boolean): this.type = js.native
    def labelsEnabled(enabled: Boolean, labelsPosition: LabelsPosition): this.type = js.native
    /**
      * The binding associated with bar length. Length is the count or value the bar is trying to show.
      * This is the .y() for a vertical plot and .x() for a horizontal plot.
      */
    /* protected */ def length(): ITransformableAccessorScaleBinding[_, Double] = js.native
    /**
      * Gets the orientation of the plot
      *
      * @return "vertical" | "horizontal"
      */
    def orientation(): BarOrientation = js.native
    /**
      * The binding associated with bar position. Position separates the different bar categories.
      * This is the .x() for a vertical plot and .y() for a horizontal plot.
      */
    /* protected */ def position(): ITransformableAccessorScaleBinding[_, Double] = js.native
  }
  
  /* static members */
  @js.native
  object Bar extends js.Object {
    var _BAR_AREA_CLASS: js.Any = js.native
    var _BAR_END_KEY: js.Any = js.native
    var _BAR_GAPLESS_THRESHOLD_PX: Double = js.native
    var _BAR_THICKNESS_KEY: String = js.native
    var _BAR_THICKNESS_RATIO: Double = js.native
    var _LABEL_AREA_CLASS: String = js.native
    /**
      * In the case of "start" or "end" LabelPositions, put the label this many px away
      * from the bar's length distance edge
      */
    var _LABEL_MARGIN_INSIDE_BAR: Double = js.native
    var _SINGLE_BAR_DIMENSION_RATIO: Double = js.native
  }
  
  @js.native
  object BarAlignment extends js.Object {
    var end: typings.plottable.plottableStrings.end = js.native
    var middle: typings.plottable.plottableStrings.middle = js.native
    var start: typings.plottable.plottableStrings.start = js.native
  }
  
  @js.native
  object BarOrientation extends js.Object {
    var horizontal: typings.plottable.plottableStrings.horizontal = js.native
    var vertical: typings.plottable.plottableStrings.vertical = js.native
  }
  
  @js.native
  object LabelsPosition extends js.Object {
    var end: typings.plottable.plottableStrings.end = js.native
    var middle: typings.plottable.plottableStrings.middle = js.native
    var outside: typings.plottable.plottableStrings.outside = js.native
    var start: typings.plottable.plottableStrings.start = js.native
  }
  
  type BarAlignment = String
  type BarOrientation = String
  type LabelsPosition = String
}

