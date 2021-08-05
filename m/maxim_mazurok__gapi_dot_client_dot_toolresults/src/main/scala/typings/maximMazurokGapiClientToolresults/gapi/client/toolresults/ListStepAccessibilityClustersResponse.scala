package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStepAccessibilityClustersResponse extends StObject {
  
  /**
    * A sequence of accessibility suggestions, grouped into clusters. Within the sequence, clusters that belong to the same SuggestionCategory should be adjacent. Within each category,
    * clusters should be ordered by their SuggestionPriority (ERRORs first). The categories should be ordered by their highest priority cluster.
    */
  var clusters: js.UndefOr[js.Array[SuggestionClusterProto]] = js.undefined
  
  /** A full resource name of the step. For example, projects/my-project/histories/bh.1234567890abcdef/executions/ 1234567890123456789/steps/bs.1234567890abcdef Always presents. */
  var name: js.UndefOr[String] = js.undefined
}
object ListStepAccessibilityClustersResponse {
  
  inline def apply(): ListStepAccessibilityClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStepAccessibilityClustersResponse]
  }
  
  extension [Self <: ListStepAccessibilityClustersResponse](x: Self) {
    
    inline def setClusters(value: js.Array[SuggestionClusterProto]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: SuggestionClusterProto*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
