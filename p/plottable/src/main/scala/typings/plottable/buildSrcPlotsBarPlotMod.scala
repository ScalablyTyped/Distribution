package typings.plottable

import typings.plottable.anon.PickDOMRectxywidthheight
import typings.plottable.buildSrcComponentsLabelMod.LabelFontSizePx
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreFormattersMod.DatumFormatter
import typings.plottable.buildSrcCoreInterfacesMod.AttributeToProjector
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcDrawersMod.ProxyDrawer
import typings.plottable.buildSrcPlotsCommonsMod.ITransformableAccessorScaleBinding
import typings.plottable.buildSrcPlotsXyPlotMod.XYPlot
import typings.plottable.plottableStrings.end
import typings.plottable.plottableStrings.horizontal
import typings.plottable.plottableStrings.middle
import typings.plottable.plottableStrings.outside
import typings.plottable.plottableStrings.start
import typings.plottable.plottableStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlotsBarPlotMod {
  
  @JSImport("plottable/build/src/plots/barPlot", "Bar")
  @js.native
  /**
    * A Bar Plot draws bars growing out from a baseline to some value
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  open class Bar[X, Y] () extends XYPlot[X, Y] {
    def this(orientation: BarOrientation) = this()
    
    /* private */ var _barAlignment: Any = js.native
    
    /* private */ var _barPixelThickness: Any = js.native
    
    /* private */ var _baseline: Any = js.native
    
    /* private */ var _baselineValue: Any = js.native
    
    /* private */ var _baselineValueProvider: Any = js.native
    
    /* private */ var _calculateLabelProperties: Any = js.native
    
    /* private */ var _computeBarPixelThickness: Any = js.native
    
    /* protected */ def _createDrawer(): ProxyDrawer = js.native
    
    /* private */ var _createLabelContainer: Any = js.native
    
    /* private */ var _drawLabel: Any = js.native
    
    /* protected */ def _drawLabels(): Unit = js.native
    
    /* private */ var _entitiesIntersecting: Any = js.native
    
    /**
      * Whether all the bars in this barPlot have the same pixel thickness.
      * If so, use the _barPixelThickness property to access the thickness.
      */
    /* private */ var _fixedBarPixelThickness: Any = js.native
    
    /**
      * Return the <rect>'s x or y attr value given the position and thickness of
      * that bar. This method is responsible for account for barAlignment, in particular.
      */
    /* protected */ def _getPositionAttr(position: Double, thickness: Double): Double = js.native
    
    /* private */ var _hideBarsIfAnyAreTooWide: Any = js.native
    
    /* protected */ def _isDatumOnScreen(
      attrToProjector: AttributeToProjector,
      plotWidth: Double,
      plotHeight: Double,
      d: Any,
      i: Double,
      dataset: Dataset
    ): Boolean = js.native
    
    /* protected */ var _isVertical: Boolean = js.native
    
    /* private */ var _labelConfig: Any = js.native
    
    /* protected */ var _labelFontSize: LabelFontSizePx = js.native
    
    /* private */ var _labelFormatter: Any = js.native
    
    /* private */ var _labelsEnabled: Any = js.native
    
    /* private */ var _labelsPosition: Any = js.native
    
    /**
      * The rectangular bounds of a bar. Note that the x/y coordinates are not the
      * same as the "pixel point" because they are always at the top/left of the
      * bar.
      */
    /* protected */ def _pixelBounds(datum: Any, index: Double, dataset: Dataset): PickDOMRectxywidthheight = js.native
    
    /* private */ var _pixelPointBar: Any = js.native
    
    /**
      * Labels are "on-bar" by default, but if the bar is not long enough to fit the text,
      * we can try putting the label "off-bar", if there's enough space outside of the bar
      * to fit it.
      */
    /* private */ var _shouldShowLabelOnBar: Any = js.native
    
    /* private */ var _updateLengthScale: Any = js.native
    
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
      * Get the label font size in px.
      */
    def labelFontSize(): LabelFontSizePx = js.native
    /**
      * Set the label font size.
      */
    def labelFontSize(fontSize: LabelFontSizePx): this.type = js.native
    
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
    /* protected */ def length(): ITransformableAccessorScaleBinding[Any, Double] = js.native
    
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
    /* protected */ def position(): ITransformableAccessorScaleBinding[Any, Double] = js.native
  }
  /* static members */
  object Bar {
    
    @JSImport("plottable/build/src/plots/barPlot", "Bar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/barPlot", "Bar._BAR_AREA_CLASS")
    @js.native
    def _BAR_AREA_CLASS: Any = js.native
    inline def _BAR_AREA_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "Bar._BAR_END_KEY")
    @js.native
    def _BAR_END_KEY: Any = js.native
    inline def _BAR_END_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "Bar._BAR_GAPLESS_THRESHOLD_PX")
    @js.native
    def _BAR_GAPLESS_THRESHOLD_PX: Double = js.native
    inline def _BAR_GAPLESS_THRESHOLD_PX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_GAPLESS_THRESHOLD_PX")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "Bar._BAR_THICKNESS_KEY")
    @js.native
    def _BAR_THICKNESS_KEY: String = js.native
    inline def _BAR_THICKNESS_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_THICKNESS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "Bar._BAR_THICKNESS_RATIO")
    @js.native
    def _BAR_THICKNESS_RATIO: Double = js.native
    inline def _BAR_THICKNESS_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_THICKNESS_RATIO")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "Bar._LABEL_AREA_CLASS")
    @js.native
    def _LABEL_AREA_CLASS: String = js.native
    inline def _LABEL_AREA_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * In the case of "start" or "end" LabelPositions, put the label this many px away
      * from the bar's length distance edge
      */
    @JSImport("plottable/build/src/plots/barPlot", "Bar._LABEL_MARGIN_INSIDE_BAR")
    @js.native
    def _LABEL_MARGIN_INSIDE_BAR: Double = js.native
    inline def _LABEL_MARGIN_INSIDE_BAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_MARGIN_INSIDE_BAR")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "Bar._SINGLE_BAR_DIMENSION_RATIO")
    @js.native
    def _SINGLE_BAR_DIMENSION_RATIO: Double = js.native
    inline def _SINGLE_BAR_DIMENSION_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SINGLE_BAR_DIMENSION_RATIO")(x.asInstanceOf[js.Any])
  }
  
  /* keyof plottable.anon.End */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.end
    - typings.plottable.plottableStrings.start
    - typings.plottable.plottableStrings.middle
  */
  trait BarAlignment extends StObject
  object BarAlignment {
    
    @JSImport("plottable/build/src/plots/barPlot", "BarAlignment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/barPlot", "BarAlignment.end")
    @js.native
    def end: typings.plottable.plottableStrings.end = js.native
    inline def end_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "BarAlignment.middle")
    @js.native
    def middle: typings.plottable.plottableStrings.middle = js.native
    inline def middle_=(x: middle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("middle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "BarAlignment.start")
    @js.native
    def start: typings.plottable.plottableStrings.start = js.native
    inline def start_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  /* keyof plottable.anon.Horizontal */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.vertical
    - typings.plottable.plottableStrings.horizontal
  */
  trait BarOrientation extends StObject
  object BarOrientation {
    
    @JSImport("plottable/build/src/plots/barPlot", "BarOrientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/barPlot", "BarOrientation.horizontal")
    @js.native
    def horizontal: typings.plottable.plottableStrings.horizontal = js.native
    inline def horizontal_=(x: horizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "BarOrientation.vertical")
    @js.native
    def vertical: typings.plottable.plottableStrings.vertical = js.native
    inline def vertical_=(x: vertical): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
  }
  
  /* keyof plottable.anon.Middle */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.end
    - typings.plottable.plottableStrings.start
    - typings.plottable.plottableStrings.middle
    - typings.plottable.plottableStrings.outside
  */
  trait LabelsPosition extends StObject
  object LabelsPosition {
    
    @JSImport("plottable/build/src/plots/barPlot", "LabelsPosition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/barPlot", "LabelsPosition.end")
    @js.native
    def end: typings.plottable.plottableStrings.end = js.native
    inline def end_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "LabelsPosition.middle")
    @js.native
    def middle: typings.plottable.plottableStrings.middle = js.native
    inline def middle_=(x: middle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("middle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "LabelsPosition.outside")
    @js.native
    def outside: typings.plottable.plottableStrings.outside = js.native
    inline def outside_=(x: outside): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outside")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/barPlot", "LabelsPosition.start")
    @js.native
    def start: typings.plottable.plottableStrings.start = js.native
    inline def start_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
}
