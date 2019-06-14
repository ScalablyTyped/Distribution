package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncResultStatus extends js.Object

// Enumerations
/**
  * Specifies the result of an asynchronous call.
  * 
  * @remarks
  * 
  * Returned by the `status` property of the {@link Office.AsyncResult | AsyncResult} object.
  */
@JSGlobal("Office.AsyncResultStatus")
@js.native
object AsyncResultStatus extends js.Object {
  /**
    * The call failed, check the error object.
    */
  @js.native
  sealed trait Failed
    extends officeDashJsDashPreviewLib.OfficeNs.AsyncResultStatus
  
  /**
    * The call succeeded.
    */
  @js.native
  sealed trait Succeeded
    extends officeDashJsDashPreviewLib.OfficeNs.AsyncResultStatus
  
  /* 1 */ val Failed: Failed with scala.Double = js.native
  /* 0 */ val Succeeded: Succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.AsyncResultStatus with scala.Double] = js.native
}

