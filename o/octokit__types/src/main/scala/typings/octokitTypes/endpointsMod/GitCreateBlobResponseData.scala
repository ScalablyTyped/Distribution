package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCreateBlobResponseData extends StObject {
  
  var sha: String
  
  var url: String
}
object GitCreateBlobResponseData {
  
  inline def apply(sha: String, url: String): GitCreateBlobResponseData = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateBlobResponseData]
  }
  
  extension [Self <: GitCreateBlobResponseData](x: Self) {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
