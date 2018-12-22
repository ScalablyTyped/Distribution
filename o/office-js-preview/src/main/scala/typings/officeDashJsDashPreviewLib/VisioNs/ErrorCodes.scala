package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Visio.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait accessDenied
    extends officeDashJsDashPreviewLib.VisioNs.ErrorCodes
  
  @js.native
  sealed trait generalException
    extends officeDashJsDashPreviewLib.VisioNs.ErrorCodes
  
  @js.native
  sealed trait invalidArgument
    extends officeDashJsDashPreviewLib.VisioNs.ErrorCodes
  
  @js.native
  sealed trait itemNotFound
    extends officeDashJsDashPreviewLib.VisioNs.ErrorCodes
  
  @js.native
  sealed trait notImplemented
    extends officeDashJsDashPreviewLib.VisioNs.ErrorCodes
  
  @js.native
  sealed trait unsupportedOperation
    extends officeDashJsDashPreviewLib.VisioNs.ErrorCodes
  
  /* "AccessDenied" */ val accessDenied: accessDenied with java.lang.String = js.native
  /* "GeneralException" */ val generalException: generalException with java.lang.String = js.native
  /* "InvalidArgument" */ val invalidArgument: invalidArgument with java.lang.String = js.native
  /* "ItemNotFound" */ val itemNotFound: itemNotFound with java.lang.String = js.native
  /* "NotImplemented" */ val notImplemented: notImplemented with java.lang.String = js.native
  /* "UnsupportedOperation" */ val unsupportedOperation: unsupportedOperation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.VisioNs.ErrorCodes with java.lang.String] = js.native
}

