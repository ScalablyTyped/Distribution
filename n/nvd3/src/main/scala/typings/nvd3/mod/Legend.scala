package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Chart Component
@js.native
trait Legend extends Nvd3Element {
  def align(): Boolean = js.native
  def align(value: Boolean): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  def expanded(): Boolean = js.native
  def expanded(value: Boolean): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
  def key(): js.Any = js.native
  def key(value: js.Any): this.type = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  /*Specifies how much spacing there is between legend items.*/
  def padding(): Double = js.native
  /*Specifies how much spacing there is between legend items.*/
  def padding(value: Double): this.type = js.native
  def radioButtonMode(): Boolean = js.native
  //If true, clicking legend items will cause it to behave like a radio button. (only one can be selected at
  def radioButtonMode(value: Boolean): this.type = js.native
  def rightAlign(): Boolean = js.native
  def rightAlign(value: Boolean): this.type = js.native
  //If true, legend will update data.disabled and trigger a 'stateChange' dispatch.
  def updateState(): Boolean = js.native
  //If true, legend will update data.disabled and trigger a 'stateChange' dispatch.
  def updateState(value: Boolean): this.type = js.native
  //Options are "classic" and "furious"
  def vers(): String = js.native
  //Options are "classic" and "furious"
  def vers(value: String): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
}

