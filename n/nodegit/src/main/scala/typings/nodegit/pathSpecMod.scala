package typings.nodegit

import typings.nodegit.diffDeltaMod.DiffDelta
import typings.nodegit.diffMod.Diff
import typings.nodegit.mod.Index
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`16`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`32`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`8`
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.strArrayMod.Strarray
import typings.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathSpecMod {
  
  @JSImport("nodegit/path-spec", "Pathspec")
  @js.native
  class Pathspec () extends StObject {
    
    def free(): Unit = js.native
    
    def matchDiff(diff: Diff, flags: Double): js.Promise[js.Any] = js.native
    
    def matchIndex(index: Index, flags: Double): js.Promise[js.Any] = js.native
    
    def matchTree(tree: Tree, flags: Double): js.Promise[js.Any] = js.native
    
    def matchWorkdir(repo: Repository, flags: Double): js.Promise[js.Any] = js.native
    
    def matchesPath(flags: Double, path: String): Double = js.native
  }
  /* static members */
  object Pathspec {
    
    @JSImport("nodegit/path-spec", "Pathspec")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(pathspec: String): Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[Pathspec]
    @scala.inline
    def create(pathspec: js.Array[String]): Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[Pathspec]
    @scala.inline
    def create(pathspec: Strarray): Pathspec = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pathspec.asInstanceOf[js.Any]).asInstanceOf[Pathspec]
    
    @scala.inline
    def matchListDiffEntry(m: js.Any, pos: Double): DiffDelta = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListDiffEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[DiffDelta]
    
    @scala.inline
    def matchListEntry(m: js.Any, pos: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def matchListEntrycount(m: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("matchListEntrycount")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def matchListFailedEntry(m: js.Any, pos: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchListFailedEntry")(m.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def matchListFailedEntrycount(m: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("matchListFailedEntrycount")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`8`
      - typings.nodegit.nodegitNumbers.`16`
      - typings.nodegit.nodegitNumbers.`32`
    */
    trait FLAG extends StObject
    object FLAG {
      
      @scala.inline
      def DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def FAILURES_ONLY: `32` = 32.asInstanceOf[`32`]
      
      @scala.inline
      def FIND_FAILURES: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def IGNORE_CASE: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def NO_GLOB: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def NO_MATCH_ERROR: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def USE_CASE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
