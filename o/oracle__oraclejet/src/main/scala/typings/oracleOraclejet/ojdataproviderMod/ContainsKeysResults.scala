package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainsKeysResults[K] extends StObject {
  
  var containsParameters: FetchByKeysParameters[K] = js.native
  
  var results: Set[K] = js.native
}
object ContainsKeysResults {
  
  @scala.inline
  def apply[K](containsParameters: FetchByKeysParameters[K], results: Set[K]): ContainsKeysResults[K] = {
    val __obj = js.Dynamic.literal(containsParameters = containsParameters.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsKeysResults[K]]
  }
  
  @scala.inline
  implicit class ContainsKeysResultsMutableBuilder[Self <: ContainsKeysResults[_], K] (val x: Self with ContainsKeysResults[K]) extends AnyVal {
    
    @scala.inline
    def setContainsParameters(value: FetchByKeysParameters[K]): Self = StObject.set(x, "containsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: Set[K]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
