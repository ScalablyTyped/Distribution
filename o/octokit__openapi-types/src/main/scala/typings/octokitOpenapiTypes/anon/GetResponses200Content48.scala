package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content48 extends StObject {
  
  /** List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/reference/repos#create-a-repository-for-the-authenticated-user). */
  var get: Responses200Content48
}
object GetResponses200Content48 {
  
  inline def apply(get: Responses200Content48): GetResponses200Content48 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content48]
  }
  
  extension [Self <: GetResponses200Content48](x: Self) {
    
    inline def setGet(value: Responses200Content48): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
