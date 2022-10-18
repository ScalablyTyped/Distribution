package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses20040 extends StObject {
  
  var parameters: PathSecretname
  
  var responses: `20040`
}
object Responses20040 {
  
  inline def apply(parameters: PathSecretname, responses: `20040`): Responses20040 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses20040]
  }
  
  extension [Self <: Responses20040](x: Self) {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20040`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
