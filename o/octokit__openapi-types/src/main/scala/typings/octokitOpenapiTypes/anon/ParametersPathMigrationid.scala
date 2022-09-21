package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationid extends StObject {
  
  var parameters: PathMigrationid
  
  var responses: `200Content98`
}
object ParametersPathMigrationid {
  
  inline def apply(parameters: PathMigrationid, responses: `200Content98`): ParametersPathMigrationid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationid]
  }
  
  extension [Self <: ParametersPathMigrationid](x: Self) {
    
    inline def setParameters(value: PathMigrationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content98`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
