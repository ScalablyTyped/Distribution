package typings.plottable

import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.drawersMod.ProxyDrawer
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.xyPlotMod.XYPlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentPlotMod {
  
  @JSImport("plottable/build/src/plots/segmentPlot", "Segment")
  @js.native
  /**
    * A Segment Plot displays line segments based on the data.
    *
    * @constructor
    */
  class Segment[X, Y] () extends XYPlot[X, Y] {
    
    /* protected */ def _createDrawer(): ProxyDrawer = js.native
    
    /* private */ def _entitiesIntersecting(xRange: js.Any, yRange: js.Any): js.Any = js.native
    
    /* private */ def _lineIntersectsBox(entity: js.Any, xRange: js.Any, yRange: js.Any, attrToProjector: js.Any): js.Any = js.native
    
    /* private */ def _lineIntersectsSegment(point1: js.Any, point2: js.Any, point3: js.Any, point4: js.Any): js.Any = js.native
    
    /**
      * Gets the AccessorScaleBinding for X2
      */
    def x2(): IAccessorScaleBinding[X, Double] = js.native
    def x2(x2: X): this.type = js.native
    /**
      * Sets X2 to a constant number or the result of an Accessor.
      * If a Scale has been set for X, it will also be used to scale X2.
      *
      * @param {number|Accessor<number>|Y|Accessor<Y>} y2
      * @returns {Plots.Segment} The calling Segment Plot
      */
    def x2(x2: Double): this.type = js.native
    def x2(x2: IAccessor[Double | X]): this.type = js.native
    
    /**
      * Gets the AccessorScaleBinding for Y2.
      */
    def y2(): IAccessorScaleBinding[Y, Double] = js.native
    def y2(y2: Y): this.type = js.native
    /**
      * Sets Y2 to a constant number or the result of an Accessor.
      * If a Scale has been set for Y, it will also be used to scale Y2.
      *
      * @param {number|Accessor<number>|Y|Accessor<Y>} y2
      * @returns {Plots.Segment} The calling Segment Plot.
      */
    def y2(y2: Double): this.type = js.native
    def y2(y2: IAccessor[Double | Y]): this.type = js.native
  }
  /* static members */
  object Segment {
    
    @JSImport("plottable/build/src/plots/segmentPlot", "Segment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/segmentPlot", "Segment._X2_KEY")
    @js.native
    def _X2_KEY: js.Any = js.native
    @scala.inline
    def _X2_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_X2_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/segmentPlot", "Segment._Y2_KEY")
    @js.native
    def _Y2_KEY: js.Any = js.native
    @scala.inline
    def _Y2_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y2_KEY")(x.asInstanceOf[js.Any])
  }
}
