package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStepsResponse extends StObject {
  
  /** A continuation token to resume the query at the next item. If set, indicates that there are more steps to read, by calling list again with this value in the page_token field. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Steps. */
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
}
object ListStepsResponse {
  
  @scala.inline
  def apply(): ListStepsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStepsResponse]
  }
  
  @scala.inline
  implicit class ListStepsResponseMutableBuilder[Self <: ListStepsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
