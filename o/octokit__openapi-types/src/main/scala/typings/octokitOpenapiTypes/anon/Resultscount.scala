package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resultscount extends StObject {
  
  var analysis_key: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-analysis-key'] */ js.Any
  
  var category: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-category'] */ js.Any
  ] = js.undefined
  
  var commit_sha: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-commit-sha'] */ js.Any
  
  var created_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-created-at'] */ js.Any
  
  var deletable: Boolean
  
  var environment: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-environment'] */ js.Any
  
  /** @example error reading field xyz */
  var error: String
  
  /** @description Unique identifier for this analysis. */
  var id: Double
  
  var ref: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-ref'] */ js.Any
  
  /** @description The total number of results in the analysis. */
  var results_count: Double
  
  /** @description The total number of rules used in the analysis. */
  var rules_count: Double
  
  var sarif_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-sarif-id'] */ js.Any
  
  var tool: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool'] */ js.Any
  
  var url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-url'] */ js.Any
  
  /**
    * @description Warning generated when processing the analysis
    * @example 123 results were ignored
    */
  var warning: String
}
object Resultscount {
  
  inline def apply(
    analysis_key: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-analysis-key'] */ js.Any,
    commit_sha: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-commit-sha'] */ js.Any,
    created_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-created-at'] */ js.Any,
    deletable: Boolean,
    environment: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-environment'] */ js.Any,
    error: String,
    id: Double,
    ref: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-ref'] */ js.Any,
    results_count: Double,
    rules_count: Double,
    sarif_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-sarif-id'] */ js.Any,
    tool: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool'] */ js.Any,
    url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-url'] */ js.Any,
    warning: String
  ): Resultscount = {
    val __obj = js.Dynamic.literal(analysis_key = analysis_key.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], results_count = results_count.asInstanceOf[js.Any], rules_count = rules_count.asInstanceOf[js.Any], sarif_id = sarif_id.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resultscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resultscount] (val x: Self) extends AnyVal {
    
    inline def setAnalysis_key(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-analysis-key'] */ js.Any
    ): Self = StObject.set(x, "analysis_key", value.asInstanceOf[js.Any])
    
    inline def setCategory(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-category'] */ js.Any
    ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCommit_sha(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-commit-sha'] */ js.Any
    ): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-created-at'] */ js.Any
    ): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-environment'] */ js.Any
    ): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRef(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-ref'] */ js.Any
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setResults_count(value: Double): Self = StObject.set(x, "results_count", value.asInstanceOf[js.Any])
    
    inline def setRules_count(value: Double): Self = StObject.set(x, "rules_count", value.asInstanceOf[js.Any])
    
    inline def setSarif_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-sarif-id'] */ js.Any
    ): Self = StObject.set(x, "sarif_id", value.asInstanceOf[js.Any])
    
    inline def setTool(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool'] */ js.Any
    ): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-url'] */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
