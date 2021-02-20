package typings.paypalCheckoutComponents

import typings.paypalCheckoutComponents.anon.AccessToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @js.native
  sealed trait FundingOption extends StObject
  @JSImport("paypal-checkout-components/modules/button", "FundingOption")
  @js.native
  object FundingOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FundingOption with Double] = js.native
    
    @js.native
    sealed trait CARD extends FundingOption
    /* 1 */ val CARD: typings.paypalCheckoutComponents.buttonMod.FundingOption.CARD with Double = js.native
    
    @js.native
    sealed trait CREDIT extends FundingOption
    /* 0 */ val CREDIT: typings.paypalCheckoutComponents.buttonMod.FundingOption.CREDIT with Double = js.native
    
    @js.native
    sealed trait ELV extends FundingOption
    /* 3 */ val ELV: typings.paypalCheckoutComponents.buttonMod.FundingOption.ELV with Double = js.native
    
    @js.native
    sealed trait VENMO extends FundingOption
    /* 2 */ val VENMO: typings.paypalCheckoutComponents.buttonMod.FundingOption.VENMO with Double = js.native
  }
  
  @js.native
  trait ButtonRenderer extends StObject {
    
    def render(options: AccessToken, selector: String): Unit = js.native
  }
  object ButtonRenderer {
    
    @scala.inline
    def apply(render: (AccessToken, String) => Unit): ButtonRenderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[ButtonRenderer]
    }
    
    @scala.inline
    implicit class ButtonRendererMutableBuilder[Self <: ButtonRenderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: (AccessToken, String) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
}
