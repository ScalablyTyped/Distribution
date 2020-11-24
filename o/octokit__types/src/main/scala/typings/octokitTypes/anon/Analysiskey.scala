package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analysiskey extends js.Object {
  
  /**
    * Identifies the configuration under which the analysis was executed. For example, in GitHub Actions this includes the workflow filename and job name.
    */
  var analysis_key: String = js.native
  
  /**
    * The commit SHA of the code scanning analysis file.
    */
  var commit_sha: String = js.native
  
  /**
    * The time that the analysis was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var created_at: String = js.native
  
  /**
    * Identifies the variable values associated with the environment in which this analysis was performed.
    */
  var environment: String = js.native
  
  var error: String = js.native
  
  /**
    * The full Git reference of the code scanning analysis file, formatted as `refs/heads/<branch name>`.
    */
  var ref: String = js.native
  
  /**
    * The name of the tool used to generate the code scanning analysis alert.
    */
  var tool_name: String = js.native
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
  implicit class AnalysiskeyOps[Self <: Analysiskey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalysis_key(value: String): Self = this.set("analysis_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit_sha(value: String): Self = this.set("commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool_name(value: String): Self = this.set("tool_name", value.asInstanceOf[js.Any])
  }
}
