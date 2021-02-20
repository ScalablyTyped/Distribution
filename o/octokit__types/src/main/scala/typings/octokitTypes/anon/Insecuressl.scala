package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Insecuressl extends StObject {
  
  var content_type: String = js.native
  
  var insecure_ssl: String = js.native
  
  var url: String = js.native
}
object Insecuressl {
  
  @scala.inline
  def apply(content_type: String, insecure_ssl: String, url: String): Insecuressl = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], insecure_ssl = insecure_ssl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insecuressl]
  }
  
  @scala.inline
  implicit class InsecuresslMutableBuilder[Self <: Insecuressl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsecure_ssl(value: String): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
