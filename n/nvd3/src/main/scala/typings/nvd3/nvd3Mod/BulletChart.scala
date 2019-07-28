package typings.nvd3.nvd3Mod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.d3DashTransition.d3DashTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulletChart extends Chart {
  @JSName("bullet")
  var bullet_Original: Bullet = js.native
  var tooltip: Tooltip = js.native
  def bullet(
    selection: Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def bullet(
    transition: Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ Double, String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[String]): this.type = js.native
  /*List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceX(): js.Array[Double] = js.native
  /*List of numbers to Force into the X scale (ie. 0, or a max / min, etc.). This ensures the numbers are in the X domain but doesn't override the whole domain. This option only applies if you have not overridden the whole domain with the xDomain option*/
  def forceX(value: js.Array[Double]): this.type = js.native
  /*The height the graph or component created inside the SVG should be made*/
  def height(): Double = js.native
  /*The height the graph or component created inside the SVG should be made.*/
  def height(value: Double): this.type = js.native
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
  def noData(): String = js.native
  def noData(value: String): this.type = js.native
  def orient(): String = js.native
  def orient(orientation: String): this.type = js.native
  def ranges(): js.Function1[/* d */ js.Any, _] = js.native
  //todo;
  def ranges(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
  //todo;
  def tickFormat(): js.Function1[/* d */ js.Any, String] = js.native
  def tickFormat(format: String): this.type = js.native
  def tickFormat(format: js.Function1[/* d */ js.Any, String]): this.type = js.native
  def tickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, String]): this.type = js.native
  def ticks(): js.Array[_] = js.native
  def ticks(args: js.Any*): this.type = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(): js.Function1[/* d */ js.Any, String] = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(func: js.Function1[/* d */ js.Any, String]): this.type = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(): Boolean = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(value: Boolean): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: Double): this.type = js.native
}

