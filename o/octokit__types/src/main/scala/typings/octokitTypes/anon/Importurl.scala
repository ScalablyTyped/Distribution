package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Importurl extends StObject {
  
  var email: String = js.native
  
  var id: Double = js.native
  
  var import_url: String = js.native
  
  var name: String = js.native
  
  var remote_id: String = js.native
  
  var remote_name: String = js.native
  
  var url: String = js.native
}
object Importurl {
  
  @scala.inline
  def apply(
    email: String,
    id: Double,
    import_url: String,
    name: String,
    remote_id: String,
    remote_name: String,
    url: String
  ): Importurl = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], import_url = import_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote_id = remote_id.asInstanceOf[js.Any], remote_name = remote_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Importurl]
  }
  
  @scala.inline
  implicit class ImporturlMutableBuilder[Self <: Importurl] (val x: Self) extends AnyVal {
    
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
