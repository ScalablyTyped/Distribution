package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposMergeResponse409Data extends StObject {
  
  var message: String
}
object ReposMergeResponse409Data {
  
  inline def apply(message: String): ReposMergeResponse409Data = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeResponse409Data]
  }
  
  extension [Self <: ReposMergeResponse409Data](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
