package typings.nvd3.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify d3.svg.Axis * / any */ @js.native
trait Nvd3Axis extends js.Object {
  def axisLabel(): String = js.native
  def axisLabel(value: String): this.type = js.native
  def axisLabelDistance(): Double = js.native
  def axisLabelDistance(value: Double): this.type = js.native
  def domain(): js.Array[Double] = js.native
  def domain(domain: js.Array[Double]): this.type = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: Double): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  def orient(): String = js.native
  def orient(orientation: String): this.type = js.native
  def range(): js.Array[Double] = js.native
  def range(range: js.Array[Double]): this.type = js.native
  def rangeBand(): Double = js.native
  def rangeBands(interval: js.Tuple2[Double, Double]): this.type = js.native
  def rangeBands(interval: js.Tuple2[Double, Double], padding: Double): this.type = js.native
  def rangeBands(interval: js.Tuple2[Double, Double], padding: Double, outerPadding: Double): this.type = js.native
  /*Rotates the X axis labels by the specified degree.*/
  def rotateLabels(): Double = js.native
  /*Rotates the X axis labels by the specified degree.*/
  def rotateLabels(range: Double): this.type = js.native
  def rotateYLabels(): Double = js.native
  def rotateYLabels(range: Double): this.type = js.native
  def scale(): js.Any = js.native
  def scale(scale: js.Any): this.type = js.native
  def showMaxMin(value: Boolean): this.type = js.native
  def staggerLabels(): Boolean = js.native
  def staggerLabels(value: Boolean): this.type = js.native
  def tickFormat(): js.Function1[/* d */ js.Any, String] = js.native
  def tickFormat(format: String): this.type = js.native
  def tickFormat(format: js.Function1[/* t */ js.Any, String]): this.type = js.native
  def tickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, String]): this.type = js.native
  def tickPadding(): Double = js.native
  def tickPadding(padding: Double): this.type = js.native
  def tickSize(): Double = js.native
  def tickSize(inner: Double, outer: Double): this.type = js.native
  def tickSize(size: Double): this.type = js.native
  def tickValues(): js.Array[_] = js.native
  def tickValues(values: js.Array[_]): this.type = js.native
  def ticks(): js.Array[_] = js.native
  def ticks(args: js.Any*): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
}

