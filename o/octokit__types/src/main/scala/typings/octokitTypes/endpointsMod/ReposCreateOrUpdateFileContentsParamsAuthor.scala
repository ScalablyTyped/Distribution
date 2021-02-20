package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateOrUpdateFileContentsParamsAuthor extends StObject {
  
  var email: String = js.native
  
  var name: String = js.native
}
object ReposCreateOrUpdateFileContentsParamsAuthor {
  
  @scala.inline
  def apply(email: String, name: String): ReposCreateOrUpdateFileContentsParamsAuthor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsParamsAuthor]
  }
  
  @scala.inline
  implicit class ReposCreateOrUpdateFileContentsParamsAuthorMutableBuilder[Self <: ReposCreateOrUpdateFileContentsParamsAuthor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
