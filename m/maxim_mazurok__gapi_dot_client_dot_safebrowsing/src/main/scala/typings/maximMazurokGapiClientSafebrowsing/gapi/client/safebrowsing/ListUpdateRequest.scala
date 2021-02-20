package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUpdateRequest extends StObject {
  
  /** The constraints associated with this request. */
  var constraints: js.UndefOr[Constraints] = js.native
  
  /** The type of platform at risk by entries present in the list. */
  var platformType: js.UndefOr[String] = js.native
  
  /** The current state of the client for the requested list (the encrypted client state that was received from the last successful list update). */
  var state: js.UndefOr[String] = js.native
  
  /** The types of entries present in the list. */
  var threatEntryType: js.UndefOr[String] = js.native
  
  /** The type of threat posed by entries present in the list. */
  var threatType: js.UndefOr[String] = js.native
}
object ListUpdateRequest {
  
  @scala.inline
  def apply(): ListUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUpdateRequest]
  }
  
  @scala.inline
  implicit class ListUpdateRequestMutableBuilder[Self <: ListUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraints(value: Constraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    @scala.inline
    def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    @scala.inline
    def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
  }
}
