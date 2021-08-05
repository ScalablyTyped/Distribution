package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateDeploymentResponse409Data extends StObject {
  
  var message: String
}
object ReposCreateDeploymentResponse409Data {
  
  inline def apply(message: String): ReposCreateDeploymentResponse409Data = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDeploymentResponse409Data]
  }
  
  extension [Self <: ReposCreateDeploymentResponse409Data](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
