package typings.plottable

import typings.plottable.barPlotMod.Bar
import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.interfacesMod.IAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/waterfallPlot", JSImport.Namespace)
@js.native
object waterfallPlotMod extends js.Object {
  @js.native
  class Waterfall[X, Y] () extends Bar[X, Double] {
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
    def connectorsEnabled(): Boolean = js.native
    /**
      * Sets whether connectors are enabled.
      *
      * @param {boolean} enabled
      * @returns {Plots.Waterfall} The calling Waterfall Plot.
      */
    def connectorsEnabled(enabled: Boolean): this.type = js.native
    /**
      * Sets total to a constant number or the result of an Accessor
      *
      * @param {Accessor<boolean>}
      * @returns {Plots.Waterfall} The calling Waterfall Plot.
      */
    def total(total: IAccessor[Boolean]): this.type = js.native
    /**
      * Gets the AccessorScaleBinding for whether a bar represents a total or a delta.
      */
    def total[T](): IAccessorScaleBinding[T, Boolean] = js.native
  }
  
  /* static members */
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

