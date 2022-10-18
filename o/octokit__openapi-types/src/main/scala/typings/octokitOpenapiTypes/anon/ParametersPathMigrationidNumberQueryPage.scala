package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidNumberQueryPage extends StObject {
  
  var parameters: PathMigrationidNumberQueryPage
  
  var responses: `200Content52`
}
object ParametersPathMigrationidNumberQueryPage {
  
  inline def apply(parameters: PathMigrationidNumberQueryPage, responses: `200Content52`): ParametersPathMigrationidNumberQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidNumberQueryPage]
  }
  
  extension [Self <: ParametersPathMigrationidNumberQueryPage](x: Self) {
    
    inline def setParameters(value: PathMigrationidNumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content52`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
