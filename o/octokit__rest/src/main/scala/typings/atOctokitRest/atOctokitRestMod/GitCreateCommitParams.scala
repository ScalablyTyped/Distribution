package typings.atOctokitRest.atOctokitRestMod

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
  var message: String
  var owner: String
  /**
    * The SHAs of the commits that were the parents of this commit. If omitted or empty, the commit will be written as a root commit. For a single parent, an array of one SHA should be provided; for a merge commit, an array of more than one should be provided.
    */
  var parents: js.Array[String]
  var repo: String
  /**
    * The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub adds the signature to the `gpgsig` header of the created commit. For a commit signature to be verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the string commit as it would be written to the object database. To pass a `signature` parameter, you need to first manually create a valid PGP signature, which can be complicated. You may find it easier to [use the command line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits.
    */
  var signature: js.UndefOr[String] = js.undefined
  /**
    * The SHA of the tree object this commit points to
    */
  var tree: String
}

object GitCreateCommitParams {
  @scala.inline
  def apply(
    message: String,
    owner: String,
    parents: js.Array[String],
    repo: String,
    tree: String,
    author: GitCreateCommitParamsAuthor = null,
    committer: GitCreateCommitParamsCommitter = null,
    signature: String = null
  ): GitCreateCommitParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (committer != null) __obj.updateDynamic("committer")(committer.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateCommitParams]
  }
}

