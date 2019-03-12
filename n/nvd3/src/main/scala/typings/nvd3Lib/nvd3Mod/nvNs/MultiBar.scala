package typings
package nvd3Lib.nvd3Mod.nvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiBar extends Nvd3Element {
  /*this option lets you specific a color for each bar group to have the same color but differentiated by shading.*/
  def barColor(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  /*this option lets you specific a color for each bar group to have the same color but differentiated by shading.*/
  def barColor(value: js.Array[java.lang.String]): this.type = js.native
  /*If true, masks lines within the X and Y scales using a clip-path*/
  def clipEdge(): scala.Boolean = js.native
  /*If true, masks lines within the X and Y scales using a clip-path*/
  def clipEdge(value: scala.Boolean): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[java.lang.String]): this.type = js.native
  /**/
  def disabled(): js.Array[scala.Boolean] = js.native
  /**/
  def disabled(value: js.Array[scala.Boolean]): this.type = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): scala.Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: scala.Double): this.type = js.native
  /* List of numbers to Force into the Y scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the Y domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the yDomain option.*/
  def forceY(): js.Array[scala.Double] = js.native
  /* List of numbers to Force into the Y scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the Y domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the yDomain option.*/
  def forceY(value: js.Array[scala.Double]): this.type = js.native
  /*The padding between bar groups, this is passed as the padding attribute of rangeBands*/
  def groupSpacing(): scala.Double = js.native
  /*The padding between bar groups, this is passed as the padding attribute of rangeBands*/
  def groupSpacing(value: scala.Double): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): scala.Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: scala.Double): this.type = js.native
  /*.*/
  def hideable(): scala.Boolean = js.native
  /**/
  def hideable(value: scala.Boolean): this.type = js.native
  def id(): js.Any = js.native
  def id(value: java.lang.String): this.type = js.native
  def id(value: scala.Double): this.type = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  def stackOffset(offset: java.lang.String): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  def stackOffset(
    offset: js.Function1[/* data */ js.Array[js.Tuple2[scala.Double, scala.Double]], js.Array[scala.Double]]
  ): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("stackOffset")
  def stackOffset_expand(offset: nvd3Lib.nvd3LibStrings.expand): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("stackOffset")
  def stackOffset_silhouette(offset: nvd3Lib.nvd3LibStrings.silhouette): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("stackOffset")
  def stackOffset_wiggle(offset: nvd3Lib.nvd3LibStrings.wiggle): this.type = js.native
  /* options include 'silhouette', 'wiggle', 'expand', 'zero', or a custom function*/
  @JSName("stackOffset")
  def stackOffset_zero(offset: nvd3Lib.nvd3LibStrings.zero): this.type = js.native
  /*.*/
  def stacked(): scala.Boolean = js.native
  /**/
  def stacked(value: scala.Boolean): this.type = js.native
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

