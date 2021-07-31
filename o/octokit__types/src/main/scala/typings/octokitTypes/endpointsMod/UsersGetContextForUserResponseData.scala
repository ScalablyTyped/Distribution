package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Octicon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersGetContextForUserResponseData extends StObject {
  
  var contexts: js.Array[Octicon]
}
object UsersGetContextForUserResponseData {
  
  @scala.inline
  def apply(contexts: js.Array[Octicon]): UsersGetContextForUserResponseData = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserResponseData]
  }
  
  @scala.inline
  implicit class UsersGetContextForUserResponseDataMutableBuilder[Self <: UsersGetContextForUserResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[Octicon]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsVarargs(value: Octicon*): Self = StObject.set(x, "contexts", js.Array(value :_*))
  }
}
