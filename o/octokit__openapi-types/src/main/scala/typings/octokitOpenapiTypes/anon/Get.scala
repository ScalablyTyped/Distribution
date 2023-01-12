package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get extends StObject {
  
  /** Get Hypermedia links to resources accessible in GitHub's REST API */
  var get: Responses
}
object Get {
  
  inline def apply(get: Responses): Get = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
