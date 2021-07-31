package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysiskey extends StObject {
  
  /**
    * Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.
    */
  var analysis_key: String
  
  /**
    * The commit SHA of the code scanning analysis file.
    */
  var commit_sha: String
  
  /**
    * The time that the analysis was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var created_at: String
  
  /**
    * Identifies the variable values associated with the environment in which this analysis was performed.
    */
  var environment: String
  
  var error: String
  
  /**
    * The full Git reference of the code scanning analysis file, formatted as `refs/heads/<branch name>`.
    */
  var ref: String
  
  /**
    * The name of the tool used to generate the code scanning analysis alert.
    */
  var tool_name: String
}
object Analysiskey {
  
  @scala.inline
  def apply(
    analysis_key: String,
    commit_sha: String,
    created_at: String,
    environment: String,
    error: String,
    ref: String,
    tool_name: String
  ): Analysiskey = {
    val __obj = js.Dynamic.literal(analysis_key = analysis_key.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tool_name = tool_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analysiskey]
  }
  
  @scala.inline
  implicit class AnalysiskeyMutableBuilder[Self <: Analysiskey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysis_key(value: String): Self = StObject.set(x, "analysis_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool_name(value: String): Self = StObject.set(x, "tool_name", value.asInstanceOf[js.Any])
  }
}
