package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.reopened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitoidEnterprise extends StObject {
  
  /** @enum {string} */
  var action: reopened
  
  /** @description The code scanning alert involved in the event. */
  var alert: DismissedatDismissedby | Null
  
  /** @description The commit SHA of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty. */
  var commit_oid: String | Null
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** @description The Git reference of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty. */
  var ref: String | Null
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object CommitoidEnterprise {
  
  inline def apply(repository: Allowupdatebranch, sender: Avatarurl): CommitoidEnterprise = {
    val __obj = js.Dynamic.literal(action = "reopened", repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], alert = null, commit_oid = null, ref = null)
    __obj.asInstanceOf[CommitoidEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitoidEnterprise] (val x: Self) extends AnyVal {
    
    inline def setAction(value: reopened): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAlert(value: DismissedatDismissedby): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setAlertNull: Self = StObject.set(x, "alert", null)
    
    inline def setCommit_oid(value: String): Self = StObject.set(x, "commit_oid", value.asInstanceOf[js.Any])
    
    inline def setCommit_oidNull: Self = StObject.set(x, "commit_oid", null)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
