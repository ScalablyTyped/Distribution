package typings.plottable.piePlotMod

import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.drawerMod.ProxyDrawer
import typings.plottable.formattersMod.DatumFormatter
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.plotMod.Plot
import typings.plottable.scaleMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/piePlot", "Pie")
@js.native
/**
  * @constructor
  */
class Pie () extends Plot {
  var _endAngle: js.Any = js.native
  var _endAngles: js.Any = js.native
  var _labelFormatter: js.Any = js.native
  var _labelsEnabled: js.Any = js.native
  var _startAngle: js.Any = js.native
  var _startAngles: js.Any = js.native
  var _strokeDrawers: js.Any = js.native
  /* protected */ def _createDrawer(): ProxyDrawer = js.native
  /* private */ def _drawLabels(): js.Any = js.native
  /* private */ def _generateStrokeDrawSteps(): js.Any = js.native
  /* private */ def _pieCenter(): js.Any = js.native
  /* private */ def _sliceIndexForPoint(p: js.Any): js.Any = js.native
  /* private */ def _updatePieAngles(): js.Any = js.native
  /**
    * Gets the end angle of the Pie Plot.
    *
    * @returns {number} Returns the end angle
    */
  def endAngle(): Double = js.native
  /**
    * Sets the end angle of the Pie Plot.
    *
    * @param {number} endAngle
    * @returns {Pie} The calling Pie Plot.
    */
  def endAngle(angle: Double): this.type = js.native
  /**
    * Sets the inner radius to a constant number or the result of an Accessor<number>.
    *
    * @param {number|Accessor<number>} innerRadius
    * @returns {Pie} The calling Pie Plot.
    */
  def innerRadius(innerRadius: Double): js.Any = js.native
  def innerRadius(innerRadius: IAccessor[Double]): js.Any = js.native
  /**
    * Gets the AccessorScaleBinding for the inner radius.
    */
  def innerRadius[R](): IAccessorScaleBinding[R, Double] = js.native
  /**
    * Sets the inner radius to a scaled constant value or scaled result of an Accessor.
    * The provided Scale will account for the values when autoDomain()-ing.
    *
    * @param {R|Accessor<R>} innerRadius
    * @param {Scale<R, number>} scale
    * @returns {Pie} The calling Pie Plot.
    */
  def innerRadius[R](innerRadius: R, scale: Scale[R, Double]): js.Any = js.native
  def innerRadius[R](innerRadius: IAccessor[R], scale: Scale[R, Double]): js.Any = js.native
  /**
    * Gets the Formatter for the labels.
    */
  def labelFormatter(): DatumFormatter = js.native
  /**
    * Sets the Formatter for the labels. The labelFormatter will be fed each pie
    * slice's value as computed by the `.sectorValue()` accessor, as well as the
    * datum, datum index, and dataset associated with that bar.
    *
    * @param {Formatter} formatter
    * @returns {Pie} The calling Pie Plot.
    */
  def labelFormatter(formatter: DatumFormatter): this.type = js.native
  /**
    * Get whether slice labels are enabled.
    *
    * @returns {boolean} Whether slices should display labels or not.
    */
  def labelsEnabled(): Boolean = js.native
  /**
    * Sets whether labels are enabled.
    *
    * @param {boolean} labelsEnabled
    * @returns {Pie} The calling Pie Plot.
    */
  def labelsEnabled(enabled: Boolean): this.type = js.native
  /**
    * Sets the outer radius to a constant number or the result of an Accessor<number>.
    *
    * @param {number|Accessor<number>} outerRadius
    * @returns {Pie} The calling Pie Plot.
    */
  def outerRadius(outerRadius: Double): this.type = js.native
  def outerRadius(outerRadius: IAccessor[Double]): this.type = js.native
  /**
    * Gets the AccessorScaleBinding for the outer radius.
    */
  def outerRadius[R](): IAccessorScaleBinding[R, Double] = js.native
  /**
    * Sets the outer radius to a scaled constant value or scaled result of an Accessor.
    * The provided Scale will account for the values when autoDomain()-ing.
    *
    * @param {R|Accessor<R>} outerRadius
    * @param {Scale<R, number>} scale
    * @returns {Pie} The calling Pie Plot.
    */
  def outerRadius[R](outerRadius: R, scale: Scale[R, Double]): this.type = js.native
  def outerRadius[R](outerRadius: IAccessor[R], scale: Scale[R, Double]): this.type = js.native
  /**
    * Sets the sector value to a constant number or the result of an Accessor<number>.
    *
    * @param {number|Accessor<number>} sectorValue
    * @returns {Pie} The calling Pie Plot.
    */
  def sectorValue(sectorValue: Double): this.type = js.native
  def sectorValue(sectorValue: IAccessor[Double]): this.type = js.native
  /**
    * Gets the AccessorScaleBinding for the sector value.
    */
  def sectorValue[S](): IAccessorScaleBinding[S, Double] = js.native
  /**
    * Sets the sector value to a scaled constant value or scaled result of an Accessor.
    * The provided Scale will account for the values when autoDomain()-ing.
    *
    * @param {S|Accessor<S>} sectorValue
    * @param {Scale<S, number>} scale
    * @returns {Pie} The calling Pie Plot.
    */
  def sectorValue[S](sectorValue: S, scale: Scale[S, Double]): this.type = js.native
  def sectorValue[S](sectorValue: IAccessor[S], scale: Scale[S, Double]): this.type = js.native
  /**
    * Gets the start angle of the Pie Plot
    *
    * @returns {number} Returns the start angle
    */
  def startAngle(): Double = js.native
  /**
    * Sets the start angle of the Pie Plot.
    *
    * @param {number} startAngle
    * @returns {Pie} The calling Pie Plot.
    */
  def startAngle(angle: Double): this.type = js.native
}

/* static members */
@JSImport("plottable/build/src/plots/piePlot", "Pie")
@js.native
object Pie extends js.Object {
  var _INNER_RADIUS_KEY: js.Any = js.native
  var _OUTER_RADIUS_KEY: js.Any = js.native
  var _SECTOR_VALUE_KEY: js.Any = js.native
  /* protected */ def _isValidData(value: js.Any): Boolean = js.native
}

