package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyChart extends Chart {
  /*Y-position of the middle of a node.*/
  def center(): scala.Double = js.native
  /*Y-position of the middle of a node.*/
  def center(value: js.Function1[/* d */ js.Any, _]): this.type = js.native
  /*Formatting settings for nodes. */
  def format(): java.lang.String = js.native
  /*Formatting settings for nodes. */
  def format(formatter: js.Function1[/* d */ js.Any, java.lang.String]): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): scala.Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: scala.Double): this.type = js.native
  /*Format annotation on links. */
  def linkTitle(): java.lang.String = js.native
  /*Format annotation on links. */
  def linkTitle(formatter: js.Function1[/* d */ js.Any, java.lang.String]): this.type = js.native
  /*Styling options for nodes. */
  def margin(): Margin = js.native
  /*Styling options for nodes. */
  def margin(value: Margin): this.type = js.native
  /* The padding of nodes.*/
  def nodePadding(): scala.Double = js.native
  /*The padding of nodes.*/
  def nodePadding(value: scala.Double): this.type = js.native
  /*Styling options for nodes. */
  def nodeStyle(): SankeyNodeStyleOptions = js.native
  /*Styling options for nodes. */
  def nodeStyle(value: SankeyNodeStyleOptions): this.type = js.native
  /* The width of nodes.*/
  def nodeWidth(): scala.Double = js.native
  /*The width of nodes.*/
  def nodeWidth(value: scala.Double): this.type = js.native
  /*Units to be used. */
  def units(): java.lang.String = js.native
  /*Units to be used. */
  def units(value: java.lang.String): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): scala.Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: scala.Double): this.type = js.native
}

