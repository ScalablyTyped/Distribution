package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUsersLegacyResponseUsersItem extends js.Object {
  var created: String
  var created_at: String
  var followers: Double
  var followers_count: Double
  var fullname: String
  var gravatar_id: String
  var id: String
  var language: String
  var location: String
  var login: String
  var name: String
  var public_repo_count: Double
  var repos: Double
  var score: Double
  var `type`: String
  var username: String
}

object SearchUsersLegacyResponseUsersItem {
  @scala.inline
  def apply(
    created: String,
    created_at: String,
    followers: Double,
    followers_count: Double,
    fullname: String,
    gravatar_id: String,
    id: String,
    language: String,
    location: String,
    login: String,
    name: String,
    public_repo_count: Double,
    repos: Double,
    score: Double,
    `type`: String,
    username: String
  ): SearchUsersLegacyResponseUsersItem = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_repo_count = public_repo_count.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUsersLegacyResponseUsersItem]
  }
}

