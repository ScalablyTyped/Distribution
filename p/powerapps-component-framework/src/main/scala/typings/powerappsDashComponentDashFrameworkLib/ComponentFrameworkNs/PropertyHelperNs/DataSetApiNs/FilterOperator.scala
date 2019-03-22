package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOperator extends js.Object

/**
			 * Supported Filter Operator for filtering expression linkage
			 */
@JSGlobal("ComponentFramework.PropertyHelper.DataSetApi.FilterOperator")
@js.native
object FilterOperator extends js.Object {
  @js.native
  sealed trait And
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.FilterOperator
  
  @js.native
  sealed trait Or
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.FilterOperator
  
  /* 0 */ val And: And with scala.Double = js.native
  /* 1 */ val Or: Or with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.FilterOperator with scala.Double
  ] = js.native
}

