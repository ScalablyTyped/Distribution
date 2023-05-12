package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.checks_requested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mergegroup extends StObject {
  
  /** @enum {string} */
  var action: checks_requested
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** MergeGroup */
  var merge_group: Baseref
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: js.UndefOr[Allowupdatebranch] = js.undefined
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object Mergegroup {
  
  inline def apply(merge_group: Baseref): Mergegroup = {
    val __obj = js.Dynamic.literal(action = "checks_requested", merge_group = merge_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mergegroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mergegroup] (val x: Self) extends AnyVal {
    
    inline def setAction(value: checks_requested): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setMerge_group(value: Baseref): Self = StObject.set(x, "merge_group", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
