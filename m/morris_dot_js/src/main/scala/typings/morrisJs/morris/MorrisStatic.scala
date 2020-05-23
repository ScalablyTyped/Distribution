package typings.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorrisStatic extends js.Object {
  /** Create an area chart. */
  def Area(options: IAreaOptions): GridChart
  /** Create a bar chart. */
  def Bar(options: IBarOptions): GridChart
  /** Create a Donut chart. */
  def Donut(options: IDonutOptions): DonutChart
  /** Create a line chart. */
  def Line(options: ILineOptions): GridChart
}

object MorrisStatic {
  @scala.inline
  def apply(
    Area: IAreaOptions => GridChart,
    Bar: IBarOptions => GridChart,
    Donut: IDonutOptions => DonutChart,
    Line: ILineOptions => GridChart
  ): MorrisStatic = {
    val __obj = js.Dynamic.literal(Area = js.Any.fromFunction1(Area), Bar = js.Any.fromFunction1(Bar), Donut = js.Any.fromFunction1(Donut), Line = js.Any.fromFunction1(Line))
    __obj.asInstanceOf[MorrisStatic]
  }
}

