package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Commit")
@js.native
class Commit ()
  extends typings.nodegit.commitMod.Commit
/* static members */
object Commit {
  
  @JSImport("nodegit", "Commit.create")
  @js.native
  def create(
    repo: typings.nodegit.repositoryMod.Repository,
    updateRef: String,
    author: typings.nodegit.signatureMod.Signature,
    committer: typings.nodegit.signatureMod.Signature,
    messageEncoding: String,
    message: String,
    tree: typings.nodegit.treeMod.Tree,
    parentCount: Double,
    parents: js.Array[_]
  ): typings.nodegit.oidMod.Oid = js.native
  
  @JSImport("nodegit", "Commit.createV")
  @js.native
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
  ): Double = js.native
  
  @JSImport("nodegit", "Commit.createWithSignature")
  @js.native
  def createWithSignature(
    repo: typings.nodegit.repositoryMod.Repository,
    commitContent: String,
    signature: String,
    signatureField: String
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  /**
    * Retrieves the commit pointed to by the oid
    *
    *
    */
  @JSImport("nodegit", "Commit.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: String): js.Promise[typings.nodegit.commitMod.Commit] = js.native
  @JSImport("nodegit", "Commit.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.commitMod.Commit): js.Promise[typings.nodegit.commitMod.Commit] = js.native
  @JSImport("nodegit", "Commit.lookup")
  @js.native
  def lookup(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid): js.Promise[typings.nodegit.commitMod.Commit] = js.native
  
  @JSImport("nodegit", "Commit.lookupPrefix")
  @js.native
  def lookupPrefix(repo: typings.nodegit.repositoryMod.Repository, id: typings.nodegit.oidMod.Oid, len: Double): js.Promise[typings.nodegit.commitMod.Commit] = js.native
}
