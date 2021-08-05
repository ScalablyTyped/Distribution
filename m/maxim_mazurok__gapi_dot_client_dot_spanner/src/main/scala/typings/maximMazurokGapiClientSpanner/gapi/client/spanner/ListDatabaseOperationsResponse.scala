package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabaseOperationsResponse extends StObject {
  
  /** `next_page_token` can be sent in a subsequent ListDatabaseOperations call to fetch more of the matching metadata. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of matching database long-running operations. Each operation's name will be prefixed by the database's name. The operation's metadata field type `metadata.type_url`
    * describes the type of the metadata.
    */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
}
object ListDatabaseOperationsResponse {
  
  inline def apply(): ListDatabaseOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatabaseOperationsResponse]
  }
  
  extension [Self <: ListDatabaseOperationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
