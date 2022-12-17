package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content41 extends StObject {
  
  /** List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/reference/repos#create-a-repository-for-the-authenticated-user). */
  var get: Responses200Content41
}
object GetResponses200Content41 {
  
  inline def apply(get: Responses200Content41): GetResponses200Content41 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content41]
  }
  
  extension [Self <: GetResponses200Content41](x: Self) {
    
    inline def setGet(value: Responses200Content41): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
