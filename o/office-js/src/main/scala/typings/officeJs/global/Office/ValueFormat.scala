package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies whether values, such as numbers and dates, returned by the invoked method are returned with their formatting applied.
  *
  * @remarks
  * 
  * For example, if the valueFormat parameter is specified as "formatted", a number formatted as currency, or a date formatted as mm/dd/yy in the 
  * host application will have its formatting preserved. If the valueFormat parameter is specified as "unformatted", a date will be returned in its 
  * underlying sequential serial number form.
  */
@JSGlobal("Office.ValueFormat")
@js.native
object ValueFormat extends js.Object {
  /* 1 */ val Formatted: typings.officeJs.Office.ValueFormat.Formatted with Double = js.native
  /* 0 */ val Unformatted: typings.officeJs.Office.ValueFormat.Unformatted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.ValueFormat with Double] = js.native
}

