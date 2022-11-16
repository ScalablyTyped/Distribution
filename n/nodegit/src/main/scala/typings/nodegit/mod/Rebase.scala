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
    branch: js.UndefOr[typings.nodegit.annotatedCommitMod.AnnotatedCommit | Null],
    upstream: js.UndefOr[typings.nodegit.annotatedCommitMod.AnnotatedCommit | Null],
    onto: js.UndefOr[typings.nodegit.annotatedCommitMod.AnnotatedCommit | Null],
    opts: js.UndefOr[RebaseOptions[Any] | Null]
  ): js.Promise[typings.nodegit.rebaseMod.Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(repo.asInstanceOf[js.Any], branch.asInstanceOf[js.Any], upstream.asInstanceOf[js.Any], onto.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.rebaseMod.Rebase]]
  
  inline def initOptions(opts: RebaseOptions[Any], version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def open(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.rebaseMod.Rebase] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.rebaseMod.Rebase]]
  inline def open(repo: typings.nodegit.repositoryMod.Repository, opts: RebaseOptions[Any]): js.Promise[typings.nodegit.rebaseMod.Rebase] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.rebaseMod.Rebase]]
}
