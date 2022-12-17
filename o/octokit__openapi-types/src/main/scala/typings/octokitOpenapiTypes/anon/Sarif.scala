package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sarif extends StObject {
  
  /**
    * Format: uri
    * @description The base directory used in the analysis, as it appears in the SARIF file.
    * This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their correct location in the repository.
    * @example file:///github/workspace/
    */
  var checkout_uri: js.UndefOr[String] = js.undefined
  
  var commit_sha: String
  
  var ref: String
  
  var sarif: String
  
  /**
    * Format: date-time
    * @description The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.undefined
  
  /** @description The name of the tool used to generate the code scanning analysis. If this parameter is not used, the tool name defaults to "API". If the uploaded SARIF contains a tool GUID, this will be available for filtering using the `tool_guid` parameter of operations such as `GET /repos/{owner}/{repo}/code-scanning/alerts`. */
  var tool_name: js.UndefOr[String] = js.undefined
}
object Sarif {
  
  inline def apply(commit_sha: String, ref: String, sarif: String): Sarif = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sarif = sarif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sarif]
  }
  
  extension [Self <: Sarif](x: Self) {
    
    inline def setCheckout_uri(value: String): Self = StObject.set(x, "checkout_uri", value.asInstanceOf[js.Any])
    
    inline def setCheckout_uriUndefined: Self = StObject.set(x, "checkout_uri", js.undefined)
    
    inline def setCommit_sha(value: String): Self = StObject.set(x, "commit_sha", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSarif(value: String): Self = StObject.set(x, "sarif", value.asInstanceOf[js.Any])
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
    
    inline def setTool_name(value: String): Self = StObject.set(x, "tool_name", value.asInstanceOf[js.Any])
    
    inline def setTool_nameUndefined: Self = StObject.set(x, "tool_name", js.undefined)
  }
}
