package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCreateCommitEndpoint extends StObject {
  
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
object GitCreateCommitEndpoint {
  
  inline def apply(message: String, owner: String, parents: js.Array[String], repo: String, tree: String): GitCreateCommitEndpoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateCommitEndpoint]
  }
  
  extension [Self <: GitCreateCommitEndpoint](x: Self) {
    
    inline def setAuthor(value: GitCreateCommitParamsAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCommitter(value: GitCreateCommitParamsCommitter): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTree(value: String): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
