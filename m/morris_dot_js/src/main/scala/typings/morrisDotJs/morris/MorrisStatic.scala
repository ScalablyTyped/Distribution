package typings.morrisDotJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("morris.MorrisStatic")
@js.native
class MorrisStatic () extends js.Object {
  /** Create an area chart. */
  def Area(options: IAreaOptions): GridChart = js.native
  /** Create a bar chart. */
  def Bar(options: IBarOptions): GridChart = js.native
  /** Create a Donut chart. */
  def Donut(options: IDonutOptions): DonutChart = js.native
  /** Create a line chart. */
  def Line(options: ILineOptions): GridChart = js.native
}

