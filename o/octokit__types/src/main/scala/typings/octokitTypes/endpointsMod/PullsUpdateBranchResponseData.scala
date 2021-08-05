package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsUpdateBranchResponseData extends StObject {
  
  var message: String
  
  var url: String
}
object PullsUpdateBranchResponseData {
  
  inline def apply(message: String, url: String): PullsUpdateBranchResponseData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateBranchResponseData]
  }
  
  extension [Self <: PullsUpdateBranchResponseData](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
