package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

/**
  * Specifies whether filtering from the host application is applied when the data is retrieved.
  */
@JSGlobal("Office.FilterType")
@js.native
object FilterType extends js.Object {
  /**
    * Return all data (not filtered by the host application).
    */
  @js.native
  sealed trait All
    extends officeDashJsLib.OfficeNs.FilterType
  
  /**
    * Return only the visible data (as filtered by the host application).
    */
  @js.native
  sealed trait OnlyVisible
    extends officeDashJsLib.OfficeNs.FilterType
  
  /* 0 */ val All: All with scala.Double = js.native
  /* 1 */ val OnlyVisible: OnlyVisible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsLib.OfficeNs.FilterType with scala.Double] = js.native
}

