package typings
package nodegitLib.rebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/rebase", "Rebase")
@js.native
class Rebase () extends js.Object {
  def abort(): scala.Double = js.native
  def commit(
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    messageEncoding: java.lang.String,
    message: java.lang.String
  ): nodegitLib.oidMod.Oid = js.native
  def finish(signature: nodegitLib.signatureMod.Signature): scala.Double = js.native
  def inmemoryIndex(index: nodegitLib.nodegitMod.Index): scala.Double = js.native
  def next(): js.Promise[nodegitLib.rebaseDashOperationMod.RebaseOperation] = js.native
  def operationByIndex(idx: scala.Double): nodegitLib.rebaseDashOperationMod.RebaseOperation = js.native
  def operationCurrent(): scala.Double = js.native
  def operationEntrycount(): scala.Double = js.native
}

/* static members */
@JSImport("nodegit/rebase", "Rebase")
@js.native
object Rebase extends js.Object {
  def init(
    repo: nodegitLib.repositoryMod.Repository,
    branch: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    upstream: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    onto: nodegitLib.annotatedDashCommitMod.AnnotatedCommit
  ): js.Promise[nodegitLib.rebaseMod.Rebase] = js.native
  def init(
    repo: nodegitLib.repositoryMod.Repository,
    branch: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    upstream: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    onto: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    opts: nodegitLib.rebaseMod.RebaseOptions
  ): js.Promise[nodegitLib.rebaseMod.Rebase] = js.native
  def initOptions(opts: nodegitLib.rebaseMod.RebaseOptions, version: scala.Double): scala.Double = js.native
  def open(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.rebaseMod.Rebase] = js.native
  def open(repo: nodegitLib.repositoryMod.Repository, opts: nodegitLib.rebaseMod.RebaseOptions): js.Promise[nodegitLib.rebaseMod.Rebase] = js.native
}

