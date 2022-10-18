package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcCoreInterfacesMod.IRangeProjector
import typings.plottable.buildSrcPlotsCommonsMod.ITransformableAccessorScaleBinding
import typings.plottable.buildSrcPlotsPlotMod.Plot
import typings.plottable.buildSrcScalesScaleMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlotsXyPlotMod {
  
  @JSImport("plottable/build/src/plots/xyPlot", "XYPlot")
  @js.native
  /**
    * An XYPlot is a Plot that displays data along two primary directions, X and Y.
    *
    * @constructor
    * @param {Scale} xScale The x scale to use.
    * @param {Scale} yScale The y scale to use.
    */
  open class XYPlot[X, Y] () extends Plot {
    
    /* private */ var _adjustXDomainOnChangeFromY: Any = js.native
    
    /* private */ var _adjustXDomainOnChangeFromYCallback: Any = js.native
    
    /* private */ var _adjustYDomainOnChangeFromX: Any = js.native
    
    /* private */ var _adjustYDomainOnChangeFromXCallback: Any = js.native
    
    /* private */ var _applyDeferredRenderingTransform: Any = js.native
    
    /* private */ var _autoAdjustXScaleDomain: Any = js.native
    
    /* private */ var _autoAdjustYScaleDomain: Any = js.native
    
    /* private */ var _deferredRenderer: Any = js.native
    
    /* private */ var _deferredRendering: Any = js.native
    
    /* private */ var _makeFilterByProperty: Any = js.native
    
    /* protected */ def _projectorsReady(): Boolean = js.native
    
    /* private */ var _updateXExtentsAndAutodomain: Any = js.native
    
    /* private */ var _updateYExtentsAndAutodomain: Any = js.native
    
    /**
      * Gets the automatic domain adjustment mode for visible points.
      */
    def autorangeMode(): String = js.native
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
    def autorangeMode(autorangeMode: String): this.type = js.native
    
    /**
      * Returns the whether or not the rendering is deferred for performance boost.
      *
      * @return {boolean} The deferred rendering option
      */
    def deferredRendering(): Boolean = js.native
    /**
      * Sets / unsets the deferred rendering option Activating this option improves
      * the performance of plot interaction (pan / zoom) by performing lazy
      * renders, only after the interaction has stopped. Because re-rendering is no
      * longer performed during the interaction, the zooming might experience a
      * small resolution degradation, before the lazy re-render is performed.
      *
      * This option is intended for cases where performance is an issue.
      */
    def deferredRendering(deferredRendering: Boolean): this.type = js.native
    
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
    def x(): ITransformableAccessorScaleBinding[X, Double] = js.native
    /**
      * Sets X to a scaled constant value or scaled result of an Accessor.
      * The provided Scale will account for the values when autoDomain()-ing.
      *
      * @param {X|Accessor<X>} x
      * @param {Scale<X, number>} xScale
      * @returns {XYPlot} The calling XYPlot.
      */
    def x(x: X, xScale: Scale[X, Double]): this.type = js.native
    def x(x: X, xScale: Scale[X, Double], postScale: IRangeProjector[Double]): this.type = js.native
    /**
      * Sets X to a constant number or the result of an Accessor<number>.
      *
      * @param {number|Accessor<number>} x
      * @returns {XYPlot} The calling XYPlot.
      */
    def x(x: Double): this.type = js.native
    def x(x: IAccessor[Double]): this.type = js.native
    def x(x: IAccessor[X], xScale: Scale[X, Double]): this.type = js.native
    def x(x: IAccessor[X], xScale: Scale[X, Double], postScale: IRangeProjector[Double]): this.type = js.native
    
    /**
      * Gets the AccessorScaleBinding for Y.
      */
    def y(): ITransformableAccessorScaleBinding[Y, Double] = js.native
    /**
      * Sets Y to a scaled constant value or scaled result of an Accessor.
      * The provided Scale will account for the values when autoDomain()-ing.
      *
      * @param {Y|Accessor<Y>} y
      * @param {Scale<Y, number>} yScale
      * @returns {XYPlot} The calling XYPlot.
      */
    def y(y: Y, yScale: Scale[Y, Double]): this.type = js.native
    def y(y: Y, yScale: Scale[Y, Double], postScale: IRangeProjector[Double]): this.type = js.native
    /**
      * Sets Y to a constant number or the result of an Accessor<number>.
      *
      * @param {number|Accessor<number>} y
      * @returns {XYPlot} The calling XYPlot.
      */
    def y(y: Double): this.type = js.native
    def y(y: IAccessor[Double]): this.type = js.native
    def y(y: IAccessor[Y], yScale: Scale[Y, Double]): this.type = js.native
    def y(y: IAccessor[Y], yScale: Scale[Y, Double], postScale: IRangeProjector[Double]): this.type = js.native
  }
  /* static members */
  object XYPlot {
    
    @JSImport("plottable/build/src/plots/xyPlot", "XYPlot")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/xyPlot", "XYPlot._X_KEY")
    @js.native
    def _X_KEY: String = js.native
    inline def _X_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_X_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/xyPlot", "XYPlot._Y_KEY")
    @js.native
    def _Y_KEY: String = js.native
    inline def _Y_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Y_KEY")(x.asInstanceOf[js.Any])
  }
}
