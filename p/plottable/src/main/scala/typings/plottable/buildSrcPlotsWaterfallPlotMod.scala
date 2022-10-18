package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcPlotsBarPlotMod.Bar
import typings.plottable.buildSrcPlotsCommonsMod.IAccessorScaleBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlotsWaterfallPlotMod {
  
  @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall")
  @js.native
  open class Waterfall[X, Y] () extends Bar[X, Double] {
    
    /* private */ var _calculateSubtotalsAndExtent: Any = js.native
    
    /* private */ var _connectorArea: Any = js.native
    
    /* private */ var _connectorsEnabled: Any = js.native
    
    /* private */ var _drawConnectors: Any = js.native
    
    /* private */ var _extent: Any = js.native
    
    /* private */ var _subtotals: Any = js.native
    
    /* private */ var _updateSubtotals: Any = js.native
    
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
    def _BAR_DECLINE_CLASS: Any = js.native
    inline def _BAR_DECLINE_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_DECLINE_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._BAR_GROWTH_CLASS")
    @js.native
    def _BAR_GROWTH_CLASS: Any = js.native
    inline def _BAR_GROWTH_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_GROWTH_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._BAR_TOTAL_CLASS")
    @js.native
    def _BAR_TOTAL_CLASS: Any = js.native
    inline def _BAR_TOTAL_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BAR_TOTAL_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._CONNECTOR_AREA_CLASS")
    @js.native
    def _CONNECTOR_AREA_CLASS: Any = js.native
    inline def _CONNECTOR_AREA_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CONNECTOR_AREA_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._CONNECTOR_CLASS")
    @js.native
    def _CONNECTOR_CLASS: Any = js.native
    inline def _CONNECTOR_CLASS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CONNECTOR_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/waterfallPlot", "Waterfall._TOTAL_KEY")
    @js.native
    def _TOTAL_KEY: Any = js.native
    inline def _TOTAL_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOTAL_KEY")(x.asInstanceOf[js.Any])
  }
}
