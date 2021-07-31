package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeScanningUploadSarifEndpoint extends StObject {
  
  /**
    * The base directory used in the analysis, as it appears in the SARIF file.
    * This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their correct location in the repository.
    */
  var checkout_uri: js.UndefOr[String] = js.undefined
  
  /**
    * The commit SHA of the code scanning analysis file.
    */
  var commit_sha: String
  
  var owner: String
  
  /**
    * The full Git reference of the code scanning analysis file, formatted as `refs/heads/<branch name>`.
    */
  var ref: String
  
  var repo: String
  
  /**
    * A Base64 string representing the SARIF file to upload. You must first compress your SARIF file using [`gzip`](http://www.gnu.org/software/gzip/manual/gzip.html) and then translate the contents of the file into a Base64 encoding string.
    */
  var sarif: String
  
  /**
    * The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the tool used to generate the code scanning analysis alert.
    */
  var tool_name: String
}
object CodeScanningUploadSarifEndpoint {
  
  @scala.inline
  def apply(commit_sha: String, owner: String, ref: String, repo: String, sarif: String, tool_name: String): CodeScanningUploadSarifEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sarif = sarif.asInstanceOf[js.Any], tool_name = tool_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningUploadSarifEndpoint]
  }
  
  @scala.inline
  implicit class CodeScanningUploadSarifEndpointMutableBuilder[Self <: CodeScanningUploadSarifEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckout_uri(value: String): Self = StObject.set(x, "checkout_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckout_uriUndefined: Self = StObject.set(x, "checkout_uri", js.undefined)
    
    @scala.inline
    def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSarif(value: String): Self = StObject.set(x, "sarif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
    
    @scala.inline
    def setTool_name(value: String): Self = StObject.set(x, "tool_name", value.asInstanceOf[js.Any])
  }
}
