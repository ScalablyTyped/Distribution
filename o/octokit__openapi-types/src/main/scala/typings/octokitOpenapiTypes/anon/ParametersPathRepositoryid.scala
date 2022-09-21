package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryid extends StObject {
  
  var parameters: PathRepositoryid
}
object ParametersPathRepositoryid {
  
  inline def apply(parameters: PathRepositoryid): ParametersPathRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryid]
  }
  
  extension [Self <: ParametersPathRepositoryid](x: Self) {
    
    inline def setParameters(value: PathRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
