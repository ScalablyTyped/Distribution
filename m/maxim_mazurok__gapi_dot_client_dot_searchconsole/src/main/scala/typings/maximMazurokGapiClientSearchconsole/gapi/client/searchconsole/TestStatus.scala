package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestStatus extends StObject {
  
  /** Error details if applicable. */
  var details: js.UndefOr[String] = js.undefined
  
  /** Status of the test. */
  var status: js.UndefOr[String] = js.undefined
}
object TestStatus {
  
  inline def apply(): TestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestStatus] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
