package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryAffiliation extends StObject {
  
  /**
    * List project collaborators
    * @description Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  var get: ParametersQueryAffiliation
}
object GetParametersQueryAffiliation {
  
  inline def apply(get: ParametersQueryAffiliation): GetParametersQueryAffiliation = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryAffiliation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryAffiliation] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryAffiliation): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
