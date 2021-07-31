package typings.nodegit

import typings.nodegit.annotatedCommitMod.AnnotatedCommit
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.mergeFileInputMod.MergeFileInput
import typings.nodegit.mergeOptionsMod.MergeOptions
import typings.nodegit.mod.Index
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`128`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`8`
import typings.nodegit.oidArrayMod.Oidarray
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("nodegit/merge", "Merge")
  @js.native
  class Merge () extends StObject
  /* static members */
  object Merge {
    
    @JSImport("nodegit/merge", "Merge")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def base(repo: Repository, one: Oid, two: Oid): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("base")(repo.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    @scala.inline
    def bases(repo: Repository, one: Oid, two: Oid): js.Promise[Oidarray] = (^.asInstanceOf[js.Dynamic].applyDynamic("bases")(repo.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oidarray]]
    
    @scala.inline
    def commits(repo: Repository, ourCommit: Commit, theirCommit: Commit): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("commits")(repo.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], theirCommit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def commits(repo: Repository, ourCommit: Commit, theirCommit: Commit, options: MergeOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("commits")(repo.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], theirCommit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def fileInitInput(opts: MergeFileInput, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fileInitInput")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def initOptions(opts: MergeOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def merge(repo: Repository, theirHead: AnnotatedCommit): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def merge(repo: Repository, theirHead: AnnotatedCommit, mergeOpts: Unit, checkoutOpts: CheckoutOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def merge(repo: Repository, theirHead: AnnotatedCommit, mergeOpts: MergeOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def merge(
      repo: Repository,
      theirHead: AnnotatedCommit,
      mergeOpts: MergeOptions,
      checkoutOpts: CheckoutOptions
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(repo.asInstanceOf[js.Any], theirHead.asInstanceOf[js.Any], mergeOpts.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def trees(repo: Repository, ancestorTree: Tree, ourTree: Tree, theirTree: Tree): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("trees")(repo.asInstanceOf[js.Any], ancestorTree.asInstanceOf[js.Any], ourTree.asInstanceOf[js.Any], theirTree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
    @scala.inline
    def trees(repo: Repository, ancestorTree: Tree, ourTree: Tree, theirTree: Tree, opts: MergeOptions): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("trees")(repo.asInstanceOf[js.Any], ancestorTree.asInstanceOf[js.Any], ourTree.asInstanceOf[js.Any], theirTree.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
    */
    trait ANALYSIS extends StObject
    object ANALYSIS {
      
      @scala.inline
      def FASTFORWARD: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def NORMAL: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def UNBORN: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def UP_TO_DATE: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
    */
    trait FILE_FAVOR extends StObject
    object FILE_FAVOR {
      
      @scala.inline
      def NORMAL: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def OURS: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def THEIRS: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def UNION: `3` = 3.asInstanceOf[`3`]
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
    */
    trait FILE_FLAGS extends StObject
    object FILE_FLAGS {
      
      @scala.inline
      def FILE_DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def FILE_DIFF_MINIMAL: `128` = 128.asInstanceOf[`128`]
      
      @scala.inline
      def FILE_DIFF_PATIENCE: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def FILE_IGNORE_WHITESPACE: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def FILE_IGNORE_WHITESPACE_CHANGE: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def FILE_IGNORE_WHITESPACE_EOL: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def FILE_SIMPLIFY_ALNUM: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def FILE_STYLE_DIFF3: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def FILE_STYLE_MERGE: `1` = 1.asInstanceOf[`1`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
    */
    trait PREFERENCE extends StObject
    object PREFERENCE {
      
      @scala.inline
      def FASTFORWARD_ONLY: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def NO_FASTFORWARD: `1` = 1.asInstanceOf[`1`]
    }
    
    object TREE_FLAG {
      
      @scala.inline
      def TREE_FIND_RENAMES: `1` = 1.asInstanceOf[`1`]
    }
    type TREE_FLAG = `1`
  }
}
