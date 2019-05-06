package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nvd3Lib.nvd3Mod.Chart because var conflicts: dispatch. Inlined state, interactiveLayer */ @js.native
trait StackedAreaChart extends StackedArea {
  @JSName("controls")
  var controls_Original: Legend = js.native
  @JSName("focus")
  var focus_Original: Focus = js.native
  var interactiveLayer: InteractiveLayer = js.native
  @JSName("legend")
  var legend_Original: Legend = js.native
  @JSName("stacked")
  var stacked_Original: StackedArea = js.native
  var state: State = js.native
  var tooltip: Tooltip = js.native
  var x2Axis: Nvd3Axis = js.native
  var xAxis: Nvd3Axis = js.native
  var y2Axis: Nvd3Axis = js.native
  var yAxis: Nvd3Axis = js.native
  def brushExtent(): (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]) = js.native
  def brushExtent(
    value: js.Tuple2[
      scala.Double | (js.Tuple2[scala.Double, scala.Double]), 
      scala.Double | (js.Tuple2[scala.Double, scala.Double])
    ]
  ): this.type = js.native
  def controlLabels(): js.Any = js.native
  /*Object that defines the labels for control items in the graph. For instance, in the stackedAreaChart, there are controls for making it stacked, expanded, or stream. For stacked bar charts, there is stacked and grouped.*/
  def controlLabels(value: js.Any): this.type = js.native
  def controls(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def controls(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(): js.Any = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(value: js.Any): this.type = js.native
  def focus(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def focus(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def focusEnable(): scala.Boolean = js.native
  def focusEnable(value: scala.Boolean): this.type = js.native
  def focusHeight(): scala.Double = js.native
  def focusHeight(value: scala.Double): this.type = js.native
  def legend(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def legend(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  /*Message to display if no data is provided*/
  def noData(): java.lang.String = js.native
  /*Message to display if no data is provided*/
  def noData(value: java.lang.String): this.type = js.native
  def rightAlignYAxis(): scala.Boolean = js.native
  /*When only one Y axis is used, this puts the Y axis on the right side instead of the left.*/
  def rightAlignYAxis(value: scala.Boolean): this.type = js.native
  def showControls(): scala.Boolean = js.native
  def showControls(value: scala.Boolean): this.type = js.native
  def showLegend(): scala.Boolean = js.native
  /*Whether to display the legend or not*/
  def showLegend(value: scala.Boolean): this.type = js.native
  /*Display or hide the X axis*/
  def showXAxis(): scala.Boolean = js.native
  /*Display or hide the X axis*/
  def showXAxis(value: scala.Boolean): this.type = js.native
  /*Display or hide the Y axis*/
  def showYAxis(): scala.Boolean = js.native
  /*Display or hide the Y axis*/
  def showYAxis(value: scala.Boolean): this.type = js.native
  def stacked(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def stacked(
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
  /*Sets the chart to use a guideline and floating tooltip instead of requiring the user to hover over specific hotspots. Turning this on will set the 'interactive' and 'useVoronoi' options to false to avoid conflicting.*/
  def useInteractiveGuideline(): scala.Boolean = js.native
  /*Sets the chart to use a guideline and floating tooltip instead of requiring the user to hover over specific hotspots. Turning this on will set the 'interactive' and 'useVoronoi' options to false to avoid conflicting.*/
  def useInteractiveGuideline(value: scala.Boolean): this.type = js.native
}

