package typings
package nodegitLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff", "Diff")
@js.native
class Diff () extends js.Object {
  def findSimilar(): js.Promise[scala.Double] = js.native
  def findSimilar(options: DiffFindOptions): js.Promise[scala.Double] = js.native
  def getDelta(idx: scala.Double): nodegitLib.diffDashDeltaMod.DiffDelta = js.native
  def getPerfdata(): js.Promise[nodegitLib.diffDashPerfDashDataMod.DiffPerfdata] = js.native
  def merge(from: Diff): js.Promise[scala.Double] = js.native
  def numDeltas(): scala.Double = js.native
  /**
    * Retrieve patches in this difflist
    *
    *
    */
  def patches(): js.Promise[js.Array[nodegitLib.convenientDashPatchMod.ConvenientPatch]] = js.native
  def toBuf(format: nodegitLib.diffMod.DiffNs.FORMAT): js.Promise[nodegitLib.bufMod.Buf] = js.native
}

/* static members */
@JSImport("nodegit/diff", "Diff")
@js.native
object Diff extends js.Object {
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  def blobToBuffer(
    oldBlob: js.UndefOr[nodegitLib.blobMod.Blob],
    oldAsPath: js.UndefOr[java.lang.String],
    buffer: js.UndefOr[java.lang.String],
    bufferAsPath: js.UndefOr[java.lang.String],
    opts: js.UndefOr[nodegitLib.diffDashOptionsMod.DiffOptions],
    fileCb: js.UndefOr[js.Function],
    binaryCb: js.UndefOr[js.Function],
    hunkCb: js.UndefOr[js.Function],
    lineCb: js.UndefOr[js.Function]
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
  def indexToWorkdir(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToWorkdir(repo: nodegitLib.repositoryMod.Repository, index: nodegitLib.indexUnderscoreMod.Index): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToWorkdir(
    repo: nodegitLib.repositoryMod.Repository,
    index: nodegitLib.indexUnderscoreMod.Index,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToIndex(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToIndex(repo: nodegitLib.repositoryMod.Repository, oldTree: nodegitLib.treeMod.Tree): js.Promise[nodegitLib.diffMod.Diff] = js.native
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
  def treeToTree(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToTree(repo: nodegitLib.repositoryMod.Repository, oldTree: nodegitLib.treeMod.Tree): js.Promise[nodegitLib.diffMod.Diff] = js.native
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
  def treeToWorkdir(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdir(repo: nodegitLib.repositoryMod.Repository, oldTree: nodegitLib.treeMod.Tree): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdir(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: nodegitLib.repositoryMod.Repository): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: nodegitLib.repositoryMod.Repository, oldTree: nodegitLib.treeMod.Tree): js.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): js.Promise[nodegitLib.diffMod.Diff] = js.native
}

