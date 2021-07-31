package typings.nvd3.mod

import typings.nvd3.nvd3Strings.count
import typings.nvd3.nvd3Strings.size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sunburst
  extends StObject
     with Nvd3Element {
  
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
  
  def id(): js.Any = js.native
  def id(value: String): this.type = js.native
  def id(value: Double): this.type = js.native
  
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  
  /*For sunburst only: specifies the mode of drawing the sunburst segments. Can be 'size' or 'count'. 'size' draws the segments according to the 'size' attribute of the leaf nodes, 'count' draws according to the amount of siblings a node has.*/
  def mode(): String = js.native
  /*For sunburst only: specifies the mode of drawing the sunburst segments. Can be 'size' or 'count'. 'size' draws the segments according to the 'size' attribute of the leaf nodes, 'count' draws according to the amount of siblings a node has.*/
  def mode(value: String): this.type = js.native
  /*For sunburst only: specifies the mode of drawing the sunburst segments. Can be 'size' or 'count'. 'size' draws the segments according to the 'size' attribute of the leaf nodes, 'count' draws according to the amount of siblings a node has.*/
  @JSName("mode")
  def mode_count(value: count): this.type = js.native
  /*For sunburst only: specifies the mode of drawing the sunburst segments. Can be 'size' or 'count'. 'size' draws the segments according to the 'size' attribute of the leaf nodes, 'count' draws according to the amount of siblings a node has.*/
  @JSName("mode")
  def mode_size(value: size): this.type = js.native
  
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
}
