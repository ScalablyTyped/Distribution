package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Diff")
@js.native
class Diff ()
  extends nodegitLib.diffMod.Diff

/* static members */
@JSImport("nodegit", "Diff")
@js.native
object Diff extends js.Object {
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  def blobToBuffer(
    oldBlob: nodegitLib.blobMod.Blob,
    oldAsPath: java.lang.String,
    buffer: java.lang.String,
    bufferAsPath: java.lang.String,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions,
    fileCb: js.Function,
    binaryCb: js.Function,
    hunkCb: js.Function,
    lineCb: js.Function
  ): js.Promise[_] = js.native
  def fromBuffer(content: java.lang.String, contentLen: scala.Double): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldIndex: nodegitLib.indexUnderscoreMod.Index,
    newIndex: nodegitLib.indexUnderscoreMod.Index
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldIndex: nodegitLib.indexUnderscoreMod.Index,
    newIndex: nodegitLib.indexUnderscoreMod.Index,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToWorkdir(repo: nodegitLib.repositoryMod.Repository, index: nodegitLib.indexUnderscoreMod.Index): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToWorkdir(
    repo: nodegitLib.repositoryMod.Repository,
    index: nodegitLib.indexUnderscoreMod.Index,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    index: nodegitLib.indexUnderscoreMod.Index
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    index: nodegitLib.indexUnderscoreMod.Index,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToTree(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    new_tree: nodegitLib.treeMod.Tree
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToTree(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    new_tree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdir(repo: nodegitLib.repositoryMod.Repository, oldTree: nodegitLib.treeMod.Tree): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdir(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: nodegitLib.repositoryMod.Repository, oldTree: nodegitLib.treeMod.Tree): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
}

