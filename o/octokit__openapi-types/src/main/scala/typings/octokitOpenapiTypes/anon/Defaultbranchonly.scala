package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Defaultbranchonly extends StObject {
  
  /** @description When forking from an existing repository, fork with only the default branch. */
  var default_branch_only: js.UndefOr[Boolean] = js.undefined
  
  /** @description When forking from an existing repository, a new name for the fork. */
  var name: js.UndefOr[String] = js.undefined
  
  /** @description Optional parameter to specify the organization name if forking into an organization. */
  var organization: js.UndefOr[String] = js.undefined
}
object Defaultbranchonly {
  
  inline def apply(): Defaultbranchonly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaultbranchonly]
  }
  
  extension [Self <: Defaultbranchonly](x: Self) {
    
    inline def setDefault_branch_only(value: Boolean): Self = StObject.set(x, "default_branch_only", value.asInstanceOf[js.Any])
    
    inline def setDefault_branch_onlyUndefined: Self = StObject.set(x, "default_branch_only", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
  }
}
