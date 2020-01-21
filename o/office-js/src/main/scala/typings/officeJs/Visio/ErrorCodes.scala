package typings.officeJs.Visio

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCodes extends js.Object

@JSGlobal("Visio.ErrorCodes")
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
  
  @js.native
  sealed trait unsupportedOperation extends ErrorCodes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCodes with String] = js.native
  /* "AccessDenied" */ @js.native
  object accessDenied extends TopLevel[accessDenied with String]
  
  /* "GeneralException" */ @js.native
  object generalException extends TopLevel[generalException with String]
  
  /* "InvalidArgument" */ @js.native
  object invalidArgument extends TopLevel[invalidArgument with String]
  
  /* "ItemNotFound" */ @js.native
  object itemNotFound extends TopLevel[itemNotFound with String]
  
  /* "NotImplemented" */ @js.native
  object notImplemented extends TopLevel[notImplemented with String]
  
  /* "UnsupportedOperation" */ @js.native
  object unsupportedOperation extends TopLevel[unsupportedOperation with String]
  
}

