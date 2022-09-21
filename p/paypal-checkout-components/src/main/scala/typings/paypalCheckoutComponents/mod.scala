package typings.paypalCheckoutComponents

import typings.paypalCheckoutComponents.buttonMod.ButtonRenderer
import typings.paypalCheckoutComponents.buttonMod.ButtonsRenderer
import typings.paypalCheckoutComponents.buttonMod.FundingOption
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
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.ButtonColorOption & String] = js.native
    
    /* "black" */ val Black: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Black & String = js.native
    
    /* "blue" */ val Blue: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Blue & String = js.native
    
    /* "gold" */ val Gold: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Gold & String = js.native
    
    /* "silver" */ val Silver: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Silver & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonLabelOption")
  @js.native
  object ButtonLabelOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption & String] = js.native
    
    /* "buynow" */ val BuyNow: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.BuyNow & String = js.native
    
    /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Checkout & String = js.native
    
    /* "credit" */ val Credit: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Credit & String = js.native
    
    /* "pay" */ val Pay: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Pay & String = js.native
    
    /* "paypal" */ val PayPal: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.PayPal & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonShapeOption")
  @js.native
  object ButtonShapeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption & String] = js.native
    
    /* "pill" */ val Pill: typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Pill & String = js.native
    
    /* "rect" */ val Rect: typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Rect & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonSizeOption")
  @js.native
  object ButtonSizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption & String] = js.native
    
    /* "large" */ val Large: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Large & String = js.native
    
    /* "medium" */ val Medium: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Medium & String = js.native
    
    /* "responsive" */ val Responsive: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Responsive & String = js.native
    
    /* "small" */ val Small: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Small & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "Buttons")
  @js.native
  val Buttons: ButtonsRenderer = js.native
  
  @JSImport("paypal-checkout-components", "Environment")
  @js.native
  object Environment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.Environment & String] = js.native
    
    /* "production" */ val Production: typings.paypalCheckoutComponents.configurationMod.Environment.Production & String = js.native
    
    /* "sandbox" */ val Sandbox: typings.paypalCheckoutComponents.configurationMod.Environment.Sandbox & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "FUNDING")
  @js.native
  object FUNDING extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FundingOption & Double] = js.native
    
    /* 1 */ val CARD: typings.paypalCheckoutComponents.buttonMod.FundingOption.CARD & Double = js.native
    
    /* 0 */ val CREDIT: typings.paypalCheckoutComponents.buttonMod.FundingOption.CREDIT & Double = js.native
    
    /* 3 */ val ELV: typings.paypalCheckoutComponents.buttonMod.FundingOption.ELV & Double = js.native
    
    /* 4 */ val PAYPAL: typings.paypalCheckoutComponents.buttonMod.FundingOption.PAYPAL & Double = js.native
    
    /* 2 */ val VENMO: typings.paypalCheckoutComponents.buttonMod.FundingOption.VENMO & Double = js.native
  }
  
  @JSImport("paypal-checkout-components", "FlowType")
  @js.native
  object FlowType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.callbackDataMod.FlowType & String] = js.native
    
    /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.callbackDataMod.FlowType.Checkout & String = js.native
    
    /* "vault" */ val Vault: typings.paypalCheckoutComponents.callbackDataMod.FlowType.Vault & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "Intent")
  @js.native
  object Intent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.callbackDataMod.Intent & String] = js.native
    
    /* "authorize" */ val Authorize: typings.paypalCheckoutComponents.callbackDataMod.Intent.Authorize & String = js.native
    
    /* "capture" */ val Capture: typings.paypalCheckoutComponents.callbackDataMod.Intent.Capture & String = js.native
    
    /* "order" */ val Order: typings.paypalCheckoutComponents.callbackDataMod.Intent.Order & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "LineItemKind")
  @js.native
  object LineItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.callbackDataMod.LineItemKind & String] = js.native
    
    /* "credit" */ val Credit: typings.paypalCheckoutComponents.callbackDataMod.LineItemKind.Credit & String = js.native
    
    /* "debit" */ val Debit: typings.paypalCheckoutComponents.callbackDataMod.LineItemKind.Debit & String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ShippingOptionType")
  @js.native
  object ShippingOptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.callbackDataMod.ShippingOptionType & String] = js.native
    
    /* "PICKUP" */ val Pickup: typings.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Pickup & String = js.native
    
    /* "SHIPPING" */ val Shipping: typings.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Shipping & String = js.native
  }
}
