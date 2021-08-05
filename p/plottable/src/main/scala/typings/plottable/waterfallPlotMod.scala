package typings.plottable

import typings.plottable.barPlotMod.Bar
import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.interfacesMod.IAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterfallPlotMod {
  
  @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall")
  @js.native
  class Waterfall[X, Y] () extends Bar[X, Double] {
    
    /* private */ def _calculateSubtotalsAndExtent(dataset: js.Any): js.Any = js.native
    
    /* private */ var _connectorArea: js.Any = js.native
    
    /* private */ var _connectorsEnabled: js.Any = js.native
    
    /* private */ def _drawConnectors(): js.Any = js.native
    
    /* private */ var _extent: js.Any = js.native
    
    /* private */ var _subtotals: js.Any = js.native
    
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
  object Waterfall {
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._BAR_DECLINE_CLASS")
    @js.native
    def _BAR_DECLINE_CLASS: js.Any = js.native
    inline def _BAR_DECLINE_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_DECLINE_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._BAR_GROWTH_CLASS")
    @js.native
    def _BAR_GROWTH_CLASS: js.Any = js.native
    inline def _BAR_GROWTH_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_GROWTH_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._BAR_TOTAL_CLASS")
    @js.native
    def _BAR_TOTAL_CLASS: js.Any = js.native
    inline def _BAR_TOTAL_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_TOTAL_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._CONNECTOR_AREA_CLASS")
    @js.native
    def _CONNECTOR_AREA_CLASS: js.Any = js.native
    inline def _CONNECTOR_AREA_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CONNECTOR_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._CONNECTOR_CLASS")
    @js.native
    def _CONNECTOR_CLASS: js.Any = js.native
    inline def _CONNECTOR_CLASS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CONNECTOR_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._TOTAL_KEY")
    @js.native
    def _TOTAL_KEY: js.Any = js.native
    inline def _TOTAL_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOTAL_KEY")(x.asInstanceOf[js.Any])
  }
}
