package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReposResponseItemsItem extends js.Object {
  var created_at: String
  var default_branch: String
  var description: String
  var fork: Boolean
  var forks_count: Double
  var full_name: String
  var homepage: String
  var html_url: String
  var id: Double
  var language: String
  var master_branch: String
  var name: String
  var node_id: String
  var open_issues_count: Double
  var owner: SearchReposResponseItemsItemOwner
  var `private`: Boolean
  var pushed_at: String
  var score: Double
  var size: Double
  var stargazers_count: Double
  var updated_at: String
  var url: String
  var watchers_count: Double
}

object SearchReposResponseItemsItem {
  @scala.inline
  def apply(
    created_at: String,
    default_branch: String,
    description: String,
    fork: Boolean,
    forks_count: Double,
    full_name: String,
    homepage: String,
    html_url: String,
    id: Double,
    language: String,
    master_branch: String,
    name: String,
    node_id: String,
    open_issues_count: Double,
    owner: SearchReposResponseItemsItemOwner,
    `private`: Boolean,
    pushed_at: String,
    score: Double,
    size: Double,
    stargazers_count: Double,
    updated_at: String,
    url: String,
    watchers_count: Double
  ): SearchReposResponseItemsItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], default_branch = default_branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], forks_count = forks_count.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], master_branch = master_branch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], open_issues_count = open_issues_count.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pushed_at = pushed_at.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stargazers_count = stargazers_count.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], watchers_count = watchers_count.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposResponseItemsItem]
  }
}

