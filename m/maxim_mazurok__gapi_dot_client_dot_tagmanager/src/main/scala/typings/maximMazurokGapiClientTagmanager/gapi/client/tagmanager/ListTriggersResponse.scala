package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTriggersResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** All GTM Triggers of a GTM Container. */
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
}
object ListTriggersResponse {
  
  @scala.inline
  def apply(): ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTriggersResponse]
  }
  
  @scala.inline
  implicit class ListTriggersResponseMutableBuilder[Self <: ListTriggersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTrigger(value: js.Array[Trigger]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setTriggerVarargs(value: Trigger*): Self = StObject.set(x, "trigger", js.Array(value :_*))
  }
}
