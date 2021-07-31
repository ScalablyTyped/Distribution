package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Commit")
@js.native
class Commit ()
  extends typings.nodegit.commitMod.Commit
/* static members */
object Commit {
  
  @JSImport("nodegit", "Commit")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typings.nodegit.treeMod.Tree,
    parentCount: Double,
    parents: js.Array[js.Any]
  ): typings.nodegit.oidMod.Oid = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], updateRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], messageEncoding.asInstanceOf[js.Any], message.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], parentCount.asInstanceOf[js.Any], parents.asInstanceOf[js.Any])).asInstanceOf[typings.nodegit.oidMod.Oid]
  
  @scala.inline
  def createV(
    id: typings.nodegit.oidMod.Oid,
    repo: typings.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typings.nodegit.treeMod.Tree,
    parentCount: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("createV")(id.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], updateRef.asInstanceOf[js.Any], author.asInstanceOf[js.Any], committer.asInstanceOf[js.Any], messageEncoding.asInstanceOf[js.Any], message.asInstanceOf[js.Any], tree.asInstanceOf[js.Any], parentCount.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def createWithSignature(
    repo: typings.nodegit.repositoryMod.Repository,
    commitContent: String,
    signature: String,
    signatureField: String
  ): js.Promise[typings.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithSignature")(repo.asInstanceOf[js.Any], commitContent.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], signatureField.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidMod.Oid]]
  
  /**
    * Retrieves the commit pointed to by the oid
    *
    *
    */
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.commitMod.Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.commitMod.Commit]]
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.commitMod.Commit): js.Promise[typings.nodegit.commitMod.Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.commitMod.Commit]]
  @scala.inline
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.commitMod.Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.commitMod.Commit]]
  
  @scala.inline
  def lookupPrefix(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, len: Double): js.Promise[typings.nodegit.commitMod.Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.commitMod.Commit]]
}
