package typings.nodegit.mod

import typings.nodegit.stashMod.StashApplyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Stash")
@js.native
open class Stash ()
  extends typings.nodegit.stashMod.Stash
/* static members */
object Stash {
  
  @JSImport("nodegit", "Stash")
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def apply(repo: typings.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def applyInitOptions(opts: StashApplyOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("applyInitOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def drop(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def foreach(repo: typings.nodegit.repositoryMod.Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def foreach(repo: typings.nodegit.repositoryMod.Repository, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def pop(repo: typings.nodegit.repositoryMod.Repository, index: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pop")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def pop(repo: typings.nodegit.repositoryMod.Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pop")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def save(
    repo: typings.nodegit.repositoryMod.Repository,
    stasher: typings.nodegit.signatureMod.Signature,
    message: String,
    flags: Double
  ): js.Promise[typings.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(repo.asInstanceOf[js.Any], stasher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidMod.Oid]]
}
