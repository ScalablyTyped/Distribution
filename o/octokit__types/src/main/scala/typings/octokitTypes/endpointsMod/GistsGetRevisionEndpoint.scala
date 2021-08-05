package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsGetRevisionEndpoint extends StObject {
  
  var gist_id: String
  
  var sha: String
}
object GistsGetRevisionEndpoint {
  
  inline def apply(gist_id: String, sha: String): GistsGetRevisionEndpoint = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetRevisionEndpoint]
  }
  
  extension [Self <: GistsGetRevisionEndpoint](x: Self) {
    
    inline def setGist_id(value: String): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
