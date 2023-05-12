package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200HeadersLinkString extends StObject {
  
  var parameters: PathOrgSecretname
  
  var responses: `200HeadersLinkString`
}
object Responses200HeadersLinkString {
  
  inline def apply(parameters: PathOrgSecretname, responses: `200HeadersLinkString`): Responses200HeadersLinkString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200HeadersLinkString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
