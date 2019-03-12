package typings
package nvd3Lib.nvd3Mod.nvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkLinePlus extends SparkLine {
  @JSName("sparkline")
  var sparkline_Original: SparkLine = js.native
  def alignValue(): scala.Boolean = js.native
  def alignValue(value: scala.Boolean): this.type = js.native
  /*Message to display if no data is provided*/
  def noData(): java.lang.String = js.native
  /*Message to display if no data is provided*/
  def noData(value: java.lang.String): this.type = js.native
  def rightAlignValue(): scala.Boolean = js.native
  def rightAlignValue(value: scala.Boolean): this.type = js.native
  /*Shows the last value in the sparkline to the right of the line.*/
  def showLastValue(): scala.Boolean = js.native
  /*Shows the last value in the sparkline to the right of the line.*/
  def showLastValue(value: scala.Boolean): this.type = js.native
  def sparkline(
    selection: d3DashSelectionLib.d3DashSelectionMod.Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def sparkline(
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def xTickFormat(format: java.lang.String): this.type = js.native
  def xTickFormat(format: js.Function1[/* d */ js.Any, java.lang.String]): this.type = js.native
  def xTickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, java.lang.String]): this.type = js.native
  def yTickFormat(format: java.lang.String): this.type = js.native
  def yTickFormat(format: js.Function1[/* d */ js.Any, java.lang.String]): this.type = js.native
  def yTickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, java.lang.String]): this.type = js.native
}

