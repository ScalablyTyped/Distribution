package typings
package plottableLib.buildSrcPlotsSegmentPlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/segmentPlot", "Segment")
@js.native
class Segment[X, Y] ()
  extends plottableLib.buildSrcPlotsXyPlotMod.XYPlot[X, Y] {
  /* protected */ def _createDrawer(): plottableLib.buildSrcDrawersMod.ProxyDrawer = js.native
  /* private */ def _entitiesIntersecting(xRange: js.Any, yRange: js.Any): js.Any = js.native
  /* private */ def _lineIntersectsBox(entity: js.Any, xRange: js.Any, yRange: js.Any, attrToProjector: js.Any): js.Any = js.native
  /* private */ def _lineIntersectsSegment(point1: js.Any, point2: js.Any, point3: js.Any, point4: js.Any): js.Any = js.native
  /**
       * Gets the AccessorScaleBinding for X2
       */
  def x2(): plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[X, scala.Double] = js.native
  /**
       * Sets X2 to a constant number or the result of an Accessor.
       * If a Scale has been set for X, it will also be used to scale X2.
       *
       * @param {number|Accessor<number>|Y|Accessor<Y>} y2
       * @returns {Plots.Segment} The calling Segment Plot
       */
  def x2(x2: X): this.type = js.native
  /**
       * Sets X2 to a constant number or the result of an Accessor.
       * If a Scale has been set for X, it will also be used to scale X2.
       *
       * @param {number|Accessor<number>|Y|Accessor<Y>} y2
       * @returns {Plots.Segment} The calling Segment Plot
       */
  def x2(x2: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double | X]): this.type = js.native
  /**
       * Sets X2 to a constant number or the result of an Accessor.
       * If a Scale has been set for X, it will also be used to scale X2.
       *
       * @param {number|Accessor<number>|Y|Accessor<Y>} y2
       * @returns {Plots.Segment} The calling Segment Plot
       */
  def x2(x2: scala.Double): this.type = js.native
  /**
       * Gets the AccessorScaleBinding for Y2.
       */
  def y2(): plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[Y, scala.Double] = js.native
  /**
       * Sets Y2 to a constant number or the result of an Accessor.
       * If a Scale has been set for Y, it will also be used to scale Y2.
       *
       * @param {number|Accessor<number>|Y|Accessor<Y>} y2
       * @returns {Plots.Segment} The calling Segment Plot.
       */
  def y2(y2: Y): this.type = js.native
  /**
       * Sets Y2 to a constant number or the result of an Accessor.
       * If a Scale has been set for Y, it will also be used to scale Y2.
       *
       * @param {number|Accessor<number>|Y|Accessor<Y>} y2
       * @returns {Plots.Segment} The calling Segment Plot.
       */
  def y2(y2: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double | Y]): this.type = js.native
  /**
       * Sets Y2 to a constant number or the result of an Accessor.
       * If a Scale has been set for Y, it will also be used to scale Y2.
       *
       * @param {number|Accessor<number>|Y|Accessor<Y>} y2
       * @returns {Plots.Segment} The calling Segment Plot.
       */
  def y2(y2: scala.Double): this.type = js.native
}

@JSImport("plottable/build/src/plots/segmentPlot", "Segment")
@js.native
object Segment extends js.Object {
  var _X2_KEY: js.Any = js.native
  var _Y2_KEY: js.Any = js.native
}

