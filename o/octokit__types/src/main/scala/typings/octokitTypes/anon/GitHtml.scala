package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitHtml extends js.Object {
  var git: String = js.native
  var html: String = js.native
  var self: String = js.native
}

object GitHtml {
  @scala.inline
  def apply(git: String, html: String, self: String): GitHtml = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitHtml]
  }
  @scala.inline
  implicit class GitHtmlOps[Self <: GitHtml] (val x: Self) extends AnyVal {
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
    def setGit(value: String): Self = this.set("git", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelf(value: String): Self = this.set("self", value.asInstanceOf[js.Any])
  }
  
}

