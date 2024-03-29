package typings.paypalCheckoutComponents

import typings.paypalCheckoutComponents.anon.AccessToken
import typings.paypalCheckoutComponents.anon.CreateBillingAgreement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesButtonMod {
  
  @js.native
  sealed trait FundingOption extends StObject
  @JSImport("paypal-checkout-components/modules/button", "FundingOption")
  @js.native
  object FundingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FundingOption & Double] = js.native
    
    @js.native
    sealed trait CARD
      extends StObject
         with FundingOption
    /* 1 */ val CARD: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.CARD & Double = js.native
    
    @js.native
    sealed trait CREDIT
      extends StObject
         with FundingOption
    /* 0 */ val CREDIT: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.CREDIT & Double = js.native
    
    @js.native
    sealed trait ELV
      extends StObject
         with FundingOption
    /* 3 */ val ELV: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.ELV & Double = js.native
    
    @js.native
    sealed trait PAYPAL
      extends StObject
         with FundingOption
    /* 4 */ val PAYPAL: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.PAYPAL & Double = js.native
    
    @js.native
    sealed trait VENMO
      extends StObject
         with FundingOption
    /* 2 */ val VENMO: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.VENMO & Double = js.native
  }
  
  trait ButtonRenderer extends StObject {
    
    def render(options: AccessToken, selector: String): Unit
  }
  object ButtonRenderer {
    
    inline def apply(render: (AccessToken, String) => Unit): ButtonRenderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[ButtonRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonRenderer] (val x: Self) extends AnyVal {
      
      inline def setRender(value: (AccessToken, String) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ButtonsRenderer extends StObject {
    
    def apply(options: CreateBillingAgreement): ButtonsRenderer = js.native
    
    def render(selector: String): Unit = js.native
  }
}
