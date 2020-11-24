package typings.nvd3.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nvd3.mod.Nvd3Element because Already inherited
- typings.nvd3.mod.Chart because var conflicts: dispatch. Inlined state, interactiveLayer */ @js.native
trait StackedAreaChart extends StackedArea {
  
  def brushExtent(): js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])] = js.native
  def brushExtent(value: js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]): this.type = js.native
  
  def controlLabels(): js.Any = js.native
  /*Object that defines the labels for control items in the graph. For instance, in the stackedAreaChart, there are controls for making it stacked, expanded, or stream. For stacked bar charts, there is stacked and grouped.*/
  def controlLabels(value: js.Any): this.type = js.native
  
  def controls(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def controls(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("controls")
  var controls_Original: Legend = js.native
  
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(): js.Any = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(value: js.Any): this.type = js.native
  
  def focus(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def focus(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  
  def focusEnable(): Boolean = js.native
  def focusEnable(value: Boolean): this.type = js.native
  
  def focusHeight(): Double = js.native
  def focusHeight(value: Double): this.type = js.native
  
  @JSName("focus")
  var focus_Original: Focus = js.native
  
  var interactiveLayer: InteractiveLayer = js.native
  
  def legend(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def legend(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("legend")
  var legend_Original: Legend = js.native
  
  /*Message to display if no data is provided*/
  def noData(): String = js.native
  /*Message to display if no data is provided*/
  def noData(value: String): this.type = js.native
  
  def rightAlignYAxis(): Boolean = js.native
  /*When only one Y axis is used, this puts the Y axis on the right side instead of the left.*/
  def rightAlignYAxis(value: Boolean): this.type = js.native
  
  def showControls(): Boolean = js.native
  def showControls(value: Boolean): this.type = js.native
  
  def showLegend(): Boolean = js.native
  /*Whether to display the legend or not*/
  def showLegend(value: Boolean): this.type = js.native
  
  /*Display or hide the X axis*/
  def showXAxis(): Boolean = js.native
  /*Display or hide the X axis*/
  def showXAxis(value: Boolean): this.type = js.native
  
  /*Display or hide the Y axis*/
  def showYAxis(): Boolean = js.native
  /*Display or hide the Y axis*/
  def showYAxis(value: Boolean): this.type = js.native
  
  def stacked(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def stacked(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("stacked")
  var stacked_Original: StackedArea = js.native
  
  var state: State = js.native
  
  var tooltip: Tooltip = js.native
  
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(): js.Function1[/* d */ js.Any, String] = js.native
  /*Deprecated. Use chart.tooltip.contentGenerator or chart.interactiveGuideline.tooltip.contentGenerator to control tooltip content.*/
  def tooltipContent(func: js.Function1[/* d */ js.Any, String]): this.type = js.native
  
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(): Boolean = js.native
  /*Deprecated. Use chart.tooltip.enabled or chart.interactive to control if tooltips are enabled or not.*/
  def tooltips(value: Boolean): this.type = js.native
  
  /*Sets the chart to use a guideline and floating tooltip instead of requiring the user to hover over specific hotspots. Turning this on will set the 'interactive' and 'useVoronoi' options to false to avoid conflicting.*/
  def useInteractiveGuideline(): Boolean = js.native
  /*Sets the chart to use a guideline and floating tooltip instead of requiring the user to hover over specific hotspots. Turning this on will set the 'interactive' and 'useVoronoi' options to false to avoid conflicting.*/
  def useInteractiveGuideline(value: Boolean): this.type = js.native
  
  var x2Axis: Nvd3Axis = js.native
  
  var xAxis: Nvd3Axis = js.native
  
  var y2Axis: Nvd3Axis = js.native
  
  var yAxis: Nvd3Axis = js.native
}
