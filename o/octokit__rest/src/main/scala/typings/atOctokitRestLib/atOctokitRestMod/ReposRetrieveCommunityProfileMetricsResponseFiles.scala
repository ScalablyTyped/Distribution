package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRetrieveCommunityProfileMetricsResponseFiles extends js.Object {
  var code_of_conduct: ReposRetrieveCommunityProfileMetricsResponseFilesCodeOfConduct
  var contributing: ReposRetrieveCommunityProfileMetricsResponseFilesContributing
  var issue_template: ReposRetrieveCommunityProfileMetricsResponseFilesIssueTemplate
  var license: ReposRetrieveCommunityProfileMetricsResponseFilesLicense
  var pull_request_template: ReposRetrieveCommunityProfileMetricsResponseFilesPullRequestTemplate
  var readme: ReposRetrieveCommunityProfileMetricsResponseFilesReadme
}

object ReposRetrieveCommunityProfileMetricsResponseFiles {
  @scala.inline
  def apply(
    code_of_conduct: ReposRetrieveCommunityProfileMetricsResponseFilesCodeOfConduct,
    contributing: ReposRetrieveCommunityProfileMetricsResponseFilesContributing,
    issue_template: ReposRetrieveCommunityProfileMetricsResponseFilesIssueTemplate,
    license: ReposRetrieveCommunityProfileMetricsResponseFilesLicense,
    pull_request_template: ReposRetrieveCommunityProfileMetricsResponseFilesPullRequestTemplate,
    readme: ReposRetrieveCommunityProfileMetricsResponseFilesReadme
  ): ReposRetrieveCommunityProfileMetricsResponseFiles = {
    val __obj = js.Dynamic.literal(code_of_conduct = code_of_conduct, contributing = contributing, issue_template = issue_template, license = license, pull_request_template = pull_request_template, readme = readme)
  
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsResponseFiles]
  }
}

