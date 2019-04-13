package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sunburst extends Nvd3Element {
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[java.lang.String]): this.type = js.native
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
  /*For sunburst only: specifies the mode of drawing the sunburst segments. Can be 'size' or 'count'. 'size' draws the segments according to the 'size' attribute of the leaf nodes, 'count' draws according to the amount of siblings a node has.*/
  def mode(): java.lang.String = js.native
  /*For sunburst only: specifies the mode of drawing the sunburst segments. Can be 'size' or 'count'. 'size' draws the segments according to the 'size' attribute of the leaf nodes, 'count' draws according to the amount of siblings a node has.*/
  def mode(value: java.lang.String): this.type = js.native
  /*For sunburst only: specifies the mode of drawing the sunburst segments. Can be 'size' or 'count'. 'size' draws the segments according to the 'size' attribute of the leaf nodes, 'count' draws according to the amount of siblings a node has.*/
  @JSName("mode")
  def mode_count(value: nvd3Lib.nvd3LibStrings.count): this.type = js.native
  /*For sunburst only: specifies the mode of drawing the sunburst segments. Can be 'size' or 'count'. 'size' draws the segments according to the 'size' attribute of the leaf nodes, 'count' draws according to the amount of siblings a node has.*/
  @JSName("mode")
  def mode_size(value: nvd3Lib.nvd3LibStrings.size): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): scala.Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: scala.Double): this.type = js.native
}

