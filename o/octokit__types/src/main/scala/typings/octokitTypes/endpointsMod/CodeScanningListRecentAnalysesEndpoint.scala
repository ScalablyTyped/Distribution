package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeScanningListRecentAnalysesEndpoint extends StObject {
  
  var owner: String
  
  /**
    * Set a full Git reference to list alerts for a specific branch. The `ref` must be formatted as `refs/heads/<branch name>`.
    */
  var ref: js.UndefOr[String] = js.undefined
  
  var repo: String
  
  /**
    * Set a single code scanning tool name to filter alerts by tool.
    */
  var tool_name: js.UndefOr[String] = js.undefined
}
object CodeScanningListRecentAnalysesEndpoint {
  
  inline def apply(owner: String, repo: String): CodeScanningListRecentAnalysesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningListRecentAnalysesEndpoint]
  }
  
  extension [Self <: CodeScanningListRecentAnalysesEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setTool_name(value: String): Self = StObject.set(x, "tool_name", value.asInstanceOf[js.Any])
    
    inline def setTool_nameUndefined: Self = StObject.set(x, "tool_name", js.undefined)
  }
}
