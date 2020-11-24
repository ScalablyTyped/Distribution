package typings.plottable.scatterPlotMod

import typings.plottable.anon.HeightWidth
import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.commonsMod.ITransformableAccessorScaleBinding
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.scaleMod.Scale
import typings.plottable.symbolFactoriesMod.SymbolFactory
import typings.plottable.xyPlotMod.XYPlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/plots/scatterPlot", "Scatter")
@js.native
/**
  * A Scatter Plot draws a symbol at each data point.
  *
  * @constructor
  */
class Scatter[X, Y] () extends XYPlot[X, Y] {
  
  /* private */ def _calculateLabelProperties(pointCoordinates: js.Any, diameter: js.Any, measurement: js.Any): js.Any = js.native
  
  /* protected */ def _constructSymbolGenerator(): js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, _] = js.native
  
  /* private */ def _createLabelContainer(labelArea: js.Any, labelContainerOrigin: js.Any, labelOrigin: js.Any, measurement: js.Any): js.Any = js.native
  
  /* private */ def _drawLabel(datum: js.Any, index: js.Any, dataset: js.Any, attrToProjector: js.Any): js.Any = js.native
  
  /* protected */ def _drawLabels(): Unit = js.native
  
  /* protected */ def _entityBounds(entity: ILightweightScatterPlotEntity): HeightWidth = js.native
  
  /* protected */ def _entityVisibleOnPlot(entity: ILightweightScatterPlotEntity, bounds: Bounds): Boolean = js.native
  
  var _labelConfig: js.Any = js.native
  
  var _labelFormatter: js.Any = js.native
  
  var _labelsEnabled: js.Any = js.native
  
  /**
    * Get whether bar labels are enabled.
    *
    * @returns {boolean} Whether bars should display labels or not.
    */
  def labelsEnabled(): Boolean = js.native
  /**
    * Sets whether labels are enabled.
    *
    * @param {boolean} labelsEnabled
    * @returns {Scatter} The calling SCATTER Plot.
    */
  def labelsEnabled(enabled: Boolean): this.type = js.native
  
  /**
    * Sets the size property to a constant number or the result of an Accessor<number>.
    *
    * @param {number|Accessor<number>} size
    * @returns {Plots.Scatter} The calling Scatter Plot.
    */
  def size(size: Double): this.type = js.native
  def size(size: IAccessor[Double]): this.type = js.native
  /**
    * Gets the AccessorScaleBinding for the size property of the plot.
    * The size property corresponds to the area of the symbol.
    */
  def size[S](): ITransformableAccessorScaleBinding[S, Double] = js.native
  /**
    * Sets the size property to a scaled constant value or scaled result of an Accessor.
    * The provided Scale will account for the values when autoDomain()-ing.
    *
    * @param {S|Accessor<S>} sectorValue
    * @param {Scale<S, number>} scale
    * @returns {Plots.Scatter} The calling Scatter Plot.
    */
  def size[S](size: S, scale: Scale[S, Double]): this.type = js.native
  def size[S](size: IAccessor[S], scale: Scale[S, Double]): this.type = js.native
  
  /**
    * Gets the AccessorScaleBinding for the symbol property of the plot.
    * The symbol property corresponds to how the symbol will be drawn.
    */
  def symbol(): IAccessorScaleBinding[_, _] = js.native
  /**
    * Sets the symbol property to an Accessor<SymbolFactory>.
    *
    * @param {Accessor<SymbolFactory>} symbol
    * @returns {Plots.Scatter} The calling Scatter Plot.
    */
  def symbol(symbol: IAccessor[SymbolFactory]): this.type = js.native
}
/* static members */
@JSImport("plottable/build/src/plots/scatterPlot", "Scatter")
@js.native
object Scatter extends js.Object {
  
  var _LABEL_AREA_CLASS: String = js.native
  
  var _LABEL_MARGIN_FROM_BUBBLE: Double = js.native
  
  var _SIZE_KEY: js.Any = js.native
  
  var _SYMBOL_KEY: js.Any = js.native
}
