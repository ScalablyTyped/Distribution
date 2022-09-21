package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Truncated extends StObject {
  
  var sha: String
  
  /**
    * @description Objects specifying a tree structure
    * @example [
    *   {
    *     "path": "file.rb",
    *     "mode": "100644",
    *     "type": "blob",
    *     "size": 30,
    *     "sha": "44b4fc6d56897b048c772eb4087f854f46256132",
    *     "url": "https://api.github.com/repos/octocat/Hello-World/git/blobs/44b4fc6d56897b048c772eb4087f854f46256132",
    *     "properties": {
    *       "path": {
    *         "type": "string"
    *       },
    *       "mode": {
    *         "type": "string"
    *       },
    *       "type": {
    *         "type": "string"
    *       },
    *       "size": {
    *         "type": "integer"
    *       },
    *       "sha": {
    *         "type": "string"
    *       },
    *       "url": {
    *         "type": "string"
    *       }
    *     },
    *     "required": [
    *       "path",
    *       "mode",
    *       "type",
    *       "sha",
    *       "url",
    *       "size"
    *     ]
    *   }
    * ]
    */
  var tree: js.Array[ModePath]
  
  var truncated: Boolean
  
  /** Format: uri */
  var url: String
}
object Truncated {
  
  inline def apply(sha: String, tree: js.Array[ModePath], truncated: Boolean, url: String): Truncated = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Truncated]
  }
  
  extension [Self <: Truncated](x: Self) {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setTree(value: js.Array[ModePath]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeVarargs(value: ModePath*): Self = StObject.set(x, "tree", js.Array(value*))
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
