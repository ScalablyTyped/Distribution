package typings.officeDashJs.ExcelNs

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
  
  /* "AccessDenied" */ val accessDenied: typings.officeDashJs.ExcelNs.ErrorCodes.accessDenied with String = js.native
  /* "ApiNotFound" */ val apiNotFound: typings.officeDashJs.ExcelNs.ErrorCodes.apiNotFound with String = js.native
  /* "Conflict" */ val conflict: typings.officeDashJs.ExcelNs.ErrorCodes.conflict with String = js.native
  /* "GeneralException" */ val generalException: typings.officeDashJs.ExcelNs.ErrorCodes.generalException with String = js.native
  /* "InsertDeleteConflict" */ val insertDeleteConflict: typings.officeDashJs.ExcelNs.ErrorCodes.insertDeleteConflict with String = js.native
  /* "InvalidArgument" */ val invalidArgument: typings.officeDashJs.ExcelNs.ErrorCodes.invalidArgument with String = js.native
  /* "InvalidBinding" */ val invalidBinding: typings.officeDashJs.ExcelNs.ErrorCodes.invalidBinding with String = js.native
  /* "InvalidOperation" */ val invalidOperation: typings.officeDashJs.ExcelNs.ErrorCodes.invalidOperation with String = js.native
  /* "InvalidOperationInCellEditMode" */ val invalidOperationInCellEditMode: typings.officeDashJs.ExcelNs.ErrorCodes.invalidOperationInCellEditMode with String = js.native
  /* "InvalidReference" */ val invalidReference: typings.officeDashJs.ExcelNs.ErrorCodes.invalidReference with String = js.native
  /* "InvalidSelection" */ val invalidSelection: typings.officeDashJs.ExcelNs.ErrorCodes.invalidSelection with String = js.native
  /* "ItemAlreadyExists" */ val itemAlreadyExists: typings.officeDashJs.ExcelNs.ErrorCodes.itemAlreadyExists with String = js.native
  /* "ItemNotFound" */ val itemNotFound: typings.officeDashJs.ExcelNs.ErrorCodes.itemNotFound with String = js.native
  /* "NonBlankCellOffSheet" */ val nonBlankCellOffSheet: typings.officeDashJs.ExcelNs.ErrorCodes.nonBlankCellOffSheet with String = js.native
  /* "NotImplemented" */ val notImplemented: typings.officeDashJs.ExcelNs.ErrorCodes.notImplemented with String = js.native
  /* "RangeExceedsLimit" */ val rangeExceedsLimit: typings.officeDashJs.ExcelNs.ErrorCodes.rangeExceedsLimit with String = js.native
  /* "UnsupportedOperation" */ val unsupportedOperation: typings.officeDashJs.ExcelNs.ErrorCodes.unsupportedOperation with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
}

