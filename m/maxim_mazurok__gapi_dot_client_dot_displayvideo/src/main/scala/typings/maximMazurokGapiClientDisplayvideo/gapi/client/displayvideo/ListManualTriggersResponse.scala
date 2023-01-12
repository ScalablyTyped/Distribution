package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManualTriggersResponse extends StObject {
  
  /** The list of manual triggers. This list will be absent if empty. */
  var manualTriggers: js.UndefOr[js.Array[ManualTrigger]] = js.undefined
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListManualTriggers` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListManualTriggersResponse {
  
  inline def apply(): ListManualTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManualTriggersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListManualTriggersResponse] (val x: Self) extends AnyVal {
    
    inline def setManualTriggers(value: js.Array[ManualTrigger]): Self = StObject.set(x, "manualTriggers", value.asInstanceOf[js.Any])
    
    inline def setManualTriggersUndefined: Self = StObject.set(x, "manualTriggers", js.undefined)
    
    inline def setManualTriggersVarargs(value: ManualTrigger*): Self = StObject.set(x, "manualTriggers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
