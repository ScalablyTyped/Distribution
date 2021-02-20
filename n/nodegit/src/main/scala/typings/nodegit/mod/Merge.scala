package typings.nodegit.mod

import typings.nodegit.mergeFileInputMod.MergeFileInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Merge")
@js.native
class Merge ()
  extends typings.nodegit.mergeMod.Merge
/* static members */
object Merge {
  
  @JSImport("nodegit", "Merge.base")
  @js.native
  def base(
    repo: typings.nodegit.repositoryMod.Repository,
    one: typings.nodegit.oidMod.Oid,
    two: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  
  @JSImport("nodegit", "Merge.bases")
  @js.native
  def bases(
    repo: typings.nodegit.repositoryMod.Repository,
    one: typings.nodegit.oidMod.Oid,
    two: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.oidArrayMod.Oidarray] = js.native
  
  @JSImport("nodegit", "Merge.commits")
  @js.native
  def commits(
    repo: typings.nodegit.repositoryMod.Repository,
    ourCommit: typings.nodegit.commitMod.Commit,
    theirCommit: typings.nodegit.commitMod.Commit
  ): js.Any = js.native
  @JSImport("nodegit", "Merge.commits")
  @js.native
  def commits(
    repo: typings.nodegit.repositoryMod.Repository,
    ourCommit: typings.nodegit.commitMod.Commit,
    theirCommit: typings.nodegit.commitMod.Commit,
    options: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Any = js.native
  
  @JSImport("nodegit", "Merge.fileInitInput")
  @js.native
  def fileInitInput(opts: MergeFileInput, version: Double): Double = js.native
  
  @JSImport("nodegit", "Merge.initOptions")
  @js.native
  def initOptions(opts: typings.nodegit.mergeOptionsMod.MergeOptions, version: Double): Double = js.native
  
  @JSImport("nodegit", "Merge.merge")
  @js.native
  def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedCommitMod.AnnotatedCommit
  ): js.Any = js.native
  @JSImport("nodegit", "Merge.merge")
  @js.native
  def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: js.UndefOr[scala.Nothing],
    checkoutOpts: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Any = js.native
  @JSImport("nodegit", "Merge.merge")
  @js.native
  def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Any = js.native
  @JSImport("nodegit", "Merge.merge")
  @js.native
  def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedCommitMod.AnnotatedCommit,
    mergeOpts: typings.nodegit.mergeOptionsMod.MergeOptions,
    checkoutOpts: typings.nodegit.checkoutOptionsMod.CheckoutOptions
  ): js.Any = js.native
  
  @JSImport("nodegit", "Merge.trees")
  @js.native
  def trees(
    repo: typings.nodegit.repositoryMod.Repository,
    ancestorTree: typings.nodegit.treeMod.Tree,
    ourTree: typings.nodegit.treeMod.Tree,
    theirTree: typings.nodegit.treeMod.Tree
  ): js.Promise[Index] = js.native
  @JSImport("nodegit", "Merge.trees")
  @js.native
  def trees(
    repo: typings.nodegit.repositoryMod.Repository,
    ancestorTree: typings.nodegit.treeMod.Tree,
    ourTree: typings.nodegit.treeMod.Tree,
    theirTree: typings.nodegit.treeMod.Tree,
    opts: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
}
