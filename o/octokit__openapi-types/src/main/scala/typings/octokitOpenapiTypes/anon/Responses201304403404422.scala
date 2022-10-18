package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201304403404422 extends StObject {
  
  var parameters: Path273
  
  var responses: `201304403404422`
}
object Responses201304403404422 {
  
  inline def apply(parameters: Path273, responses: `201304403404422`): Responses201304403404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201304403404422]
  }
  
  extension [Self <: Responses201304403404422](x: Self) {
    
    inline def setParameters(value: Path273): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
