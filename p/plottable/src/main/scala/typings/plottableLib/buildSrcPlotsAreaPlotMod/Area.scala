package typings
package plottableLib.buildSrcPlotsAreaPlotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/areaPlot", "Area")
@js.native
class Area[X] ()
  extends plottableLib.buildSrcPlotsLinePlotMod.Line[X] {
  var _constantBaselineValueProvider: js.Any = js.native
  var _lineDrawers: js.Any = js.native
  /* protected */ def _additionalPaint(): scala.Unit = js.native
  /* protected */ def _constructAreaProjector(
    xProjector: plottableLib.buildSrcCoreInterfacesMod.Projector,
    yProjector: plottableLib.buildSrcCoreInterfacesMod.Projector,
    y0Projector: plottableLib.buildSrcCoreInterfacesMod.Projector
  ): js.Function3[
    /* datum */ js.Array[_], 
    /* index */ scala.Double, 
    /* dataset */ plottableLib.buildSrcCoreDatasetMod.Dataset, 
    java.lang.String
  ] = js.native
  /* protected */ def _coordinateProjectors(): js.Tuple3[
    plottableLib.buildSrcCoreInterfacesMod.Projector, 
    plottableLib.buildSrcCoreInterfacesMod.Projector, 
    plottableLib.buildSrcCoreInterfacesMod.Projector
  ] = js.native
  /* private */ def _createAreaGenerator(
    xProjector: js.Any,
    yProjector: js.Any,
    y0Projector: js.Any,
    definedProjector: js.Any,
    dataset: js.Any
  ): js.Any = js.native
  /* private */ def _createDefinedProjector(xProjector: js.Any, yProjector: js.Any): js.Any = js.native
  /* private */ def _createTopLineGenerator(xProjector: js.Any, yProjector: js.Any, definedProjector: js.Any, dataset: js.Any): js.Any = js.native
  /* private */ def _generateLineAttrToProjector(): js.Any = js.native
  /* private */ def _generateLineDrawSteps(): js.Any = js.native
  /* protected */ def _updateYScale(): scala.Unit = js.native
  def y(
    y: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double],
    yScale: plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[scala.Double]
  ): this.type = js.native
  def y(
    y: scala.Double,
    yScale: plottableLib.buildSrcScalesQuantitativeScaleMod.QuantitativeScale[scala.Double]
  ): this.type = js.native
  /**
       * Gets the AccessorScaleBinding for Y0.
       */
  def y0(): plottableLib.buildSrcPlotsCommonsMod.IAccessorScaleBinding[scala.Double, scala.Double] = js.native
  /**
       * Sets Y0 to a constant number or the result of an Accessor<number>.
       * If a Scale has been set for Y, it will also be used to scale Y0.
       *
       * @param {number|Accessor<number>} y0
       * @returns {Area} The calling Area Plot.
       */
  def y0(y0: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]): this.type = js.native
  /**
       * Sets Y0 to a constant number or the result of an Accessor<number>.
       * If a Scale has been set for Y, it will also be used to scale Y0.
       *
       * @param {number|Accessor<number>} y0
       * @returns {Area} The calling Area Plot.
       */
  def y0(y0: scala.Double): this.type = js.native
}

@JSImport("plottable/build/src/plots/areaPlot", "Area")
@js.native
object Area extends js.Object {
  var _Y0_KEY: js.Any = js.native
}

