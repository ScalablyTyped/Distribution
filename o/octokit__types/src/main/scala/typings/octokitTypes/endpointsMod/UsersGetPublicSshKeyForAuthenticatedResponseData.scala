package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersGetPublicSshKeyForAuthenticatedResponseData extends StObject {
  
  var key: String = js.native
  
  var key_id: String = js.native
}
object UsersGetPublicSshKeyForAuthenticatedResponseData {
  
  @scala.inline
  def apply(key: String, key_id: String): UsersGetPublicSshKeyForAuthenticatedResponseData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetPublicSshKeyForAuthenticatedResponseData]
  }
  
  @scala.inline
  implicit class UsersGetPublicSshKeyForAuthenticatedResponseDataMutableBuilder[Self <: UsersGetPublicSshKeyForAuthenticatedResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
  }
}
