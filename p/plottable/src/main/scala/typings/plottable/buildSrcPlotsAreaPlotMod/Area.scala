package typings.plottable.buildSrcPlotsAreaPlotMod

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcCoreInterfacesMod.Projector
import typings.plottable.buildSrcPlotsCommonsMod.IAccessorScaleBinding
import typings.plottable.buildSrcPlotsLinePlotMod.Line
import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/areaPlot", "Area")
@js.native
/**
  * An Area Plot draws a filled region (area) between Y and Y0.
  *
  * @constructor
  */
class Area[X] () extends Line[X] {
  var _constantBaselineValueProvider: js.Any = js.native
  var _lineDrawers: js.Any = js.native
  /* protected */ def _additionalPaint(): Unit = js.native
  /* protected */ def _constructAreaProjector(xProjector: Projector, yProjector: Projector, y0Projector: Projector): js.Function3[/* datum */ js.Array[_], /* index */ Double, /* dataset */ Dataset, String] = js.native
  /* protected */ def _coordinateProjectors(): js.Tuple3[Projector, Projector, Projector] = js.native
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
  /* protected */ def _updateYScale(): Unit = js.native
  def y(y: Double, yScale: QuantitativeScale[Double]): this.type = js.native
  def y(y: IAccessor[Double], yScale: QuantitativeScale[Double]): this.type = js.native
  /**
    * Gets the AccessorScaleBinding for Y0.
    */
  def y0(): IAccessorScaleBinding[Double, Double] = js.native
  /**
    * Sets Y0 to a constant number or the result of an Accessor<number>.
    * If a Scale has been set for Y, it will also be used to scale Y0.
    *
    * @param {number|Accessor<number>} y0
    * @returns {Area} The calling Area Plot.
    */
  def y0(y0: Double): this.type = js.native
  def y0(y0: IAccessor[Double]): this.type = js.native
}

/* static members */
@JSImport("plottable/build/src/plots/areaPlot", "Area")
@js.native
object Area extends js.Object {
  var _Y0_KEY: js.Any = js.native
}

