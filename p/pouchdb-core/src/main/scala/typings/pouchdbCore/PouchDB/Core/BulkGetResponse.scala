package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Docs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkGetResponse[Content /* <: js.Object */] extends StObject {
  
  var results: js.Array[Docs[Content]] = js.native
}
object BulkGetResponse {
  
  @scala.inline
  def apply[Content /* <: js.Object */](results: js.Array[Docs[Content]]): BulkGetResponse[Content] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetResponse[Content]]
  }
  
  @scala.inline
  implicit class BulkGetResponseMutableBuilder[Self <: BulkGetResponse[_], Content /* <: js.Object */] (val x: Self with BulkGetResponse[Content]) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[Docs[Content]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: Docs[Content]*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
