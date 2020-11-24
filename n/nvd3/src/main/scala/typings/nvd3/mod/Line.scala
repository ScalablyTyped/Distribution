package typings.nvd3.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends Scatter {
  
  /*A provided function that allows a line to be non-continuous when not defined.*/
  def defined(): js.Function2[/* d */ js.Any, /* i */ Double, Boolean] = js.native
  /*A provided function that allows a line to be non-continuous when not defined.*/
  def defined(func: js.Function2[/* d */ js.Any, /* i */ Double, Boolean]): this.type = js.native
  
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(): String = js.native
  /*controls the line interpolation between points, many options exist, see the D3 reference:*/
  def interpolate(value: String): this.type = js.native
  
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(): js.Function1[/* d */ js.Any, Boolean] = js.native
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(func: js.Function1[/* d */ js.Any, Boolean]): this.type = js.native
  /*Function to define if a line is a normal line or if it fills in the area. Notice the default gets the value from the line's definition in data. If a non-function is given, it the value is used for all lines.*/
  def isArea(value: Boolean): this.type = js.native
  
  def scatter(
    selection: Selection_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  def scatter(
    transition: Transition_[
      _ | js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    args: js.Any*
  ): js.Any = js.native
  @JSName("scatter")
  var scatter_Original: Scatter = js.native
}
