package typings.nodegit.mod

import typings.nodegit.rebaseMod.RebaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Rebase")
@js.native
class Rebase ()
  extends typings.nodegit.rebaseMod.Rebase
/* static members */
@JSImport("nodegit", "Rebase")
@js.native
object Rebase extends js.Object {
  
  def init(
    repo: typings.nodegit.repositoryMod.Repository,
    branch: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    upstream: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    onto: typings.nodegit.annotatedCommitMod.AnnotatedCommit
  ): js.Promise[typings.nodegit.rebaseMod.Rebase] = js.native
  def init(
    repo: typings.nodegit.repositoryMod.Repository,
    branch: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    upstream: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    onto: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    opts: RebaseOptions
  ): js.Promise[typings.nodegit.rebaseMod.Rebase] = js.native
  
  def initOptions(opts: RebaseOptions, version: Double): Double = js.native
  
  def open(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.rebaseMod.Rebase] = js.native
  def open(repo: typings.nodegit.repositoryMod.Repository, opts: RebaseOptions): js.Promise[typings.nodegit.rebaseMod.Rebase] = js.native
}
