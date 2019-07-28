package typings.plottable.buildSrcPlotsLinePlotMod

import typings.d3DashShape.d3DashShapeMod.CurveFactory
import typings.d3DashShape.d3DashShapeMod.CurveFactoryLineOnly
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcCoreInterfacesMod.Projector
import typings.plottable.buildSrcPlotsCommonsMod.IPlotEntity
import typings.plottable.buildSrcPlotsXyPlotMod.XYPlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/linePlot", "Line")
@js.native
/**
  * A Line Plot draws line segments starting from the first data point to the next.
  *
  * @constructor
  */
class Line[X] () extends XYPlot[X, Double] {
  var _autorangeSmooth: js.Any = js.native
  var _collapseDenseVerticalLinesEnabled: js.Any = js.native
  var _croppedRenderingEnabled: js.Any = js.native
  var _curve: js.Any = js.native
  var _downsamplingEnabled: js.Any = js.native
  /**
    * Iterates over the line points collapsing points that fall on the same
    * floored x coordinate.
    *
    * Once all the points with the same x coordinate are detected, we draw a
    * single line from the min to max y coorindate.
    *
    * The "entrance" and "exit" lines to/from this collapsed vertical line are
    * also drawn. This allows lines with no collapsed segments to render
    * correctly.
    */
  /* private */ def _bucketByX(dataset: js.Any, indices: js.Any, xFn: js.Any, yFn: js.Any): js.Any = js.native
  /* protected */ def _constructLineProjector(xProjector: Projector, yProjector: Projector): js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, String] = js.native
  /**
    * Return a d3.Line whose .x, .y, and .defined accessors are hooked up to the xProjector and yProjector
    * after they've been fed the dataset, and whose curve is configured to this plot's curve.
    * @param dataset
    * @param xProjector
    * @param yProjector
    * @returns {Line<[number,number]>}
    * @private
    */
  /* protected */ def _d3LineFactory(dataset: Dataset): typings.d3DashShape.d3DashShapeMod.Line[_] = js.native
  /* protected */ def _d3LineFactory(dataset: Dataset, xProjector: IAccessor[_]): typings.d3DashShape.d3DashShapeMod.Line[_] = js.native
  /* protected */ def _d3LineFactory(dataset: Dataset, xProjector: IAccessor[_], yProjector: IAccessor[_]): typings.d3DashShape.d3DashShapeMod.Line[_] = js.native
  /* private */ def _filterCroppedRendering(dataset: js.Any, indices: js.Any): js.Any = js.native
  /**
    * Collapse line geometry
    *
    * Assuming that there are many points that are drawn on the same coordinate,
    * we can save a lot of render time by just drawing one line from the min to
    * max y-coordinate of all those points.
    */
  /* private */ def _filterDenseLines(dataset: js.Any, indices: js.Any): js.Any = js.native
  /* private */ def _filterDownsampling(dataset: js.Any, indices: js.Any): js.Any = js.native
  /* protected */ def _getCurveFactory(): CurveFactory | CurveFactoryLineOnly = js.native
  /* private */ def _getEdgeIntersectionPoints(): js.Any = js.native
  /* protected */ def _getResetYFunction(): js.Function3[/* d */ js.Any, /* i */ Double, /* dataset */ Dataset, Double] = js.native
  /* private */ def _setScaleSnapping(): js.Any = js.native
  /**
    * Gets whether or not the autoranging is done smoothly.
    */
  def autorangeSmooth(): Boolean = js.native
  /**
    * Sets whether or not the autorange is done smoothly.
    *
    * Smooth autoranging is done by making sure lines always exit on the left / right side of the plot
    * and deactivating the nice domain feature on the scales
    */
  def autorangeSmooth(autorangeSmooth: Boolean): this.type = js.native
  /**
    * Gets if collapseDenseLines is enabled
    *
    * When collapseDenseLines is enabled, vertical or nearly vertical line
    * segments that have the same floored x coordinate will be bucketed then
    * drawn, drastically reducing the render time of dense line plots like
    * timeseries. Only applies to the high performance "canvas" drawer.
    */
  def collapseDenseLinesEnabled(): Boolean = js.native
  /**
    * Sets if collapseDenseLines is enabled
    *
    * @returns {Plots.Line} The calling Plots.Line
    */
  def collapseDenseLinesEnabled(collapseDenseLines: Boolean): this.type = js.native
  /**
    * Gets if croppedRendering is enabled
    *
    * When croppedRendering is enabled, lines that will not be visible in the viewport will not be drawn.
    */
  def croppedRenderingEnabled(): Boolean = js.native
  /**
    * Sets if croppedRendering is enabled
    *
    * @returns {Plots.Line} The calling Plots.Line
    */
  def croppedRenderingEnabled(croppedRendering: Boolean): this.type = js.native
  /**
    * Gets the curve function associated with the plot.
    *
    * @return {string | d3.CurveFactory | d3.CurveFactoryLineOnly}
    */
  def curve(): CurveName | CurveFactory | CurveFactoryLineOnly = js.native
  def curve(curve: CurveFactory | CurveFactoryLineOnly): this.type = js.native
  /**
    * Sets the curve function associated with the plot. The curve function specifies how to
    * draw the interpolated line between successive points.
    *
    * @param {string | points: Array<[number, number]>) => string} curve Curve function
    * @return Plots.Line
    */
  def curve(curve: CurveName): this.type = js.native
  /**
    * Gets if downsampling is enabled
    *
    * When downsampling is enabled, two consecutive lines with the same slope will be merged to one line.
    */
  def downsamplingEnabled(): Boolean = js.native
  /**
    * Sets if downsampling is enabled
    *
    * @returns {Plots.Line} The calling Plots.Line
    */
  def downsamplingEnabled(downsampling: Boolean): this.type = js.native
  /**
    * Returns the PlotEntity nearest to the query point by X then by Y, or undefined if no PlotEntity can be found.
    *
    * @param {Point} queryPoint
    * @returns {PlotEntity} The nearest PlotEntity, or undefined if no PlotEntity can be found.
    */
  def entityNearestByXThenY(queryPoint: Point): IPlotEntity = js.native
}

