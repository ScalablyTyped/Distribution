package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationRepositorySenderTeam extends StObject {
  
  /** @enum {string} */
  var action: created_
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: Hooksurl
  
  /**
    * Repository
    * @description A git repository
    */
  var repository: js.UndefOr[Disabled] = js.undefined
  
  var sender: Avatarurl
  
  /**
    * Team
    * @description Groups of organization members that gives permissions on specified repositories.
    */
  var team: DeletedDescription
}
object OrganizationRepositorySenderTeam {
  
  inline def apply(organization: Hooksurl, sender: Avatarurl, team: DeletedDescription): OrganizationRepositorySenderTeam = {
    val __obj = js.Dynamic.literal(action = "created", organization = organization.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationRepositorySenderTeam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationRepositorySenderTeam] (val x: Self) extends AnyVal {
    
    inline def setAction(value: created_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Disabled): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setTeam(value: DeletedDescription): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
  }
}
