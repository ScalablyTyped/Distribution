package typings
package plottableLib.buildSrcPlotsXyPlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/xyPlot", "XYPlot")
@js.native
class XYPlot[X, Y] ()
  extends plottableLib.buildSrcPlotsPlotMod.Plot {
  var _adjustXDomainOnChangeFromYCallback: js.Any = js.native
  var _adjustYDomainOnChangeFromXCallback: js.Any = js.native
  var _applyDeferredRenderingTransform: js.Any = js.native
  var _autoAdjustXScaleDomain: js.Any = js.native
  var _autoAdjustYScaleDomain: js.Any = js.native
  var _deferredRenderer: js.Any = js.native
  var _deferredRendering: js.Any = js.native
  /* private */ def _adjustXDomainOnChangeFromY(): js.Any = js.native
  /* private */ def _adjustYDomainOnChangeFromX(): js.Any = js.native
  /* private */ def _makeFilterByProperty(property: js.Any): js.Any = js.native
  /* protected */ def _projectorsReady(): scala.Boolean = js.native
  /* private */ def _updateXExtentsAndAutodomain(): js.Any = js.native
  /* private */ def _updateYExtentsAndAutodomain(): js.Any = js.native
  /**
       * Gets the automatic domain adjustment mode for visible points.
       */
  def autorangeMode(): java.lang.String = js.native
  /**
       * Sets the automatic domain adjustment mode for visible points to operate against the X Scale, Y Scale, or neither.
       * If "x" or "y" is specified the adjustment is immediately performed.
       *
       * @param {string} autorangeMode One of "x"/"y"/"none".
       *   "x" will adjust the x Scale in relation to changes in the y domain.
       *   "y" will adjust the y Scale in relation to changes in the x domain.
       *   "none" means neither Scale will change automatically.
       * @returns {XYPlot} The calling XYPlot.
       */
  def autorangeMode(autorangeMode: java.lang.String): this.type = js.native
  /**
       * Returns the whether or not the rendering is deferred for performance boost.
       *
       * @return {boolean} The deferred rendering option
       */
  def deferredRendering(): scala.Boolean = js.native
  /**
       * Sets / unsets the deferred rendering option Activating this option improves
       * the performance of plot interaction (pan / zoom) by performing lazy
       * renders, only after the interaction has stopped. Because re-rendering is no
       * longer performed during the interaction, the zooming might experience a
       * small resolution degradation, before the lazy re-render is performed.
       *
       * This option is intended for cases where performance is an issue.
       */
  def deferredRendering(deferredRendering: scala.Boolean): this.type = js.native
  /**
       * Adjusts the domains of both X and Y scales to show all data.
       * This call does not override the autorange() behavior.
       *
       * @returns {XYPlot} The calling XYPlot.
       */
  def showAllData(): this.type = js.native
  /**
       * Gets the TransformableAccessorScaleBinding for X.
       */
  def x(): plottableLib.buildSrcPlotsCommonsMod.ITransformableAccessorScaleBinding[X, scala.Double] = js.native
  /**
       * Sets X to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {X|Accessor<X>} x
       * @param {Scale<X, number>} xScale
       * @returns {XYPlot} The calling XYPlot.
       */
  def x(x: X, xScale: plottableLib.buildSrcScalesScaleMod.Scale[X, scala.Double]): this.type = js.native
  /**
       * Sets X to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {X|Accessor<X>} x
       * @param {Scale<X, number>} xScale
       * @returns {XYPlot} The calling XYPlot.
       */
  def x(
    x: X,
    xScale: plottableLib.buildSrcScalesScaleMod.Scale[X, scala.Double],
    postScale: plottableLib.buildSrcCoreInterfacesMod.IRangeProjector[scala.Double]
  ): this.type = js.native
  /**
       * Sets X to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} x
       * @returns {XYPlot} The calling XYPlot.
       */
  def x(x: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]): this.type = js.native
  /**
       * Sets X to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {X|Accessor<X>} x
       * @param {Scale<X, number>} xScale
       * @returns {XYPlot} The calling XYPlot.
       */
  def x(
    x: plottableLib.buildSrcCoreInterfacesMod.IAccessor[X],
    xScale: plottableLib.buildSrcScalesScaleMod.Scale[X, scala.Double]
  ): this.type = js.native
  /**
       * Sets X to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {X|Accessor<X>} x
       * @param {Scale<X, number>} xScale
       * @returns {XYPlot} The calling XYPlot.
       */
  def x(
    x: plottableLib.buildSrcCoreInterfacesMod.IAccessor[X],
    xScale: plottableLib.buildSrcScalesScaleMod.Scale[X, scala.Double],
    postScale: plottableLib.buildSrcCoreInterfacesMod.IRangeProjector[scala.Double]
  ): this.type = js.native
  /**
       * Sets X to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} x
       * @returns {XYPlot} The calling XYPlot.
       */
  def x(x: scala.Double): this.type = js.native
  /**
       * Gets the AccessorScaleBinding for Y.
       */
  def y(): plottableLib.buildSrcPlotsCommonsMod.ITransformableAccessorScaleBinding[Y, scala.Double] = js.native
  /**
       * Sets Y to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {Y|Accessor<Y>} y
       * @param {Scale<Y, number>} yScale
       * @returns {XYPlot} The calling XYPlot.
       */
  def y(y: Y, yScale: plottableLib.buildSrcScalesScaleMod.Scale[Y, scala.Double]): this.type = js.native
  /**
       * Sets Y to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {Y|Accessor<Y>} y
       * @param {Scale<Y, number>} yScale
       * @returns {XYPlot} The calling XYPlot.
       */
  def y(
    y: Y,
    yScale: plottableLib.buildSrcScalesScaleMod.Scale[Y, scala.Double],
    postScale: plottableLib.buildSrcCoreInterfacesMod.IRangeProjector[scala.Double]
  ): this.type = js.native
  /**
       * Sets Y to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} y
       * @returns {XYPlot} The calling XYPlot.
       */
  def y(y: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]): this.type = js.native
  /**
       * Sets Y to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {Y|Accessor<Y>} y
       * @param {Scale<Y, number>} yScale
       * @returns {XYPlot} The calling XYPlot.
       */
  def y(
    y: plottableLib.buildSrcCoreInterfacesMod.IAccessor[Y],
    yScale: plottableLib.buildSrcScalesScaleMod.Scale[Y, scala.Double]
  ): this.type = js.native
  /**
       * Sets Y to a scaled constant value or scaled result of an Accessor.
       * The provided Scale will account for the values when autoDomain()-ing.
       *
       * @param {Y|Accessor<Y>} y
       * @param {Scale<Y, number>} yScale
       * @returns {XYPlot} The calling XYPlot.
       */
  def y(
    y: plottableLib.buildSrcCoreInterfacesMod.IAccessor[Y],
    yScale: plottableLib.buildSrcScalesScaleMod.Scale[Y, scala.Double],
    postScale: plottableLib.buildSrcCoreInterfacesMod.IRangeProjector[scala.Double]
  ): this.type = js.native
  /**
       * Sets Y to a constant number or the result of an Accessor<number>.
       *
       * @param {number|Accessor<number>} y
       * @returns {XYPlot} The calling XYPlot.
       */
  def y(y: scala.Double): this.type = js.native
}

@JSImport("plottable/build/src/plots/xyPlot", "XYPlot")
@js.native
object XYPlot extends js.Object {
  var _X_KEY: java.lang.String = js.native
  var _Y_KEY: java.lang.String = js.native
}

