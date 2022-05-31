package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainsKeysResults[K] extends StObject {
  
  var containsParameters: FetchByKeysParameters[K]
  
  var results: Set[K]
}
object ContainsKeysResults {
  
  inline def apply[K](containsParameters: FetchByKeysParameters[K], results: Set[K]): ContainsKeysResults[K] = {
    val __obj = js.Dynamic.literal(containsParameters = containsParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsKeysResults[K]]
  }
  
  extension [Self <: ContainsKeysResults[?], K](x: Self & ContainsKeysResults[K]) {
    
    inline def setContainsParameters(value: FetchByKeysParameters[K]): Self = StObject.set(x, "containsParameters", value.asInstanceOf[js.Any])
    
    inline def setResults(value: Set[K]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
