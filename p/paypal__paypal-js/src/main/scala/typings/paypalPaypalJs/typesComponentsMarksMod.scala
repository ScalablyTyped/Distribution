package typings.paypalPaypalJs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesComponentsMarksMod {
  
  @js.native
  trait PayPalMarksComponent extends StObject {
    
    def isEligible(): Boolean = js.native
    
    def render(container: String): js.Promise[Unit] = js.native
    def render(container: HTMLElement): js.Promise[Unit] = js.native
  }
  
  trait PayPalMarksComponentOptions extends StObject {
    
    /**
      * Used for defining a standalone mark.
      */
    var fundingSource: js.UndefOr[String] = js.undefined
  }
  object PayPalMarksComponentOptions {
    
    inline def apply(): PayPalMarksComponentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayPalMarksComponentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayPalMarksComponentOptions] (val x: Self) extends AnyVal {
      
      inline def setFundingSource(value: String): Self = StObject.set(x, "fundingSource", value.asInstanceOf[js.Any])
      
      inline def setFundingSourceUndefined: Self = StObject.set(x, "fundingSource", js.undefined)
    }
  }
}
