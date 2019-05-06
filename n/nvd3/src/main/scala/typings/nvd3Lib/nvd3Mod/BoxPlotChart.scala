package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Charts
@js.native
trait BoxPlotChart extends Chart {
  @JSName("boxplot")
  var boxplot_Original: BoxPlot = js.native
  var tooltip: Tooltip = js.native
  var xAxis: Nvd3Axis = js.native
  var yAxis: Nvd3Axis = js.native
  def boxplot(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def boxplot(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[java.lang.String]): this.type = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): scala.Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: scala.Double): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): scala.Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: scala.Double): this.type = js.native
  def id(): js.Any = js.native
  def id(value: java.lang.String): this.type = js.native
  def id(value: scala.Double): this.type = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  def maxBoxWidth(): scala.Double = js.native
  def maxBoxWidth(value: scala.Double): this.type = js.native
  def noData(): java.lang.String = js.native
  def noData(value: java.lang.String): this.type = js.native
  /*When only one Y axis is used, this puts the Y axis on the right side instead of the left.*/
  def rightAlignYAxis(): scala.Boolean = js.native
  /*When only one Y axis is used, this puts the Y axis on the right side instead of the left.*/
  def rightAlignYAxis(value: scala.Boolean): this.type = js.native
  /*Display or hide the X axis*/
  def showXAxis(): scala.Boolean = js.native
  /*Display or hide the X axis*/
  def showXAxis(value: scala.Boolean): this.type = js.native
  /*Display or hide the Y axis*/
  def showYAxis(): scala.Boolean = js.native
  /*Display or hide the Y axis*/
  def showYAxis(value: scala.Boolean): this.type = js.native
  /*Makes the X labels stagger at different distances from the axis so they're less likely to overlap.*/
  def staggerLabels(): scala.Boolean = js.native
  /*Makes the X labels stagger at different distances from the axis so they're less likely to overlap.*/
  def staggerLabels(value: scala.Boolean): this.type = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(func: js.Function1[/* d */ js.Any, java.lang.String]): this.type = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(): scala.Boolean = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(value: scala.Boolean): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): scala.Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: scala.Double): this.type = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(): js.Function1[/* d */ js.Any, _] = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
  /* Defines the whole X scale's domain. Using this will disable calculating the domain based on the data.*/
  def xDomain(): js.Array[scala.Double] = js.native
  /* Defines the whole X scale's domain. Using this will disable calculating the domain based on the data.*/
  def xDomain(value: js.Array[scala.Double]): this.type = js.native
  /* Override the X scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def xRange(): js.Array[scala.Double] = js.native
  /* Override the X scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def xRange(value: js.Array[scala.Double]): this.type = js.native
  /* Override the default scale type for the X axis*/
  def xScale(): js.Any = js.native
  /* Override the default scale type for the X axis*/
  def xScale(value: js.Any): this.type = js.native
  def y(): js.Function1[/* d */ js.Any, scala.Double] = js.native
  /* Proxy function to return the y value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def y(func: js.Function1[/* d */ js.Any, scala.Double]): this.type = js.native
  /* Defines the whole y scale's domain. Using this will disable calculating the domain based on the data.*/
  def yDomain(): js.Array[scala.Double] = js.native
  /* Defines the whole y scale's domain. Using this will disable calculating the domain based on the data.*/
  def yDomain(value: js.Array[scala.Double]): this.type = js.native
  /* Override the y scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def yRange(): js.Array[scala.Double] = js.native
  /* Override the y scale's range. Using this will disable calculating the range based on the data and chart width/height.*/
  def yRange(value: js.Array[scala.Double]): this.type = js.native
  /* Override the default scale type for the y axis*/
  def yScale(): js.Any = js.native
  /* Override the default scale type for the y axis*/
  def yScale(value: js.Any): this.type = js.native
}

