package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidNumberQuery473 extends StObject {
  
  var parameters: PathMigrationidNumberQuery473
  
  var responses: `200Content497`
}
object ParametersPathMigrationidNumberQuery473 {
  
  inline def apply(parameters: PathMigrationidNumberQuery473, responses: `200Content497`): ParametersPathMigrationidNumberQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidNumberQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMigrationidNumberQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMigrationidNumberQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content497`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
