package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Word.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait accessDenied
    extends officeDashJsLib.WordNs.ErrorCodes
  
  @js.native
  sealed trait generalException
    extends officeDashJsLib.WordNs.ErrorCodes
  
  @js.native
  sealed trait invalidArgument
    extends officeDashJsLib.WordNs.ErrorCodes
  
  @js.native
  sealed trait itemNotFound
    extends officeDashJsLib.WordNs.ErrorCodes
  
  @js.native
  sealed trait notImplemented
    extends officeDashJsLib.WordNs.ErrorCodes
  
  /* "AccessDenied" */ val accessDenied: accessDenied with java.lang.String = js.native
  /* "GeneralException" */ val generalException: generalException with java.lang.String = js.native
  /* "InvalidArgument" */ val invalidArgument: invalidArgument with java.lang.String = js.native
  /* "ItemNotFound" */ val itemNotFound: itemNotFound with java.lang.String = js.native
  /* "NotImplemented" */ val notImplemented: notImplemented with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.ErrorCodes with java.lang.String] = js.native
}

