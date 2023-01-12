package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchByOffsetResults[K, D] extends StObject {
  
  var done: Boolean
  
  var fetchParameters: FetchByOffsetParameters[D]
  
  var results: js.Array[Item[K, D]]
}
object FetchByOffsetResults {
  
  inline def apply[K, D](done: Boolean, fetchParameters: FetchByOffsetParameters[D], results: js.Array[Item[K, D]]): FetchByOffsetResults[K, D] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], fetchParameters = fetchParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetResults[K, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchByOffsetResults[?, ?], K, D] (val x: Self & (FetchByOffsetResults[K, D])) extends AnyVal {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setFetchParameters(value: FetchByOffsetParameters[D]): Self = StObject.set(x, "fetchParameters", value.asInstanceOf[js.Any])
    
    inline def setResults(value: js.Array[Item[K, D]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: (Item[K, D])*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
