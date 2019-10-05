package typings.plottable

import typings.plottable.buildSrcCoreFormattersMod.Formatter
import typings.plottable.buildSrcPlotsBarPlotMod.Bar
import typings.plottable.buildSrcPlotsBarPlotMod.BarOrientation
import typings.plottable.buildSrcUtilsStackingUtilsMod.IStackingOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/stackedBarPlot", JSImport.Namespace)
@js.native
object buildSrcPlotsStackedBarPlotMod extends js.Object {
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
  class StackedBar[X, Y] () extends Bar[X, Y] {
    def this(orientation: BarOrientation) = this()
    var _extremaFormatter: js.Any = js.native
    var _labelArea: js.Any = js.native
    var _measurer: js.Any = js.native
    var _stackedExtent: js.Any = js.native
    var _stackingOrder: js.Any = js.native
    var _stackingResult: js.Any = js.native
    var _writer: js.Any = js.native
    /**
      * Gets the Formatter for the stacked bar extrema labels.
      */
    def extremaFormatter(): Formatter = js.native
    /**
      * Sets the Formatter for the stacked bar extrema labels. Extrema labels are the
      * numbers at the very top and bottom of the stack that aren't associated
      * with a single datum. Their value will be passed through this formatter
      * before being displayed.
      *
      * @param {Formatter} formatter
      * @returns {this}
      */
    def extremaFormatter(formatter: Formatter): this.type = js.native
    /**
      * Gets the stacking order of the plot.
      */
    def stackingOrder(): IStackingOrder = js.native
    /**
      * Sets the stacking order of the plot.
      *
      * By default, stacked plots are "bottomup", meaning for positive data, the
      * first series will be placed at the bottom of the scale and subsequent
      * data series will by stacked on top. This can be reveresed by setting
      * stacking order to "topdown".
      *
      * @returns {Plots.StackedArea} This plot
      */
    def stackingOrder(stackingOrder: IStackingOrder): this.type = js.native
  }
  
  /* static members */
  @js.native
  object StackedBar extends js.Object {
    var _EXTREMA_LABEL_MARGIN_FROM_BAR: Double = js.native
  }
  
}

