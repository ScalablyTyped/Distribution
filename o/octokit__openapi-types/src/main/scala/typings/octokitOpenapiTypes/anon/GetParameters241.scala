package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters241 extends StObject {
  
  /**
    * List available machine types for a repository
    * @description List the machine types available for a given repository based on its configuration.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  var get: Parameters241
}
object GetParameters241 {
  
  inline def apply(get: Parameters241): GetParameters241 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters241]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters241] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters241): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
