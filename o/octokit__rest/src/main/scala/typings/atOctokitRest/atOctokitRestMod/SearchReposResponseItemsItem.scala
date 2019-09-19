package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(created_at = created_at, default_branch = default_branch, description = description, fork = fork, forks_count = forks_count, full_name = full_name, homepage = homepage, html_url = html_url, id = id, language = language, master_branch = master_branch, name = name, node_id = node_id, open_issues_count = open_issues_count, owner = owner, pushed_at = pushed_at, score = score, size = size, stargazers_count = stargazers_count, updated_at = updated_at, url = url, watchers_count = watchers_count)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[SearchReposResponseItemsItem]
  }
}

