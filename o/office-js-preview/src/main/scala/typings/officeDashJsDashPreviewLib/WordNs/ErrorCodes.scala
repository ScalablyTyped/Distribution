package typings
package officeDashJsDashPreviewLib.WordNs

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
    extends officeDashJsDashPreviewLib.WordNs.ErrorCodes
  
  @js.native
  sealed trait generalException
    extends officeDashJsDashPreviewLib.WordNs.ErrorCodes
  
  @js.native
  sealed trait invalidArgument
    extends officeDashJsDashPreviewLib.WordNs.ErrorCodes
  
  @js.native
  sealed trait itemNotFound
    extends officeDashJsDashPreviewLib.WordNs.ErrorCodes
  
  @js.native
  sealed trait notImplemented
    extends officeDashJsDashPreviewLib.WordNs.ErrorCodes
  
  /* "AccessDenied" */ val accessDenied: accessDenied with java.lang.String = js.native
  /* "GeneralException" */ val generalException: generalException with java.lang.String = js.native
  /* "InvalidArgument" */ val invalidArgument: invalidArgument with java.lang.String = js.native
  /* "ItemNotFound" */ val itemNotFound: itemNotFound with java.lang.String = js.native
  /* "NotImplemented" */ val notImplemented: notImplemented with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.ErrorCodes with java.lang.String] = js.native
}

