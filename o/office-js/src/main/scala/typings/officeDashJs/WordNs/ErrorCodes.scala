package typings.officeDashJs.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Word.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait accessDenied extends ErrorCodes
  
  @js.native
  sealed trait generalException extends ErrorCodes
  
  @js.native
  sealed trait invalidArgument extends ErrorCodes
  
  @js.native
  sealed trait itemNotFound extends ErrorCodes
  
  @js.native
  sealed trait notImplemented extends ErrorCodes
  
  /* "AccessDenied" */ val accessDenied: typings.officeDashJs.WordNs.ErrorCodes.accessDenied with String = js.native
  /* "GeneralException" */ val generalException: typings.officeDashJs.WordNs.ErrorCodes.generalException with String = js.native
  /* "InvalidArgument" */ val invalidArgument: typings.officeDashJs.WordNs.ErrorCodes.invalidArgument with String = js.native
  /* "ItemNotFound" */ val itemNotFound: typings.officeDashJs.WordNs.ErrorCodes.itemNotFound with String = js.native
  /* "NotImplemented" */ val notImplemented: typings.officeDashJs.WordNs.ErrorCodes.notImplemented with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
}

