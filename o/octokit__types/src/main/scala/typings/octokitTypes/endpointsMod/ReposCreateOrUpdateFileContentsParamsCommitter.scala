package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateOrUpdateFileContentsParamsCommitter extends StObject {
  
  var email: String
  
  var name: String
}
object ReposCreateOrUpdateFileContentsParamsCommitter {
  
  @scala.inline
  def apply(email: String, name: String): ReposCreateOrUpdateFileContentsParamsCommitter = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsParamsCommitter]
  }
  
  @scala.inline
  implicit class ReposCreateOrUpdateFileContentsParamsCommitterMutableBuilder[Self <: ReposCreateOrUpdateFileContentsParamsCommitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
