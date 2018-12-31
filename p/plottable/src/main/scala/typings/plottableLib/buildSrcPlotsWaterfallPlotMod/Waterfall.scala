package typings
package plottableLib.buildSrcPlotsWaterfallPlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall")
@js.native
class Waterfall[X, Y] ()
  extends plottableLib.buildSrcPlotsBarPlotMod.Bar[X, scala.Double] {
  var _connectorArea: js.Any = js.native
  var _connectorsEnabled: js.Any = js.native
  var _extent: js.Any = js.native
  var _subtotals: js.Any = js.native
  /* private */ def _calculateSubtotalsAndExtent(dataset: js.Any): js.Any = js.native
  /* private */ def _drawConnectors(): js.Any = js.native
  /* private */ def _updateSubtotals(): js.Any = js.native
  /**
    * Gets whether connectors are enabled.
    *
    * @returns {boolean} Whether connectors should be shown or not.
    */
  def connectorsEnabled(): scala.Boolean = js.native
  /**
    * Sets whether connectors are enabled.
    *
    * @param {boolean} enabled
    * @returns {Plots.Waterfall} The calling Waterfall Plot.
    */
  def connectorsEnabled(enabled: scala.Boolean): this.type = js.native
  /**
    * Sets total to a constant number or the result of an Accessor
    *
    * @param {Accessor<boolean>}
    * @returns {Plots.Waterfall} The calling Waterfall Plot.
    */
  def total(total: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Boolean]): this.type = js.native
  /**
    * Gets the AccessorScaleBinding for whether a bar represents a total or a delta.
    */
  def total[T](): plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[T, scala.Boolean] = js.native
}

@JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall")
@js.native
object Waterfall extends js.Object {
  var _BAR_DECLINE_CLASS: js.Any = js.native
  var _BAR_GROWTH_CLASS: js.Any = js.native
  var _BAR_TOTAL_CLASS: js.Any = js.native
  var _CONNECTOR_AREA_CLASS: js.Any = js.native
  var _CONNECTOR_CLASS: js.Any = js.native
  var _TOTAL_KEY: js.Any = js.native
}

