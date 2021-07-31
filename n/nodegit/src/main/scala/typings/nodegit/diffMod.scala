package typings.nodegit

import typings.nodegit.blobMod.Blob
import typings.nodegit.bufMod.Buf
import typings.nodegit.convenientPatchMod.ConvenientPatch
import typings.nodegit.diffDeltaMod.DiffDelta
import typings.nodegit.diffMod.Diff.FORMAT
import typings.nodegit.diffOptionsMod.DiffOptions
import typings.nodegit.diffPerfDataMod.DiffPerfdata
import typings.nodegit.diffStatsMod.DiffStats
import typings.nodegit.indexMod.Index
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1024`
import typings.nodegit.nodegitNumbers.`1048576`
import typings.nodegit.nodegitNumbers.`1073741824`
import typings.nodegit.nodegitNumbers.`10`
import typings.nodegit.nodegitNumbers.`128`
import typings.nodegit.nodegitNumbers.`131072`
import typings.nodegit.nodegitNumbers.`16384`
import typings.nodegit.nodegitNumbers.`16777216`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2048`
import typings.nodegit.nodegitNumbers.`2097152`
import typings.nodegit.nodegitNumbers.`255`
import typings.nodegit.nodegitNumbers.`256`
import typings.nodegit.nodegitNumbers.`268435456`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32768`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`33554432`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4096`
import typings.nodegit.nodegitNumbers.`4194304`
import typings.nodegit.nodegitNumbers.`43`
import typings.nodegit.nodegitNumbers.`45`
import typings.nodegit.nodegitNumbers.`48`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`512`
import typings.nodegit.nodegitNumbers.`536870912`
import typings.nodegit.nodegitNumbers.`5`
import typings.nodegit.nodegitNumbers.`60`
import typings.nodegit.nodegitNumbers.`61`
import typings.nodegit.nodegitNumbers.`62`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`65536`
import typings.nodegit.nodegitNumbers.`66`
import typings.nodegit.nodegitNumbers.`67108864`
import typings.nodegit.nodegitNumbers.`6`
import typings.nodegit.nodegitNumbers.`70`
import typings.nodegit.nodegitNumbers.`72`
import typings.nodegit.nodegitNumbers.`7`
import typings.nodegit.nodegitNumbers.`8192`
import typings.nodegit.nodegitNumbers.`8388608`
import typings.nodegit.nodegitNumbers.`8`
import typings.nodegit.nodegitNumbers.`9`
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("nodegit/diff", "Diff")
  @js.native
  class Diff () extends StObject {
    
    def findSimilar(): js.Promise[Double] = js.native
    def findSimilar(options: DiffFindOptions): js.Promise[Double] = js.native
    
    def getDelta(idx: Double): DiffDelta = js.native
    
    def getPerfdata(): js.Promise[DiffPerfdata] = js.native
    
    /**
      * @returns - Structure containg the diff statistics.
      */
    def getStats(): js.Promise[DiffStats] = js.native
    
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
  object Diff {
    
    @JSImport("nodegit/diff", "Diff")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Directly run a diff between a blob and a buffer.
      *
      *
      */
    @scala.inline
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
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobToBuffer")(oldBlob.asInstanceOf[js.Any], oldAsPath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], bufferAsPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fileCb.asInstanceOf[js.Any], binaryCb.asInstanceOf[js.Any], hunkCb.asInstanceOf[js.Any], lineCb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def fromBuffer(content: String, contentLen: Double): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(content.asInstanceOf[js.Any], contentLen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    @scala.inline
    def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToIndex")(repo.asInstanceOf[js.Any], oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def indexToIndex(repo: Repository, oldIndex: Index, newIndex: Index, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToIndex")(repo.asInstanceOf[js.Any], oldIndex.asInstanceOf[js.Any], newIndex.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    @scala.inline
    def indexToWorkdir(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def indexToWorkdir(repo: Repository, index: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def indexToWorkdir(repo: Repository, index: Index): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def indexToWorkdir(repo: Repository, index: Index, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToWorkdir")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    @scala.inline
    def treeToIndex(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToIndex(repo: Repository, oldTree: Unit, index: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToIndex(repo: Repository, oldTree: Unit, index: Index): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToIndex(repo: Repository, oldTree: Unit, index: Index, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToIndex(repo: Repository, oldTree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToIndex(repo: Repository, oldTree: Tree, index: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToIndex(repo: Repository, oldTree: Tree, index: Index): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToIndex(repo: Repository, oldTree: Tree, index: Index, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    @scala.inline
    def treeToTree(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToTree(repo: Repository, oldTree: Unit, new_tree: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToTree(repo: Repository, oldTree: Unit, new_tree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToTree(repo: Repository, oldTree: Unit, new_tree: Tree, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToTree(repo: Repository, oldTree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToTree(repo: Repository, oldTree: Tree, new_tree: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToTree(repo: Repository, oldTree: Tree, new_tree: Tree, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToTree")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], new_tree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    @scala.inline
    def treeToWorkdir(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToWorkdir(repo: Repository, oldTree: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToWorkdir(repo: Repository, oldTree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToWorkdir(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdir")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    @scala.inline
    def treeToWorkdirWithIndex(repo: Repository): js.Promise[Diff] = ^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToWorkdirWithIndex(repo: Repository, oldTree: Unit, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    @scala.inline
    def treeToWorkdirWithIndex(repo: Repository, oldTree: Tree, opts: DiffOptions): js.Promise[Diff] = (^.asInstanceOf[js.Dynamic].applyDynamic("treeToWorkdirWithIndex")(repo.asInstanceOf[js.Any], oldTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Diff]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`5`
      - typings.nodegit.nodegitNumbers.`6`
      - typings.nodegit.nodegitNumbers.`7`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`9`
      - typings.nodegit.nodegitNumbers.`10`
    */
    trait DELTA extends StObject
    object DELTA {
      
      @scala.inline
      def ADDED: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def CONFLICTED: `10` = 10.asInstanceOf[`10`]
      
      @scala.inline
      def COPIED: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def DELETED: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def IGNORED: `6` = 6.asInstanceOf[`6`]
      
      @scala.inline
      def MODIFIED: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def RENAMED: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def TYPECHANGE: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def UNMODIFIED: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def UNREADABLE: `9` = 9.asInstanceOf[`9`]
      
      @scala.inline
      def UNTRACKED: `7` = 7.asInstanceOf[`7`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`16`
      - typings.nodegit.nodegitNumbers.`32`
      - typings.nodegit.nodegitNumbers.`48`
      - typings.nodegit.nodegitNumbers.`64`
      - typings.nodegit.nodegitNumbers.`255`
      - typings.nodegit.nodegitNumbers.`4096`
      - typings.nodegit.nodegitNumbers.`8192`
      - typings.nodegit.nodegitNumbers.`16384`
      - typings.nodegit.nodegitNumbers.`32768`
      - typings.nodegit.nodegitNumbers.`65536`
    */
    trait FIND extends StObject
    object FIND {
      
      @scala.inline
      def ALL: `255` = 255.asInstanceOf[`255`]
      
      @scala.inline
      def AND_BREAK_REWRITES: `48` = 48.asInstanceOf[`48`]
      
      @scala.inline
      def BREAK_REWRITES: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def BREAK_REWRITES_FOR_RENAMES_ONLY: `32768` = 32768.asInstanceOf[`32768`]
      
      @scala.inline
      def BY_CONFIG: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def COPIES: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def COPIES_FROM_UNMODIFIED: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def DONT_IGNORE_WHITESPACE: `8192` = 8192.asInstanceOf[`8192`]
      
      @scala.inline
      def EXACT_MATCH_ONLY: `16384` = 16384.asInstanceOf[`16384`]
      
      @scala.inline
      def FOR_UNTRACKED: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def IGNORE_LEADING_WHITESPACE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def IGNORE_WHITESPACE: `4096` = 4096.asInstanceOf[`4096`]
      
      @scala.inline
      def REMOVE_UNMODIFIED: `65536` = 65536.asInstanceOf[`65536`]
      
      @scala.inline
      def RENAMES: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def RENAMES_FROM_REWRITES: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def REWRITES: `16` = 16.asInstanceOf[`16`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
    */
    trait FLAG extends StObject
    object FLAG {
      
      @scala.inline
      def BINARY: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def EXISTS: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def NOT_BINARY: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def VALID_ID: `4` = 4.asInstanceOf[`4`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`5`
    */
    trait FORMAT extends StObject
    object FORMAT {
      
      @scala.inline
      def NAME_ONLY: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def NAME_STATUS: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def PATCH: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def PATCH_HEADER: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def RAW: `3` = 3.asInstanceOf[`3`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
    */
    trait FORMAT_EMAIL_FLAGS extends StObject
    object FORMAT_EMAIL_FLAGS {
      
      @scala.inline
      def FORMAT_EMAIL_EXCLUDE_SUBJECT_PATCH_MARKER: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def FORMAT_EMAIL_NONE: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`32`
      - typings.nodegit.nodegitNumbers.`43`
      - typings.nodegit.nodegitNumbers.`45`
      - typings.nodegit.nodegitNumbers.`61`
      - typings.nodegit.nodegitNumbers.`62`
      - typings.nodegit.nodegitNumbers.`60`
      - typings.nodegit.nodegitNumbers.`70`
      - typings.nodegit.nodegitNumbers.`72`
      - typings.nodegit.nodegitNumbers.`66`
    */
    trait LINE extends StObject
    object LINE {
      
      @scala.inline
      def ADDITION: `43` = 43.asInstanceOf[`43`]
      
      @scala.inline
      def ADD_EOFNL: `62` = 62.asInstanceOf[`62`]
      
      @scala.inline
      def BINARY: `66` = 66.asInstanceOf[`66`]
      
      @scala.inline
      def CONTEXT: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def CONTEXT_EOFNL: `61` = 61.asInstanceOf[`61`]
      
      @scala.inline
      def DELETION: `45` = 45.asInstanceOf[`45`]
      
      @scala.inline
      def DEL_EOFNL: `60` = 60.asInstanceOf[`60`]
      
      @scala.inline
      def FILE_HDR: `70` = 70.asInstanceOf[`70`]
      
      @scala.inline
      def HUNK_HDR: `72` = 72.asInstanceOf[`72`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`16`
      - typings.nodegit.nodegitNumbers.`32`
      - typings.nodegit.nodegitNumbers.`64`
      - typings.nodegit.nodegitNumbers.`128`
      - typings.nodegit.nodegitNumbers.`256`
      - typings.nodegit.nodegitNumbers.`512`
      - typings.nodegit.nodegitNumbers.`1024`
      - typings.nodegit.nodegitNumbers.`2048`
      - typings.nodegit.nodegitNumbers.`4096`
      - typings.nodegit.nodegitNumbers.`8192`
      - typings.nodegit.nodegitNumbers.`16384`
      - typings.nodegit.nodegitNumbers.`32768`
      - typings.nodegit.nodegitNumbers.`65536`
      - typings.nodegit.nodegitNumbers.`131072`
      - typings.nodegit.nodegitNumbers.`1048576`
      - typings.nodegit.nodegitNumbers.`2097152`
      - typings.nodegit.nodegitNumbers.`4194304`
      - typings.nodegit.nodegitNumbers.`8388608`
      - typings.nodegit.nodegitNumbers.`16777216`
      - typings.nodegit.nodegitNumbers.`33554432`
      - typings.nodegit.nodegitNumbers.`67108864`
      - typings.nodegit.nodegitNumbers.`268435456`
      - typings.nodegit.nodegitNumbers.`536870912`
      - typings.nodegit.nodegitNumbers.`1073741824`
    */
    trait OPTION extends StObject
    object OPTION {
      
      @scala.inline
      def DISABLE_PATHSPEC_MATCH: `4096` = 4096.asInstanceOf[`4096`]
      
      @scala.inline
      def ENABLE_FAST_UNTRACKED_DIRS: `16384` = 16384.asInstanceOf[`16384`]
      
      @scala.inline
      def FORCE_BINARY: `2097152` = 2097152.asInstanceOf[`2097152`]
      
      @scala.inline
      def FORCE_TEXT: `1048576` = 1048576.asInstanceOf[`1048576`]
      
      @scala.inline
      def IGNORE_CASE: `1024` = 1024.asInstanceOf[`1024`]
      
      @scala.inline
      def IGNORE_FILEMODE: `256` = 256.asInstanceOf[`256`]
      
      @scala.inline
      def IGNORE_SUBMODULES: `512` = 512.asInstanceOf[`512`]
      
      @scala.inline
      def IGNORE_WHITESPACE: `4194304` = 4194304.asInstanceOf[`4194304`]
      
      @scala.inline
      def IGNORE_WHITESPACE_CHANGE: `8388608` = 8388608.asInstanceOf[`8388608`]
      
      @scala.inline
      def IGNORE_WHITESPACE_EOL: `16777216` = 16777216.asInstanceOf[`16777216`]
      
      @scala.inline
      def INCLUDE_CASECHANGE: `2048` = 2048.asInstanceOf[`2048`]
      
      @scala.inline
      def INCLUDE_IGNORED: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def INCLUDE_TYPECHANGE: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def INCLUDE_TYPECHANGE_TREES: `128` = 128.asInstanceOf[`128`]
      
      @scala.inline
      def INCLUDE_UNMODIFIED: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def INCLUDE_UNREADABLE: `65536` = 65536.asInstanceOf[`65536`]
      
      @scala.inline
      def INCLUDE_UNREADABLE_AS_UNTRACKED: `131072` = 131072.asInstanceOf[`131072`]
      
      @scala.inline
      def INCLUDE_UNTRACKED: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def MINIMAL: `536870912` = 536870912.asInstanceOf[`536870912`]
      
      @scala.inline
      def NORMAL: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def PATIENCE: `268435456` = 268435456.asInstanceOf[`268435456`]
      
      @scala.inline
      def RECURSE_IGNORED_DIRS: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def RECURSE_UNTRACKED_DIRS: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def REVERSE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def SHOW_BINARY: `1073741824` = 1073741824.asInstanceOf[`1073741824`]
      
      @scala.inline
      def SHOW_UNMODIFIED: `67108864` = 67108864.asInstanceOf[`67108864`]
      
      @scala.inline
      def SHOW_UNTRACKED_CONTENT: `33554432` = 33554432.asInstanceOf[`33554432`]
      
      @scala.inline
      def SKIP_BINARY_CHECK: `8192` = 8192.asInstanceOf[`8192`]
      
      @scala.inline
      def UPDATE_INDEX: `32768` = 32768.asInstanceOf[`32768`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
    */
    trait STATS_FORMAT extends StObject
    object STATS_FORMAT {
      
      @scala.inline
      def STATS_FULL: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def STATS_INCLUDE_SUMMARY: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def STATS_NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def STATS_NUMBER: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def STATS_SHORT: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  trait DiffFindOptions extends StObject {
    
    var breakRewriteThreshold: js.UndefOr[Double] = js.undefined
    
    var copyThreshold: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var renameFromRewriteThreshold: js.UndefOr[Double] = js.undefined
    
    var renameLimit: js.UndefOr[Double] = js.undefined
    
    var renameThreshold: js.UndefOr[Double] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object DiffFindOptions {
    
    @scala.inline
    def apply(): DiffFindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffFindOptions]
    }
    
    @scala.inline
    implicit class DiffFindOptionsMutableBuilder[Self <: DiffFindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakRewriteThreshold(value: Double): Self = StObject.set(x, "breakRewriteThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakRewriteThresholdUndefined: Self = StObject.set(x, "breakRewriteThreshold", js.undefined)
      
      @scala.inline
      def setCopyThreshold(value: Double): Self = StObject.set(x, "copyThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyThresholdUndefined: Self = StObject.set(x, "copyThreshold", js.undefined)
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setRenameFromRewriteThreshold(value: Double): Self = StObject.set(x, "renameFromRewriteThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameFromRewriteThresholdUndefined: Self = StObject.set(x, "renameFromRewriteThreshold", js.undefined)
      
      @scala.inline
      def setRenameLimit(value: Double): Self = StObject.set(x, "renameLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameLimitUndefined: Self = StObject.set(x, "renameLimit", js.undefined)
      
      @scala.inline
      def setRenameThreshold(value: Double): Self = StObject.set(x, "renameThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenameThresholdUndefined: Self = StObject.set(x, "renameThreshold", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
