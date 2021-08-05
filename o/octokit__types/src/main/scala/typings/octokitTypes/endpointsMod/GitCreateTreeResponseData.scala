package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCreateTreeResponseData extends StObject {
  
  var sha: String
  
  var tree: js.Array[Mode]
  
  var url: String
}
object GitCreateTreeResponseData {
  
  inline def apply(sha: String, tree: js.Array[Mode], url: String): GitCreateTreeResponseData = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTreeResponseData]
  }
  
  extension [Self <: GitCreateTreeResponseData](x: Self) {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setTree(value: js.Array[Mode]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeVarargs(value: Mode*): Self = StObject.set(x, "tree", js.Array(value :_*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
