package typings
package plottableLib.buildSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src", "Plots")
@js.native
object PlotsNs extends js.Object {
  @js.native
  class Area[X] ()
    extends plottableLib.buildSrcPlotsMod.Area[X]
  
  @js.native
  class Bar[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Bar[X, Y] {
    /**
         * A Bar Plot draws bars growing out from a baseline to some value
         *
         * @constructor
         * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
         */
    def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
  }
  
  @js.native
  class ClusteredBar[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.ClusteredBar[X, Y] {
    /**
         * A ClusteredBar Plot groups bars across Datasets based on the primary value of the bars.
         *   On a vertical ClusteredBar Plot, the bars with the same X value are grouped.
         *   On a horizontal ClusteredBar Plot, the bars with the same Y value are grouped.
         *
         * @constructor
         * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
         */
    def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
  }
  
  @js.native
  class Line[X] ()
    extends plottableLib.buildSrcPlotsMod.Line[X]
  
  @js.native
  class Pie ()
    extends plottableLib.buildSrcPlotsMod.Pie
  
  @js.native
  class Rectangle[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Rectangle[X, Y]
  
  @js.native
  class Scatter[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Scatter[X, Y]
  
  @js.native
  class Segment[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Segment[X, Y]
  
  @js.native
  class StackedArea[X] ()
    extends plottableLib.buildSrcPlotsMod.StackedArea[X]
  
  @js.native
  class StackedBar[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.StackedBar[X, Y] {
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
    def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
  }
  
  @js.native
  class Waterfall[X, Y] ()
    extends plottableLib.buildSrcPlotsMod.Waterfall[X, Y]
  
  val BarAlignment: plottableLib.Anon_Middle = js.native
  val BarOrientation: plottableLib.Anon_Horizontal = js.native
  val CurveName: plottableLib.Anon_LinearClosed = js.native
  val LabelsPosition: plottableLib.Anon_Outside = js.native
  @JSName("Animator")
  @js.native
  object AnimatorNs extends js.Object {
    var MAIN: java.lang.String = js.native
    var RESET: java.lang.String = js.native
  }
  
  @js.native
  object Area extends js.Object {
    var _Y0_KEY: js.Any = js.native
  }
  
  @js.native
  object Bar extends js.Object {
    var _BAR_AREA_CLASS: js.Any = js.native
    var _BAR_END_KEY: js.Any = js.native
    var _BAR_GAPLESS_THRESHOLD_PX: scala.Double = js.native
    var _BAR_THICKNESS_KEY: java.lang.String = js.native
    var _BAR_THICKNESS_RATIO: scala.Double = js.native
    var _LABEL_AREA_CLASS: java.lang.String = js.native
    /**
         * In the case of "start" or "end" LabelPositions, put the label this many px away
         * from the bar's length distance edge
         */
    var _LABEL_MARGIN_INSIDE_BAR: scala.Double = js.native
    var _SINGLE_BAR_DIMENSION_RATIO: scala.Double = js.native
  }
  
  @js.native
  object Pie extends js.Object {
    var _INNER_RADIUS_KEY: js.Any = js.native
    var _OUTER_RADIUS_KEY: js.Any = js.native
    var _SECTOR_VALUE_KEY: js.Any = js.native
    /* protected */ def _isValidData(value: js.Any): scala.Boolean = js.native
  }
  
  @js.native
  object Rectangle extends js.Object {
    var _X2_KEY: js.Any = js.native
    var _Y2_KEY: js.Any = js.native
  }
  
  @js.native
  object Scatter extends js.Object {
    var _LABEL_AREA_CLASS: java.lang.String = js.native
    var _LABEL_MARGIN_FROM_BUBBLE: scala.Double = js.native
    var _SIZE_KEY: js.Any = js.native
    var _SYMBOL_KEY: js.Any = js.native
  }
  
  @js.native
  object Segment extends js.Object {
    var _X2_KEY: js.Any = js.native
    var _Y2_KEY: js.Any = js.native
  }
  
  @js.native
  object StackedArea extends js.Object {
    /**
         * Given an array of Datasets and the accessor function for the key, computes the
         * set reunion (no duplicates) of the domain of each Dataset. The keys are stringified
         * before being returned.
         *
         * @param {Dataset[]} datasets The Datasets for which we extract the domain keys
         * @param {Accessor<any>} keyAccessor The accessor for the key of the data
         * @return {string[]} An array of stringified keys
         */
    /* private */ def _domainKeys(datasets: js.Any, keyAccessor: js.Any): js.Any = js.native
  }
  
  @js.native
  object StackedBar extends js.Object {
    var _EXTREMA_LABEL_MARGIN_FROM_BAR: scala.Double = js.native
  }
  
  @js.native
  object Waterfall extends js.Object {
    var _BAR_DECLINE_CLASS: js.Any = js.native
    var _BAR_GROWTH_CLASS: js.Any = js.native
    var _BAR_TOTAL_CLASS: js.Any = js.native
    var _CONNECTOR_AREA_CLASS: js.Any = js.native
    var _CONNECTOR_CLASS: js.Any = js.native
    var _TOTAL_KEY: js.Any = js.native
  }
  
}

