package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortDirection extends js.Object

/**
			 * Column Sort Direction
			 */
@JSGlobal("ComponentFramework.PropertyHelper.DataSetApi.SortDirection")
@js.native
object SortDirection extends js.Object {
  @js.native
  sealed trait Ascending
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.SortDirection
  
  @js.native
  sealed trait Descending
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.SortDirection
  
  @js.native
  sealed trait None
    extends powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.SortDirection
  
  /* 0 */ val Ascending: Ascending with scala.Double = js.native
  /* 1 */ val Descending: Descending with scala.Double = js.native
  /* -1 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.SortDirection with scala.Double
  ] = js.native
}

