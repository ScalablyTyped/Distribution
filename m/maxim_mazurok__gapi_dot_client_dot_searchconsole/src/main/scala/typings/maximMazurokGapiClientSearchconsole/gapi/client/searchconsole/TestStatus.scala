package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestStatus extends StObject {
  
  /** Error details if applicable. */
  var details: js.UndefOr[String] = js.native
  
  /** Status of the test. */
  var status: js.UndefOr[String] = js.native
}
object TestStatus {
  
  @scala.inline
  def apply(): TestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestStatus]
  }
  
  @scala.inline
  implicit class TestStatusMutableBuilder[Self <: TestStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
