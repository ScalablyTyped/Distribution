package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403404500 extends StObject {
  
  var parameters: PathCodespacenameString
  
  var responses: `401403404500`
}
object Responses401403404500 {
  
  inline def apply(parameters: PathCodespacenameString, responses: `401403404500`): Responses401403404500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403404500]
  }
  
  extension [Self <: Responses401403404500](x: Self) {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
