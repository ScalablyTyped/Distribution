package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueriesResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#listQueriesResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Next page's pagination token if one exists. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Retrieved queries. */
  var queries: js.UndefOr[js.Array[Query]] = js.native
}
object ListQueriesResponse {
  
  @scala.inline
  def apply(): ListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueriesResponse]
  }
  
  @scala.inline
  implicit class ListQueriesResponseMutableBuilder[Self <: ListQueriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setQueries(value: js.Array[Query]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: Query*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
