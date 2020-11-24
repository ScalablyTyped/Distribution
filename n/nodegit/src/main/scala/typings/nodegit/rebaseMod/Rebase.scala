package typings.nodegit.rebaseMod

import typings.nodegit.annotatedCommitMod.AnnotatedCommit
import typings.nodegit.mod.Index
import typings.nodegit.oidMod.Oid
import typings.nodegit.rebaseOperationMod.RebaseOperation
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/rebase", "Rebase")
@js.native
class Rebase () extends js.Object {
  
  def abort(): Double = js.native
  
  def commit(author: Signature, committer: Signature, messageEncoding: String, message: String): Oid = js.native
  
  def finish(signature: Signature): Double = js.native
  
  def inmemoryIndex(index: Index): Double = js.native
  
  def next(): js.Promise[RebaseOperation] = js.native
  
  def operationByIndex(idx: Double): RebaseOperation = js.native
  
  def operationCurrent(): Double = js.native
  
  def operationEntrycount(): Double = js.native
}
/* static members */
@JSImport("nodegit/rebase", "Rebase")
@js.native
object Rebase extends js.Object {
  
  def init(repo: Repository, branch: AnnotatedCommit, upstream: AnnotatedCommit, onto: AnnotatedCommit): js.Promise[Rebase] = js.native
  def init(
    repo: Repository,
    branch: AnnotatedCommit,
    upstream: AnnotatedCommit,
    onto: AnnotatedCommit,
    opts: RebaseOptions
  ): js.Promise[Rebase] = js.native
  
  def initOptions(opts: RebaseOptions, version: Double): Double = js.native
  
  def open(repo: Repository): js.Promise[Rebase] = js.native
  def open(repo: Repository, opts: RebaseOptions): js.Promise[Rebase] = js.native
}
