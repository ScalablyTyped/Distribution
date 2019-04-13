package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Nvd3Axis extends js.Object {
  def axisLabel(): java.lang.String = js.native
  def axisLabel(value: java.lang.String): this.type = js.native
  def axisLabelDistance(): scala.Double = js.native
  def axisLabelDistance(value: scala.Double): this.type = js.native
  def domain(): js.Array[scala.Double] = js.native
  def domain(domain: js.Array[scala.Double]): this.type = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): scala.Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: scala.Double): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): scala.Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: scala.Double): this.type = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  def orient(): java.lang.String = js.native
  def orient(orientation: java.lang.String): this.type = js.native
  def range(): js.Array[scala.Double] = js.native
  def range(range: js.Array[scala.Double]): this.type = js.native
  def rangeBand(): scala.Double = js.native
  def rangeBands(interval: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
  def rangeBands(interval: js.Tuple2[scala.Double, scala.Double], padding: scala.Double): this.type = js.native
  def rangeBands(interval: js.Tuple2[scala.Double, scala.Double], padding: scala.Double, outerPadding: scala.Double): this.type = js.native
  /*Rotates the X axis labels by the specified degree.*/
  def rotateLabels(): scala.Double = js.native
  /*Rotates the X axis labels by the specified degree.*/
  def rotateLabels(range: scala.Double): this.type = js.native
  def rotateYLabels(): scala.Double = js.native
  def rotateYLabels(range: scala.Double): this.type = js.native
  def scale(): js.Any = js.native
  def scale(scale: js.Any): this.type = js.native
  def showMaxMin(value: scala.Boolean): this.type = js.native
  def staggerLabels(): scala.Boolean = js.native
  def staggerLabels(value: scala.Boolean): this.type = js.native
  def tickFormat(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def tickFormat(format: java.lang.String): this.type = js.native
  def tickFormat(format: js.Function1[/* t */ js.Any, java.lang.String]): this.type = js.native
  def tickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, java.lang.String]): this.type = js.native
  def tickPadding(): scala.Double = js.native
  def tickPadding(padding: scala.Double): this.type = js.native
  def tickSize(): scala.Double = js.native
  def tickSize(inner: scala.Double, outer: scala.Double): this.type = js.native
  def tickSize(size: scala.Double): this.type = js.native
  def tickValues(): js.Array[_] = js.native
  def tickValues(values: js.Array[_]): this.type = js.native
  def ticks(): js.Array[_] = js.native
  def ticks(args: js.Any*): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): scala.Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: scala.Double): this.type = js.native
}

