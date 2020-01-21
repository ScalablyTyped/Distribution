package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchEmailLegacyResponseUser extends js.Object {
  var blog: String
  var company: String
  var created: String
  var created_at: String
  var email: String
  var followers_count: Double
  var following_count: Double
  var gravatar_id: String
  var id: Double
  var location: String
  var login: String
  var name: String
  var public_gist_count: Double
  var public_repo_count: Double
  var `type`: String
}

object SearchEmailLegacyResponseUser {
  @scala.inline
  def apply(
    blog: String,
    company: String,
    created: String,
    created_at: String,
    email: String,
    followers_count: Double,
    following_count: Double,
    gravatar_id: String,
    id: Double,
    location: String,
    login: String,
    name: String,
    public_gist_count: Double,
    public_repo_count: Double,
    `type`: String
  ): SearchEmailLegacyResponseUser = {
    val __obj = js.Dynamic.literal(blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_gist_count = public_gist_count.asInstanceOf[js.Any], public_repo_count = public_repo_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEmailLegacyResponseUser]
  }
}

