package typings.nvd3.mod

import typings.nvd3.nvd3Strings.x
import typings.nvd3.nvd3Strings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends Nvd3Element {
  def axis(): String = js.native
  def axis(value: String): this.type = js.native
  @JSName("axis")
  def axis_x(value: x): this.type = js.native
  @JSName("axis")
  def axis_y(value: y): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  def domain(): js.Array[Double] = js.native
  def domain(value: js.Array[Double]): this.type = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: Double): this.type = js.native
  def getData(func: js.Function1[/* d */ js.Any, Double]): this.type = js.native
  def scale(): js.Any = js.native
  def scale(value: js.Any): this.type = js.native
  def size(): Double = js.native
  def size(value: Double): this.type = js.native
  def width(): Double = js.native
  def width(value: Double): this.type = js.native
}

