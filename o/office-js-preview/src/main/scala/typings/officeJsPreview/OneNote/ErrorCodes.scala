package typings.officeJsPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCodes extends js.Object
@JSGlobal("OneNote.ErrorCodes")
@js.native
object ErrorCodes extends js.Object {
  
  @js.native
  sealed trait generalException extends ErrorCodes
  
  @js.native
  sealed trait operationAborted extends ErrorCodes
}
