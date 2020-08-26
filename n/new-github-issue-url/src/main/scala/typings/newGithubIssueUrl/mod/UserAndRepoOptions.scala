package typings.newGithubIssueUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAndRepoOptions
  extends CommonOptions
     with Options {
  /**
  		GitHub repo.
  		*/
  val repo: String = js.native
  /**
  		GitHub username or organization.
  		*/
  val user: String = js.native
}

object UserAndRepoOptions {
  @scala.inline
  def apply(repo: String, user: String): UserAndRepoOptions = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAndRepoOptions]
  }
  @scala.inline
  implicit class UserAndRepoOptionsOps[Self <: UserAndRepoOptions] (val x: Self) extends AnyVal {
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
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

