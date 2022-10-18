package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses20096 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `20096`
}
object Responses20096 {
  
  inline def apply(parameters: PathBranchOwner, responses: `20096`): Responses20096 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses20096]
  }
  
  extension [Self <: Responses20096](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20096`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
