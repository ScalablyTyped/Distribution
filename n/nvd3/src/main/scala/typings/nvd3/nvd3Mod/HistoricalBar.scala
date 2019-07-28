package typings.nvd3.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalBar extends Nvd3Element {
  /*If true, masks lines within the X and Y scales using a clip-path*/
  def clipEdge(): Boolean = js.native
  /*If true, masks lines within the X and Y scales using a clip-path*/
  def clipEdge(value: Boolean): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
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
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  /*.*/
  def padData(): Boolean = js.native
  /**/
  def padData(value: Boolean): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(): js.Function1[/* d */ js.Any, _] = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
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

