package typings.nvd3.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoricalBarChart
  extends StObject
     with Chart {
  
  def bars(
    selection: Selection_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  def bars(
    transition: Transition_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("bars")
  var bars_Original: HistoricalBar = js.native
  
  /*If true, masks lines within the X and Y scales using a clip-path*/
  def clipEdge(): Boolean = js.native
  /*If true, masks lines within the X and Y scales using a clip-path*/
  def clipEdge(value: Boolean): this.type = js.native
  
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(): js.Any = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(value: js.Any): this.type = js.native
  
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: Double): this.type = js.native
  
  /* List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the Y domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the yDomain option.*/
  def forceX(): js.Array[Double] = js.native
  /* List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the Y domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the yDomain option.*/
  def forceX(value: js.Array[Double]): this.type = js.native
  
  /* List of numbers to Force into the Y scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the Y domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the yDomain option.*/
  def forceY(): js.Array[Double] = js.native
  /* List of numbers to Force into the Y scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the Y domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the yDomain option.*/
  def forceY(value: js.Array[Double]): this.type = js.native
  
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
  
  def id(): js.Any = js.native
  def id(value: String): this.type = js.native
  def id(value: Double): this.type = js.native
  
  /*A master flag for turning chart interaction on and off. This overrides all tooltip, voronoi, and guideline options.*/
  def interactive(): Boolean = js.native
  /*A master flag for turning chart interaction on and off. This overrides all tooltip, voronoi, and guideline options.*/
  def interactive(value: Boolean): this.type = js.native
  
  def legend(
    selection: Selection_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  def legend(
    transition: Transition_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("legend")
  var legend_Original: Legend = js.native
  
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  
  def noData(): String = js.native
  def noData(value: String): this.type = js.native
  
  /**/
  def padData(): Boolean = js.native
  /**/
  def padData(value: Boolean): this.type = js.native
  
  def rightAlignYAxis(): Boolean = js.native
  /*When only one Y axis is used, this puts the Y axis on the right side instead of the left.*/
  def rightAlignYAxis(value: Boolean): this.type = js.native
  
  /*Whether to display the legend or not.*/
  def showLegend(): Boolean = js.native
  /*Whether to display the legend or not.*/
  def showLegend(value: Boolean): this.type = js.native
  
  /*Display or hide the X axis*/
  def showXAxis(): Boolean = js.native
  /*Display or hide the X axis*/
  def showXAxis(value: Boolean): this.type = js.native
  
  /*Display or hide the Y axis*/
  def showYAxis(): Boolean = js.native
  /*Display or hide the Y axis*/
  def showYAxis(value: Boolean): this.type = js.native
  
  var tooltip: Tooltip = js.native
  
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(): js.Function1[/* d */ js.Any, String] = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(func: js.Function1[/* d */ js.Any, String]): this.type = js.native
  
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(): Boolean = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(value: Boolean): this.type = js.native
  
  /*Sets the chart to use a guideline and floating tooltip instead of requiring the user to hover over specific hotspots. Turning this on will set the 'interactive' and 'useVoronoi' options to false to avoid conflicting.*/
  def useInteractiveGuideline(): Boolean = js.native
  /*Sets the chart to use a guideline and floating tooltip instead of requiring the user to hover over specific hotspots. Turning this on will set the 'interactive' and 'useVoronoi' options to false to avoid conflicting.*/
  def useInteractiveGuideline(value: Boolean): this.type = js.native
  
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
  
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(): js.Function1[/* d */ js.Any, js.Any] = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(func: js.Function1[/* d */ js.Any, js.Any]): this.type = js.native
  
  var xAxis: Nvd3Axis = js.native
  
  /* Defines the whole X scale's domain. Using this will disable calculating the domain based on the data.*/
  def xDomain(): js.Array[Double] = js.native
  /* Defines the whole X scale's domain. Using this will disable calculating the domain based on the data.*/
  def xDomain(value: js.Array[Double]): this.type = js.native
  
  /* Override the X scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def xRange(): js.Array[Double] = js.native
  /* Override the X scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def xRange(value: js.Array[Double]): this.type = js.native
  
  /* Override the default scale type for the X axis*/
  def xScale(): js.Any = js.native
  /* Override the default scale type for the X axis*/
  def xScale(value: js.Any): this.type = js.native
  
  def y(): js.Function1[/* d */ js.Any, Double] = js.native
  /* Proxy function to return the y value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def y(func: js.Function1[/* d */ js.Any, Double]): this.type = js.native
  
  var yAxis: Nvd3Axis = js.native
  
  /* Defines the whole y scale's domain. Using this will disable calculating the domain based on the data.*/
  def yDomain(): js.Array[Double] = js.native
  /* Defines the whole y scale's domain. Using this will disable calculating the domain based on the data.*/
  def yDomain(value: js.Array[Double]): this.type = js.native
  
  /* Override the y scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def yRange(): js.Array[Double] = js.native
  /* Override the y scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def yRange(value: js.Array[Double]): this.type = js.native
  
  /* Override the default scale type for the y axis*/
  def yScale(): js.Any = js.native
  /* Override the default scale type for the y axis*/
  def yScale(value: js.Any): this.type = js.native
}
