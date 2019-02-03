package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Rebase")
@js.native
class Rebase ()
  extends nodegitLib.rebaseMod.Rebase

/* static members */
@JSImport("nodegit", "Rebase")
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

