package typings.nvd3.nvd3Mod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.d3DashTransition.d3DashTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkLinePlus extends SparkLine {
  @JSName("sparkline")
  var sparkline_Original: SparkLine = js.native
  def alignValue(): Boolean = js.native
  def alignValue(value: Boolean): this.type = js.native
  /*Message to display if no data is provided*/
  def noData(): String = js.native
  /*Message to display if no data is provided*/
  def noData(value: String): this.type = js.native
  def rightAlignValue(): Boolean = js.native
  def rightAlignValue(value: Boolean): this.type = js.native
  /*Shows the last value in the sparkline to the right of the line.*/
  def showLastValue(): Boolean = js.native
  /*Shows the last value in the sparkline to the right of the line.*/
  def showLastValue(value: Boolean): this.type = js.native
  def sparkline(
    selection: Selection[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def sparkline(
    transition: Transition[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def xTickFormat(format: String): this.type = js.native
  def xTickFormat(format: js.Function1[/* d */ js.Any, String]): this.type = js.native
  def xTickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, String]): this.type = js.native
  def yTickFormat(format: String): this.type = js.native
  def yTickFormat(format: js.Function1[/* d */ js.Any, String]): this.type = js.native
  def yTickFormat(format: js.Function2[/* d */ js.Any, /* i */ js.Any, String]): this.type = js.native
}

