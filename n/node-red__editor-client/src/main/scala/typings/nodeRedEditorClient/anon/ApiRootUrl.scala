package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiRootUrl extends StObject {
  
  var apiRootUrl: String
}
object ApiRootUrl {
  
  inline def apply(apiRootUrl: String): ApiRootUrl = {
    val __obj = js.Dynamic.literal(apiRootUrl = apiRootUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiRootUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiRootUrl] (val x: Self) extends AnyVal {
    
    inline def setApiRootUrl(value: String): Self = StObject.set(x, "apiRootUrl", value.asInstanceOf[js.Any])
  }
}
