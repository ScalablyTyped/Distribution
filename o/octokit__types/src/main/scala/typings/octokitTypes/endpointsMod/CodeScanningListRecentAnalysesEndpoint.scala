package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeScanningListRecentAnalysesEndpoint extends StObject {
  
  var owner: String = js.native
  
  /**
    * Set a full Git reference to list alerts for a specific branch. The `ref` must be formatted as `refs/heads/<branch name>`.
    */
  var ref: js.UndefOr[String] = js.native
  
  var repo: String = js.native
  
  /**
    * Set a single code scanning tool name to filter alerts by tool.
    */
  var tool_name: js.UndefOr[String] = js.native
}
object CodeScanningListRecentAnalysesEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): CodeScanningListRecentAnalysesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningListRecentAnalysesEndpoint]
  }
  
  @scala.inline
  implicit class CodeScanningListRecentAnalysesEndpointMutableBuilder[Self <: CodeScanningListRecentAnalysesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool_name(value: String): Self = StObject.set(x, "tool_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool_nameUndefined: Self = StObject.set(x, "tool_name", js.undefined)
  }
}
