package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.ErrorCodes.accessDenied
import typings.officeDashJs.Excel.ErrorCodes.apiNotFound
import typings.officeDashJs.Excel.ErrorCodes.conflict
import typings.officeDashJs.Excel.ErrorCodes.generalException
import typings.officeDashJs.Excel.ErrorCodes.insertDeleteConflict
import typings.officeDashJs.Excel.ErrorCodes.invalidArgument
import typings.officeDashJs.Excel.ErrorCodes.invalidBinding
import typings.officeDashJs.Excel.ErrorCodes.invalidOperation
import typings.officeDashJs.Excel.ErrorCodes.invalidOperationInCellEditMode
import typings.officeDashJs.Excel.ErrorCodes.invalidReference
import typings.officeDashJs.Excel.ErrorCodes.invalidSelection
import typings.officeDashJs.Excel.ErrorCodes.itemAlreadyExists
import typings.officeDashJs.Excel.ErrorCodes.itemNotFound
import typings.officeDashJs.Excel.ErrorCodes.nonBlankCellOffSheet
import typings.officeDashJs.Excel.ErrorCodes.notImplemented
import typings.officeDashJs.Excel.ErrorCodes.rangeExceedsLimit
import typings.officeDashJs.Excel.ErrorCodes.requestAborted
import typings.officeDashJs.Excel.ErrorCodes.unsupportedOperation
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
  sealed trait requestAborted extends ErrorCodes
  
  @js.native
  sealed trait unsupportedOperation extends ErrorCodes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
  /* "AccessDenied" */ @js.native
  object accessDenied extends TopLevel[accessDenied with String]
  
  /* "ApiNotFound" */ @js.native
  object apiNotFound extends TopLevel[apiNotFound with String]
  
  /* "Conflict" */ @js.native
  object conflict extends TopLevel[conflict with String]
  
  /* "GeneralException" */ @js.native
  object generalException extends TopLevel[generalException with String]
  
  /* "InsertDeleteConflict" */ @js.native
  object insertDeleteConflict extends TopLevel[insertDeleteConflict with String]
  
  /* "InvalidArgument" */ @js.native
  object invalidArgument extends TopLevel[invalidArgument with String]
  
  /* "InvalidBinding" */ @js.native
  object invalidBinding extends TopLevel[invalidBinding with String]
  
  /* "InvalidOperation" */ @js.native
  object invalidOperation extends TopLevel[invalidOperation with String]
  
  /* "InvalidOperationInCellEditMode" */ @js.native
  object invalidOperationInCellEditMode extends TopLevel[invalidOperationInCellEditMode with String]
  
  /* "InvalidReference" */ @js.native
  object invalidReference extends TopLevel[invalidReference with String]
  
  /* "InvalidSelection" */ @js.native
  object invalidSelection extends TopLevel[invalidSelection with String]
  
  /* "ItemAlreadyExists" */ @js.native
  object itemAlreadyExists extends TopLevel[itemAlreadyExists with String]
  
  /* "ItemNotFound" */ @js.native
  object itemNotFound extends TopLevel[itemNotFound with String]
  
  /* "NonBlankCellOffSheet" */ @js.native
  object nonBlankCellOffSheet extends TopLevel[nonBlankCellOffSheet with String]
  
  /* "NotImplemented" */ @js.native
  object notImplemented extends TopLevel[notImplemented with String]
  
  /* "RangeExceedsLimit" */ @js.native
  object rangeExceedsLimit extends TopLevel[rangeExceedsLimit with String]
  
  /* "RequestAborted" */ @js.native
  object requestAborted extends TopLevel[requestAborted with String]
  
  /* "UnsupportedOperation" */ @js.native
  object unsupportedOperation extends TopLevel[unsupportedOperation with String]
  
}

