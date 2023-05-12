package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidOrgQuery473 extends StObject {
  
  var parameters: PathMigrationidOrgQuery473
  
  var responses: `200Content497`
}
object ParametersPathMigrationidOrgQuery473 {
  
  inline def apply(parameters: PathMigrationidOrgQuery473, responses: `200Content497`): ParametersPathMigrationidOrgQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidOrgQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMigrationidOrgQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMigrationidOrgQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content497`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
