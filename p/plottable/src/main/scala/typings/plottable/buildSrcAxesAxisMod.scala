package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.plottable.buildSrcComponentsComponentMod.Component
import typings.plottable.buildSrcComponentsLabelMod.LabelFontSizePx
import typings.plottable.buildSrcCoreFormattersMod.Formatter
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typings.plottable.buildSrcScalesScaleMod.Scale
import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.left
import typings.plottable.plottableStrings.right
import typings.plottable.plottableStrings.top
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAxesAxisMod {
  
  @JSImport("plottable/build/src/axes/axis", "Axis")
  @js.native
  open class Axis[D] protected () extends Component {
    /**
      * Constructs an Axis.
      * An Axis is a visual representation of a Scale.
      *
      * @constructor
      * @param {Scale} scale
      * @param {AxisOrientation} orientation Orientation of this Axis.
      */
    def this(scale: Scale[D, Double], orientation: AxisOrientation) = this()
    
    /* private */ var _annotatedTicks: Any = js.native
    
    /* private */ var _annotatedTicksToRender: Any = js.native
    
    /* private */ var _annotationContainer: Any = js.native
    
    /* private */ var _annotationFormatter: Any = js.native
    
    /* private */ var _annotationMeasurer: Any = js.native
    
    /* private */ var _annotationTierCount: Any = js.native
    
    /* protected */ def _annotationTierHeight(): Double = js.native
    
    /* private */ var _annotationToTier: Any = js.native
    
    /* private */ var _annotationWriter: Any = js.native
    
    /* private */ var _annotationsEnabled: Any = js.native
    
    /* protected */ var _baseline: SimpleSelection[Unit] = js.native
    
    /* protected */ def _computeHeight(): Double = js.native
    
    /* protected */ def _computeWidth(): Double = js.native
    
    /* private */ var _configureTickLabelContainer: Any = js.native
    
    /**
      * Retrieves the size of the core pieces.
      *
      * The core pieces include the labels, the end tick marks, the inner tick marks, and the tick label padding.
      */
    /* protected */ def _coreSize(): Double = js.native
    
    /* protected */ def _drawAnnotations(): Unit = js.native
    
    /* private */ var _endTickLength: Any = js.native
    
    /* private */ var _formatter: Any = js.native
    
    /* protected */ def _generateBaselineAttrHash(): StringDictionary[Double] = js.native
    
    /* protected */ def _generateTickMarkAttrHash(): StringDictionary[Double | (js.Function1[/* d */ Any, Double])] = js.native
    /* protected */ def _generateTickMarkAttrHash(isEndTickMark: Boolean): StringDictionary[Double | (js.Function1[/* d */ Any, Double])] = js.native
    
    /* protected */ def _getTickValues(): js.Array[D] = js.native
    
    /**
      * Responsible for hiding any tick labels that break out of the bounding
      * container.
      */
    /* protected */ def _hideOverflowingTickLabels(): Unit = js.native
    
    /**
      * Hides the Tick Marks which have no corresponding Tick Labels
      */
    /* protected */ def _hideTickMarksWithoutLabel(): Unit = js.native
    
    /* private */ var _innerTickLength: Any = js.native
    
    /* private */ var _margin: Any = js.native
    
    /**
      * Gets the maximum pixel length over all ticks on this axis.
      * @returns {number}
      */
    /* protected */ def _maxLabelTickLength(): Double = js.native
    
    /* private */ var _orientation: Any = js.native
    
    /* protected */ def _removeAnnotations(): Unit = js.native
    
    /* protected */ def _rescale(): Unit = js.native
    
    /* private */ var _rescaleCallback: Any = js.native
    
    /* protected */ var _scale: Scale[D, Double] = js.native
    
    /* protected */ def _setDefaultAlignment(): Unit = js.native
    
    /* protected */ def _showAllTickLabels(): Unit = js.native
    
    /* protected */ def _showAllTickMarks(): Unit = js.native
    
    /* private */ var _showEndTickLabels: Any = js.native
    
    /* protected */ var _tickLabelContainer: SimpleSelection[Unit] = js.native
    
    /**
      * `protected` instead of `private` to accommodate time axes which draw their own label containers
      * and need access to this value.
      */
    /* protected */ var _tickLabelFontSize: LabelFontSizePx = js.native
    
    /* private */ var _tickLabelPadding: Any = js.native
    
    /* protected */ var _tickMarkContainer: SimpleSelection[Unit] = js.native
    
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
    def annotationFormatter(): Formatter = js.native
    /**
      * Sets the Formatter for the annotations. The annotationFormatter will be passed
      * each value in annotatedTicks.
      *
      * @returns {Axis} The calling Axis.
      */
    def annotationFormatter(annotationFormatter: Formatter): this.type = js.native
    
    /**
      * Gets the count of annotation tiers to render.
      */
    def annotationTierCount(): Double = js.native
    /**
      * Sets the count of annotation tiers to render.
      *
      * @returns {Axis} The calling Axis.
      */
    def annotationTierCount(annotationTierCount: Double): this.type = js.native
    
    /**
      * Gets if annotations are enabled.
      */
    def annotationsEnabled(): Boolean = js.native
    /**
      * Sets if annotations are enabled.
      *
      * @returns {Axis} The calling Axis.
      */
    def annotationsEnabled(annotationsEnabled: Boolean): this.type = js.native
    
    /**
      * Gets the end tick mark length in pixels.
      */
    def endTickLength(): Double = js.native
    /**
      * Sets the end tick mark length in pixels.
      *
      * @param {number} length
      * @returns {Axis} The calling Axis.
      */
    def endTickLength(length: Double): this.type = js.native
    
    /**
      * Gets the Formatter on the Axis. Tick values are passed through the
      * Formatter before being displayed.
      */
    def formatter(): Formatter = js.native
    /**
      * Sets the Formatter on the Axis. Tick values are passed through the
      * Formatter before being displayed.
      *
      * @param {Formatter} formatter
      * @returns {Axis} The calling Axis.
      */
    def formatter(formatter: Formatter): this.type = js.native
    
    /**
      * Get the scale that this axis is associated with.
      * @returns {Scale<D, number>}
      */
    def getScale(): Scale[D, Double] = js.native
    
    /**
      * Gets the tick mark length in pixels.
      */
    def innerTickLength(): Double = js.native
    /**
      * Sets the tick mark length in pixels.
      *
      * @param {number} length
      * @returns {Axis} The calling Axis.
      */
    def innerTickLength(length: Double): this.type = js.native
    
    /**
      * Get whether this axis is horizontal (orientation is "top" or "bottom") or vertical.
      * @returns {boolean} - true for horizontal, false for vertical.
      */
    def isHorizontal(): Boolean = js.native
    
    /**
      * Gets the margin in pixels.
      * The margin is the amount of space between the tick labels and the outer edge of the Axis.
      * The margin also determines the space that annotations will reside in if annotations are enabled.
      */
    def margin(): Double = js.native
    /**
      * Sets the margin in pixels.
      * The margin is the amount of space between the tick labels and the outer edge of the Axis.
      * The margin also determines the space that annotations will reside in if annotations are enabled.
      *
      * @param {number} size
      * @returns {Axis} The calling Axis.
      */
    def margin(size: Double): this.type = js.native
    
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
    def showEndTickLabels(): Boolean = js.native
    /**
      * Sets whether the Axis shows the end tick labels.
      *
      * @param {boolean} show
      * @returns {Axis} The calling Axis.
      */
    def showEndTickLabels(show: Boolean): this.type = js.native
    
    /**
      * Gets the tick label data on a element. Element in argument must be a descendent of a tick label element.
      *
      * @param {Element} element
      */
    def tickLabelDataOnElement(element: Element): Any = js.native
    
    /**
      * Get the label font size in px.
      */
    def tickLabelFontSize(): LabelFontSizePx = js.native
    /**
      * Set the label font size.
      */
    def tickLabelFontSize(fontSize: LabelFontSizePx): this.type = js.native
    
    /**
      * Gets the padding between each tick mark and its associated label in pixels.
      */
    def tickLabelPadding(): Double = js.native
    /**
      * Sets the padding between each tick mark and its associated label in pixels.
      *
      * @param {number} padding
      * @returns {Axis} The calling Axis.
      */
    def tickLabelPadding(padding: Double): this.type = js.native
  }
  /* static members */
  object Axis {
    
    @JSImport("plottable/build/src/axes/axis", "Axis")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The css class applied to each annotation circle, which denotes which tick is being annotated.
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.ANNOTATION_CIRCLE_CLASS")
    @js.native
    def ANNOTATION_CIRCLE_CLASS: String = js.native
    inline def ANNOTATION_CIRCLE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_CIRCLE_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each annotation label, which shows the formatted annotation text.
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.ANNOTATION_LABEL_CLASS")
    @js.native
    def ANNOTATION_LABEL_CLASS: String = js.native
    inline def ANNOTATION_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_LABEL_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each annotation line, which extends from the axis to the rect.
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.ANNOTATION_LINE_CLASS")
    @js.native
    def ANNOTATION_LINE_CLASS: String = js.native
    inline def ANNOTATION_LINE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_LINE_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each annotation rect, which surrounds the annotation label.
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.ANNOTATION_RECT_CLASS")
    @js.native
    def ANNOTATION_RECT_CLASS: String = js.native
    inline def ANNOTATION_RECT_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_RECT_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each end tick mark (the line on the end tick).
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.END_TICK_MARK_CLASS")
    @js.native
    def END_TICK_MARK_CLASS: String = js.native
    inline def END_TICK_MARK_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_TICK_MARK_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each tick label (the text associated with the tick).
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.TICK_LABEL_CLASS")
    @js.native
    def TICK_LABEL_CLASS: String = js.native
    inline def TICK_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_LABEL_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each tick mark (the line on the tick).
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.TICK_MARK_CLASS")
    @js.native
    def TICK_MARK_CLASS: String = js.native
    inline def TICK_MARK_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARK_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/axis", "Axis._ANNOTATION_LABEL_PADDING")
    @js.native
    def _ANNOTATION_LABEL_PADDING: Any = js.native
    inline def _ANNOTATION_LABEL_PADDING_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ANNOTATION_LABEL_PADDING")(x.asInstanceOf[js.Any])
  }
  
  /* keyof plottable.anon.Bottom */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.left
    - typings.plottable.plottableStrings.top
    - typings.plottable.plottableStrings.bottom
    - typings.plottable.plottableStrings.right
  */
  trait AxisOrientation extends StObject
  object AxisOrientation {
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation.bottom")
    @js.native
    def bottom: typings.plottable.plottableStrings.bottom = js.native
    inline def bottom_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation.left")
    @js.native
    def left: typings.plottable.plottableStrings.left = js.native
    inline def left_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation.right")
    @js.native
    def right: typings.plottable.plottableStrings.right = js.native
    inline def right_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation.top")
    @js.native
    def top: typings.plottable.plottableStrings.top = js.native
    inline def top_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
}
