package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.comments
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.open
import typings.octokitTypes.octokitTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesListForRepoEndpoint extends StObject {
  
  /**
    * Can be the name of a user. Pass in `none` for issues with no assigned user, and `*` for issues assigned to any user.
    */
  var assignee: js.UndefOr[String] = js.undefined
  
  /**
    * The user that created the issue.
    */
  var creator: js.UndefOr[String] = js.undefined
  
  /**
    * The direction of the sort. Can be either `asc` or `desc`.
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * A list of comma separated label names. Example: `bug,ui,@high`
    */
  var labels: js.UndefOr[String] = js.undefined
  
  /**
    * A user that's mentioned in the issue.
    */
  var mentioned: js.UndefOr[String] = js.undefined
  
  /**
    * If an `integer` is passed, it should refer to a milestone by its `number` field. If the string `*` is passed, issues with any milestone are accepted. If the string `none` is passed, issues without milestones are returned.
    */
  var milestone: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var repo: String
  
  /**
    * Only issues updated at or after this time are returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[String] = js.undefined
  
  /**
    * What to sort results by. Can be either `created`, `updated`, `comments`.
    */
  var sort: js.UndefOr[created | updated | comments] = js.undefined
  
  /**
    * Indicates the state of the issues to return. Can be either `open`, `closed`, or `all`.
    */
  var state: js.UndefOr[open | closed | all] = js.undefined
}
object IssuesListForRepoEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): IssuesListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesListForRepoEndpoint]
  }
  
  @scala.inline
  implicit class IssuesListForRepoEndpointMutableBuilder[Self <: IssuesListForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    @scala.inline
    def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    @scala.inline
    def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMentioned(value: String): Self = StObject.set(x, "mentioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMentionedUndefined: Self = StObject.set(x, "mentioned", js.undefined)
    
    @scala.inline
    def setMilestone(value: String): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilestoneUndefined: Self = StObject.set(x, "milestone", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    @scala.inline
    def setSort(value: created | updated | comments): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setState(value: open | closed | all): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
