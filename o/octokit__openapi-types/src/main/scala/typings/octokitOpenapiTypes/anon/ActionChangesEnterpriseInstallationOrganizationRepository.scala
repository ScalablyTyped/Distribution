package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.edited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionChangesEnterpriseInstallationOrganizationRepository extends StObject {
  
  /** @enum {string} */
  var action: edited
  
  /** @description The changes to the team if the action was `edited`. */
  var changes: NameNotificationsetting
  
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
object ActionChangesEnterpriseInstallationOrganizationRepository {
  
  inline def apply(
    changes: NameNotificationsetting,
    organization: Hooksurl,
    sender: Avatarurl,
    team: DeletedDescription
  ): ActionChangesEnterpriseInstallationOrganizationRepository = {
    val __obj = js.Dynamic.literal(action = "edited", changes = changes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionChangesEnterpriseInstallationOrganizationRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionChangesEnterpriseInstallationOrganizationRepository] (val x: Self) extends AnyVal {
    
    inline def setAction(value: edited): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: NameNotificationsetting): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
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
