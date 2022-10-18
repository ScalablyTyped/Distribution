package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRepoStatusid extends StObject {
  
  /** Users with pull access can view a deployment status for a deployment: */
  var get: ParametersPathRepoStatusid
}
object GetParametersPathRepoStatusid {
  
  inline def apply(get: ParametersPathRepoStatusid): GetParametersPathRepoStatusid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRepoStatusid]
  }
  
  extension [Self <: GetParametersPathRepoStatusid](x: Self) {
    
    inline def setGet(value: ParametersPathRepoStatusid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
