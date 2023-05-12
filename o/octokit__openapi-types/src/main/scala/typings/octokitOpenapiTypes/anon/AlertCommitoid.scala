package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertCommitoid extends StObject {
  
  /** @enum {string} */
  var action: fixed
  
  /** @description The code scanning alert involved in the event. */
  var alert: CreatedatDismissedat
  
  /** @description The commit SHA of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty. */
  var commit_oid: String
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** @description The Git reference of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was triggered by the `sender` and this value will be empty. */
  var ref: String
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object AlertCommitoid {
  
  inline def apply(
    alert: CreatedatDismissedat,
    commit_oid: String,
    ref: String,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): AlertCommitoid = {
    val __obj = js.Dynamic.literal(action = "fixed", alert = alert.asInstanceOf[js.Any], commit_oid = commit_oid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertCommitoid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlertCommitoid] (val x: Self) extends AnyVal {
    
    inline def setAction(value: fixed): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAlert(value: CreatedatDismissedat): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setCommit_oid(value: String): Self = StObject.set(x, "commit_oid", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
