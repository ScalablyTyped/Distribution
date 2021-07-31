package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.Maintain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsCheckPermissionsForRepoLegacyResponseData extends StObject {
  
  var organization: Avatarurl
  
  var parent: Allowmergecommit
  
  var permissions: Maintain
  
  var source: Allowmergecommit
}
object TeamsCheckPermissionsForRepoLegacyResponseData {
  
  @scala.inline
  def apply(organization: Avatarurl, parent: Allowmergecommit, permissions: Maintain, source: Allowmergecommit): TeamsCheckPermissionsForRepoLegacyResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForRepoLegacyResponseData]
  }
  
  @scala.inline
  implicit class TeamsCheckPermissionsForRepoLegacyResponseDataMutableBuilder[Self <: TeamsCheckPermissionsForRepoLegacyResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrganization(value: Avatarurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Allowmergecommit): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Maintain): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Allowmergecommit): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
