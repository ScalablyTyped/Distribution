package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateOrUpdateFileContentsParamsAuthor extends StObject {
  
  var email: String
  
  var name: String
}
object ReposCreateOrUpdateFileContentsParamsAuthor {
  
  inline def apply(email: String, name: String): ReposCreateOrUpdateFileContentsParamsAuthor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsParamsAuthor]
  }
  
  extension [Self <: ReposCreateOrUpdateFileContentsParamsAuthor](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
