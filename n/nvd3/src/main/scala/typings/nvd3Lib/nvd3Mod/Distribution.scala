package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends Nvd3Element {
  def axis(): java.lang.String = js.native
  def axis(value: java.lang.String): this.type = js.native
  @JSName("axis")
  def axis_x(value: nvd3Lib.nvd3LibStrings.x): this.type = js.native
  @JSName("axis")
  def axis_y(value: nvd3Lib.nvd3LibStrings.y): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[java.lang.String]): this.type = js.native
  def domain(): js.Array[scala.Double] = js.native
  def domain(value: js.Array[scala.Double]): this.type = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): scala.Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: scala.Double): this.type = js.native
  def getData(func: js.Function1[/* d */ js.Any, scala.Double]): this.type = js.native
  def scale(): js.Any = js.native
  def scale(value: js.Any): this.type = js.native
  def size(): scala.Double = js.native
  def size(value: scala.Double): this.type = js.native
  def width(): scala.Double = js.native
  def width(value: scala.Double): this.type = js.native
}

