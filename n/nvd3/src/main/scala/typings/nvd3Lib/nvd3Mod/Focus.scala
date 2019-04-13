package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Focus extends Nvd3Element {
  def brushExtent(): (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]) = js.native
  def brushExtent(
    value: js.Tuple2[
      scala.Double | (js.Tuple2[scala.Double, scala.Double]), 
      scala.Double | (js.Tuple2[scala.Double, scala.Double])
    ]
  ): this.type = js.native
  def color(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  def color(value: js.Array[java.lang.String]): this.type = js.native
  def duration(): scala.Double = js.native
  def duration(value: scala.Double): this.type = js.native
  def height(): scala.Double = js.native
  def height(value: scala.Double): this.type = js.native
  def interpolate(): java.lang.String = js.native
  def interpolate(value: java.lang.String): this.type = js.native
  def margin(): Margin = js.native
  def margin(value: Margin): this.type = js.native
  def rightAlignYAxis(): scala.Boolean = js.native
  def rightAlignYAxis(value: scala.Boolean): this.type = js.native
  def showXAxis(): scala.Boolean = js.native
  def showXAxis(value: scala.Boolean): this.type = js.native
  def showYAxis(): scala.Boolean = js.native
  def showYAxis(value: scala.Boolean): this.type = js.native
  def syncBrushing(): scala.Boolean = js.native
  def syncBrushing(value: scala.Boolean): this.type = js.native
  def width(): scala.Double = js.native
  def width(value: scala.Double): this.type = js.native
  def x(): js.Function1[/* d */ js.Any, _] = js.native
  def x(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
  def xTickFormat(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def xTickFormat(format: java.lang.String): this.type = js.native
  def xTickFormat(format: js.Function1[/* t */ js.Any, java.lang.String]): this.type = js.native
  def xTickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, java.lang.String]): this.type = js.native
  def y(): js.Function1[/* d */ js.Any, scala.Double] = js.native
  def y(func: js.Function1[/* d */ js.Any, scala.Double]): this.type = js.native
  def yTickFormat(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def yTickFormat(format: java.lang.String): this.type = js.native
  def yTickFormat(format: js.Function1[/* t */ js.Any, java.lang.String]): this.type = js.native
  def yTickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, java.lang.String]): this.type = js.native
}

