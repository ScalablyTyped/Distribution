package typings.nodegit

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.nodegitNumbers.`4`
import typings.nodegit.nodegitNumbers.`5`
import typings.nodegit.nodegitNumbers.`6`
import typings.nodegit.nodegitNumbers.`7`
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stashMod {
  
  @JSImport("nodegit/stash", "Stash")
  @js.native
  class Stash () extends StObject
  /* static members */
  object Stash {
    
    @JSImport("nodegit/stash", "Stash.apply")
    @js.native
    def apply(repo: Repository, index: Double): js.Promise[Double] = js.native
    @JSImport("nodegit/stash", "Stash.apply")
    @js.native
    def apply(repo: Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
    
    @JSImport("nodegit/stash", "Stash.applyInitOptions")
    @js.native
    def applyInitOptions(opts: StashApplyOptions, version: Double): Double = js.native
    
    @JSImport("nodegit/stash", "Stash.drop")
    @js.native
    def drop(repo: Repository, index: Double): js.Promise[Double] = js.native
    
    @JSImport("nodegit/stash", "Stash.foreach")
    @js.native
    def foreach(repo: Repository): js.Promise[Double] = js.native
    @JSImport("nodegit/stash", "Stash.foreach")
    @js.native
    def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = js.native
    
    @JSImport("nodegit/stash", "Stash.pop")
    @js.native
    def pop(repo: Repository, index: Double): js.Promise[Double] = js.native
    @JSImport("nodegit/stash", "Stash.pop")
    @js.native
    def pop(repo: Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = js.native
    
    @JSImport("nodegit/stash", "Stash.save")
    @js.native
    def save(repo: Repository, stasher: Signature, message: String, flags: Double): js.Promise[Oid] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
    */
    trait APPLY_FLAGS extends StObject
    object APPLY_FLAGS {
      
      @scala.inline
      def APPLY_DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def APPLY_REINSTATE_INDEX: `1` = 1.asInstanceOf[`1`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
      - typings.nodegit.nodegitNumbers.`4`
      - typings.nodegit.nodegitNumbers.`5`
      - typings.nodegit.nodegitNumbers.`6`
      - typings.nodegit.nodegitNumbers.`7`
    */
    trait APPLY_PROGRESS extends StObject
    object APPLY_PROGRESS {
      
      @scala.inline
      def ANALYZE_INDEX: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def ANALYZE_MODIFIED: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def ANALYZE_UNTRACKED: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def CHECKOUT_MODIFIED: `6` = 6.asInstanceOf[`6`]
      
      @scala.inline
      def CHECKOUT_UNTRACKED: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def DONE: `7` = 7.asInstanceOf[`7`]
      
      @scala.inline
      def LOADING_STASH: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`4`
    */
    trait FLAGS extends StObject
    object FLAGS {
      
      @scala.inline
      def DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def INCLUDE_IGNORED: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def INCLUDE_UNTRACKED: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def KEEP_INDEX: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  @js.native
  trait StashApplyOptions extends StObject {
    
    var checkoutOptions: js.UndefOr[CheckoutOptions] = js.native
    
    var flags: js.UndefOr[Double] = js.native
    
    var progressCb: js.UndefOr[js.Function] = js.native
    
    var progressPayload: js.UndefOr[js.Any] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object StashApplyOptions {
    
    @scala.inline
    def apply(): StashApplyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StashApplyOptions]
    }
    
    @scala.inline
    implicit class StashApplyOptionsMutableBuilder[Self <: StashApplyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckoutOptions(value: CheckoutOptions): Self = StObject.set(x, "checkoutOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckoutOptionsUndefined: Self = StObject.set(x, "checkoutOptions", js.undefined)
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setProgressCb(value: js.Function): Self = StObject.set(x, "progressCb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressCbUndefined: Self = StObject.set(x, "progressCb", js.undefined)
      
      @scala.inline
      def setProgressPayload(value: js.Any): Self = StObject.set(x, "progressPayload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressPayloadUndefined: Self = StObject.set(x, "progressPayload", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
