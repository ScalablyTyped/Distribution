package typings.nodegit.mod

import typings.nodegit.diffOptionsMod.DiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Diff")
@js.native
class Diff ()
  extends typings.nodegit.diffMod.Diff
/* static members */
object Diff {
  
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  @JSImport("nodegit", "Diff.blobToBuffer")
  @js.native
  def blobToBuffer(
    oldBlob: js.UndefOr[typings.nodegit.blobMod.Blob],
    oldAsPath: js.UndefOr[String],
    buffer: js.UndefOr[String],
    bufferAsPath: js.UndefOr[String],
    opts: js.UndefOr[DiffOptions],
    fileCb: js.UndefOr[js.Function],
    binaryCb: js.UndefOr[js.Function],
    hunkCb: js.UndefOr[js.Function],
    lineCb: js.UndefOr[js.Function]
  ): js.Promise[_] = js.native
  
  @JSImport("nodegit", "Diff.fromBuffer")
  @js.native
  def fromBuffer(content: String, contentLen: Double): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  
  @JSImport("nodegit", "Diff.indexToIndex")
  @js.native
  def indexToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldIndex: typings.nodegit.indexMod.Index,
    newIndex: typings.nodegit.indexMod.Index
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.indexToIndex")
  @js.native
  def indexToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldIndex: typings.nodegit.indexMod.Index,
    newIndex: typings.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  
  @JSImport("nodegit", "Diff.indexToWorkdir")
  @js.native
  def indexToWorkdir(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.indexToWorkdir")
  @js.native
  def indexToWorkdir(
    repo: typings.nodegit.repositoryMod.Repository,
    index: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.indexToWorkdir")
  @js.native
  def indexToWorkdir(repo: typings.nodegit.repositoryMod.Repository, index: typings.nodegit.indexMod.Index): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.indexToWorkdir")
  @js.native
  def indexToWorkdir(
    repo: typings.nodegit.repositoryMod.Repository,
    index: typings.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  
  @JSImport("nodegit", "Diff.treeToIndex")
  @js.native
  def treeToIndex(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToIndex")
  @js.native
  def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToIndex")
  @js.native
  def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: js.UndefOr[scala.Nothing],
    index: typings.nodegit.indexMod.Index
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToIndex")
  @js.native
  def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: js.UndefOr[scala.Nothing],
    index: typings.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToIndex")
  @js.native
  def treeToIndex(repo: typings.nodegit.repositoryMod.Repository, oldTree: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToIndex")
  @js.native
  def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    index: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToIndex")
  @js.native
  def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    index: typings.nodegit.indexMod.Index
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToIndex")
  @js.native
  def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    index: typings.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  
  @JSImport("nodegit", "Diff.treeToTree")
  @js.native
  def treeToTree(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToTree")
  @js.native
  def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: js.UndefOr[scala.Nothing],
    new_tree: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToTree")
  @js.native
  def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: js.UndefOr[scala.Nothing],
    new_tree: typings.nodegit.treeMod.Tree
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToTree")
  @js.native
  def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: js.UndefOr[scala.Nothing],
    new_tree: typings.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToTree")
  @js.native
  def treeToTree(repo: typings.nodegit.repositoryMod.Repository, oldTree: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToTree")
  @js.native
  def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    new_tree: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToTree")
  @js.native
  def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    new_tree: typings.nodegit.treeMod.Tree
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToTree")
  @js.native
  def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    new_tree: typings.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  
  @JSImport("nodegit", "Diff.treeToWorkdir")
  @js.native
  def treeToWorkdir(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToWorkdir")
  @js.native
  def treeToWorkdir(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToWorkdir")
  @js.native
  def treeToWorkdir(repo: typings.nodegit.repositoryMod.Repository, oldTree: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToWorkdir")
  @js.native
  def treeToWorkdir(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  
  @JSImport("nodegit", "Diff.treeToWorkdirWithIndex")
  @js.native
  def treeToWorkdirWithIndex(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToWorkdirWithIndex")
  @js.native
  def treeToWorkdirWithIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: js.UndefOr[scala.Nothing],
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToWorkdirWithIndex")
  @js.native
  def treeToWorkdirWithIndex(repo: typings.nodegit.repositoryMod.Repository, oldTree: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.diffMod.Diff] = js.native
  @JSImport("nodegit", "Diff.treeToWorkdirWithIndex")
  @js.native
  def treeToWorkdirWithIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = js.native
}
