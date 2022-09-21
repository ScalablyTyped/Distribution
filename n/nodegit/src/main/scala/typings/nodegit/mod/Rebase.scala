package typings.nodegit.mod

import typings.nodegit.rebaseMod.RebaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Rebase")
@js.native
open class Rebase ()
  extends typings.nodegit.rebaseMod.Rebase
/* static members */
object Rebase {
  
  @JSImport("nodegit", "Rebase")
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(
    repo: typings.nodegit.repositoryMod.Repository,
    branch: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    upstream: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    onto: typings.nodegit.annotatedCommitMod.AnnotatedCommit
  ): js.Promise[typings.nodegit.rebaseMod.Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(repo.asInstanceOf[js.Any], branch.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any], onto.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.rebaseMod.Rebase]]
  inline def init(
    repo: typings.nodegit.repositoryMod.Repository,
    branch: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    upstream: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    onto: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    opts: RebaseOptions
  ): js.Promise[typings.nodegit.rebaseMod.Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(repo.asInstanceOf[js.Any], branch.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any], onto.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.rebaseMod.Rebase]]
  
  inline def initOptions(opts: RebaseOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def open(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.rebaseMod.Rebase] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.rebaseMod.Rebase]]
  inline def open(repo: typings.nodegit.repositoryMod.Repository, opts: RebaseOptions): js.Promise[typings.nodegit.rebaseMod.Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.rebaseMod.Rebase]]
}
