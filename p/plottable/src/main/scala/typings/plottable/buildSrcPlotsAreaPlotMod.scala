package typings.plottable

import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcCoreInterfacesMod.Projector
import typings.plottable.buildSrcPlotsCommonsMod.IAccessorScaleBinding
import typings.plottable.buildSrcPlotsLinePlotMod.Line
import typings.plottable.buildSrcScalesQuantitativeScaleMod.QuantitativeScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlotsAreaPlotMod {
  
  @JSImport("plottable/build/src/plots/areaPlot", "Area")
  @js.native
  /**
    * An Area Plot draws a filled region (area) between Y and Y0.
    *
    * @constructor
    */
  open class Area[X] () extends Line[X] {
    
    /* protected */ def _additionalPaint(): Unit = js.native
    
    /* private */ var _constantBaselineValueProvider: Any = js.native
    
    /* protected */ def _constructAreaProjector(xProjector: Projector, yProjector: Projector, y0Projector: Projector): js.Function3[/* datum */ js.Array[Any], /* index */ Double, /* dataset */ Dataset, String] = js.native
    
    /* protected */ def _coordinateProjectors(): js.Tuple3[Projector, Projector, Projector] = js.native
    
    /* private */ var _createAreaGenerator: Any = js.native
    
    /* private */ var _createDefinedProjector: Any = js.native
    
    /* private */ var _createTopLineGenerator: Any = js.native
    
    /* private */ var _generateLineAttrToProjector: Any = js.native
    
    /* private */ var _generateLineDrawSteps: Any = js.native
    
    /* private */ var _lineDrawers: Any = js.native
    
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
  object Area {
    
    @JSImport("plottable/build/src/plots/areaPlot", "Area")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/areaPlot", "Area._Y0_KEY")
    @js.native
    def _Y0_KEY: Any = js.native
    inline def _Y0_KEY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y0_KEY")(x.asInstanceOf[js.Any])
  }
}
