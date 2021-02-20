package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerConfig extends StObject {
  
  var db: String = js.native
  
  var url: String = js.native
}
object ServerConfig {
  
  @scala.inline
  def apply(db: String, url: String): ServerConfig = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  
  @scala.inline
  implicit class ServerConfigMutableBuilder[Self <: ServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
