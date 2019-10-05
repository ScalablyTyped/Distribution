package typings.officeDashJs.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("OneNote.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait generalException extends ErrorCodes
  
  /* "GeneralException" */ val generalException: typings.officeDashJs.OneNote.ErrorCodes.generalException with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
}

