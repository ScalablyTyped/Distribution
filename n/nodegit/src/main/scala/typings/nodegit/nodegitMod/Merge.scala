package typings.nodegit.nodegitMod

import typings.nodegit.mergeDashFileDashInputMod.MergeFileInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Merge")
@js.native
class Merge ()
  extends typings.nodegit.mergeMod.Merge

/* static members */
@JSImport("nodegit", "Merge")
@js.native
object Merge extends js.Object {
  def base(
    repo: typings.nodegit.repositoryMod.Repository,
    one: typings.nodegit.oidMod.Oid,
    two: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.oidMod.Oid] = js.native
  def bases(
    repo: typings.nodegit.repositoryMod.Repository,
    one: typings.nodegit.oidMod.Oid,
    two: typings.nodegit.oidMod.Oid
  ): js.Promise[typings.nodegit.oidDashArrayMod.Oidarray] = js.native
  def commits(
    repo: typings.nodegit.repositoryMod.Repository,
    ourCommit: typings.nodegit.commitMod.Commit,
    theirCommit: typings.nodegit.commitMod.Commit
  ): js.Any = js.native
  def commits(
    repo: typings.nodegit.repositoryMod.Repository,
    ourCommit: typings.nodegit.commitMod.Commit,
    theirCommit: typings.nodegit.commitMod.Commit,
    options: typings.nodegit.mergeDashOptionsMod.MergeOptions
  ): js.Any = js.native
  def fileInitInput(opts: MergeFileInput, version: Double): Double = js.native
  def initOptions(opts: typings.nodegit.mergeDashOptionsMod.MergeOptions, version: Double): Double = js.native
  def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit
  ): js.Any = js.native
  def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit,
    mergeOpts: typings.nodegit.mergeDashOptionsMod.MergeOptions
  ): js.Any = js.native
  def merge(
    repo: typings.nodegit.repositoryMod.Repository,
    theirHead: typings.nodegit.annotatedDashCommitMod.AnnotatedCommit,
    mergeOpts: typings.nodegit.mergeDashOptionsMod.MergeOptions,
    checkoutOpts: typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
  ): js.Any = js.native
  def trees(
    repo: typings.nodegit.repositoryMod.Repository,
    ancestorTree: typings.nodegit.treeMod.Tree,
    ourTree: typings.nodegit.treeMod.Tree,
    theirTree: typings.nodegit.treeMod.Tree
  ): js.Promise[Index] = js.native
  def trees(
    repo: typings.nodegit.repositoryMod.Repository,
    ancestorTree: typings.nodegit.treeMod.Tree,
    ourTree: typings.nodegit.treeMod.Tree,
    theirTree: typings.nodegit.treeMod.Tree,
    opts: typings.nodegit.mergeDashOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
}

