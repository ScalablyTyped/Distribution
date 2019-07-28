package typings.nodegit.mergeMod

import typings.nodegit.annotatedDashCommitMod.AnnotatedCommit
import typings.nodegit.checkoutDashOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.mergeDashFileDashInputMod.MergeFileInput
import typings.nodegit.mergeDashOptionsMod.MergeOptions
import typings.nodegit.nodegitMod.Index
import typings.nodegit.oidDashArrayMod.Oidarray
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/merge", "Merge")
@js.native
class Merge () extends js.Object

/* static members */
@JSImport("nodegit/merge", "Merge")
@js.native
object Merge extends js.Object {
  def base(repo: Repository, one: Oid, two: Oid): js.Promise[Oid] = js.native
  def bases(repo: Repository, one: Oid, two: Oid): js.Promise[Oidarray] = js.native
  def commits(repo: Repository, ourCommit: Commit, theirCommit: Commit): js.Any = js.native
  def commits(repo: Repository, ourCommit: Commit, theirCommit: Commit, options: MergeOptions): js.Any = js.native
  def fileInitInput(opts: MergeFileInput, version: Double): Double = js.native
  def initOptions(opts: MergeOptions, version: Double): Double = js.native
  def merge(repo: Repository, theirHead: AnnotatedCommit): js.Any = js.native
  def merge(repo: Repository, theirHead: AnnotatedCommit, mergeOpts: MergeOptions): js.Any = js.native
  def merge(
    repo: Repository,
    theirHead: AnnotatedCommit,
    mergeOpts: MergeOptions,
    checkoutOpts: CheckoutOptions
  ): js.Any = js.native
  def trees(repo: Repository, ancestorTree: Tree, ourTree: Tree, theirTree: Tree): js.Promise[Index] = js.native
  def trees(repo: Repository, ancestorTree: Tree, ourTree: Tree, theirTree: Tree, opts: MergeOptions): js.Promise[Index] = js.native
}

