package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.mergeOptionsMod.MergeOptions
import typings.nodegit.mod.Index
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revertMod {
  
  @JSImport("nodegit/revert", "Revert")
  @js.native
  class Revert () extends StObject
  /* static members */
  object Revert {
    
    @JSImport("nodegit/revert", "Revert")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
      */
    inline def commit(repo: Repository, revertCommit: Commit, ourCommit: Commit, mainline: Double): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(repo.asInstanceOf[js.Any], revertCommit.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], mainline.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
    inline def commit(
      repo: Repository,
      revertCommit: Commit,
      ourCommit: Commit,
      mainline: Double,
      mergeOptions: MergeOptions
    ): js.Promise[Index] = (^.asInstanceOf[js.Dynamic].applyDynamic("commit")(repo.asInstanceOf[js.Any], revertCommit.asInstanceOf[js.Any], ourCommit.asInstanceOf[js.Any], mainline.asInstanceOf[js.Any], mergeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Index]]
    
    inline def revert(repo: Repository, commit: Commit): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def revert(repo: Repository, commit: Commit, givenOpts: RevertOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("revert")(repo.asInstanceOf[js.Any], commit.asInstanceOf[js.Any], givenOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  }
  
  trait RevertOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var checkoutOpts: js.UndefOr[CheckoutOptions] = js.undefined
    
    var mainline: js.UndefOr[Double] = js.undefined
    
    var mergeOpts: js.UndefOr[MergeOptions] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object RevertOptions {
    
    inline def apply(): RevertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevertOptions]
    }
    
    extension [Self <: RevertOptions](x: Self) {
      
      inline def setCheckoutOpts(value: CheckoutOptions): Self = StObject.set(x, "checkoutOpts", value.asInstanceOf[js.Any])
      
      inline def setCheckoutOptsUndefined: Self = StObject.set(x, "checkoutOpts", js.undefined)
      
      inline def setMainline(value: Double): Self = StObject.set(x, "mainline", value.asInstanceOf[js.Any])
      
      inline def setMainlineUndefined: Self = StObject.set(x, "mainline", js.undefined)
      
      inline def setMergeOpts(value: MergeOptions): Self = StObject.set(x, "mergeOpts", value.asInstanceOf[js.Any])
      
      inline def setMergeOptsUndefined: Self = StObject.set(x, "mergeOpts", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
