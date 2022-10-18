package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses402 extends StObject {
  
  var parameters: PathCodespacenameString
  
  var responses: `402`
}
object Responses402 {
  
  inline def apply(parameters: PathCodespacenameString, responses: `402`): Responses402 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses402]
  }
  
  extension [Self <: Responses402](x: Self) {
    
    inline def setParameters(value: PathCodespacenameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `402`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
