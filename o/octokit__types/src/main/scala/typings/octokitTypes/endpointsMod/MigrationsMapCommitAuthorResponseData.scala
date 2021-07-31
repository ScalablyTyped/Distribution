package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsMapCommitAuthorResponseData extends StObject {
  
  var email: String
  
  var id: Double
  
  var import_url: String
  
  var name: String
  
  var remote_id: String
  
  var remote_name: String
  
  var url: String
}
object MigrationsMapCommitAuthorResponseData {
  
  @scala.inline
  def apply(
    email: String,
    id: Double,
    import_url: String,
    name: String,
    remote_id: String,
    remote_name: String,
    url: String
  ): MigrationsMapCommitAuthorResponseData = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], import_url = import_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote_id = remote_id.asInstanceOf[js.Any], remote_name = remote_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsMapCommitAuthorResponseData]
  }
  
  @scala.inline
  implicit class MigrationsMapCommitAuthorResponseDataMutableBuilder[Self <: MigrationsMapCommitAuthorResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport_url(value: String): Self = StObject.set(x, "import_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote_id(value: String): Self = StObject.set(x, "remote_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote_name(value: String): Self = StObject.set(x, "remote_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
