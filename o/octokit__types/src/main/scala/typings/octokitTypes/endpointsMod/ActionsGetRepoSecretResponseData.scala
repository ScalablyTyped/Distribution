package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsGetRepoSecretResponseData extends StObject {
  
  var created_at: String = js.native
  
  var name: String = js.native
  
  var updated_at: String = js.native
}
object ActionsGetRepoSecretResponseData {
  
  @scala.inline
  def apply(created_at: String, name: String, updated_at: String): ActionsGetRepoSecretResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetRepoSecretResponseData]
  }
  
  @scala.inline
  implicit class ActionsGetRepoSecretResponseDataMutableBuilder[Self <: ActionsGetRepoSecretResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
