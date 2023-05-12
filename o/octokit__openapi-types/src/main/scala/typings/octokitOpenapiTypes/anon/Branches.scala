package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branches extends StObject {
  
  /** Format: uri */
  var avatar_url: js.UndefOr[String | Null] = js.undefined
  
  /** @description An array of branch objects containing the status' SHA. Each branch contains the given SHA, but the SHA may or may not be the head of the branch. The array includes a maximum of 10 branches. */
  var branches: js.Array[NameProtected]
  
  var commit: CommentsurlCommit
  
  var context: String
  
  var created_at: String
  
  /** @description The optional human-readable description added to the status. */
  var description: String | Null
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  /** @description The unique identifier of the status. */
  var id: Double
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var name: String
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  var repository: Allowupdatebranch
  
  var sender: Avatarurl
  
  /** @description The Commit SHA. */
  var sha: String
  
  /**
    * @description The new state. Can be `pending`, `success`, `failure`, or `error`.
    * @enum {string}
    */
  var state: pending | success | failure | error
  
  /** @description The optional link added to the status. */
  var target_url: String | Null
  
  var updated_at: String
}
object Branches {
  
  inline def apply(
    branches: js.Array[NameProtected],
    commit: CommentsurlCommit,
    context: String,
    created_at: String,
    id: Double,
    name: String,
    repository: Allowupdatebranch,
    sender: Avatarurl,
    sha: String,
    state: pending | success | failure | error,
    updated_at: String
  ): Branches = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], description = null, target_url = null)
    __obj.asInstanceOf[Branches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Branches] (val x: Self) extends AnyVal {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlNull: Self = StObject.set(x, "avatar_url", null)
    
    inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    inline def setBranches(value: js.Array[NameProtected]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setBranchesVarargs(value: NameProtected*): Self = StObject.set(x, "branches", js.Array(value*))
    
    inline def setCommit(value: CommentsurlCommit): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setRepository(value: Allowupdatebranch): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setState(value: pending | success | failure | error): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    inline def setTarget_urlNull: Self = StObject.set(x, "target_url", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
