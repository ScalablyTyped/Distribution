package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spdxid extends StObject {
  
  var html_url: String
  
  var key: String
  
  var name: String
  
  var spdx_id: String
  
  var url: String
}
object Spdxid {
  
  @scala.inline
  def apply(html_url: String, key: String, name: String, spdx_id: String, url: String): Spdxid = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spdx_id = spdx_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spdxid]
  }
  
  @scala.inline
  implicit class SpdxidMutableBuilder[Self <: Spdxid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpdx_id(value: String): Self = StObject.set(x, "spdx_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
