package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryClientipRef extends StObject {
  
  /**
    * Gets the default attributes for codespaces created by the user with the repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var get: ParametersQueryClientipRef
}
object GetParametersQueryClientipRef {
  
  inline def apply(get: ParametersQueryClientipRef): GetParametersQueryClientipRef = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryClientipRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryClientipRef] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryClientipRef): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
