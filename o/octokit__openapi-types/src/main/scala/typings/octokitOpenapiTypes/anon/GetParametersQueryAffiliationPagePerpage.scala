package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryAffiliationPagePerpage extends StObject {
  
  /** Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators. */
  var get: ParametersQueryAffiliationPagePerpage
}
object GetParametersQueryAffiliationPagePerpage {
  
  inline def apply(get: ParametersQueryAffiliationPagePerpage): GetParametersQueryAffiliationPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryAffiliationPagePerpage]
  }
  
  extension [Self <: GetParametersQueryAffiliationPagePerpage](x: Self) {
    
    inline def setGet(value: ParametersQueryAffiliationPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
