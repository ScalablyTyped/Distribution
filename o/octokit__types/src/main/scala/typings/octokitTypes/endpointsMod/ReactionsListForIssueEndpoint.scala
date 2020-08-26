package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import typings.octokitTypes.octokitTypesStrings.Plussign1
import typings.octokitTypes.octokitTypesStrings.`-1`
import typings.octokitTypes.octokitTypesStrings.confused
import typings.octokitTypes.octokitTypesStrings.eyes
import typings.octokitTypes.octokitTypesStrings.heart
import typings.octokitTypes.octokitTypesStrings.hooray
import typings.octokitTypes.octokitTypesStrings.laugh
import typings.octokitTypes.octokitTypesStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   issue_number :number,   content :'+1' | '-1' | 'laugh' | 'confused' | 'heart' | 'hooray' | 'rocket' | 'eyes' | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsListForIssueEndpoint extends js.Object {
  /**
    * Returns a single [reaction type](https://developer.github.com/v3/reactions/#reaction-types). Omit this parameter to list all reactions to an issue.
    */
  var content: js.UndefOr[Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes] = js.native
  var issue_number: Double = js.native
  var mediaType: `12` = js.native
  var owner: String = js.native
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  var repo: String = js.native
}

object ReactionsListForIssueEndpoint {
  @scala.inline
  def apply(issue_number: Double, mediaType: `12`, owner: String, repo: String): ReactionsListForIssueEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForIssueEndpoint]
  }
  @scala.inline
  implicit class ReactionsListForIssueEndpointOps[Self <: ReactionsListForIssueEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIssue_number(value: Double): Self = this.set("issue_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `12`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
  }
  
}

