package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("OneNote.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait generalException
    extends officeDashJsLib.OneNoteNs.ErrorCodes
  
  /* "GeneralException" */ val generalException: generalException with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OneNoteNs.ErrorCodes with java.lang.String] = js.native
}

