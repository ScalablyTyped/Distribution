package typings.nodegit

import typings.nodegit.annotatedCommitMod.AnnotatedCommit
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.strArrayMod.Strarray
import typings.nodegit.tagMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resetMod {
  
  @JSImport("nodegit/reset", "Reset")
  @js.native
  class Reset () extends StObject
  /* static members */
  object Reset {
    
    @JSImport("nodegit/reset", "Reset.default")
    @js.native
    def default(repo: Repository, target: Commit, pathspecs: String): js.Promise[Double] = js.native
    @JSImport("nodegit/reset", "Reset.default")
    @js.native
    def default(repo: Repository, target: Commit, pathspecs: js.Array[String]): js.Promise[Double] = js.native
    /**
      * Look up a refs's commit.
      */
    @JSImport("nodegit/reset", "Reset.default")
    @js.native
    def default(repo: Repository, target: Commit, pathspecs: Strarray): js.Promise[Double] = js.native
    @JSImport("nodegit/reset", "Reset.default")
    @js.native
    def default(repo: Repository, target: Tag, pathspecs: String): js.Promise[Double] = js.native
    @JSImport("nodegit/reset", "Reset.default")
    @js.native
    def default(repo: Repository, target: Tag, pathspecs: js.Array[String]): js.Promise[Double] = js.native
    @JSImport("nodegit/reset", "Reset.default")
    @js.native
    def default(repo: Repository, target: Tag, pathspecs: Strarray): js.Promise[Double] = js.native
    
    /**
      * Sets the current head to the specified commit oid and optionally resets the index and working tree to match.
      * This behaves like reset but takes an annotated commit, which lets you specify which extended sha syntax string was specified by a user, allowing for more exact reflog messages.
      * See the documentation for reset.
      */
    @JSImport("nodegit/reset", "Reset.fromAnnotated")
    @js.native
    def fromAnnotated(repo: Repository, commit: AnnotatedCommit, resetType: Double, checkoutOpts: CheckoutOptions): Double = js.native
    
    /**
      * Look up a refs's commit.
      */
    @JSImport("nodegit/reset", "Reset.reset")
    @js.native
    def reset(repo: Repository, target: Commit, resetType: Double, checkoutOpts: CheckoutOptions): js.Promise[Double] = js.native
    @JSImport("nodegit/reset", "Reset.reset")
    @js.native
    def reset(repo: Repository, target: Tag, resetType: Double, checkoutOpts: CheckoutOptions): js.Promise[Double] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
    */
    trait TYPE extends StObject
    object TYPE {
      
      @scala.inline
      def HARD: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def MIXED: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def SOFT: `1` = 1.asInstanceOf[`1`]
    }
  }
}
