package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Masterbranch extends StObject {
  
  /** @description The repository's current description. */
  var description: String | Null
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  /** @description The name of the repository's default branch (usually `main`). */
  var master_branch: String
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /** @description The pusher type for the event. Can be either `user` or a deploy key. */
  var pusher_type: String
  
  /** @description The [`git ref`](https://docs.github.com/rest/reference/git#get-a-reference) resource. */
  var ref: String
  
  /**
    * @description The type of Git ref object created in the repository.
    * @enum {string}
    */
  var ref_type: tag | branch
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
}
object Masterbranch {
  
  inline def apply(
    master_branch: String,
    pusher_type: String,
    ref: String,
    ref_type: tag | branch,
    repository: Allowupdatebranch,
    sender: Avatarurl
  ): Masterbranch = {
    val __obj = js.Dynamic.literal(master_branch = master_branch.asInstanceOf[js.Any], pusher_type = pusher_type.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], ref_type = ref_type.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Masterbranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Masterbranch] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setMaster_branch(value: String): Self = StObject.set(x, "master_branch", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPusher_type(value: String): Self = StObject.set(x, "pusher_type", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRef_type(value: tag | branch): Self = StObject.set(x, "ref_type", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
