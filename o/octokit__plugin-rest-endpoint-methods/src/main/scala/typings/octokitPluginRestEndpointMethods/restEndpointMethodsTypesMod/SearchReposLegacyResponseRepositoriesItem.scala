package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReposLegacyResponseRepositoriesItem extends js.Object {
  var created: String
  var created_at: String
  var description: String
  var followers: Double
  var fork: Boolean
  var forks: Double
  var has_downloads: Boolean
  var has_issues: Boolean
  var has_wiki: Boolean
  var homepage: String
  var language: String
  var name: String
  var open_issues: Double
  var owner: String
  var `private`: Boolean
  var pushed: String
  var pushed_at: String
  var score: Double
  var size: Double
  var `type`: String
  var url: String
  var username: String
  var watchers: Double
}

object SearchReposLegacyResponseRepositoriesItem {
  @scala.inline
  def apply(
    created: String,
    created_at: String,
    description: String,
    followers: Double,
    fork: Boolean,
    forks: Double,
    has_downloads: Boolean,
    has_issues: Boolean,
    has_wiki: Boolean,
    homepage: String,
    language: String,
    name: String,
    open_issues: Double,
    owner: String,
    `private`: Boolean,
    pushed: String,
    pushed_at: String,
    score: Double,
    size: Double,
    `type`: String,
    url: String,
    username: String,
    watchers: Double
  ): SearchReposLegacyResponseRepositoriesItem = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], has_downloads = has_downloads.asInstanceOf[js.Any], has_issues = has_issues.asInstanceOf[js.Any], has_wiki = has_wiki.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], pushed_at = pushed_at.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], watchers = watchers.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposLegacyResponseRepositoriesItem]
  }
}

