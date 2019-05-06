package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiChart extends Chart {
  @JSName("bars1")
  var bars1_Original: MultiBar = js.native
  @JSName("bars2")
  var bars2_Original: MultiBar = js.native
  @JSName("lines1")
  var lines1_Original: Line = js.native
  @JSName("lines2")
  var lines2_Original: Line = js.native
  @JSName("scatters1")
  var scatters1_Original: Scatter = js.native
  @JSName("scatters2")
  var scatters2_Original: Scatter = js.native
  @JSName("stack1")
  var stack1_Original: StackedArea = js.native
  @JSName("stack2")
  var stack2_Original: StackedArea = js.native
  var tooltip: Tooltip = js.native
  var xAxis: Nvd3Axis = js.native
  var yAxis1: Nvd3Axis = js.native
  var yAxis2: Nvd3Axis = js.native
  def bars1(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def bars1(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def bars2(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def bars2(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(func: js.Function2[/* d */ js.Any, /* i */ scala.Double, java.lang.String]): this.type = js.native
  /*Colors to use for the different data. If an array is given, it is converted to a function automatically.*/
  def color(value: js.Array[java.lang.String]): this.type = js.native
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(): java.lang.String = js.native
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(value: java.lang.String): this.type = js.native
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(): js.Function1[/* d */ js.Any, scala.Boolean] = js.native
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(func: js.Function1[/* d */ js.Any, scala.Boolean]): this.type = js.native
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(value: scala.Boolean): this.type = js.native
  def lines1(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def lines1(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def lines2(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def lines2(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(): Margin = js.native
  /*Object containing the margins for the chart or component. You can specify only certain margins in the object to change just those parts.*/
  def margin(value: Margin): this.type = js.native
  def noData(): java.lang.String = js.native
  def noData(value: java.lang.String): this.type = js.native
  def scatters1(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def scatters1(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def scatters2(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def scatters2(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*Whether to display the legend or not.*/
  def showLegend(): scala.Boolean = js.native
  /*Whether to display the legend or not.*/
  def showLegend(value: scala.Boolean): this.type = js.native
  def stack1(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def stack1(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def stack2(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def stack2(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(): js.Function1[/* d */ js.Any, java.lang.String] = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(func: js.Function1[/* d */ js.Any, java.lang.String]): this.type = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(): scala.Boolean = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(value: scala.Boolean): this.type = js.native
  /*Use voronoi diagram to select nearest point to display tooltip instead of requiring a hover over the specific point itself. Setting this to false will also set clipVoronoi to false.*/
  def useVoronoi(): scala.Boolean = js.native
  /*Use voronoi diagram to select nearest point to display tooltip instead of requiring a hover over the specific point itself. Setting this to false will also set clipVoronoi to false.*/
  def useVoronoi(value: scala.Boolean): this.type = js.native
  /* The width the graph or component created inside the SVG should be made*/
  def width(): scala.Double = js.native
  /*The width the graph or component created inside the SVG should be made.*/
  def width(value: scala.Double): this.type = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(): js.Function1[/* d */ js.Any, _] = js.native
  /* Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def x(func: js.Function1[/* d */ js.Any, _]): this.type = js.native
  /* Defines the whole X scale's domain. Using this will disable calculating the domain based on the data.*/
  def y(): js.Function1[/* d */ js.Any, scala.Double] = js.native
  /* Proxy function to return the y value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.*/
  def y(func: js.Function1[/* d */ js.Any, scala.Double]): this.type = js.native
  /* */
  def yDomain1(): js.Array[scala.Double] = js.native
  /* */
  def yDomain1(value: js.Array[scala.Double]): this.type = js.native
  /* */
  def yDomain2(): js.Array[scala.Double] = js.native
  /* */
  def yDomain2(value: js.Array[scala.Double]): this.type = js.native
}

