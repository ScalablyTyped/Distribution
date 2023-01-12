package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestDetails extends StObject {
  
  /** Output only. If the TestState is ERROR, then this string will contain human-readable details about the error. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Human-readable, detailed descriptions of the test's progress. For example: "Provisioning a device", "Starting Test". During the course of execution new data may be
    * appended to the end of progress_messages.
    */
  var progressMessages: js.UndefOr[js.Array[String]] = js.undefined
}
object TestDetails {
  
  inline def apply(): TestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestDetails] (val x: Self) extends AnyVal {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setProgressMessages(value: js.Array[String]): Self = StObject.set(x, "progressMessages", value.asInstanceOf[js.Any])
    
    inline def setProgressMessagesUndefined: Self = StObject.set(x, "progressMessages", js.undefined)
    
    inline def setProgressMessagesVarargs(value: String*): Self = StObject.set(x, "progressMessages", js.Array(value*))
  }
}
