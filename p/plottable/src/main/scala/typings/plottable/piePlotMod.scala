package typings.plottable

import typings.plottable.commonsMod.IAccessorScaleBinding
import typings.plottable.commonsMod.IPlotEntity
import typings.plottable.datasetMod.Dataset
import typings.plottable.drawerMod.ProxyDrawer
import typings.plottable.formattersMod.DatumFormatter
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.Point
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.plotMod.Plot
import typings.plottable.scaleMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object piePlotMod {
  
  @JSImport("plottable/build/src/plots/piePlot", "Pie")
  @js.native
  /**
    * @constructor
    */
  class Pie () extends Plot {
    
    /* protected */ def _createDrawer(): ProxyDrawer = js.native
    
    /* private */ def _drawLabels(): js.Any = js.native
    
    var _endAngle: js.Any = js.native
    
    var _endAngles: js.Any = js.native
    
    /* private */ def _generateStrokeDrawSteps(): js.Any = js.native
    
    var _labelFormatter: js.Any = js.native
    
    var _labelsEnabled: js.Any = js.native
    
    /* private */ def _pieCenter(): js.Any = js.native
    
    /* private */ def _sliceIndexForPoint(p: js.Any): js.Any = js.native
    
    var _startAngle: js.Any = js.native
    
    var _startAngles: js.Any = js.native
    
    var _strokeDrawers: js.Any = js.native
    
    /* private */ def _updatePieAngles(): js.Any = js.native
    
    /**
      * Gets the end angle of the Pie Plot.
      *
      * @returns {number} Returns the end angle
      */
    def endAngle(): Double = js.native
    /**
      * Sets the end angle of the Pie Plot.
      *
      * @param {number} endAngle
      * @returns {Pie} The calling Pie Plot.
      */
    def endAngle(angle: Double): this.type = js.native
    
    /**
      * Sets the inner radius to a constant number or the result of an Accessor<number>.
      *
      * @param {number|Accessor<number>} innerRadius
      * @returns {Pie} The calling Pie Plot.
      */
    def innerRadius(innerRadius: Double): js.Any = js.native
    def innerRadius(innerRadius: IAccessor[Double]): js.Any = js.native
    /**
      * Gets the AccessorScaleBinding for the inner radius.
      */
    def innerRadius[R](): IAccessorScaleBinding[R, Double] = js.native
    /**
      * Sets the inner radius to a scaled constant value or scaled result of an Accessor.
      * The provided Scale will account for the values when autoDomain()-ing.
      *
      * @param {R|Accessor<R>} innerRadius
      * @param {Scale<R, number>} scale
      * @returns {Pie} The calling Pie Plot.
      */
    def innerRadius[R](innerRadius: R, scale: Scale[R, Double]): js.Any = js.native
    def innerRadius[R](innerRadius: IAccessor[R], scale: Scale[R, Double]): js.Any = js.native
    
    /**
      * Gets the Formatter for the labels.
      */
    def labelFormatter(): DatumFormatter = js.native
    /**
      * Sets the Formatter for the labels. The labelFormatter will be fed each pie
      * slice's value as computed by the `.sectorValue()` accessor, as well as the
      * datum, datum index, and dataset associated with that bar.
      *
      * @param {Formatter} formatter
      * @returns {Pie} The calling Pie Plot.
      */
    def labelFormatter(formatter: DatumFormatter): this.type = js.native
    
    /**
      * Get whether slice labels are enabled.
      *
      * @returns {boolean} Whether slices should display labels or not.
      */
    def labelsEnabled(): Boolean = js.native
    /**
      * Sets whether labels are enabled.
      *
      * @param {boolean} labelsEnabled
      * @returns {Pie} The calling Pie Plot.
      */
    def labelsEnabled(enabled: Boolean): this.type = js.native
    
    /**
      * Sets the outer radius to a constant number or the result of an Accessor<number>.
      *
      * @param {number|Accessor<number>} outerRadius
      * @returns {Pie} The calling Pie Plot.
      */
    def outerRadius(outerRadius: Double): this.type = js.native
    def outerRadius(outerRadius: IAccessor[Double]): this.type = js.native
    /**
      * Gets the AccessorScaleBinding for the outer radius.
      */
    def outerRadius[R](): IAccessorScaleBinding[R, Double] = js.native
    /**
      * Sets the outer radius to a scaled constant value or scaled result of an Accessor.
      * The provided Scale will account for the values when autoDomain()-ing.
      *
      * @param {R|Accessor<R>} outerRadius
      * @param {Scale<R, number>} scale
      * @returns {Pie} The calling Pie Plot.
      */
    def outerRadius[R](outerRadius: R, scale: Scale[R, Double]): this.type = js.native
    def outerRadius[R](outerRadius: IAccessor[R], scale: Scale[R, Double]): this.type = js.native
    
    /**
      * Sets the sector value to a constant number or the result of an Accessor<number>.
      *
      * @param {number|Accessor<number>} sectorValue
      * @returns {Pie} The calling Pie Plot.
      */
    def sectorValue(sectorValue: Double): this.type = js.native
    def sectorValue(sectorValue: IAccessor[Double]): this.type = js.native
    /**
      * Gets the AccessorScaleBinding for the sector value.
      */
    def sectorValue[S](): IAccessorScaleBinding[S, Double] = js.native
    /**
      * Sets the sector value to a scaled constant value or scaled result of an Accessor.
      * The provided Scale will account for the values when autoDomain()-ing.
      *
      * @param {S|Accessor<S>} sectorValue
      * @param {Scale<S, number>} scale
      * @returns {Pie} The calling Pie Plot.
      */
    def sectorValue[S](sectorValue: S, scale: Scale[S, Double]): this.type = js.native
    def sectorValue[S](sectorValue: IAccessor[S], scale: Scale[S, Double]): this.type = js.native
    
    /**
      * Gets the start angle of the Pie Plot
      *
      * @returns {number} Returns the start angle
      */
    def startAngle(): Double = js.native
    /**
      * Sets the start angle of the Pie Plot.
      *
      * @param {number} startAngle
      * @returns {Pie} The calling Pie Plot.
      */
    def startAngle(angle: Double): this.type = js.native
  }
  /* static members */
  object Pie {
    
    @JSImport("plottable/build/src/plots/piePlot", "Pie")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/piePlot", "Pie._INNER_RADIUS_KEY")
    @js.native
    def _INNER_RADIUS_KEY: js.Any = js.native
    @scala.inline
    def _INNER_RADIUS_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_INNER_RADIUS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/piePlot", "Pie._OUTER_RADIUS_KEY")
    @js.native
    def _OUTER_RADIUS_KEY: js.Any = js.native
    @scala.inline
    def _OUTER_RADIUS_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OUTER_RADIUS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/plots/piePlot", "Pie._SECTOR_VALUE_KEY")
    @js.native
    def _SECTOR_VALUE_KEY: js.Any = js.native
    @scala.inline
    def _SECTOR_VALUE_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SECTOR_VALUE_KEY")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def _isValidData(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isValidData")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait IPiePlotEntity
    extends StObject
       with IPlotEntity {
    
    var strokeSelection: SimpleSelection[js.Any]
  }
  object IPiePlotEntity {
    
    @scala.inline
    def apply(
      bounds: IEntityBounds,
      component: Plot,
      dataset: Dataset,
      datasetIndex: Double,
      datum: js.Any,
      index: Double,
      position: Point,
      selection: SimpleSelection[js.Any],
      strokeSelection: SimpleSelection[js.Any]
    ): IPiePlotEntity = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], datasetIndex = datasetIndex.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], strokeSelection = strokeSelection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPiePlotEntity]
    }
    
    @scala.inline
    implicit class IPiePlotEntityMutableBuilder[Self <: IPiePlotEntity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrokeSelection(value: SimpleSelection[js.Any]): Self = StObject.set(x, "strokeSelection", value.asInstanceOf[js.Any])
    }
  }
}
