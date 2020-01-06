package typings.nvd3.nvd3Mod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.d3DashTransition.d3DashTransitionMod.Transition
import typings.nvd3.nvd3Strings.key
import typings.nvd3.nvd3Strings.percent
import typings.nvd3.nvd3Strings.right
import typings.nvd3.nvd3Strings.top
import typings.nvd3.nvd3Strings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChart extends Chart {
  @JSName("legend")
  var legend_Original: Legend = js.native
  @JSName("pie")
  var pie_Original: Pie = js.native
  var tooltip: Tooltip = js.native
  /*Specifies each slice size, by an inner and a outer radius. Values between 0 and 1*/
  def arcsRadius(): js.Array[ArcsRadius] = js.native
  /*Specifies each slice size, by an inner and a outer radius. Values between 0 and 1*/
  def arcsRadius(value: js.Array[ArcsRadius]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  /*D3 3.4+, For donut charts only, the corner radius of the slices. Typically used with padAngle.*/
  def cornerRadius(): Double = js.native
  /*D3 3.4+, For donut charts only, the corner radius of the slices. Typically used with padAngle.*/
  def cornerRadius(value: Double): this.type = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(): js.Any = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(value: js.Any): this.type = js.native
  /*Whether to make a pie graph a donut graph or not.*/
  def donut(): Boolean = js.native
  /*Whether to make a pie graph a donut graph or not.*/
  def donut(value: Boolean): this.type = js.native
  /**/
  def donutLabelsOutside(): Boolean = js.native
  /**/
  def donutLabelsOutside(value: Boolean): this.type = js.native
  /*Percent of pie radius to cut out of the middle to make the donut. It is multiplied by the outer radius to calculate the inner radius, thus it should be between 0 and 1.*/
  def donutRatio(): Double = js.native
  /*Percent of pie radius to cut out of the middle to make the donut. It is multiplied by the outer radius to calculate the inner radius, thus it should be between 0 and 1.*/
  def donutRatio(value: Double): this.type = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: Double): this.type = js.native
  /*Function used to manage the ending angle of the pie/donut chart*/
  def endAngle(): js.Function1[/* d */ js.Any, Double] = js.native
  /*Function used to manage the ending angle of the pie/donut chart*/
  def endAngle(func: js.Function1[/* d */ js.Any, Double]): this.type = js.native
  /*For pie/donut charts, whether to increase slice radius on hover or not*/
  def growOnHover(): Boolean = js.native
  /*For pie/donut charts, whether to increase slice radius on hover or not*/
  def growOnHover(value: Boolean): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
  def id(): js.Any = js.native
  def id(value: String): this.type = js.native
  def id(value: Double): this.type = js.native
  /**/
  def labelFormat(): String = js.native
  /**/
  def labelFormat(format: js.Function1[/* d */ js.Any, String]): this.type = js.native
  /**/
  def labelFormat(value: String): this.type = js.native
  /**/
  def labelSunbeamLayout(): Boolean = js.native
  /**/
  def labelSunbeamLayout(value: Boolean): this.type = js.native
  /*Pie/donut charts: The slice threshold size to not display the label because it woudl be too small of a space*/
  def labelThreshold(): Double = js.native
  /*Pie/donut charts: The slice threshold size to not display the label because it woudl be too small of a space*/
  def labelThreshold(value: Double): this.type = js.native
  /*pie/donut charts only: what kind of data to display for the slice labels. Options are key, value, or percent. */
  def labelType(): String = js.native
  /*pie/donut charts only: what kind of data to display for the slice labels. Options are key, value, or percent. */
  def labelType(func: js.Function3[/* d */ js.Any, /* i */ Double, /* values */ js.Any, String]): this.type = js.native
  /*pie/donut charts only: what kind of data to display for the slice labels. Options are key, value, or percent. */
  def labelType(value: String): this.type = js.native
  /*pie/donut charts only: what kind of data to display for the slice labels. Options are key, value, or percent. */
  @JSName("labelType")
  def labelType_key(value: key): this.type = js.native
  /*pie/donut charts only: what kind of data to display for the slice labels. Options are key, value, or percent. */
  @JSName("labelType")
  def labelType_percent(value: percent): this.type = js.native
  /*pie/donut charts only: what kind of data to display for the slice labels. Options are key, value, or percent. */
  @JSName("labelType")
  def labelType_value(value: value): this.type = js.native
  /*Whether pie/donut chart labels should be outside the slices instead of inside them*/
  def labelsOutside(): Boolean = js.native
  /*Whether pie/donut chart labels should be outside the slices instead of inside them*/
  def labelsOutside(value: Boolean): this.type = js.native
  def legend(
    selection: Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def legend(
    transition: Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*Position of the legend (top or right). */
  def legendPosition(): String = js.native
  /*Position of the legend (top or right). */
  def legendPosition(value: String): this.type = js.native
  /*Position of the legend (top or right). */
  @JSName("legendPosition")
  def legendPosition_right(value: right): this.type = js.native
  /*Position of the legend (top or right). */
  @JSName("legendPosition")
  def legendPosition_top(value: top): this.type = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  /*Message to display if no data is provided*/
  def noData(): String = js.native
  /*Message to display if no data is provided*/
  def noData(value: String): this.type = js.native
  /*D3 3.4+, For donut charts only, the percent of the chart that should be spacing between slices.*/
  def padAngle(): Double = js.native
  /*D3 3.4+, For donut charts only, the percent of the chart that should be spacing between slices.*/
  def padAngle(value: Double): this.type = js.native
  def pie(
    selection: Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def pie(
    transition: Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /**/
  def pieLabelsOutside(): Boolean = js.native
  /**/
  def pieLabelsOutside(value: Boolean): this.type = js.native
  /*Show pie/donut chart labels for each slice*/
  def showLabels(): Boolean = js.native
  /*Show pie/donut chart labels for each slice*/
  def showLabels(value: Boolean): this.type = js.native
  /*Whether to display the legend or not*/
  def showLegend(): Boolean = js.native
  /*Whether to display the legend or not*/
  def showLegend(value: Boolean): this.type = js.native
  /*Function used to manage the starting  angle of the pie/donut chart*/
  def startAngle(): js.Function1[/* d */ js.Any, Double] = js.native
  /*Function used to manage the starting  angle of the pie/donut chart*/
  def startAngle(func: js.Function1[/* d */ js.Any, Double]): this.type = js.native
  /*Text to include within the middle of a donut chart*/
  def title(): String = js.native
  /*Text to include within the middle of a donut chart*/
  def title(value: String): this.type = js.native
  /*Vertical offset for the donut chart title*/
  def titleOffset(): Double = js.native
  /*Vertical offset for the donut chart title*/
  def titleOffset(value: Double): this.type = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(): js.Function1[/* d */ js.Any, String] = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(func: js.Function1[/* d */ js.Any, String]): this.type = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(): Boolean = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(value: Boolean): this.type = js.native
  /*D3 Format object for the label of pie/donut, discrete bar and multibar charts.*/
  def valueFormat(): String = js.native
  /*D3 Format object for the label of pie/donut, discrete bar and multibar charts.*/
  def valueFormat(format: js.Function1[/* d */ js.Any, String]): this.type = js.native
  /*D3 Format object for the label of pie/donut, discrete bar and multibar charts.*/
  def valueFormat(value: String): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(): js.Function1[/* d */ js.Any, _] = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
  /*Proxy function to return the Y value so adjustments can be made if needed.For pie/ donut chart this returns the value for the slice.*/
  def y(): js.Function1[/* d */ js.Any, Double] = js.native
  /*Proxy function to return the Y value so adjustments can be made if needed. For pie/donut chart this returns the value for the slice.*/
  def y(func: js.Function1[/* d */ js.Any, Double]): this.type = js.native
}

