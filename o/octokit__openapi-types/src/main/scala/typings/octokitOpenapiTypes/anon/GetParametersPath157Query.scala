package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath157Query extends StObject {
  
  /**
    * List project collaborators
    * @description Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  var get: ParametersPath157Query
}
object GetParametersPath157Query {
  
  inline def apply(get: ParametersPath157Query): GetParametersPath157Query = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath157Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath157Query] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath157Query): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
