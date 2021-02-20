package typings.nodegit

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.mod.Index
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1024`
import typings.nodegit.nodegitNumbers.`1048576`
import typings.nodegit.nodegitNumbers.`128`
import typings.nodegit.nodegitNumbers.`131072`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2048`
import typings.nodegit.nodegitNumbers.`2097152`
import typings.nodegit.nodegitNumbers.`256`
import typings.nodegit.nodegitNumbers.`262144`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`4096`
import typings.nodegit.nodegitNumbers.`4194304`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`512`
import typings.nodegit.nodegitNumbers.`524288`
import typings.nodegit.nodegitNumbers.`64`
import typings.nodegit.nodegitNumbers.`65535`
import typings.nodegit.nodegitNumbers.`65536`
import typings.nodegit.nodegitNumbers.`8192`
import typings.nodegit.nodegitNumbers.`8388608`
import typings.nodegit.nodegitNumbers.`8`
import typings.nodegit.oidMod.Oid
import typings.nodegit.referenceMod.Reference
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkoutMod {
  
  @JSImport("nodegit/checkout", "Checkout")
  @js.native
  class Checkout () extends StObject
  /* static members */
  object Checkout {
    
    /**
      * Patch head checkout to automatically coerce objects.
      */
    @JSImport("nodegit/checkout", "Checkout.head")
    @js.native
    def head(repo: Repository): js.Promise[Unit] = js.native
    @JSImport("nodegit/checkout", "Checkout.head")
    @js.native
    def head(repo: Repository, options: CheckoutOptions): js.Promise[Unit] = js.native
    
    /**
      * Patch index checkout to automatically coerce objects.
      */
    @JSImport("nodegit/checkout", "Checkout.index")
    @js.native
    def index(repo: Repository, The: Index): js.Promise[Unit] = js.native
    @JSImport("nodegit/checkout", "Checkout.index")
    @js.native
    def index(repo: Repository, The: Index, options: CheckoutOptions): js.Promise[Unit] = js.native
    
    @JSImport("nodegit/checkout", "Checkout.initOptions")
    @js.native
    def initOptions(opts: CheckoutOptions, version: Double): Double = js.native
    
    @JSImport("nodegit/checkout", "Checkout.tree")
    @js.native
    def tree(repo: Repository, treeish: Commit): js.Promise[Unit] = js.native
    @JSImport("nodegit/checkout", "Checkout.tree")
    @js.native
    def tree(repo: Repository, treeish: Commit, options: CheckoutOptions): js.Promise[Unit] = js.native
    /**
      * Patch tree checkout to automatically coerce objects.
      */
    @JSImport("nodegit/checkout", "Checkout.tree")
    @js.native
    def tree(repo: Repository, treeish: Oid): js.Promise[Unit] = js.native
    @JSImport("nodegit/checkout", "Checkout.tree")
    @js.native
    def tree(repo: Repository, treeish: Oid, options: CheckoutOptions): js.Promise[Unit] = js.native
    @JSImport("nodegit/checkout", "Checkout.tree")
    @js.native
    def tree(repo: Repository, treeish: Reference): js.Promise[Unit] = js.native
    @JSImport("nodegit/checkout", "Checkout.tree")
    @js.native
    def tree(repo: Repository, treeish: Reference, options: CheckoutOptions): js.Promise[Unit] = js.native
    @JSImport("nodegit/checkout", "Checkout.tree")
    @js.native
    def tree(repo: Repository, treeish: Tree): js.Promise[Unit] = js.native
    @JSImport("nodegit/checkout", "Checkout.tree")
    @js.native
    def tree(repo: Repository, treeish: Tree, options: CheckoutOptions): js.Promise[Unit] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`16`
      - typings.nodegit.nodegitNumbers.`65535`
    */
    trait NOTIFY extends StObject
    object NOTIFY {
      
      @scala.inline
      def ALL: `65535` = 65535.asInstanceOf[`65535`]
      
      @scala.inline
      def CONFLICT: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def DIRTY: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def IGNORED: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def UNTRACKED: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def UPDATED: `4` = 4.asInstanceOf[`4`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
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
      - typings.nodegit.nodegitNumbers.`262144`
      - typings.nodegit.nodegitNumbers.`524288`
      - typings.nodegit.nodegitNumbers.`1048576`
      - typings.nodegit.nodegitNumbers.`2097152`
      - typings.nodegit.nodegitNumbers.`4194304`
      - typings.nodegit.nodegitNumbers.`8388608`
      - typings.nodegit.nodegitNumbers.`65536`
      - typings.nodegit.nodegitNumbers.`131072`
    */
    trait STRATEGY extends StObject
    object STRATEGY {
      
      @scala.inline
      def ALLOW_CONFLICTS: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def CONFLICT_STYLE_DIFF3: `2097152` = 2097152.asInstanceOf[`2097152`]
      
      @scala.inline
      def CONFLICT_STYLE_MERGE: `1048576` = 1048576.asInstanceOf[`1048576`]
      
      @scala.inline
      def DISABLE_PATHSPEC_MATCH: `8192` = 8192.asInstanceOf[`8192`]
      
      @scala.inline
      def DONT_OVERWRITE_IGNORED: `524288` = 524288.asInstanceOf[`524288`]
      
      @scala.inline
      def DONT_REMOVE_EXISTING: `4194304` = 4194304.asInstanceOf[`4194304`]
      
      @scala.inline
      def DONT_UPDATE_INDEX: `256` = 256.asInstanceOf[`256`]
      
      @scala.inline
      def DONT_WRITE_INDEX: `8388608` = 8388608.asInstanceOf[`8388608`]
      
      @scala.inline
      def FORCE: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def NO_REFRESH: `512` = 512.asInstanceOf[`512`]
      
      @scala.inline
      def RECREATE_MISSING: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def REMOVE_IGNORED: `64` = 64.asInstanceOf[`64`]
      
      @scala.inline
      def REMOVE_UNTRACKED: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def SAFE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def SKIP_LOCKED_DIRECTORIES: `262144` = 262144.asInstanceOf[`262144`]
      
      @scala.inline
      def SKIP_UNMERGED: `1024` = 1024.asInstanceOf[`1024`]
      
      @scala.inline
      def UPDATE_ONLY: `128` = 128.asInstanceOf[`128`]
      
      @scala.inline
      def UPDATE_SUBMODULES: `65536` = 65536.asInstanceOf[`65536`]
      
      @scala.inline
      def UPDATE_SUBMODULES_IF_CHANGED: `131072` = 131072.asInstanceOf[`131072`]
      
      @scala.inline
      def USE_OURS: `2048` = 2048.asInstanceOf[`2048`]
      
      @scala.inline
      def USE_THEIRS: `4096` = 4096.asInstanceOf[`4096`]
    }
  }
}
