package typings.paypalCheckoutComponents

import typings.paypalCheckoutComponents.modulesButtonMod.ButtonRenderer
import typings.paypalCheckoutComponents.modulesButtonMod.ButtonsRenderer
import typings.paypalCheckoutComponents.modulesButtonMod.FundingOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("paypal-checkout-components", "Button")
  @js.native
  val Button: ButtonRenderer = js.native
  
  @JSImport("paypal-checkout-components", "ButtonColorOption")
  @js.native
  object ButtonColorOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption & String
      ] = js.native
    
    /* "black" */ val Black: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Black & String = js.native
    
    /* "blue" */ val Blue: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Blue & String = js.native
    
    /* "gold" */ val Gold: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Gold & String = js.native
    
    /* "silver" */ val Silver: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Silver & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonLabelOption")
  @js.native
  object ButtonLabelOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption & String
      ] = js.native
    
    /* "buynow" */ val BuyNow: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.BuyNow & String = js.native
    
    /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Checkout & String = js.native
    
    /* "credit" */ val Credit: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Credit & String = js.native
    
    /* "pay" */ val Pay: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Pay & String = js.native
    
    /* "paypal" */ val PayPal: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.PayPal & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonShapeOption")
  @js.native
  object ButtonShapeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption & String
      ] = js.native
    
    /* "pill" */ val Pill: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption.Pill & String = js.native
    
    /* "rect" */ val Rect: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption.Rect & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonSizeOption")
  @js.native
  object ButtonSizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption & String
      ] = js.native
    
    /* "large" */ val Large: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Large & String = js.native
    
    /* "medium" */ val Medium: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Medium & String = js.native
    
    /* "responsive" */ val Responsive: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Responsive & String = js.native
    
    /* "small" */ val Small: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Small & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "Buttons")
  @js.native
  val Buttons: ButtonsRenderer = js.native
  
  @JSImport("paypal-checkout-components", "Environment")
  @js.native
  object Environment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.modulesConfigurationMod.Environment & String] = js.native
    
    /* "production" */ val Production: typings.paypalCheckoutComponents.modulesConfigurationMod.Environment.Production & String = js.native
    
    /* "sandbox" */ val Sandbox: typings.paypalCheckoutComponents.modulesConfigurationMod.Environment.Sandbox & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "FUNDING")
  @js.native
  object FUNDING extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FundingOption & Double] = js.native
    
    /* 1 */ val CARD: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.CARD & Double = js.native
    
    /* 0 */ val CREDIT: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.CREDIT & Double = js.native
    
    /* 3 */ val ELV: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.ELV & Double = js.native
    
    /* 4 */ val PAYPAL: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.PAYPAL & Double = js.native
    
    /* 2 */ val VENMO: typings.paypalCheckoutComponents.modulesButtonMod.FundingOption.VENMO & Double = js.native
  }
  
  @JSImport("paypal-checkout-components", "FlowType")
  @js.native
  object FlowType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.modulesCallbackDataMod.FlowType & String] = js.native
    
    /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.modulesCallbackDataMod.FlowType.Checkout & String = js.native
    
    /* "vault" */ val Vault: typings.paypalCheckoutComponents.modulesCallbackDataMod.FlowType.Vault & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "Intent")
  @js.native
  object Intent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.modulesCallbackDataMod.Intent & String] = js.native
    
    /* "authorize" */ val Authorize: typings.paypalCheckoutComponents.modulesCallbackDataMod.Intent.Authorize & String = js.native
    
    /* "capture" */ val Capture: typings.paypalCheckoutComponents.modulesCallbackDataMod.Intent.Capture & String = js.native
    
    /* "order" */ val Order: typings.paypalCheckoutComponents.modulesCallbackDataMod.Intent.Order & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "LineItemKind")
  @js.native
  object LineItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.modulesCallbackDataMod.LineItemKind & String] = js.native
    
    /* "credit" */ val Credit: typings.paypalCheckoutComponents.modulesCallbackDataMod.LineItemKind.Credit & String = js.native
    
    /* "debit" */ val Debit: typings.paypalCheckoutComponents.modulesCallbackDataMod.LineItemKind.Debit & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ShippingOptionType")
  @js.native
  object ShippingOptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutComponents.modulesCallbackDataMod.ShippingOptionType & String
      ] = js.native
    
    /* "PICKUP" */ val Pickup: typings.paypalCheckoutComponents.modulesCallbackDataMod.ShippingOptionType.Pickup & String = js.native
    
    /* "SHIPPING" */ val Shipping: typings.paypalCheckoutComponents.modulesCallbackDataMod.ShippingOptionType.Shipping & String = js.native
  }
}
