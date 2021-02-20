package typings.plottable

import typings.plottable.barPlotMod.BarOrientation
import typings.plottable.plottableStrings.basis
import typings.plottable.plottableStrings.basisClosed
import typings.plottable.plottableStrings.basisOpen
import typings.plottable.plottableStrings.bundle
import typings.plottable.plottableStrings.cardinal
import typings.plottable.plottableStrings.cardinalClosed
import typings.plottable.plottableStrings.cardinalOpen
import typings.plottable.plottableStrings.end
import typings.plottable.plottableStrings.horizontal
import typings.plottable.plottableStrings.linear
import typings.plottable.plottableStrings.linearClosed
import typings.plottable.plottableStrings.middle
import typings.plottable.plottableStrings.monotone
import typings.plottable.plottableStrings.outside
import typings.plottable.plottableStrings.start
import typings.plottable.plottableStrings.step
import typings.plottable.plottableStrings.stepAfter
import typings.plottable.plottableStrings.stepBefore
import typings.plottable.plottableStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plotsMod {
  
  object Animator {
    
    @JSImport("plottable/build/src/plots", "Animator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "Animator.MAIN")
    @js.native
    def MAIN: String = js.native
    @scala.inline
    def MAIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAIN")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Animator.RESET")
    @js.native
    def RESET: String = js.native
    @scala.inline
    def RESET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESET")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots", "Area")
  @js.native
  /**
    * An Area Plot draws a filled region (area) between Y and Y0.
    *
    * @constructor
    */
  class Area[X] ()
    extends typings.plottable.areaPlotMod.Area[X]
  /* static members */
  object Area {
    
    @JSImport("plottable/build/src/plots", "Area")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "Area._Y0_KEY")
    @js.native
    def _Y0_KEY: js.Any = js.native
    @scala.inline
    def _Y0_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y0_KEY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots", "Bar")
  @js.native
  /**
    * A Bar Plot draws bars growing out from a baseline to some value
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  class Bar[X, Y] ()
    extends typings.plottable.barPlotMod.Bar[X, Y] {
    def this(orientation: BarOrientation) = this()
  }
  /* static members */
  object Bar {
    
    @JSImport("plottable/build/src/plots", "Bar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "Bar._BAR_AREA_CLASS")
    @js.native
    def _BAR_AREA_CLASS: js.Any = js.native
    @scala.inline
    def _BAR_AREA_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Bar._BAR_END_KEY")
    @js.native
    def _BAR_END_KEY: js.Any = js.native
    @scala.inline
    def _BAR_END_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_END_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Bar._BAR_GAPLESS_THRESHOLD_PX")
    @js.native
    def _BAR_GAPLESS_THRESHOLD_PX: Double = js.native
    @scala.inline
    def _BAR_GAPLESS_THRESHOLD_PX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_GAPLESS_THRESHOLD_PX")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Bar._BAR_THICKNESS_KEY")
    @js.native
    def _BAR_THICKNESS_KEY: String = js.native
    @scala.inline
    def _BAR_THICKNESS_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_THICKNESS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Bar._BAR_THICKNESS_RATIO")
    @js.native
    def _BAR_THICKNESS_RATIO: Double = js.native
    @scala.inline
    def _BAR_THICKNESS_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_THICKNESS_RATIO")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Bar._LABEL_AREA_CLASS")
    @js.native
    def _LABEL_AREA_CLASS: String = js.native
    @scala.inline
    def _LABEL_AREA_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    /**
      * In the case of "start" or "end" LabelPositions, put the label this many px away
      * from the bar's length distance edge
      */
    @JSImport("plottable/build/src/plots", "Bar._LABEL_MARGIN_INSIDE_BAR")
    @js.native
    def _LABEL_MARGIN_INSIDE_BAR: Double = js.native
    @scala.inline
    def _LABEL_MARGIN_INSIDE_BAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_MARGIN_INSIDE_BAR")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Bar._SINGLE_BAR_DIMENSION_RATIO")
    @js.native
    def _SINGLE_BAR_DIMENSION_RATIO: Double = js.native
    @scala.inline
    def _SINGLE_BAR_DIMENSION_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SINGLE_BAR_DIMENSION_RATIO")(x.asInstanceOf[js.Any])
  }
  
  object BarAlignment {
    
    @JSImport("plottable/build/src/plots", "BarAlignment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "BarAlignment.end")
    @js.native
    def end: typings.plottable.plottableStrings.end = js.native
    @scala.inline
    def end_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "BarAlignment.middle")
    @js.native
    def middle: typings.plottable.plottableStrings.middle = js.native
    @scala.inline
    def middle_=(x: middle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("middle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "BarAlignment.start")
    @js.native
    def start: typings.plottable.plottableStrings.start = js.native
    @scala.inline
    def start_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  object BarOrientation {
    
    @JSImport("plottable/build/src/plots", "BarOrientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "BarOrientation.horizontal")
    @js.native
    def horizontal: typings.plottable.plottableStrings.horizontal = js.native
    @scala.inline
    def horizontal_=(x: horizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "BarOrientation.vertical")
    @js.native
    def vertical: typings.plottable.plottableStrings.vertical = js.native
    @scala.inline
    def vertical_=(x: vertical): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots", "ClusteredBar")
  @js.native
  /**
    * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
    *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
    *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
    *
    * @constructor
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  class ClusteredBar[X, Y] ()
    extends typings.plottable.clusteredBarPlotMod.ClusteredBar[X, Y] {
    def this(orientation: BarOrientation) = this()
  }
  
  object CurveName {
    
    @JSImport("plottable/build/src/plots", "CurveName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "CurveName.basis")
    @js.native
    def basis: typings.plottable.plottableStrings.basis = js.native
    
    @JSImport("plottable/build/src/plots", "CurveName.basisClosed")
    @js.native
    def basisClosed: typings.plottable.plottableStrings.basisClosed = js.native
    @scala.inline
    def basisClosed_=(x: basisClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basisClosed")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "CurveName.basisOpen")
    @js.native
    def basisOpen: typings.plottable.plottableStrings.basisOpen = js.native
    @scala.inline
    def basisOpen_=(x: basisOpen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basisOpen")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def basis_=(x: basis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basis")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "CurveName.bundle")
    @js.native
    def bundle: typings.plottable.plottableStrings.bundle = js.native
    @scala.inline
    def bundle_=(x: bundle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bundle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "CurveName.cardinal")
    @js.native
    def cardinal: typings.plottable.plottableStrings.cardinal = js.native
    
    @JSImport("plottable/build/src/plots", "CurveName.cardinalClosed")
    @js.native
    def cardinalClosed: typings.plottable.plottableStrings.cardinalClosed = js.native
    @scala.inline
    def cardinalClosed_=(x: cardinalClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinalClosed")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "CurveName.cardinalOpen")
    @js.native
    def cardinalOpen: typings.plottable.plottableStrings.cardinalOpen = js.native
    @scala.inline
    def cardinalOpen_=(x: cardinalOpen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinalOpen")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cardinal_=(x: cardinal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "CurveName.linear")
    @js.native
    def linear: typings.plottable.plottableStrings.linear = js.native
    
    @JSImport("plottable/build/src/plots", "CurveName.linearClosed")
    @js.native
    def linearClosed: typings.plottable.plottableStrings.linearClosed = js.native
    @scala.inline
    def linearClosed_=(x: linearClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linearClosed")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def linear_=(x: linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "CurveName.monotone")
    @js.native
    def monotone: typings.plottable.plottableStrings.monotone = js.native
    @scala.inline
    def monotone_=(x: monotone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monotone")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "CurveName.step")
    @js.native
    def step: typings.plottable.plottableStrings.step = js.native
    
    @JSImport("plottable/build/src/plots", "CurveName.stepAfter")
    @js.native
    def stepAfter: typings.plottable.plottableStrings.stepAfter = js.native
    @scala.inline
    def stepAfter_=(x: stepAfter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stepAfter")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "CurveName.stepBefore")
    @js.native
    def stepBefore: typings.plottable.plottableStrings.stepBefore = js.native
    @scala.inline
    def stepBefore_=(x: stepBefore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stepBefore")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def step_=(x: step): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
  }
  
  object LabelsPosition {
    
    @JSImport("plottable/build/src/plots", "LabelsPosition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "LabelsPosition.end")
    @js.native
    def end: typings.plottable.plottableStrings.end = js.native
    @scala.inline
    def end_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "LabelsPosition.middle")
    @js.native
    def middle: typings.plottable.plottableStrings.middle = js.native
    @scala.inline
    def middle_=(x: middle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("middle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "LabelsPosition.outside")
    @js.native
    def outside: typings.plottable.plottableStrings.outside = js.native
    @scala.inline
    def outside_=(x: outside): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outside")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "LabelsPosition.start")
    @js.native
    def start: typings.plottable.plottableStrings.start = js.native
    @scala.inline
    def start_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots", "Line")
  @js.native
  /**
    * A Line Plot draws line segments starting from the first data point to the next.
    *
    * @constructor
    */
  class Line[X] ()
    extends typings.plottable.linePlotMod.Line[X]
  
  @JSImport("plottable/build/src/plots", "Pie")
  @js.native
  /**
    * @constructor
    */
  class Pie ()
    extends typings.plottable.piePlotMod.Pie
  /* static members */
  object Pie {
    
    @JSImport("plottable/build/src/plots", "Pie")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "Pie._INNER_RADIUS_KEY")
    @js.native
    def _INNER_RADIUS_KEY: js.Any = js.native
    @scala.inline
    def _INNER_RADIUS_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_INNER_RADIUS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Pie._OUTER_RADIUS_KEY")
    @js.native
    def _OUTER_RADIUS_KEY: js.Any = js.native
    @scala.inline
    def _OUTER_RADIUS_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OUTER_RADIUS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Pie._SECTOR_VALUE_KEY")
    @js.native
    def _SECTOR_VALUE_KEY: js.Any = js.native
    @scala.inline
    def _SECTOR_VALUE_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SECTOR_VALUE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Pie._isValidData")
    @js.native
    def _isValidData(value: js.Any): Boolean = js.native
  }
  
  @JSImport("plottable/build/src/plots", "Rectangle")
  @js.native
  /**
    * A Rectangle Plot displays rectangles based on the data.
    * The left and right edges of each rectangle can be set with x() and x2().
    *   If only x() is set the Rectangle Plot will attempt to compute the correct left and right edge positions.
    * The top and bottom edges of each rectangle can be set with y() and y2().
    *   If only y() is set the Rectangle Plot will attempt to compute the correct top and bottom edge positions.
    *
    * @constructor
    * @param {Scale.Scale} xScale
    * @param {Scale.Scale} yScale
    */
  class Rectangle[X, Y] ()
    extends typings.plottable.rectanglePlotMod.Rectangle[X, Y]
  /* static members */
  object Rectangle {
    
    @JSImport("plottable/build/src/plots", "Rectangle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "Rectangle._X2_KEY")
    @js.native
    def _X2_KEY: js.Any = js.native
    @scala.inline
    def _X2_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_X2_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Rectangle._Y2_KEY")
    @js.native
    def _Y2_KEY: js.Any = js.native
    @scala.inline
    def _Y2_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y2_KEY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots", "Scatter")
  @js.native
  /**
    * A Scatter Plot draws a symbol at each data point.
    *
    * @constructor
    */
  class Scatter[X, Y] ()
    extends typings.plottable.scatterPlotMod.Scatter[X, Y]
  /* static members */
  object Scatter {
    
    @JSImport("plottable/build/src/plots", "Scatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "Scatter._LABEL_AREA_CLASS")
    @js.native
    def _LABEL_AREA_CLASS: String = js.native
    @scala.inline
    def _LABEL_AREA_CLASS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Scatter._LABEL_MARGIN_FROM_BUBBLE")
    @js.native
    def _LABEL_MARGIN_FROM_BUBBLE: Double = js.native
    @scala.inline
    def _LABEL_MARGIN_FROM_BUBBLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LABEL_MARGIN_FROM_BUBBLE")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Scatter._SIZE_KEY")
    @js.native
    def _SIZE_KEY: js.Any = js.native
    @scala.inline
    def _SIZE_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SIZE_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Scatter._SYMBOL_KEY")
    @js.native
    def _SYMBOL_KEY: js.Any = js.native
    @scala.inline
    def _SYMBOL_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SYMBOL_KEY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots", "Segment")
  @js.native
  /**
    * A Segment Plot displays line segments based on the data.
    *
    * @constructor
    */
  class Segment[X, Y] ()
    extends typings.plottable.segmentPlotMod.Segment[X, Y]
  /* static members */
  object Segment {
    
    @JSImport("plottable/build/src/plots", "Segment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "Segment._X2_KEY")
    @js.native
    def _X2_KEY: js.Any = js.native
    @scala.inline
    def _X2_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_X2_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Segment._Y2_KEY")
    @js.native
    def _Y2_KEY: js.Any = js.native
    @scala.inline
    def _Y2_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y2_KEY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots", "StackedArea")
  @js.native
  /**
    * @constructor
    */
  class StackedArea[X] ()
    extends typings.plottable.stackedAreaPlotMod.StackedArea[X]
  /* static members */
  object StackedArea {
    
    /**
      * Given an array of Datasets and the accessor function for the key, computes the
      * set reunion (no duplicates) of the domain of each Dataset. The keys are stringified
      * before being returned.
      *
      * @param {Dataset[]} datasets The Datasets for which we extract the domain keys
      * @param {Accessor<any>} keyAccessor The accessor for the key of the data
      * @return {string[]} An array of stringified keys
      */
    @JSImport("plottable/build/src/plots", "StackedArea._domainKeys")
    @js.native
    def _domainKeys(datasets: js.Any, keyAccessor: js.Any): js.Any = js.native
  }
  
  @JSImport("plottable/build/src/plots", "StackedBar")
  @js.native
  /**
    * A StackedBar Plot stacks bars across Datasets based on the primary value of the bars.
    *   On a vertical StackedBar Plot, the bars with the same X value are stacked.
    *   On a horizontal StackedBar Plot, the bars with the same Y value are stacked.
    *
    * @constructor
    * @param {Scale} xScale
    * @param {Scale} yScale
    * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
    */
  class StackedBar[X, Y] ()
    extends typings.plottable.stackedBarPlotMod.StackedBar[X, Y] {
    def this(orientation: BarOrientation) = this()
  }
  /* static members */
  object StackedBar {
    
    @JSImport("plottable/build/src/plots", "StackedBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "StackedBar._EXTREMA_LABEL_MARGIN_FROM_BAR")
    @js.native
    def _EXTREMA_LABEL_MARGIN_FROM_BAR: Double = js.native
    @scala.inline
    def _EXTREMA_LABEL_MARGIN_FROM_BAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EXTREMA_LABEL_MARGIN_FROM_BAR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots", "Waterfall")
  @js.native
  class Waterfall[X, Y] ()
    extends typings.plottable.waterfallPlotMod.Waterfall[X, Y]
  /* static members */
  object Waterfall {
    
    @JSImport("plottable/build/src/plots", "Waterfall")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots", "Waterfall._BAR_DECLINE_CLASS")
    @js.native
    def _BAR_DECLINE_CLASS: js.Any = js.native
    @scala.inline
    def _BAR_DECLINE_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_DECLINE_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Waterfall._BAR_GROWTH_CLASS")
    @js.native
    def _BAR_GROWTH_CLASS: js.Any = js.native
    @scala.inline
    def _BAR_GROWTH_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_GROWTH_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Waterfall._BAR_TOTAL_CLASS")
    @js.native
    def _BAR_TOTAL_CLASS: js.Any = js.native
    @scala.inline
    def _BAR_TOTAL_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_TOTAL_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Waterfall._CONNECTOR_AREA_CLASS")
    @js.native
    def _CONNECTOR_AREA_CLASS: js.Any = js.native
    @scala.inline
    def _CONNECTOR_AREA_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CONNECTOR_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Waterfall._CONNECTOR_CLASS")
    @js.native
    def _CONNECTOR_CLASS: js.Any = js.native
    @scala.inline
    def _CONNECTOR_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CONNECTOR_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots", "Waterfall._TOTAL_KEY")
    @js.native
    def _TOTAL_KEY: js.Any = js.native
    @scala.inline
    def _TOTAL_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOTAL_KEY")(x.asInstanceOf[js.Any])
  }
}
