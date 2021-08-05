package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Maintain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCheckPermissionsForRepoInOrgResponseData extends StObject {
  
  var organization: Avatarurl
  
  var parent: Allowmergecommit
  
  var permissions: Maintain
  
  var source: Allowmergecommit
}
object TeamsCheckPermissionsForRepoInOrgResponseData {
  
  inline def apply(organization: Avatarurl, parent: Allowmergecommit, permissions: Maintain, source: Allowmergecommit): TeamsCheckPermissionsForRepoInOrgResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForRepoInOrgResponseData]
  }
  
  extension [Self <: TeamsCheckPermissionsForRepoInOrgResponseData](x: Self) {
    
    inline def setOrganization(value: Avatarurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Allowmergecommit): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Maintain): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Allowmergecommit): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
