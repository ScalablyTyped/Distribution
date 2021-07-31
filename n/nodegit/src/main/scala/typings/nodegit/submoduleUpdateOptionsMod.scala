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
    
    @scala.inline
    def apply(): SubmoduleUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubmoduleUpdateOptions]
    }
    
    @scala.inline
    implicit class SubmoduleUpdateOptionsMutableBuilder[Self <: SubmoduleUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckoutOpts(value: CheckoutOptions): Self = StObject.set(x, "checkoutOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckoutOptsUndefined: Self = StObject.set(x, "checkoutOpts", js.undefined)
      
      @scala.inline
      def setCloneCheckoutStrategy(value: Double): Self = StObject.set(x, "cloneCheckoutStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloneCheckoutStrategyUndefined: Self = StObject.set(x, "cloneCheckoutStrategy", js.undefined)
      
      @scala.inline
      def setFetchOpts(value: FetchOptions): Self = StObject.set(x, "fetchOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOptsUndefined: Self = StObject.set(x, "fetchOpts", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
