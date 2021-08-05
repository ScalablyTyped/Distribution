package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposMergeResponse404Data extends StObject {
  
  var message: String
}
object ReposMergeResponse404Data {
  
  inline def apply(message: String): ReposMergeResponse404Data = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeResponse404Data]
  }
  
  extension [Self <: ReposMergeResponse404Data](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
