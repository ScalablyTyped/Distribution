package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusUrl extends StObject {
  
  /** @example queued */
  var status: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/github/hello-world/pages/builds/latest
    */
  var url: String
}
object StatusUrl {
  
  inline def apply(status: String, url: String): StatusUrl = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusUrl] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
