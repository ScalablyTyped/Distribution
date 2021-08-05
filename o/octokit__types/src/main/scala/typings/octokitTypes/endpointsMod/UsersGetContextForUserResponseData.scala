package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Octicon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersGetContextForUserResponseData extends StObject {
  
  var contexts: js.Array[Octicon]
}
object UsersGetContextForUserResponseData {
  
  inline def apply(contexts: js.Array[Octicon]): UsersGetContextForUserResponseData = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserResponseData]
  }
  
  extension [Self <: UsersGetContextForUserResponseData](x: Self) {
    
    inline def setContexts(value: js.Array[Octicon]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: Octicon*): Self = StObject.set(x, "contexts", js.Array(value :_*))
  }
}
