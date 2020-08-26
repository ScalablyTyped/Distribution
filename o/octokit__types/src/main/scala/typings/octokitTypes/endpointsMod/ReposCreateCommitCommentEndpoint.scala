package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateCommitCommentEndpoint extends js.Object {
  /**
    * The contents of the comment.
    */
  var body: String = js.native
  var commit_sha: String = js.native
  /**
    * **Deprecated**. Use **position** parameter instead. Line number in the file to comment on.
    */
  var line: js.UndefOr[Double | Null] = js.native
  var owner: String = js.native
  /**
    * Relative path of the file to comment on.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Line index in the diff to comment on.
    */
  var position: js.UndefOr[Double] = js.native
  var repo: String = js.native
}

object ReposCreateCommitCommentEndpoint {
  @scala.inline
  def apply(body: String, commit_sha: String, owner: String, repo: String): ReposCreateCommitCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitCommentEndpoint]
  }
  @scala.inline
  implicit class ReposCreateCommitCommentEndpointOps[Self <: ReposCreateCommitCommentEndpoint] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit_sha(value: String): Self = this.set("commit_sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setLineNull: Self = this.set("line", null)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

