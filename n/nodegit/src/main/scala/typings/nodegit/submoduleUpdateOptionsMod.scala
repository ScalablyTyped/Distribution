package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.fetchOptionsMod.FetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object submoduleUpdateOptionsMod {
  
  trait SubmoduleUpdateOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var checkoutOpts: js.UndefOr[CheckoutOptions] = js.undefined
    
    var cloneCheckoutStrategy: js.UndefOr[Double] = js.undefined
    
    var fetchOpts: js.UndefOr[FetchOptions] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object SubmoduleUpdateOptions {
    
    inline def apply(): SubmoduleUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubmoduleUpdateOptions]
    }
    
    extension [Self <: SubmoduleUpdateOptions](x: Self) {
      
      inline def setCheckoutOpts(value: CheckoutOptions): Self = StObject.set(x, "checkoutOpts", value.asInstanceOf[js.Any])
      
      inline def setCheckoutOptsUndefined: Self = StObject.set(x, "checkoutOpts", js.undefined)
      
      inline def setCloneCheckoutStrategy(value: Double): Self = StObject.set(x, "cloneCheckoutStrategy", value.asInstanceOf[js.Any])
      
      inline def setCloneCheckoutStrategyUndefined: Self = StObject.set(x, "cloneCheckoutStrategy", js.undefined)
      
      inline def setFetchOpts(value: FetchOptions): Self = StObject.set(x, "fetchOpts", value.asInstanceOf[js.Any])
      
      inline def setFetchOptsUndefined: Self = StObject.set(x, "fetchOpts", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
