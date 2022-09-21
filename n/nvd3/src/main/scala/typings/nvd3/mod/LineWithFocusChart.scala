package typings.nvd3.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineWithFocusChart
  extends StObject
     with Chart {
  
  def brushExtent(): js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])] = js.native
  def brushExtent(value: js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]): this.type = js.native
  
  def clearHighlights(): this.type = js.native
  
  /*If true, masks lines within the X and Y scales using a clip-path*/
  def clipEdge(): Boolean = js.native
  /*If true, masks lines within the X and Y scales using a clip-path*/
  def clipEdge(value: Boolean): this.type = js.native
  
  /*When useVoronoi and clipVoronoi are true, you can control the clip radius with this option. Essentially this lets you set how far away from the actual point you can put the mouse for it to select the point.*/
  def clipRadius(func: js.Function1[/* d */ Any, Double]): this.type = js.native
  /*When useVoronoi and clipVoronoi are true, you can control the clip radius with this option. Essentially this lets you set how far away from the actual point you can put the mouse for it to select the point.*/
  def clipRadius(value: Double): this.type = js.native
  
  /*When useVoronoi is on, this masks each voronoi section with a circle to limit selection to smaller area.*/
  def clipVoronoi(): Boolean = js.native
  /*When useVoronoi is on, this masks each voronoi section with a circle to limit selection to smaller area.*/
  def clipVoronoi(value: Boolean): this.type = js.native
  
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(): Any = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(value: Any): this.type = js.native
  
  /*A provided function that allows a line to be non-continuous when not defined.*/
  def defined(): js.Function2[/* d */ Any, /* i */ Double, Boolean] = js.native
  /*A provided function that allows a line to be non-continuous when not defined.*/
  def defined(func: js.Function2[/* d */ Any, /* i */ Double, Boolean]): this.type = js.native
  
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: Double): this.type = js.native
  
  def focusHeight(): Double = js.native
  def focusHeight(value: Double): this.type = js.native
  
  def focusMargin(): Margin = js.native
  def focusMargin(value: Margin): this.type = js.native
  
  /*List of numbers to Force into the point scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forcePoint(): js.Array[Double] = js.native
  /*List of numbers to Force into the point scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forcePoint(value: js.Array[Double]): this.type = js.native
  
  /*List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceX(): js.Array[Double] = js.native
  /*List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceX(value: js.Array[Double]): this.type = js.native
  
  /*List of numbers to Force into the Y scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceY(): js.Array[Double] = js.native
  /*List of numbers to Force into the Y scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceY(value: js.Array[Double]): this.type = js.native
  
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
  
  /**/
  def highlightPoint(): js.Function1[/* d */ Any, Boolean] = js.native
  /**/
  def highlightPoint(func: js.Function1[/* d */ Any, Boolean]): this.type = js.native
  
  def id(): Any = js.native
  def id(value: String): this.type = js.native
  def id(value: Double): this.type = js.native
  
  /*A master flag for turning chart interaction on and off. This overrides all tooltip, voronoi, and guideline options.*/
  def interactive(): Boolean = js.native
  /*A master flag for turning chart interaction on and off. This overrides all tooltip, voronoi, and guideline options.*/
  def interactive(value: Boolean): this.type = js.native
  
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(): String = js.native
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(value: String): this.type = js.native
  
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(): js.Function1[/* d */ Any, Boolean] = js.native
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(func: js.Function1[/* d */ Any, Boolean]): this.type = js.native
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(value: Boolean): this.type = js.native
  
  def legend(
    selection: Selection_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  def legend(
    transition: Transition_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  @JSName("legend")
  var legend_Original: Legend = js.native
  
  def lines(
    selection: Selection_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  def lines(
    transition: Transition_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  
  def lines2(
    selection: Selection_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  def lines2(
    transition: Transition_[
      Any | js.Array[Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ Any
    ],
    args: Any*
  ): Any = js.native
  @JSName("lines2")
  var lines2_Original: Line = js.native
  
  @JSName("lines")
  var lines_Original: Line = js.native
  
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  
  def noData(): String = js.native
  def noData(value: String): this.type = js.native
  
  /**/
  def padData(): Boolean = js.native
  /**/
  def padData(value: Boolean): this.type = js.native
  
  /**/
  def padDataOuter(): Double = js.native
  /**/
  def padDataOuter(value: Double): this.type = js.native
  
  /* Function used to determine if scatter points are active or not, returns false to denote them as inactive and true for active.*/
  def pointActive(): js.Function1[/* d */ Any, Boolean] = js.native
  /*Function used to determine if scatter points are active or not, returns false to denote them as inactive and true for active.*/
  def pointActive(func: js.Function1[/* d */ Any, Boolean]): this.type = js.native
  
  /* Defines the whole point scale's domain. Using this will disable calculating the domain based on the data.*/
  def pointDomain(value: js.Array[Double]): this.type = js.native
  
  /* Override the point scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def pointRange(): js.Array[Double] = js.native
  /* Override the point scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def pointRange(value: js.Array[Double]): this.type = js.native
  
  /* Override the default scale type for the point axis*/
  def pointScale(): Any = js.native
  /* Override the default scale type for the point axis*/
  def pointScale(value: Any): this.type = js.native
  
  /* Specifies the size of the points in a scatter. Scatter is also used to make the hover points on lines.*/
  def pointSize(): js.Function1[/* d */ Any, Double] = js.native
  /* Specifies the size of the points in a scatter. Scatter is also used to make the hover points on lines.*/
  def pointSize(func: js.Function1[/* d */ Any, Double]): this.type = js.native
  /* Specifies the size of the points in a scatter. Scatter is also used to make the hover points on lines.*/
  def pointSize(value: Double): this.type = js.native
  
  /* Defines the whole point scale's domain. Using this will disable calculating the domain based on the data.*/
  def pointxDomain(): js.Array[Double] = js.native
  
  /*Whether to display the legend or not.*/
  def showLegend(): Boolean = js.native
  /*Whether to display the legend or not.*/
  def showLegend(value: Boolean): this.type = js.native
  
  /*Displays the voronoi areas on the chart. This is mostly helpful when debugging issues.*/
  def showVoronoi(): Boolean = js.native
  /*Displays the voronoi areas on the chart. This is mostly helpful when debugging issues.*/
  def showVoronoi(value: Boolean): this.type = js.native
  
  var tooltip: Tooltip = js.native
  
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(): js.Function1[/* d */ Any, String] = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(func: js.Function1[/* d */ Any, String]): this.type = js.native
  
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(): Boolean = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(value: Boolean): this.type = js.native
  
  /*Sets the chart to use a guideline and floating tooltip instead of requiring the user to hover over specific hotspots. Turning this on will set the 'interactive' and 'useVoronoi' options to false to avoid conflicting.*/
  def useInteractiveGuideline(): Boolean = js.native
  /*Sets the chart to use a guideline and floating tooltip instead of requiring the user to hover over specific hotspots. Turning this on will set the 'interactive' and 'useVoronoi' options to false to avoid conflicting.*/
  def useInteractiveGuideline(value: Boolean): this.type = js.native
  
  /*Use voronoi diagram to select nearest point to display tooltip instead of requiring a hover over the specific point itself. Setting this to false will also set clipVoronoi to false.*/
  def useVoronoi(): Boolean = js.native
  /*Use voronoi diagram to select nearest point to display tooltip instead of requiring a hover over the specific point itself. Setting this to false will also set clipVoronoi to false.*/
  def useVoronoi(value: Boolean): this.type = js.native
  
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
  
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(): js.Function1[/* d */ Any, Any] = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(func: js.Function1[/* d */ Any, Any]): this.type = js.native
  
  var x2Axis: Nvd3Axis = js.native
  
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
  def xScale(): Any = js.native
  /* Override the default scale type for the X axis*/
  def xScale(value: Any): this.type = js.native
  
  def xTickFormat(): js.Function1[/* d */ Any, String] = js.native
  def xTickFormat(format: String): this.type = js.native
  def xTickFormat(format: js.Function1[/* t */ Any, String]): this.type = js.native
  def xTickFormat(format: js.Function2[/* d */ Any, /* i */ Any, String]): this.type = js.native
  
  def y(): js.Function1[/* d */ Any, Double] = js.native
  /* Proxy function to return the y value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def y(func: js.Function1[/* d */ Any, Double]): this.type = js.native
  
  var y2Axis: Nvd3Axis = js.native
  
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
  def yScale(): Any = js.native
  /* Override the default scale type for the y axis*/
  def yScale(value: Any): this.type = js.native
  
  def yTickFormat(): js.Function1[/* d */ Any, String] = js.native
  def yTickFormat(format: String): this.type = js.native
  def yTickFormat(format: js.Function1[/* t */ Any, String]): this.type = js.native
  def yTickFormat(format: js.Function2[/* d */ Any, /* i */ Any, String]): this.type = js.native
}
