package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AsyncResultStatus extends StObject
/**
  * Specifies the result of an asynchronous call.
  * 
  * @remarks
  * 
  * Returned by the `status` property of the {@link Office.AsyncResult | AsyncResult} object.
  */
@JSGlobal("Office.AsyncResultStatus")
@js.native
object AsyncResultStatus extends StObject {
  
  /**
    * The call failed, check the error object.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with AsyncResultStatus
  
  /**
    * The call succeeded.
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with AsyncResultStatus
}
