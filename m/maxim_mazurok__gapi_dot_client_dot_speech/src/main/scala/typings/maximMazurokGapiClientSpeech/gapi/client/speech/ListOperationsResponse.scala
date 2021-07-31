package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsResponse extends StObject {
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of operations that matches the specified filter in the request. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
}
object ListOperationsResponse {
  
  @scala.inline
  def apply(): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsResponse]
  }
  
  @scala.inline
  implicit class ListOperationsResponseMutableBuilder[Self <: ListOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
