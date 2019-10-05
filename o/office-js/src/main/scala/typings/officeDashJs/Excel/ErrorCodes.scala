package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Excel.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  @js.native
  sealed trait accessDenied extends ErrorCodes
  
  @js.native
  sealed trait apiNotFound extends ErrorCodes
  
  @js.native
  sealed trait conflict extends ErrorCodes
  
  @js.native
  sealed trait generalException extends ErrorCodes
  
  @js.native
  sealed trait insertDeleteConflict extends ErrorCodes
  
  @js.native
  sealed trait invalidArgument extends ErrorCodes
  
  @js.native
  sealed trait invalidBinding extends ErrorCodes
  
  @js.native
  sealed trait invalidOperation extends ErrorCodes
  
  @js.native
  sealed trait invalidOperationInCellEditMode extends ErrorCodes
  
  @js.native
  sealed trait invalidReference extends ErrorCodes
  
  @js.native
  sealed trait invalidSelection extends ErrorCodes
  
  @js.native
  sealed trait itemAlreadyExists extends ErrorCodes
  
  @js.native
  sealed trait itemNotFound extends ErrorCodes
  
  @js.native
  sealed trait nonBlankCellOffSheet extends ErrorCodes
  
  @js.native
  sealed trait notImplemented extends ErrorCodes
  
  @js.native
  sealed trait rangeExceedsLimit extends ErrorCodes
  
  @js.native
  sealed trait unsupportedOperation extends ErrorCodes
  
  /* "AccessDenied" */ val accessDenied: typings.officeDashJs.Excel.ErrorCodes.accessDenied with String = js.native
  /* "ApiNotFound" */ val apiNotFound: typings.officeDashJs.Excel.ErrorCodes.apiNotFound with String = js.native
  /* "Conflict" */ val conflict: typings.officeDashJs.Excel.ErrorCodes.conflict with String = js.native
  /* "GeneralException" */ val generalException: typings.officeDashJs.Excel.ErrorCodes.generalException with String = js.native
  /* "InsertDeleteConflict" */ val insertDeleteConflict: typings.officeDashJs.Excel.ErrorCodes.insertDeleteConflict with String = js.native
  /* "InvalidArgument" */ val invalidArgument: typings.officeDashJs.Excel.ErrorCodes.invalidArgument with String = js.native
  /* "InvalidBinding" */ val invalidBinding: typings.officeDashJs.Excel.ErrorCodes.invalidBinding with String = js.native
  /* "InvalidOperation" */ val invalidOperation: typings.officeDashJs.Excel.ErrorCodes.invalidOperation with String = js.native
  /* "InvalidOperationInCellEditMode" */ val invalidOperationInCellEditMode: typings.officeDashJs.Excel.ErrorCodes.invalidOperationInCellEditMode with String = js.native
  /* "InvalidReference" */ val invalidReference: typings.officeDashJs.Excel.ErrorCodes.invalidReference with String = js.native
  /* "InvalidSelection" */ val invalidSelection: typings.officeDashJs.Excel.ErrorCodes.invalidSelection with String = js.native
  /* "ItemAlreadyExists" */ val itemAlreadyExists: typings.officeDashJs.Excel.ErrorCodes.itemAlreadyExists with String = js.native
  /* "ItemNotFound" */ val itemNotFound: typings.officeDashJs.Excel.ErrorCodes.itemNotFound with String = js.native
  /* "NonBlankCellOffSheet" */ val nonBlankCellOffSheet: typings.officeDashJs.Excel.ErrorCodes.nonBlankCellOffSheet with String = js.native
  /* "NotImplemented" */ val notImplemented: typings.officeDashJs.Excel.ErrorCodes.notImplemented with String = js.native
  /* "RangeExceedsLimit" */ val rangeExceedsLimit: typings.officeDashJs.Excel.ErrorCodes.rangeExceedsLimit with String = js.native
  /* "UnsupportedOperation" */ val unsupportedOperation: typings.officeDashJs.Excel.ErrorCodes.unsupportedOperation with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
}

