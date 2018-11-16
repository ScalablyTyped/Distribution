package typings
package plottableLib.buildSrcPlotsPiePlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/piePlot", "Pie")
@js.native
class Pie ()
  extends plottableLib.buildSrcPlotsPlotMod.Plot {
  var _endAngle: js.Any = js.native
  var _endAngles: js.Any = js.native
  var _labelFormatter: js.Any = js.native
  var _labelsEnabled: js.Any = js.native
  var _startAngle: js.Any = js.native
  var _startAngles: js.Any = js.native
  var _strokeDrawers: js.Any = js.native
  /* protected */ def _createDrawer(): plottableLib.buildSrcDrawersDrawerMod.ProxyDrawer = js.native
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
  def endAngle(): scala.Double = js.native
  /**
       * Sets the end angle of the Pie Plot.
       *
       * @param {number} endAngle
       * @returns {Pie} The calling Pie Plot.
       */
  def endAngle(angle: scala.Double): this.type = js.native
  /**
       * Sets the inner radius to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} innerRadius
       * @returns {Pie} The calling Pie Plot.
       */
  def innerRadius(innerRadius: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]): js.Any = js.native
  /**
       * Sets the inner radius to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} innerRadius
       * @returns {Pie} The calling Pie Plot.
       */
  def innerRadius(innerRadius: scala.Double): js.Any = js.native
  /**
       * Gets the AccessorScaleBinding for the inner radius.
       */
  def innerRadius[R](): plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[R, scala.Double] = js.native
  /**
       * Sets the inner radius to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {R|Accessor<R>} innerRadius
       * @param {Scale<R, number>} scale
       * @returns {Pie} The calling Pie Plot.
       */
  def innerRadius[R](innerRadius: R, scale: plottableLib.buildSrcScalesScaleMod.Scale[R, scala.Double]): js.Any = js.native
  /**
       * Sets the inner radius to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {R|Accessor<R>} innerRadius
       * @param {Scale<R, number>} scale
       * @returns {Pie} The calling Pie Plot.
       */
  def innerRadius[R](
    innerRadius: plottableLib.buildSrcCoreInterfacesMod.IAccessor[R],
    scale: plottableLib.buildSrcScalesScaleMod.Scale[R, scala.Double]
  ): js.Any = js.native
  /**
       * Gets the Formatter for the labels.
       */
  def labelFormatter(): plottableLib.buildSrcCoreFormattersMod.DatumFormatter = js.native
  /**
       * Sets the Formatter for the labels. The labelFormatter will be fed each pie
       * slice's value as computed by the `.sectorValue()` accessor, as well as the
       * datum, datum index, and dataset associated with that bar.
       *
       * @param {Formatter} formatter
       * @returns {Pie} The calling Pie Plot.
       */
  def labelFormatter(formatter: plottableLib.buildSrcCoreFormattersMod.DatumFormatter): this.type = js.native
  /**
       * Get whether slice labels are enabled.
       *
       * @returns {boolean} Whether slices should display labels or not.
       */
  def labelsEnabled(): scala.Boolean = js.native
  /**
       * Sets whether labels are enabled.
       *
       * @param {boolean} labelsEnabled
       * @returns {Pie} The calling Pie Plot.
       */
  def labelsEnabled(enabled: scala.Boolean): this.type = js.native
  /**
       * Sets the outer radius to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} outerRadius
       * @returns {Pie} The calling Pie Plot.
       */
  def outerRadius(outerRadius: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]): this.type = js.native
  /**
       * Sets the outer radius to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} outerRadius
       * @returns {Pie} The calling Pie Plot.
       */
  def outerRadius(outerRadius: scala.Double): this.type = js.native
  /**
       * Gets the AccessorScaleBinding for the outer radius.
       */
  def outerRadius[R](): plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[R, scala.Double] = js.native
  /**
       * Sets the outer radius to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {R|Accessor<R>} outerRadius
       * @param {Scale<R, number>} scale
       * @returns {Pie} The calling Pie Plot.
       */
  def outerRadius[R](outerRadius: R, scale: plottableLib.buildSrcScalesScaleMod.Scale[R, scala.Double]): this.type = js.native
  /**
       * Sets the outer radius to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {R|Accessor<R>} outerRadius
       * @param {Scale<R, number>} scale
       * @returns {Pie} The calling Pie Plot.
       */
  def outerRadius[R](
    outerRadius: plottableLib.buildSrcCoreInterfacesMod.IAccessor[R],
    scale: plottableLib.buildSrcScalesScaleMod.Scale[R, scala.Double]
  ): this.type = js.native
  /**
       * Sets the sector value to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} sectorValue
       * @returns {Pie} The calling Pie Plot.
       */
  def sectorValue(sectorValue: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]): this.type = js.native
  /**
       * Sets the sector value to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} sectorValue
       * @returns {Pie} The calling Pie Plot.
       */
  def sectorValue(sectorValue: scala.Double): this.type = js.native
  /**
       * Gets the AccessorScaleBinding for the sector value.
       */
  def sectorValue[S](): plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[S, scala.Double] = js.native
  /**
       * Sets the sector value to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {S|Accessor<S>} sectorValue
       * @param {Scale<S, number>} scale
       * @returns {Pie} The calling Pie Plot.
       */
  def sectorValue[S](sectorValue: S, scale: plottableLib.buildSrcScalesScaleMod.Scale[S, scala.Double]): this.type = js.native
  /**
       * Sets the sector value to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {S|Accessor<S>} sectorValue
       * @param {Scale<S, number>} scale
       * @returns {Pie} The calling Pie Plot.
       */
  def sectorValue[S](
    sectorValue: plottableLib.buildSrcCoreInterfacesMod.IAccessor[S],
    scale: plottableLib.buildSrcScalesScaleMod.Scale[S, scala.Double]
  ): this.type = js.native
  /**
       * Gets the start angle of the Pie Plot
       *
       * @returns {number} Returns the start angle
       */
  def startAngle(): scala.Double = js.native
  /**
       * Sets the start angle of the Pie Plot.
       *
       * @param {number} startAngle
       * @returns {Pie} The calling Pie Plot.
       */
  def startAngle(angle: scala.Double): this.type = js.native
}

@JSImport("plottable/build/src/plots/piePlot", "Pie")
@js.native
object Pie extends js.Object {
  var _INNER_RADIUS_KEY: js.Any = js.native
  var _OUTER_RADIUS_KEY: js.Any = js.native
  var _SECTOR_VALUE_KEY: js.Any = js.native
  /* protected */ def _isValidData(value: js.Any): scala.Boolean = js.native
}

