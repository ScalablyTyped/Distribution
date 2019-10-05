package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueFormat extends js.Object

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
  /**
    * Return formatted data.
    */
  @js.native
  sealed trait Formatted extends ValueFormat
  
  /**
    * Return unformatted data.
    */
  @js.native
  sealed trait Unformatted extends ValueFormat
  
  /* 1 */ val Formatted: typings.officeDashJsDashPreview.Office.ValueFormat.Formatted with Double = js.native
  /* 0 */ val Unformatted: typings.officeDashJsDashPreview.Office.ValueFormat.Unformatted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueFormat with Double] = js.native
}

