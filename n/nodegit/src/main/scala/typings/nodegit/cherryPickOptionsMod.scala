package typings.nodegit

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.mergeOptionsMod.MergeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cherryPickOptionsMod {
  
  @js.native
  trait CherrypickOptions extends StObject {
    
    var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
    
    var mainline: js.UndefOr[Double] = js.native
    
    var mergeOpts: js.UndefOr[MergeOptions] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object CherrypickOptions {
    
    @scala.inline
    def apply(): CherrypickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CherrypickOptions]
    }
    
    @scala.inline
    implicit class CherrypickOptionsMutableBuilder[Self <: CherrypickOptions] (val x: Self) extends AnyVal {
      
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
