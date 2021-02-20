package typings.plottable

import typings.d3Shape.mod.CurveFactory
import typings.d3Shape.mod.CurveFactoryLineOnly
import typings.d3Shape.mod.Line_
import typings.plottable.commonsMod.IPlotEntity
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.interfacesMod.Point
import typings.plottable.interfacesMod.Projector
import typings.plottable.plottableStrings.basis
import typings.plottable.plottableStrings.basisClosed
import typings.plottable.plottableStrings.basisOpen
import typings.plottable.plottableStrings.bundle
import typings.plottable.plottableStrings.cardinal
import typings.plottable.plottableStrings.cardinalClosed
import typings.plottable.plottableStrings.cardinalOpen
import typings.plottable.plottableStrings.linear
import typings.plottable.plottableStrings.linearClosed
import typings.plottable.plottableStrings.monotone
import typings.plottable.plottableStrings.step
import typings.plottable.plottableStrings.stepAfter
import typings.plottable.plottableStrings.stepBefore
import typings.plottable.xyPlotMod.XYPlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linePlotMod {
  
  /* keyof plottable.anon.Basis */ /* Rewritten from type alias, can be one of: 
    - typings.plottable.plottableStrings.linear
    - typings.plottable.plottableStrings.linearClosed
    - typings.plottable.plottableStrings.step
    - typings.plottable.plottableStrings.stepBefore
    - typings.plottable.plottableStrings.stepAfter
    - typings.plottable.plottableStrings.basis
    - typings.plottable.plottableStrings.basisOpen
    - typings.plottable.plottableStrings.basisClosed
    - typings.plottable.plottableStrings.bundle
    - typings.plottable.plottableStrings.cardinal
    - typings.plottable.plottableStrings.cardinalOpen
    - typings.plottable.plottableStrings.cardinalClosed
    - typings.plottable.plottableStrings.monotone
  */
  trait CurveName extends StObject
  object CurveName {
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.basis")
    @js.native
    def basis: typings.plottable.plottableStrings.basis = js.native
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.basisClosed")
    @js.native
    def basisClosed: typings.plottable.plottableStrings.basisClosed = js.native
    @scala.inline
    def basisClosed_=(x: basisClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basisClosed")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.basisOpen")
    @js.native
    def basisOpen: typings.plottable.plottableStrings.basisOpen = js.native
    @scala.inline
    def basisOpen_=(x: basisOpen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basisOpen")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def basis_=(x: basis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basis")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.bundle")
    @js.native
    def bundle: typings.plottable.plottableStrings.bundle = js.native
    @scala.inline
    def bundle_=(x: bundle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bundle")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.cardinal")
    @js.native
    def cardinal: typings.plottable.plottableStrings.cardinal = js.native
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.cardinalClosed")
    @js.native
    def cardinalClosed: typings.plottable.plottableStrings.cardinalClosed = js.native
    @scala.inline
    def cardinalClosed_=(x: cardinalClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinalClosed")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.cardinalOpen")
    @js.native
    def cardinalOpen: typings.plottable.plottableStrings.cardinalOpen = js.native
    @scala.inline
    def cardinalOpen_=(x: cardinalOpen): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinalOpen")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cardinal_=(x: cardinal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.linear")
    @js.native
    def linear: typings.plottable.plottableStrings.linear = js.native
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.linearClosed")
    @js.native
    def linearClosed: typings.plottable.plottableStrings.linearClosed = js.native
    @scala.inline
    def linearClosed_=(x: linearClosed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linearClosed")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def linear_=(x: linear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linear")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.monotone")
    @js.native
    def monotone: typings.plottable.plottableStrings.monotone = js.native
    @scala.inline
    def monotone_=(x: monotone): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monotone")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.step")
    @js.native
    def step: typings.plottable.plottableStrings.step = js.native
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.stepAfter")
    @js.native
    def stepAfter: typings.plottable.plottableStrings.stepAfter = js.native
    @scala.inline
    def stepAfter_=(x: stepAfter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stepAfter")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/linePlot", "CurveName.stepBefore")
    @js.native
    def stepBefore: typings.plottable.plottableStrings.stepBefore = js.native
    @scala.inline
    def stepBefore_=(x: stepBefore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stepBefore")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def step_=(x: step): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("step")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("plottable/build/src/plots/linePlot", "Line")
  @js.native
  /**
    * A Line Plot draws line segments starting from the first data point to the next.
    *
    * @constructor
    */
  class Line[X] () extends XYPlot[X, Double] {
    
    var _autorangeSmooth: js.Any = js.native
    
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
    
    var _collapseDenseVerticalLinesEnabled: js.Any = js.native
    
    /* protected */ def _constructLineProjector(xProjector: Projector, yProjector: Projector): js.Function3[/* datum */ js.Any, /* index */ Double, /* dataset */ Dataset, String] = js.native
    
    var _croppedRenderingEnabled: js.Any = js.native
    
    var _curve: js.Any = js.native
    
    /**
      * Return a d3.Line whose .x, .y, and .defined accessors are hooked up to the xProjector and yProjector
      * after they've been fed the dataset, and whose curve is configured to this plot's curve.
      * @param dataset
      * @param xProjector
      * @param yProjector
      * @returns {Line<[number,number]>}
      * @private
      */
    /* protected */ def _d3LineFactory(dataset: Dataset): Line_[_] = js.native
    /* protected */ def _d3LineFactory(dataset: Dataset, xProjector: js.UndefOr[scala.Nothing], yProjector: IAccessor[_]): Line_[_] = js.native
    /* protected */ def _d3LineFactory(dataset: Dataset, xProjector: IAccessor[_]): Line_[_] = js.native
    /* protected */ def _d3LineFactory(dataset: Dataset, xProjector: IAccessor[_], yProjector: IAccessor[_]): Line_[_] = js.native
    
    var _downsamplingEnabled: js.Any = js.native
    
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
}
