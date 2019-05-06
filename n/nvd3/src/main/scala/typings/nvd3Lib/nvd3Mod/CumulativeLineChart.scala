package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CumulativeLineChart extends LineChart {
  @JSName("controls")
  var controls_Original: Legend = js.native
  def average(): js.Function1[/* d */ js.Any, scala.Double] = js.native
  def average(func: js.Function1[/* d */ js.Any, scala.Double]): this.type = js.native
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
  def noErrorCheck(): scala.Boolean = js.native
  def noErrorCheck(value: scala.Boolean): this.type = js.native
}

