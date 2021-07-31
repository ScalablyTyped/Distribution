package typings.plottable

import org.scalablytyped.runtime.StringDictionary
import typings.plottable.componentMod.Component
import typings.plottable.formattersMod.Formatter
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.plottableStrings.bottom
import typings.plottable.plottableStrings.left
import typings.plottable.plottableStrings.right
import typings.plottable.plottableStrings.top
import typings.plottable.scaleMod.Scale
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisMod {
  
  @JSImport("plottable/build/src/axes/axis", "Axis")
  @js.native
  class Axis[D] protected () extends Component {
    /**
      * Constructs an Axis.
      * An Axis is a visual representation of a Scale.
      *
      * @constructor
      * @param {Scale} scale
      * @param {AxisOrientation} orientation Orientation of this Axis.
      */
    def this(scale: Scale[D, Double], orientation: AxisOrientation) = this()
    
    var _annotatedTicks: js.Any = js.native
    
    /* private */ def _annotatedTicksToRender(): js.Any = js.native
    
    var _annotationContainer: js.Any = js.native
    
    var _annotationFormatter: js.Any = js.native
    
    var _annotationMeasurer: js.Any = js.native
    
    var _annotationTierCount: js.Any = js.native
    
    /* protected */ def _annotationTierHeight(): Double = js.native
    
    /* private */ def _annotationToTier(measurements: js.Any): js.Any = js.native
    
    var _annotationWriter: js.Any = js.native
    
    var _annotationsEnabled: js.Any = js.native
    
    var _baseline: SimpleSelection[Unit] = js.native
    
    /* protected */ def _computeHeight(): Double = js.native
    
    /* protected */ def _computeWidth(): Double = js.native
    
    /**
      * Retrieves the size of the core pieces.
      *
      * The core pieces include the labels, the end tick marks, the inner tick marks, and the tick label padding.
      */
    /* protected */ def _coreSize(): Double = js.native
    
    /* protected */ def _drawAnnotations(): Unit = js.native
    
    var _endTickLength: js.Any = js.native
    
    var _formatter: js.Any = js.native
    
    /* protected */ def _generateBaselineAttrHash(): StringDictionary[Double] = js.native
    
    /* protected */ def _generateTickMarkAttrHash(): StringDictionary[Double | (js.Function1[/* d */ js.Any, Double])] = js.native
    /* protected */ def _generateTickMarkAttrHash(isEndTickMark: Boolean): StringDictionary[Double | (js.Function1[/* d */ js.Any, Double])] = js.native
    
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
    
    var _innerTickLength: js.Any = js.native
    
    var _margin: js.Any = js.native
    
    /**
      * Gets the maximum pixel length over all ticks on this axis.
      * @returns {number}
      */
    /* protected */ def _maxLabelTickLength(): Double = js.native
    
    var _orientation: js.Any = js.native
    
    /* protected */ def _removeAnnotations(): Unit = js.native
    
    /* protected */ def _rescale(): Unit = js.native
    
    var _rescaleCallback: js.Any = js.native
    
    var _scale: Scale[D, Double] = js.native
    
    /* protected */ def _setDefaultAlignment(): Unit = js.native
    
    /* protected */ def _showAllTickLabels(): Unit = js.native
    
    /* protected */ def _showAllTickMarks(): Unit = js.native
    
    var _showEndTickLabels: js.Any = js.native
    
    var _tickLabelContainer: SimpleSelection[Unit] = js.native
    
    var _tickLabelPadding: js.Any = js.native
    
    var _tickMarkContainer: SimpleSelection[Unit] = js.native
    
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
    def tickLabelDataOnElement(element: Element): js.Object = js.native
    
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
    @scala.inline
    def ANNOTATION_CIRCLE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_CIRCLE_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each annotation label, which shows the formatted annotation text.
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.ANNOTATION_LABEL_CLASS")
    @js.native
    def ANNOTATION_LABEL_CLASS: String = js.native
    @scala.inline
    def ANNOTATION_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_LABEL_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each annotation line, which extends from the axis to the rect.
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.ANNOTATION_LINE_CLASS")
    @js.native
    def ANNOTATION_LINE_CLASS: String = js.native
    @scala.inline
    def ANNOTATION_LINE_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_LINE_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each annotation rect, which surrounds the annotation label.
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.ANNOTATION_RECT_CLASS")
    @js.native
    def ANNOTATION_RECT_CLASS: String = js.native
    @scala.inline
    def ANNOTATION_RECT_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANNOTATION_RECT_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each end tick mark (the line on the end tick).
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.END_TICK_MARK_CLASS")
    @js.native
    def END_TICK_MARK_CLASS: String = js.native
    @scala.inline
    def END_TICK_MARK_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_TICK_MARK_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each tick label (the text associated with the tick).
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.TICK_LABEL_CLASS")
    @js.native
    def TICK_LABEL_CLASS: String = js.native
    @scala.inline
    def TICK_LABEL_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_LABEL_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * The css class applied to each tick mark (the line on the tick).
      */
    @JSImport("plottable/build/src/axes/axis", "Axis.TICK_MARK_CLASS")
    @js.native
    def TICK_MARK_CLASS: String = js.native
    @scala.inline
    def TICK_MARK_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICK_MARK_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/axis", "Axis._ANNOTATION_LABEL_PADDING")
    @js.native
    def _ANNOTATION_LABEL_PADDING: js.Any = js.native
    @scala.inline
    def _ANNOTATION_LABEL_PADDING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ANNOTATION_LABEL_PADDING")(x.asInstanceOf[js.Any])
  }
  
  /* keyof plottable.anon.Bottom */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.left
    - typings.plottable.plottableStrings.right
    - typings.plottable.plottableStrings.top
    - typings.plottable.plottableStrings.bottom
  */
  trait AxisOrientation extends StObject
  object AxisOrientation {
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation.bottom")
    @js.native
    def bottom: typings.plottable.plottableStrings.bottom = js.native
    @scala.inline
    def bottom_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation.left")
    @js.native
    def left: typings.plottable.plottableStrings.left = js.native
    @scala.inline
    def left_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation.right")
    @js.native
    def right: typings.plottable.plottableStrings.right = js.native
    @scala.inline
    def right_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/axes/axis", "AxisOrientation.top")
    @js.native
    def top: typings.plottable.plottableStrings.top = js.native
    @scala.inline
    def top_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
}
