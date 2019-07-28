package typings.nodegit.diffMod

import typings.nodegit.blobMod.Blob
import typings.nodegit.bufMod.Buf
import typings.nodegit.convenientDashPatchMod.ConvenientPatch
import typings.nodegit.diffDashDeltaMod.DiffDelta
import typings.nodegit.diffDashOptionsMod.DiffOptions
import typings.nodegit.diffDashPerfDashDataMod.DiffPerfdata
import typings.nodegit.diffMod.DiffNs.FORMAT
import typings.nodegit.indexUnderscoreMod.Index
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeMod.Tree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff", "Diff")
@js.native
class Diff () extends js.Object {
  def findSimilar(): js.Promise[Double] = js.native
  def findSimilar(options: DiffFindOptions): js.Promise[Double] = js.native
  def getDelta(idx: Double): DiffDelta = js.native
  def getPerfdata(): js.Promise[DiffPerfdata] = js.native
  def merge(from: Diff): js.Promise[Double] = js.native
  def numDeltas(): Double = js.native
  /**
    * Retrieve patches in this difflist
    *
    *
    */
  def patches(): js.Promise[js.Array[ConvenientPatch]] = js.native
  def toBuf(format: FORMAT): js.Promise[Buf] = js.native
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
    oldBlob: js.UndefOr[Blob],
    oldAsPath: js.UndefOr[String],
    buffer: js.UndefOr[String],
    bufferAsPath: js.UndefOr[String],
    opts: js.UndefOr[DiffOptions],
    fileCb: js.UndefOr[js.Function],
    binaryCb: js.UndefOr[js.Function],
    hunkCb: js.UndefOr[js.Function],
    lineCb: js.UndefOr[js.Function]
  ): js.Promise[_] = js.native
  def fromBuffer(content: String, contentLen: Double): js.Promise[Diff] = js.native
  def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index): js.Promise[Diff] = js.native
  def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index, opts: DiffOptions): js.Promise[Diff] = js.native
  def indexToWorkdir(repo: Repository): js.Promise[Diff] = js.native
  def indexToWorkdir(repo: Repository, index: Index): js.Promise[Diff] = js.native
  def indexToWorkdir(repo: Repository, index: Index, opts: DiffOptions): js.Promise[Diff] = js.native
  def treeToIndex(repo: Repository): js.Promise[Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree): js.Promise[Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree, index: Index): js.Promise[Diff] = js.native
  def treeToIndex(repo: Repository, oldTree: Tree, index: Index, opts: DiffOptions): js.Promise[Diff] = js.native
  def treeToTree(repo: Repository): js.Promise[Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree): js.Promise[Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree): js.Promise[Diff] = js.native
  def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree, opts: DiffOptions): js.Promise[Diff] = js.native
  def treeToWorkdir(repo: Repository): js.Promise[Diff] = js.native
  def treeToWorkdir(repo: Repository, oldTree: Tree): js.Promise[Diff] = js.native
  def treeToWorkdir(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository): js.Promise[Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree): js.Promise[Diff] = js.native
  def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[Diff] = js.native
}

