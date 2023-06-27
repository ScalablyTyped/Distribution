package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.dequeued
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.destroyed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.invalidated
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.merged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionInstallation extends StObject {
  
  /** @enum {string} */
  var action: destroyed
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var merge_group: Basesha
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /**
    * @description Explains why the merge group is being destroyed. The group could have been merged, removed from the queue (dequeued), or invalidated by an earlier queue entry being dequeued (invalidated).
    * @enum {string}
    */
  var reason: js.UndefOr[merged | invalidated | dequeued] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object ActionInstallation {
  
  inline def apply(merge_group: Basesha): ActionInstallation = {
    val __obj = js.Dynamic.literal(action = "destroyed", merge_group = merge_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionInstallation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionInstallation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: destroyed): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setMerge_group(value: Basesha): Self = StObject.set(x, "merge_group", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setReason(value: merged | invalidated | dequeued): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
