package typings.nodegit.mod

import typings.nodegit.mergeFileInputMod.MergeFileInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Merge")
@js.native
class Merge ()
  extends typings.nodegit.mergeMod.Merge
/* static members */
object Merge {
  
  @JSImport("nodegit", "Merge")
  @js.native
  val ^ : js.Any = js.native
  
  inline def base(
    repo: typings.nodegit.repositoryMod.Repository,
    one: typings.nodegit.oidMod.Oid,
    two: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("base")(repo.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidMod.Oid]]
  
  inline def bases(
    repo: typings.nodegit.repositoryMod.Repository,
    one: typings.nodegit.oidMod.Oid,
    two: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.oidArrayMod.Oidarray] = (^.asInstanceOf[js.Dynamic].applyDynamic("bases")(repo.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.oidArrayMod.Oidarray]]
  
  inline def commits(
    repo: typings.nodegit.repositoryMod.Repository,
    ourCommit: typings.nodegit.commitMod.Commit,
    theirCommit: typings.nodegit.commitMod.Commit
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("commits")(repo.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], theirCommit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def commits(
    repo: typings.nodegit.repositoryMod.Repository,
    ourCommit: typings.nodegit.commitMod.Commit,
    theirCommit: typings.nodegit.commitMod.Commit,
    options: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("commits")(repo.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], theirCommit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def fileInitInput(opts: MergeFileInput, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fileInitInput")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def initOptions(opts: typings.nodegit.mergeOptionsMod.MergeOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedCommitMod.AnnotatedCommit
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: Unit,
    checkoutOpts: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typings.nodegit.mergeOptionsMod.MergeOptions,
    checkoutOpts: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def trees(
    repo: typings.nodegit.repositoryMod.Repository,
    ancestorTree: typings.nodegit.treeMod.Tree,
    ourTree: typings.nodegit.treeMod.Tree,
    theirTree: typings.nodegit.treeMod.Tree
  ): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("trees")(repo.asInstanceOf[js.Any], ancestorTree.asInstanceOf[js.Any], ourTree.asInstanceOf[js.Any], theirTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
  inline def trees(
    repo: typings.nodegit.repositoryMod.Repository,
    ancestorTree: typings.nodegit.treeMod.Tree,
    ourTree: typings.nodegit.treeMod.Tree,
    theirTree: typings.nodegit.treeMod.Tree,
    opts: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("trees")(repo.asInstanceOf[js.Any], ancestorTree.asInstanceOf[js.Any], ourTree.asInstanceOf[js.Any], theirTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
}
