package typings.nvd3.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CumulativeLineChart
  extends StObject
     with LineChart {
  
  def average(): js.Function1[/* d */ js.Any, Double] = js.native
  def average(func: js.Function1[/* d */ js.Any, Double]): this.type = js.native
  
  def controls(
    selection: Selection_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  def controls(
    transition: Transition_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("controls")
  var controls_Original: Legend = js.native
  
  def noErrorCheck(): Boolean = js.native
  def noErrorCheck(value: Boolean): this.type = js.native
}
