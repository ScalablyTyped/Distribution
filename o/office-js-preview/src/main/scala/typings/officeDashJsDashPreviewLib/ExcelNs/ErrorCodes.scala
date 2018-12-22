package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Excel.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait accessDenied
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait apiNotFound
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait conflict
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait generalException
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait insertDeleteConflict
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait invalidArgument
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait invalidBinding
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait invalidOperation
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait invalidOperationInCellEditMode
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait invalidReference
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait invalidSelection
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait itemAlreadyExists
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait itemNotFound
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait nonBlankCellOffSheet
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait notImplemented
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  @js.native
  sealed trait unsupportedOperation
    extends officeDashJsDashPreviewLib.ExcelNs.ErrorCodes
  
  /* "AccessDenied" */ val accessDenied: accessDenied with java.lang.String = js.native
  /* "ApiNotFound" */ val apiNotFound: apiNotFound with java.lang.String = js.native
  /* "Conflict" */ val conflict: conflict with java.lang.String = js.native
  /* "GeneralException" */ val generalException: generalException with java.lang.String = js.native
  /* "InsertDeleteConflict" */ val insertDeleteConflict: insertDeleteConflict with java.lang.String = js.native
  /* "InvalidArgument" */ val invalidArgument: invalidArgument with java.lang.String = js.native
  /* "InvalidBinding" */ val invalidBinding: invalidBinding with java.lang.String = js.native
  /* "InvalidOperation" */ val invalidOperation: invalidOperation with java.lang.String = js.native
  /* "InvalidOperationInCellEditMode" */ val invalidOperationInCellEditMode: invalidOperationInCellEditMode with java.lang.String = js.native
  /* "InvalidReference" */ val invalidReference: invalidReference with java.lang.String = js.native
  /* "InvalidSelection" */ val invalidSelection: invalidSelection with java.lang.String = js.native
  /* "ItemAlreadyExists" */ val itemAlreadyExists: itemAlreadyExists with java.lang.String = js.native
  /* "ItemNotFound" */ val itemNotFound: itemNotFound with java.lang.String = js.native
  /* "NonBlankCellOffSheet" */ val nonBlankCellOffSheet: nonBlankCellOffSheet with java.lang.String = js.native
  /* "NotImplemented" */ val notImplemented: notImplemented with java.lang.String = js.native
  /* "UnsupportedOperation" */ val unsupportedOperation: unsupportedOperation with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ErrorCodes with java.lang.String] = js.native
}

