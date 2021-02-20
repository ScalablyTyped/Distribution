package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.commitMod.Commit
import typings.nodegit.mergeOptionsMod.MergeOptions
import typings.nodegit.mod.Index
import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revertMod {
  
  @JSImport("nodegit/revert", "Revert")
  @js.native
  class Revert () extends StObject
  /* static members */
  object Revert {
    
    /**
      * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
      */
    @JSImport("nodegit/revert", "Revert.commit")
    @js.native
    def commit(repo: Repository, revertCommit: Commit, ourCommit: Commit, mainline: Double): js.Promise[Index] = js.native
    @JSImport("nodegit/revert", "Revert.commit")
    @js.native
    def commit(
      repo: Repository,
      revertCommit: Commit,
      ourCommit: Commit,
      mainline: Double,
      mergeOptions: MergeOptions
    ): js.Promise[Index] = js.native
    
    @JSImport("nodegit/revert", "Revert.revert")
    @js.native
    def revert(repo: Repository, commit: Commit): js.Promise[Double] = js.native
    @JSImport("nodegit/revert", "Revert.revert")
    @js.native
    def revert(repo: Repository, commit: Commit, givenOpts: RevertOptions): js.Promise[Double] = js.native
  }
  
  @js.native
  trait RevertOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
    
    var mainline: js.UndefOr[Double] = js.native
    
    var mergeOpts: js.UndefOr[MergeOptions] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object RevertOptions {
    
    @scala.inline
    def apply(): RevertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevertOptions]
    }
    
    @scala.inline
    implicit class RevertOptionsMutableBuilder[Self <: RevertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckoutOpts(value: CheckoutOptions): Self = StObject.set(x, "checkoutOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckoutOptsUndefined: Self = StObject.set(x, "checkoutOpts", js.undefined)
      
      @scala.inline
      def setMainline(value: Double): Self = StObject.set(x, "mainline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainlineUndefined: Self = StObject.set(x, "mainline", js.undefined)
      
      @scala.inline
      def setMergeOpts(value: MergeOptions): Self = StObject.set(x, "mergeOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeOptsUndefined: Self = StObject.set(x, "mergeOpts", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
