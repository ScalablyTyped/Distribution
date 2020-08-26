package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCreateCommitEndpoint extends js.Object {
  /**
    * Information about the author of the commit. By default, the `author` will be the authenticated user and the current date. See the `author` and `committer` object below for details.
    */
  var author: js.UndefOr[GitCreateCommitParamsAuthor] = js.native
  /**
    * Information about the person who is making the commit. By default, `committer` will use the information set in `author`. See the `author` and `committer` object below for details.
    */
  var committer: js.UndefOr[GitCreateCommitParamsCommitter] = js.native
  /**
    * The commit message
    */
  var message: String = js.native
  var owner: String = js.native
  /**
    * The SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be written as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an array of more than one should be provided.
    */
  var parents: js.Array[String] = js.native
  var repo: String = js.native
  /**
    * The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature to the `gpgsig` header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the string commit as it would be written to the object database. To pass a `signature` parameter, you need to first manually create a valid PGP signature, which can be complicated. You may find it easier to [use the command line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits.
    */
  var signature: js.UndefOr[String] = js.native
  /**
    * The SHA of the tree object this commit points to
    */
  var tree: String = js.native
}

object GitCreateCommitEndpoint {
  @scala.inline
  def apply(message: String, owner: String, parents: js.Array[String], repo: String, tree: String): GitCreateCommitEndpoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateCommitEndpoint]
  }
  @scala.inline
  implicit class GitCreateCommitEndpointOps[Self <: GitCreateCommitEndpoint] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentsVarargs(value: String*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[String]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: String): Self = this.set("tree", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: GitCreateCommitParamsAuthor): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCommitter(value: GitCreateCommitParamsCommitter): Self = this.set("committer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitter: Self = this.set("committer", js.undefined)
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
  
}

