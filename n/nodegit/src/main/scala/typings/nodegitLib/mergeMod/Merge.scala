package typings
package nodegitLib.mergeMod

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
  def base(repo: nodegitLib.repositoryMod.Repository, one: nodegitLib.oidMod.Oid, two: nodegitLib.oidMod.Oid): js.Promise[nodegitLib.oidMod.Oid] = js.native
  def bases(repo: nodegitLib.repositoryMod.Repository, one: nodegitLib.oidMod.Oid, two: nodegitLib.oidMod.Oid): js.Promise[nodegitLib.oidDashArrayMod.Oidarray] = js.native
  def commits(
    repo: nodegitLib.repositoryMod.Repository,
    ourCommit: nodegitLib.commitMod.Commit,
    theirCommit: nodegitLib.commitMod.Commit
  ): js.Any = js.native
  def commits(
    repo: nodegitLib.repositoryMod.Repository,
    ourCommit: nodegitLib.commitMod.Commit,
    theirCommit: nodegitLib.commitMod.Commit,
    options: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): js.Any = js.native
  def fileInitInput(opts: nodegitLib.mergeDashFileDashInputMod.MergeFileInput, version: scala.Double): scala.Double = js.native
  def initOptions(opts: nodegitLib.mergeDashOptionsMod.MergeOptions, version: scala.Double): scala.Double = js.native
  def merge(
    repo: nodegitLib.repositoryMod.Repository,
    theirHead: nodegitLib.annotatedDashCommitMod.AnnotatedCommit
  ): js.Any = js.native
  def merge(
    repo: nodegitLib.repositoryMod.Repository,
    theirHead: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    mergeOpts: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): js.Any = js.native
  def merge(
    repo: nodegitLib.repositoryMod.Repository,
    theirHead: nodegitLib.annotatedDashCommitMod.AnnotatedCommit,
    mergeOpts: nodegitLib.mergeDashOptionsMod.MergeOptions,
    checkoutOpts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): js.Any = js.native
  def trees(
    repo: nodegitLib.repositoryMod.Repository,
    ancestorTree: nodegitLib.treeMod.Tree,
    ourTree: nodegitLib.treeMod.Tree,
    theirTree: nodegitLib.treeMod.Tree
  ): js.Promise[nodegitLib.nodegitMod.Index] = js.native
  def trees(
    repo: nodegitLib.repositoryMod.Repository,
    ancestorTree: nodegitLib.treeMod.Tree,
    ourTree: nodegitLib.treeMod.Tree,
    theirTree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): js.Promise[nodegitLib.nodegitMod.Index] = js.native
}

