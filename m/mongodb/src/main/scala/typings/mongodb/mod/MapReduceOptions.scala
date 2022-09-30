package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.Inline
import typings.mongodb.anon.Merge
import typings.mongodb.anon.Reduce
import typings.mongodb.anon.Replace
import typings.mongodb.mongodbStrings.`inline`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapReduceOptions[TKey, TValue]
  extends StObject
     with CommandOperationOptions {
  
  /** Allow driver to bypass schema validation in MongoDB 3.2 or higher. */
  var bypassDocumentValidation: js.UndefOr[Boolean] = js.undefined
  
  /** Finalize function. */
  @JSName("finalize")
  var finalize_FMapReduceOptions: js.UndefOr[(FinalizeFunction[TKey, TValue]) | String] = js.undefined
  
  /** It is possible to make the execution stay in JS. Provided in MongoDB \> 2.0.X. */
  var jsMode: js.UndefOr[Boolean] = js.undefined
  
  /** Keep temporary data. */
  var keeptemp: js.UndefOr[Boolean] = js.undefined
  
  /** Number of objects to return from collection. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /** Sets the output target for the map reduce job. */
  var out: js.UndefOr[`inline` | Inline | Replace | Merge | Reduce] = js.undefined
  
  /** Query filter object. */
  var query: js.UndefOr[Document] = js.undefined
  
  /** Can pass in variables that can be access from map/reduce/finalize. */
  var scope: js.UndefOr[Document] = js.undefined
  
  /** Sorts the input objects using this key. Useful for optimization, like sorting by the emit key for fewer reduces. */
  var sort: js.UndefOr[Sort] = js.undefined
  
  /** Provide statistics on job execution time. */
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object MapReduceOptions {
  
  inline def apply[TKey, TValue](): MapReduceOptions[TKey, TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapReduceOptions[TKey, TValue]]
  }
  
  extension [Self <: MapReduceOptions[?, ?], TKey, TValue](x: Self & (MapReduceOptions[TKey, TValue])) {
    
    inline def setBypassDocumentValidation(value: Boolean): Self = StObject.set(x, "bypassDocumentValidation", value.asInstanceOf[js.Any])
    
    inline def setBypassDocumentValidationUndefined: Self = StObject.set(x, "bypassDocumentValidation", js.undefined)
    
    inline def setFinalize_(value: (FinalizeFunction[TKey, TValue]) | String): Self = StObject.set(x, "finalize", value.asInstanceOf[js.Any])
    
    inline def setFinalize_Function2(value: (TKey, TValue) => TValue): Self = StObject.set(x, "finalize", js.Any.fromFunction2(value))
    
    inline def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
    
    inline def setJsMode(value: Boolean): Self = StObject.set(x, "jsMode", value.asInstanceOf[js.Any])
    
    inline def setJsModeUndefined: Self = StObject.set(x, "jsMode", js.undefined)
    
    inline def setKeeptemp(value: Boolean): Self = StObject.set(x, "keeptemp", value.asInstanceOf[js.Any])
    
    inline def setKeeptempUndefined: Self = StObject.set(x, "keeptemp", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOut(value: `inline` | Inline | Replace | Merge | Reduce): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setQuery(value: Document): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScope(value: Document): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: (String | (js.Tuple2[String, SortDirection]))*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
