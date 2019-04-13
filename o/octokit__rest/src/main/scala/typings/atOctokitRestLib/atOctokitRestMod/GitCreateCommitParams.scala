package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitParams extends js.Object {
  /**
    * Information about the author of the commit. By default, the `author` will be the authenticated user and the current date. See the `author` and `committer` object below for details.
    */
  var author: js.UndefOr[GitCreateCommitParamsAuthor] = js.undefined
  /**
    * Information about the person who is making the commit. By default, `committer` will use the information set in `author`. See the `author` and `committer` object below for details.
    */
  var committer: js.UndefOr[GitCreateCommitParamsCommitter] = js.undefined
  /**
    * The commit message
    */
  var message: java.lang.String
  var owner: java.lang.String
  /**
    * The SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be written as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an array of more than one should be provided.
    */
  var parents: js.Array[java.lang.String]
  var repo: java.lang.String
  /**
    * The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature to the `gpgsig` header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the string commit as it would be written to the object database. To pass a `signature` parameter, you need to first manually create a valid PGP signature, which can be complicated. You may find it easier to [use the command line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits.
    */
  var signature: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SHA of the tree object this commit points to
    */
  var tree: java.lang.String
}

object GitCreateCommitParams {
  @scala.inline
  def apply(
    message: java.lang.String,
    owner: java.lang.String,
    parents: js.Array[java.lang.String],
    repo: java.lang.String,
    tree: java.lang.String,
    author: GitCreateCommitParamsAuthor = null,
    committer: GitCreateCommitParamsCommitter = null,
    signature: java.lang.String = null
  ): GitCreateCommitParams = {
    val __obj = js.Dynamic.literal(message = message, owner = owner, parents = parents, repo = repo, tree = tree)
    if (author != null) __obj.updateDynamic("author")(author)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[GitCreateCommitParams]
  }
}

