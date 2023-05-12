package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTagprotectionid extends StObject {
  
  var parameters: PathRepoTagprotectionid
  
  var responses: `403Content36404Content36`
}
object ParametersPathRepoTagprotectionid {
  
  inline def apply(parameters: PathRepoTagprotectionid, responses: `403Content36404Content36`): ParametersPathRepoTagprotectionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTagprotectionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoTagprotectionid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoTagprotectionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content36404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
