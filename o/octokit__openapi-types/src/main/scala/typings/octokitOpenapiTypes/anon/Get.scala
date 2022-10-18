package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get extends StObject {
  
  /** Get Hypermedia links to resources accessible in GitHub's REST API */
  var get: Responses200Content226
}
object Get {
  
  inline def apply(get: Responses200Content226): Get = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get]
  }
  
  extension [Self <: Get](x: Self) {
    
    inline def setGet(value: Responses200Content226): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
