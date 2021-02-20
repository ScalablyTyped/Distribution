package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesResponse[Content /* <: js.Object */] extends StObject {
  
  var last_seq: Double | String = js.native
  
  var results: js.Array[ChangesResponseChange[Content]] = js.native
  
  var status: String = js.native
}
object ChangesResponse {
  
  @scala.inline
  def apply[Content /* <: js.Object */](last_seq: Double | String, results: js.Array[ChangesResponseChange[Content]], status: String): ChangesResponse[Content] = {
    val __obj = js.Dynamic.literal(last_seq = last_seq.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesResponse[Content]]
  }
  
  @scala.inline
  implicit class ChangesResponseMutableBuilder[Self <: ChangesResponse[_], Content /* <: js.Object */] (val x: Self with ChangesResponse[Content]) extends AnyVal {
    
    @scala.inline
    def setLast_seq(value: Double | String): Self = StObject.set(x, "last_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[ChangesResponseChange[Content]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: ChangesResponseChange[Content]*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
