package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.Plussign1
import typings.octokitTypes.octokitTypesStrings.`-1`
import typings.octokitTypes.octokitTypesStrings.`squirrel-girl`
import typings.octokitTypes.octokitTypesStrings.confused
import typings.octokitTypes.octokitTypesStrings.eyes
import typings.octokitTypes.octokitTypesStrings.heart
import typings.octokitTypes.octokitTypesStrings.hooray
import typings.octokitTypes.octokitTypesStrings.laugh
import typings.octokitTypes.octokitTypesStrings.rocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionsListForTeamDiscussionCommentInOrgEndpoint
  extends StObject
     with RequiredPreview[`squirrel-girl`] {
  
  var comment_number: Double
  
  /**
    * Returns a single [reaction type](https://developer.github.com/v3/reactions/#reaction-types). Omit this parameter to list all reactions to a team discussion comment.
    */
  var content: js.UndefOr[Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes] = js.undefined
  
  var discussion_number: Double
  
  @JSName("org")
  var org_ : String
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var team_slug: String
}
object ReactionsListForTeamDiscussionCommentInOrgEndpoint {
  
  @scala.inline
  def apply(
    comment_number: Double,
    discussion_number: Double,
    mediaType: `0`[`squirrel-girl`],
    org_ : String,
    team_slug: String
  ): ReactionsListForTeamDiscussionCommentInOrgEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ReactionsListForTeamDiscussionCommentInOrgEndpointMutableBuilder[Self <: ReactionsListForTeamDiscussionCommentInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment_number(value: Double): Self = StObject.set(x, "comment_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDiscussion_number(value: Double): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setTeam_slug(value: String): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
