package typings.officeJsPreview.OneNote

import org.scalablytyped.runtime.TopLevel
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
  
  @js.native
  sealed trait operationAborted extends ErrorCodes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
  /* "GeneralException" */ @js.native
  object generalException extends TopLevel[generalException with String]
  
  /* "OperationAborted" */ @js.native
  object operationAborted extends TopLevel[operationAborted with String]
  
}

