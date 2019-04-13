package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bullet extends Nvd3Element {
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[java.lang.String]): this.type = js.native
  /*List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceX(): js.Array[scala.Double] = js.native
  /*List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceX(value: js.Array[scala.Double]): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): scala.Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: scala.Double): this.type = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  def markers(): js.Function1[/* d */ js.Any, _] = js.native
  //todo;
  def markers(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
  //todo;
  def measures(): js.Function1[/* d */ js.Any, _] = js.native
  //todo;
  def measures(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
  //todo;
  def orient(): java.lang.String = js.native
  def orient(orientation: java.lang.String): this.type = js.native
  def ranges(): js.Function1[/* d */ js.Any, _] = js.native
  //todo;
  def ranges(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
  //todo;
  def tickFormat(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  def tickFormat(format: java.lang.String): this.type = js.native
  def tickFormat(format: js.Function1[/* d */ js.Any, java.lang.String]): this.type = js.native
  def tickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, java.lang.String]): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): scala.Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: scala.Double): this.type = js.native
}

