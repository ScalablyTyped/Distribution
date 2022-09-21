package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content213 extends StObject {
  
  var parameters: PathCommitshaQueryPage
  
  var responses: `200Content213`
}
object Responses200Content213 {
  
  inline def apply(parameters: PathCommitshaQueryPage, responses: `200Content213`): Responses200Content213 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content213]
  }
  
  extension [Self <: Responses200Content213](x: Self) {
    
    inline def setParameters(value: PathCommitshaQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content213`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
