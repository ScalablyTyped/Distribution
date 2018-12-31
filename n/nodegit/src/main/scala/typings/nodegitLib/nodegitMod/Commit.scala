package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Commit")
@js.native
class Commit ()
  extends nodegitLib.commitMod.Commit

@JSImport("nodegit", "Commit")
@js.native
object Commit extends js.Object {
  def create(
    repo: nodegitLib.repositoryMod.Repository,
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    messageEncoding: java.lang.String,
    message: java.lang.String,
    tree: nodegitLib.treeMod.Tree,
    parentCount: scala.Double,
    parents: js.Array[_]
  ): nodegitLib.oidMod.Oid = js.native
  def createV(
    id: nodegitLib.oidMod.Oid,
    repo: nodegitLib.repositoryMod.Repository,
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    messageEncoding: java.lang.String,
    message: java.lang.String,
    tree: nodegitLib.treeMod.Tree,
    parentCount: scala.Double
  ): scala.Double = js.native
  def createWithSignature(
    repo: nodegitLib.repositoryMod.Repository,
    commitContent: java.lang.String,
    signature: java.lang.String,
    signatureField: java.lang.String
  ): js.Promise[nodegitLib.oidMod.Oid] = js.native
  /**
    * Retrieves the commit pointed to by the oid
    *
    *
    */
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: java.lang.String): js.Promise[nodegitLib.commitMod.Commit] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.commitMod.Commit): js.Promise[nodegitLib.commitMod.Commit] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid): js.Promise[nodegitLib.commitMod.Commit] = js.native
  def lookupPrefix(repo: nodegitLib.repositoryMod.Repository, id: nodegitLib.oidMod.Oid, len: scala.Double): js.Promise[nodegitLib.commitMod.Commit] = js.native
}

