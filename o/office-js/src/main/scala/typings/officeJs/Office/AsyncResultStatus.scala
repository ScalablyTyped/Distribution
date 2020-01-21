package typings.officeJs.Office

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Failed extends AsyncResultStatus
  
  /**
    * The call succeeded.
    */
  @js.native
  sealed trait Succeeded extends AsyncResultStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AsyncResultStatus with Double] = js.native
  /* 1 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 0 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
}

