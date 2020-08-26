package typings.newGithubIssueUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepoUrlOptions
  extends CommonOptions
     with Options {
  /**
  		The full URL to the repo.
  		*/
  val repoUrl: String = js.native
}

object RepoUrlOptions {
  @scala.inline
  def apply(repoUrl: String): RepoUrlOptions = {
    val __obj = js.Dynamic.literal(repoUrl = repoUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoUrlOptions]
  }
  @scala.inline
  implicit class RepoUrlOptionsOps[Self <: RepoUrlOptions] (val x: Self) extends AnyVal {
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
    def setRepoUrl(value: String): Self = this.set("repoUrl", value.asInstanceOf[js.Any])
  }
  
}

