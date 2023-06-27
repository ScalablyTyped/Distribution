package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters242 extends StObject {
  
  /**
    * Get default attributes for a codespace
    * @description Gets the default attributes for codespaces created by the user with the repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var get: Parameters242
}
object GetParameters242 {
  
  inline def apply(get: Parameters242): GetParameters242 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters242]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters242] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters242): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
