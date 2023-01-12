package typings.nodegit

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.mergeOptionsMod.MergeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cherryPickOptionsMod {
  
  trait CherrypickOptions extends StObject {
    
    var checkoutOpts: js.UndefOr[CheckoutOptions] = js.undefined
    
    var mainline: js.UndefOr[Double] = js.undefined
    
    var mergeOpts: js.UndefOr[MergeOptions] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object CherrypickOptions {
    
    inline def apply(): CherrypickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CherrypickOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CherrypickOptions] (val x: Self) extends AnyVal {
      
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
