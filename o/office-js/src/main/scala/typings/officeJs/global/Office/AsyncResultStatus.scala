package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.AsyncResultStatus & Double] = js.native
  
  /* 1 */ val Failed: typings.officeJs.Office.AsyncResultStatus.Failed & Double = js.native
  
  /* 0 */ val Succeeded: typings.officeJs.Office.AsyncResultStatus.Succeeded & Double = js.native
}
