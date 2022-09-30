package typings.nodegit

import typings.nodegit.annotatedCommitMod.AnnotatedCommit
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`3`
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.strArrayMod.Strarray
import typings.nodegit.tagMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resetMod {
  
  @JSImport("nodegit/reset", "Reset")
  @js.native
  open class Reset () extends StObject
  /* static members */
  object Reset {
    
    @JSImport("nodegit/reset", "Reset")
    @js.native
    val ^ : js.Any = js.native
    
    inline def default(repo: Repository, target: Commit, pathspecs: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def default(repo: Repository, target: Commit, pathspecs: js.Array[String]): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    /**
      * Look up a refs's commit.
      */
    inline def default(repo: Repository, target: Commit, pathspecs: Strarray): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def default(repo: Repository, target: Tag, pathspecs: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def default(repo: Repository, target: Tag, pathspecs: js.Array[String]): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def default(repo: Repository, target: Tag, pathspecs: Strarray): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], pathspecs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    /**
      * Sets the current head to the specified commit oid and optionally resets the index and working tree to match.
      * This behaves like reset but takes an annotated commit, which lets you specify which extended sha syntax string was specified by a user, allowing for more exact reflog messages.
      * See the documentation for reset.
      */
    inline def fromAnnotated(repo: Repository, commit: AnnotatedCommit, resetType: Double, checkoutOpts: CheckoutOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAnnotated")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], resetType.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Look up a refs's commit.
      */
    inline def reset(repo: Repository, target: Commit, resetType: Double, checkoutOpts: CheckoutOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], resetType.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def reset(repo: Repository, target: Tag, resetType: Double, checkoutOpts: CheckoutOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("reset")(repo.asInstanceOf[js.Any], target.asInstanceOf[js.Any], resetType.asInstanceOf[js.Any], checkoutOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
    */
    trait TYPE extends StObject
    object TYPE {
      
      inline def HARD: `3` = 3.asInstanceOf[`3`]
      
      inline def MIXED: `2` = 2.asInstanceOf[`2`]
      
      inline def SOFT: `1` = 1.asInstanceOf[`1`]
    }
  }
}
