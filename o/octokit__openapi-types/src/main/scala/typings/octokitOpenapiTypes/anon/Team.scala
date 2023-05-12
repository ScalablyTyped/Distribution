package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.added
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.team_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Team extends StObject {
  
  /** @enum {string} */
  var action: added
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** User */
  var member: Deleted | Null
  
  var organization: Hooksurl
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  /**
    * @description The scope of the membership. Currently, can only be `team`.
    * @enum {string}
    */
  var scope: team_
  
  /** User */
  var sender: Deleted | Null
  
  /**
    * Team
    * @description Groups of organization members that gives permissions on specified repositories.
    */
  var team: DeletedDescription
}
object Team {
  
  inline def apply(organization: Hooksurl, team: DeletedDescription): Team = {
    val __obj = js.Dynamic.literal(action = "added", organization = organization.asInstanceOf[js.Any], scope = "team", team = team.asInstanceOf[js.Any], member = null, sender = null)
    __obj.asInstanceOf[Team]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Team] (val x: Self) extends AnyVal {
    
    inline def setAction(value: added): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setMember(value: Deleted): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberNull: Self = StObject.set(x, "member", null)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setScope(value: team_): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Deleted): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderNull: Self = StObject.set(x, "sender", null)
    
    inline def setTeam(value: DeletedDescription): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
  }
}
