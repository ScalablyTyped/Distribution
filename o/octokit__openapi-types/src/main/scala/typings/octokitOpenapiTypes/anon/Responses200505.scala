package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200505 extends StObject {
  
  var parameters: PathCommitshaOwnerRepo
  
  var responses: `200505`
}
object Responses200505 {
  
  inline def apply(parameters: PathCommitshaOwnerRepo, responses: `200505`): Responses200505 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200505]
  }
  
  extension [Self <: Responses200505](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200505`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
