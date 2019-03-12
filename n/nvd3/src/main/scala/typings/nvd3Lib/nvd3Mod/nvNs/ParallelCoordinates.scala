package typings
package nvd3Lib.nvd3Mod.nvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelCoordinates extends Nvd3Element {
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[java.lang.String]): this.type = js.native
  def dimensionData(): js.Any = js.native
  def dimensionData(d: js.Any): this.type = js.native
  /*D3 format for each x axis*/
  def dimensionFormats(): js.Array[java.lang.String] = js.native
  /*D3 format for each x axis*/
  def dimensionFormats(value: js.Array[java.lang.String]): this.type = js.native
  /*Name of each dimension, used for each axis.*/
  def dimensionNames(): js.Array[java.lang.String] = js.native
  /*Name of each dimension, used for each axis.*/
  def dimensionNames(value: js.Array[java.lang.String]): this.type = js.native
  /*Deprecated. Use dimensionsNames instead. */
  def dimensions(): js.Any = js.native
  /*Deprecated. Use dimensionsNames instead. .*/
  def dimensions(value: js.Any): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): scala.Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: scala.Double): this.type = js.native
  /*Specifies each line tension. Values between 0 and 1.*/
  def lineTension(): scala.Double = js.native
  /*Specifies each line tension. Values between 0 and 1.*/
  def lineTension(value: scala.Double): this.type = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): scala.Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: scala.Double): this.type = js.native
}

