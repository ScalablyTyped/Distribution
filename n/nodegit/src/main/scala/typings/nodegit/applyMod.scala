package typings.nodegit

import typings.nodegit.applyOptionsMod.ApplyOptions
import typings.nodegit.diffMod.Diff
import typings.nodegit.indexMod.Index
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyMod {
  
  @JSImport("nodegit/apply", "Apply")
  @js.native
  class Apply () extends StObject
  /* static members */
  object Apply {
    
    @JSImport("nodegit/apply", "Apply")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def apply(repo: Repository, diff: Diff, location: LOCATION, options: ApplyOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(repo.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], location.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    @scala.inline
    def toTree(repo: Repository, preimage: Tree, diff: Diff, options: ApplyOptions): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTree")(repo.asInstanceOf[js.Any], preimage.asInstanceOf[js.Any], diff.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
    
    object FLAGS {
      
      @scala.inline
      def CHECK: `1` = 1.asInstanceOf[`1`]
    }
    type FLAGS = `1`
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
    */
    trait LOCATION extends StObject
    object LOCATION {
      
      @scala.inline
      def BOTH: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def INDEX: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def WORKDIR: `0` = 0.asInstanceOf[`0`]
    }
  }
}
