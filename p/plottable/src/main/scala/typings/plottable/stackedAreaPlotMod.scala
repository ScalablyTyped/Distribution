package typings.plottable

import typings.plottable.areaPlotMod.Area
import typings.plottable.datasetMod.Dataset
import typings.plottable.stackingUtilsMod.IStackingOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackedAreaPlotMod {
  
  @JSImport("plottable/build/src/plots/stackedAreaPlot", "StackedArea")
  @js.native
  /**
    * @constructor
    */
  class StackedArea[X] () extends Area[X] {
    
    /* private */ var _baseline: js.Any = js.native
    
    /* private */ var _baselineValue: js.Any = js.native
    
    /* private */ var _baselineValueProvider: js.Any = js.native
    
    /* private */ def _checkSameDomain(): js.Any = js.native
    
    /* private */ var _stackedExtent: js.Any = js.native
    
    /* private */ var _stackingOrder: js.Any = js.native
    
    /* private */ var _stackingResult: js.Any = js.native
    
    /**
      * Gets the stacking order of the plot.
      */
    def stackingOrder(): IStackingOrder = js.native
    /**
      * Sets the stacking order of the plot.
      *
      * By default, stacked plots are "bottomup", meaning for positive data, the
      * first series will be placed at the bottom of the scale and subsequent
      * data series will by stacked on top. This can be reveresed by setting
      * stacking order to "topdown".
      *
      * @returns {Plots.StackedArea} This plot
      */
    def stackingOrder(stackingOrder: IStackingOrder): this.type = js.native
    
    /**
      * Gets the offset of the y value corresponding to an x value of a given dataset. This allows other plots to plot
      * points corresponding to their stacked value in the graph.
      * @param dataset The dataset from which to retrieve the y value offset
      * @param x The x value corresponding to the y-value of interest.
      */
    def yOffset(dataset: Dataset, x: js.Any): Double = js.native
  }
  /* static members */
  object StackedArea {
    
    @JSImport("plottable/build/src/plots/stackedAreaPlot", "StackedArea")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given an array of Datasets and the accessor function for the key, computes the
      * set reunion (no duplicates) of the domain of each Dataset. The keys are stringified
      * before being returned.
      *
      * @param {Dataset[]} datasets The Datasets for which we extract the domain keys
      * @param {Accessor<any>} keyAccessor The accessor for the key of the data
      * @return {string[]} An array of stringified keys
      */
    inline def _domainKeys(datasets: js.Any, keyAccessor: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_domainKeys")(datasets.asInstanceOf[js.Any], keyAccessor.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
