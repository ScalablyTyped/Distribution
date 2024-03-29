package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content32 extends StObject {
  
  /**
    * Get all gitignore templates
    * @description List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/reference/repos#create-a-repository-for-the-authenticated-user).
    */
  var get: Responses200Content32
}
object GetResponses200Content32 {
  
  inline def apply(get: Responses200Content32): GetResponses200Content32 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content32]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content32] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content32): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
