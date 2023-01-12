package typings.nodegit

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.nodegitInts.`0`
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`3`
import typings.nodegit.nodegitInts.`4`
import typings.nodegit.nodegitInts.`5`
import typings.nodegit.nodegitInts.`6`
import typings.nodegit.nodegitInts.`7`
import typings.nodegit.oidMod.Oid
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stashMod {
  
  @JSImport("nodegit/stash", "Stash")
  @js.native
  open class Stash () extends StObject
  /* static members */
  object Stash {
    
    @JSImport("nodegit/stash", "Stash")
    @js.native
    val ^ : js.Any = js.native
    
    inline def apply(repo: Repository, index: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def apply(repo: Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def applyInitOptions(opts: StashApplyOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("applyInitOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def drop(repo: Repository, index: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def foreach(repo: Repository): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
    inline def foreach(repo: Repository, callback: js.Function): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("foreach")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def pop(repo: Repository, index: Double): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pop")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    inline def pop(repo: Repository, index: Double, options: StashApplyOptions): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pop")(repo.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    inline def save(repo: Repository, stasher: Signature, message: String, flags: Double): js.Promise[Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(repo.asInstanceOf[js.Any], stasher.asInstanceOf[js.Any], message.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Oid]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
    */
    trait APPLY_FLAGS extends StObject
    object APPLY_FLAGS {
      
      inline def APPLY_DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      inline def APPLY_REINSTATE_INDEX: `1` = 1.asInstanceOf[`1`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`3`
      - typings.nodegit.nodegitInts.`4`
      - typings.nodegit.nodegitInts.`5`
      - typings.nodegit.nodegitInts.`6`
      - typings.nodegit.nodegitInts.`7`
    */
    trait APPLY_PROGRESS extends StObject
    object APPLY_PROGRESS {
      
      inline def ANALYZE_INDEX: `2` = 2.asInstanceOf[`2`]
      
      inline def ANALYZE_MODIFIED: `3` = 3.asInstanceOf[`3`]
      
      inline def ANALYZE_UNTRACKED: `4` = 4.asInstanceOf[`4`]
      
      inline def CHECKOUT_MODIFIED: `6` = 6.asInstanceOf[`6`]
      
      inline def CHECKOUT_UNTRACKED: `5` = 5.asInstanceOf[`5`]
      
      inline def DONE: `7` = 7.asInstanceOf[`7`]
      
      inline def LOADING_STASH: `1` = 1.asInstanceOf[`1`]
      
      inline def NONE: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`4`
    */
    trait FLAGS extends StObject
    object FLAGS {
      
      inline def DEFAULT: `0` = 0.asInstanceOf[`0`]
      
      inline def INCLUDE_IGNORED: `4` = 4.asInstanceOf[`4`]
      
      inline def INCLUDE_UNTRACKED: `2` = 2.asInstanceOf[`2`]
      
      inline def KEEP_INDEX: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  trait StashApplyOptions extends StObject {
    
    var checkoutOptions: js.UndefOr[CheckoutOptions] = js.undefined
    
    var flags: js.UndefOr[Double] = js.undefined
    
    var progressCb: js.UndefOr[js.Function] = js.undefined
    
    var progressPayload: js.UndefOr[Any] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object StashApplyOptions {
    
    inline def apply(): StashApplyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StashApplyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StashApplyOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckoutOptions(value: CheckoutOptions): Self = StObject.set(x, "checkoutOptions", value.asInstanceOf[js.Any])
      
      inline def setCheckoutOptionsUndefined: Self = StObject.set(x, "checkoutOptions", js.undefined)
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setProgressCb(value: js.Function): Self = StObject.set(x, "progressCb", value.asInstanceOf[js.Any])
      
      inline def setProgressCbUndefined: Self = StObject.set(x, "progressCb", js.undefined)
      
      inline def setProgressPayload(value: Any): Self = StObject.set(x, "progressPayload", value.asInstanceOf[js.Any])
      
      inline def setProgressPayloadUndefined: Self = StObject.set(x, "progressPayload", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
