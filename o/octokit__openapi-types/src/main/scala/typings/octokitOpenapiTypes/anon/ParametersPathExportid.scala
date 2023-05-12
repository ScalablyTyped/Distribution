package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathExportid extends StObject {
  
  var parameters: PathExportid
  
  var responses: `200Content379`
}
object ParametersPathExportid {
  
  inline def apply(parameters: PathExportid, responses: `200Content379`): ParametersPathExportid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathExportid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathExportid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathExportid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content379`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
