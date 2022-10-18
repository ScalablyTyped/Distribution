package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPagePerpageRole extends StObject {
  
  /** List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned. */
  var get: ParametersQueryPagePerpageRole
}
object GetParametersQueryPagePerpageRole {
  
  inline def apply(get: ParametersQueryPagePerpageRole): GetParametersQueryPagePerpageRole = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPagePerpageRole]
  }
  
  extension [Self <: GetParametersQueryPagePerpageRole](x: Self) {
    
    inline def setGet(value: ParametersQueryPagePerpageRole): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
