package typings.paypalCheckoutComponents

import typings.paypalCheckoutComponents.buttonMod.ButtonRenderer
import typings.paypalCheckoutComponents.buttonMod.FundingOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("paypal-checkout-components", "Button")
  @js.native
  val Button: ButtonRenderer = js.native
  
  @JSImport("paypal-checkout-components", "ButtonColorOption")
  @js.native
  object ButtonColorOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.ButtonColorOption with String] = js.native
    
    /* "black" */ val Black: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Black with String = js.native
    
    /* "blue" */ val Blue: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Blue with String = js.native
    
    /* "gold" */ val Gold: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Gold with String = js.native
    
    /* "silver" */ val Silver: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Silver with String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonLabelOption")
  @js.native
  object ButtonLabelOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption with String] = js.native
    
    /* "buynow" */ val BuyNow: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.BuyNow with String = js.native
    
    /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Checkout with String = js.native
    
    /* "credit" */ val Credit: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Credit with String = js.native
    
    /* "pay" */ val Pay: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Pay with String = js.native
    
    /* "paypal" */ val PayPal: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.PayPal with String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonShapeOption")
  @js.native
  object ButtonShapeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption with String] = js.native
    
    /* "pill" */ val Pill: typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Pill with String = js.native
    
    /* "rect" */ val Rect: typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Rect with String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ButtonSizeOption")
  @js.native
  object ButtonSizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption with String] = js.native
    
    /* "large" */ val Large: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Large with String = js.native
    
    /* "medium" */ val Medium: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Medium with String = js.native
    
    /* "responsive" */ val Responsive: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Responsive with String = js.native
    
    /* "small" */ val Small: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Small with String = js.native
  }
  
  @JSImport("paypal-checkout-components", "Environment")
  @js.native
  object Environment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.configurationMod.Environment with String] = js.native
    
    /* "production" */ val Production: typings.paypalCheckoutComponents.configurationMod.Environment.Production with String = js.native
    
    /* "sandbox" */ val Sandbox: typings.paypalCheckoutComponents.configurationMod.Environment.Sandbox with String = js.native
  }
  
  @JSImport("paypal-checkout-components", "FUNDING")
  @js.native
  object FUNDING extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FundingOption with Double] = js.native
    
    /* 1 */ val CARD: typings.paypalCheckoutComponents.buttonMod.FundingOption.CARD with Double = js.native
    
    /* 0 */ val CREDIT: typings.paypalCheckoutComponents.buttonMod.FundingOption.CREDIT with Double = js.native
    
    /* 3 */ val ELV: typings.paypalCheckoutComponents.buttonMod.FundingOption.ELV with Double = js.native
    
    /* 2 */ val VENMO: typings.paypalCheckoutComponents.buttonMod.FundingOption.VENMO with Double = js.native
  }
  
  @JSImport("paypal-checkout-components", "FlowType")
  @js.native
  object FlowType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.callbackDataMod.FlowType with String] = js.native
    
    /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.callbackDataMod.FlowType.Checkout with String = js.native
    
    /* "vault" */ val Vault: typings.paypalCheckoutComponents.callbackDataMod.FlowType.Vault with String = js.native
  }
  
  @JSImport("paypal-checkout-components", "Intent")
  @js.native
  object Intent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.callbackDataMod.Intent with String] = js.native
    
    /* "authorize" */ val Authorize: typings.paypalCheckoutComponents.callbackDataMod.Intent.Authorize with String = js.native
    
    /* "capture" */ val Capture: typings.paypalCheckoutComponents.callbackDataMod.Intent.Capture with String = js.native
    
    /* "order" */ val Order: typings.paypalCheckoutComponents.callbackDataMod.Intent.Order with String = js.native
  }
  
  @JSImport("paypal-checkout-components", "LineItemKind")
  @js.native
  object LineItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.callbackDataMod.LineItemKind with String] = js.native
    
    /* "credit" */ val Credit: typings.paypalCheckoutComponents.callbackDataMod.LineItemKind.Credit with String = js.native
    
    /* "debit" */ val Debit: typings.paypalCheckoutComponents.callbackDataMod.LineItemKind.Debit with String = js.native
  }
  
  @JSImport("paypal-checkout-components", "ShippingOptionType")
  @js.native
  object ShippingOptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutComponents.callbackDataMod.ShippingOptionType with String] = js.native
    
    /* "PICKUP" */ val Pickup: typings.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Pickup with String = js.native
    
    /* "SHIPPING" */ val Shipping: typings.paypalCheckoutComponents.callbackDataMod.ShippingOptionType.Shipping with String = js.native
  }
}
