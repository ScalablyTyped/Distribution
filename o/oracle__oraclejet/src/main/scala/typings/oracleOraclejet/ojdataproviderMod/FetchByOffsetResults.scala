package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchByOffsetResults[K, D] extends StObject {
  
  var done: Boolean = js.native
  
  var fetchParameters: FetchByOffsetParameters[D] = js.native
  
  var results: js.Array[Item[K, D]] = js.native
}
object FetchByOffsetResults {
  
  @scala.inline
  def apply[K, D](done: Boolean, fetchParameters: FetchByOffsetParameters[D], results: js.Array[Item[K, D]]): FetchByOffsetResults[K, D] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetResults[K, D]]
  }
  
  @scala.inline
  implicit class FetchByOffsetResultsMutableBuilder[Self <: FetchByOffsetResults[_, _], K, D] (val x: Self with (FetchByOffsetResults[K, D])) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchParameters(value: FetchByOffsetParameters[D]): Self = StObject.set(x, "fetchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: js.Array[Item[K, D]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: (Item[K, D])*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
