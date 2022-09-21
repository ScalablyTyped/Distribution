package typings.nodegit.mod

import typings.nodegit.diffOptionsMod.DiffOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Diff")
@js.native
open class Diff ()
  extends typings.nodegit.diffMod.Diff
/* static members */
object Diff {
  
  @JSImport("nodegit", "Diff")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Directly run a diff between a blob and a buffer.
    *
    *
    */
  inline def blobToBuffer(
    oldBlob: js.UndefOr[typings.nodegit.blobMod.Blob],
    oldAsPath: js.UndefOr[String],
    buffer: js.UndefOr[String],
    bufferAsPath: js.UndefOr[String],
    opts: js.UndefOr[DiffOptions],
    fileCb: js.UndefOr[js.Function],
    binaryCb: js.UndefOr[js.Function],
    hunkCb: js.UndefOr[js.Function],
    lineCb: js.UndefOr[js.Function]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobToBuffer")(oldBlob.asInstanceOf[js.Any], oldAsPath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], bufferAsPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fileCb.asInstanceOf[js.Any], binaryCb.asInstanceOf[js.Any], hunkCb.asInstanceOf[js.Any], lineCb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def fromBuffer(content: String, contentLen: Double): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(content.asInstanceOf[js.Any], contentLen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  
  inline def indexToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldIndex: typings.nodegit.indexMod.Index,
    newIndex: typings.nodegit.indexMod.Index
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToIndex")(repo.asInstanceOf[js.Any], oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def indexToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldIndex: typings.nodegit.indexMod.Index,
    newIndex: typings.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToIndex")(repo.asInstanceOf[js.Any], oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  
  inline def indexToWorkdir(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def indexToWorkdir(repo: typings.nodegit.repositoryMod.Repository, index: Unit, opts: DiffOptions): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def indexToWorkdir(repo: typings.nodegit.repositoryMod.Repository, index: typings.nodegit.indexMod.Index): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def indexToWorkdir(
    repo: typings.nodegit.repositoryMod.Repository,
    index: typings.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  
  inline def treeToIndex(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToIndex(repo: typings.nodegit.repositoryMod.Repository, oldTree: Unit, index: Unit, opts: DiffOptions): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    index: typings.nodegit.indexMod.Index
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    index: typings.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToIndex(repo: typings.nodegit.repositoryMod.Repository, oldTree: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    index: Unit,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    index: typings.nodegit.indexMod.Index
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    index: typings.nodegit.indexMod.Index,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  
  inline def treeToTree(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToTree(repo: typings.nodegit.repositoryMod.Repository, oldTree: Unit, new_tree: Unit, opts: DiffOptions): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    new_tree: typings.nodegit.treeMod.Tree
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: Unit,
    new_tree: typings.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToTree(repo: typings.nodegit.repositoryMod.Repository, oldTree: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    new_tree: Unit,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    new_tree: typings.nodegit.treeMod.Tree
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToTree(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    new_tree: typings.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  
  inline def treeToWorkdir(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToWorkdir(repo: typings.nodegit.repositoryMod.Repository, oldTree: Unit, opts: DiffOptions): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToWorkdir(repo: typings.nodegit.repositoryMod.Repository, oldTree: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToWorkdir(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  
  inline def treeToWorkdirWithIndex(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.diffMod.Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToWorkdirWithIndex(repo: typings.nodegit.repositoryMod.Repository, oldTree: Unit, opts: DiffOptions): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToWorkdirWithIndex(repo: typings.nodegit.repositoryMod.Repository, oldTree: typings.nodegit.treeMod.Tree): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
  inline def treeToWorkdirWithIndex(
    repo: typings.nodegit.repositoryMod.Repository,
    oldTree: typings.nodegit.treeMod.Tree,
    opts: DiffOptions
  ): js.Promise[typings.nodegit.diffMod.Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.diffMod.Diff]]
}
