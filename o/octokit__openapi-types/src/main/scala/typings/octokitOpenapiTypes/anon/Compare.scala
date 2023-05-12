package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compare extends StObject {
  
  /** @description The SHA of the most recent commit on `ref` after the push. */
  var after: String
  
  var base_ref: String | Null
  
  /** @description The SHA of the most recent commit on `ref` before the push. */
  var before: String
  
  /** @description An array of commit objects describing the pushed commits. (Pushed commits are all commits that are included in the `compare` between the `before` commit and the `after` commit.) The array includes a maximum of 20 commits. If necessary, you can use the [Commits API](https://docs.github.com/rest/reference/repos#commits) to fetch additional commits. This limit is applied to timeline events only and isn't applied to webhook deliveries. */
  var commits: js.Array[Added]
  
  /** @description URL that shows the changes in this `ref` update, from the `before` commit to the `after` commit. For a newly created `ref` that is directly based on the default branch, this is the comparison between the head of the default branch and the `after` commit. Otherwise, this shows all commits until the `after` commit. */
  var compare: String
  
  /** @description Whether this push created the `ref`. */
  var created: Boolean
  
  /** @description Whether this push deleted the `ref`. */
  var deleted: Boolean
  
  var enterprise: js.UndefOr[Htmlurl] = js.undefined
  
  /** @description Whether this push was a force push of the `ref`. */
  var forced: Boolean
  
  /** Commit */
  var head_commit: Added | Null
  
  var installation: js.UndefOr[NodeidString] = js.undefined
  
  var organization: js.UndefOr[Hooksurl] = js.undefined
  
  /**
    * Committer
    * @description Metaproperties for Git author/committer information.
    */
  var pusher: EmailNameUsername
  
  /** @description The full git ref that was pushed. Example: `refs/heads/main` or `refs/tags/v3.14.1`. */
  var ref: String
  
  /**
    * Repository
    * @description A git repository
    */
  var repository: Downloadsurl
  
  var sender: js.UndefOr[Avatarurl] = js.undefined
}
object Compare {
  
  inline def apply(
    after: String,
    before: String,
    commits: js.Array[Added],
    compare: String,
    created: Boolean,
    deleted: Boolean,
    forced: Boolean,
    pusher: EmailNameUsername,
    ref: String,
    repository: Downloadsurl
  ): Compare = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], pusher = pusher.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], base_ref = null, head_commit = null)
    __obj.asInstanceOf[Compare]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compare] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setBase_ref(value: String): Self = StObject.set(x, "base_ref", value.asInstanceOf[js.Any])
    
    inline def setBase_refNull: Self = StObject.set(x, "base_ref", null)
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: js.Array[Added]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setCommitsVarargs(value: Added*): Self = StObject.set(x, "commits", js.Array(value*))
    
    inline def setCompare(value: String): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Htmlurl): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUndefined: Self = StObject.set(x, "enterprise", js.undefined)
    
    inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
    
    inline def setHead_commit(value: Added): Self = StObject.set(x, "head_commit", value.asInstanceOf[js.Any])
    
    inline def setHead_commitNull: Self = StObject.set(x, "head_commit", null)
    
    inline def setInstallation(value: NodeidString): Self = StObject.set(x, "installation", value.asInstanceOf[js.Any])
    
    inline def setInstallationUndefined: Self = StObject.set(x, "installation", js.undefined)
    
    inline def setOrganization(value: Hooksurl): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPusher(value: EmailNameUsername): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Downloadsurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Avatarurl): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
  }
}
