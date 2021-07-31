package typings.nvd3.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nvd3.mod.Nvd3Element because Already inherited
- typings.nvd3.mod.Chart because var conflicts: dispatch. Inlined state, interactiveLayer */ @js.native
trait SunburstChart
  extends StObject
     with Sunburst {
  
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(): js.Any = js.native
  /*No longer used.Use chart.dispatch.changeState(...) instead*/
  def defaultState(value: js.Any): this.type = js.native
  
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(): Double = js.native
  /*Duration in ms to take when updating chart. For things like bar charts, each bar can animate by itself but the total time taken should be this value.*/
  def duration(value: Double): this.type = js.native
  
  var interactiveLayer: InteractiveLayer = js.native
  
  /*Message to display if no data is provided*/
  def noData(): String = js.native
  /*Message to display if no data is provided*/
  def noData(value: String): this.type = js.native
  
  var state: State = js.native
  
  def sunburst(
    selection: Selection_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  def sunburst(
    transition: Transition_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("sunburst")
  var sunburst_Original: Sunburst = js.native
  
  var tooltip: Tooltip = js.native
}
