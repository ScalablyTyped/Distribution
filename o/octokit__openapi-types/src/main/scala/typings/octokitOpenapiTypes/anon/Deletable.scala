package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deletable extends StObject {
  
  var analysis_key: String
  
  var category: js.UndefOr[String] = js.undefined
  
  var commit_sha: String
  
  var created_at: String
  
  var deletable: Boolean
  
  var environment: String
  
  /** @example error reading field xyz */
  var error: String
  
  /** @description Unique identifier for this analysis. */
  var id: Double
  
  var ref: String
  
  /** @description The total number of results in the analysis. */
  var results_count: Double
  
  /** @description The total number of rules used in the analysis. */
  var rules_count: Double
  
  var sarif_id: String
  
  var tool: Version
  
  var url: String
  
  /**
    * @description Warning generated when processing the analysis
    * @example 123 results were ignored
    */
  var warning: String
}
object Deletable {
  
  inline def apply(
    analysis_key: String,
    commit_sha: String,
    created_at: String,
    deletable: Boolean,
    environment: String,
    error: String,
    id: Double,
    ref: String,
    results_count: Double,
    rules_count: Double,
    sarif_id: String,
    tool: Version,
    url: String,
    warning: String
  ): Deletable = {
    val __obj = js.Dynamic.literal(analysis_key = analysis_key.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], results_count = results_count.asInstanceOf[js.Any], rules_count = rules_count.asInstanceOf[js.Any], sarif_id = sarif_id.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deletable]
  }
  
  extension [Self <: Deletable](x: Self) {
    
    inline def setAnalysis_key(value: String): Self = StObject.set(x, "analysis_key", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setResults_count(value: Double): Self = StObject.set(x, "results_count", value.asInstanceOf[js.Any])
    
    inline def setRules_count(value: Double): Self = StObject.set(x, "rules_count", value.asInstanceOf[js.Any])
    
    inline def setSarif_id(value: String): Self = StObject.set(x, "sarif_id", value.asInstanceOf[js.Any])
    
    inline def setTool(value: Version): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
