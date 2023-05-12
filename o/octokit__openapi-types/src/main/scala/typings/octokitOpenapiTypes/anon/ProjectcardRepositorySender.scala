package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.moved_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectcardRepositorySender extends StObject {
  
  /** @enum {string} */
  var action: moved_
  
  var changes: js.UndefOr[ColumnidFromNumber] = js.undefined
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var project_card: Contenturl
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: Avatarurl
}
object ProjectcardRepositorySender {
  
  inline def apply(project_card: Contenturl, sender: Avatarurl): ProjectcardRepositorySender = {
    val __obj = js.Dynamic.literal(action = "moved", project_card = project_card.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectcardRepositorySender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectcardRepositorySender] (val x: Self) extends AnyVal {
    
    inline def setAction(value: moved_): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: ColumnidFromNumber): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setProject_card(value: Contenturl): Self = StObject.set(x, "project_card", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
