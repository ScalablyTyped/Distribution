package typings.paypalCheckoutComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @js.native
  sealed trait ButtonColorOption extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "ButtonColorOption")
  @js.native
  object ButtonColorOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonColorOption with String] = js.native
    
    /**
      * Third alternate
      * If your website demands a monochromatic button experience, try the black button.
      * Because black is a common website color and less capable of drawing people's attention,
      * we recommend this button as a third alternative.
      */
    @js.native
    sealed trait Black extends ButtonColorOption
    /* "black" */ val Black: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Black with String = js.native
    
    /**
      * First alternate
      * If gold is not an option for your site, try the PayPal blue button.
      * Research shows that people know it is our brand color,
      * which provides a halo of trust and security to your experience.
      */
    @js.native
    sealed trait Blue extends ButtonColorOption
    /* "blue" */ val Blue: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Blue with String = js.native
    
    /**
      * Recommended
      * People around the world know us for the color gold and research confirms it.
      * Extensive testing determined just the right shade and shape that help increase conversion.
      * Use it on your website to leverage PayPal’s recognition and preference.
      */
    @js.native
    sealed trait Gold extends ButtonColorOption
    /* "gold" */ val Gold: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Gold with String = js.native
    
    /**
      * Second alternate
      * If gold or blue do not work for your site design or aesthetic, try the silver button.
      * Because this color is a bit recessive and less capable of drawing people’s attention,
      * we recommend this button color as a second alternative.
      */
    @js.native
    sealed trait Silver extends ButtonColorOption
    /* "silver" */ val Silver: typings.paypalCheckoutComponents.configurationMod.ButtonColorOption.Silver with String = js.native
  }
  
  @js.native
  sealed trait ButtonLabelOption extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "ButtonLabelOption")
  @js.native
  object ButtonLabelOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonLabelOption with String] = js.native
    
    /**
      * The Buy Now button. Initializes the checkout flow.
      * The default Buy Now button is unbranded. To include PayPal branding, set branding: true.
      */
    @js.native
    sealed trait BuyNow extends ButtonLabelOption
    /* "buynow" */ val BuyNow: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.BuyNow with String = js.native
    
    /**
      * The PayPal Checkout button. The default button.
      */
    @js.native
    sealed trait Checkout extends ButtonLabelOption
    /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Checkout with String = js.native
    
    /**
      * The PayPal Credit button. Initializes the credit flow. Cannot be used with any custom color option.
      */
    @js.native
    sealed trait Credit extends ButtonLabelOption
    /* "credit" */ val Credit: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Credit with String = js.native
    
    /**
      * The Pay With PayPal button. Initializes the checkout flow.
      */
    @js.native
    sealed trait Pay extends ButtonLabelOption
    /* "pay" */ val Pay: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.Pay with String = js.native
    
    /**
      * The generic PayPal button. Initializes the checkout flow. This button contains only the PayPal brand logo.
      */
    @js.native
    sealed trait PayPal extends ButtonLabelOption
    /* "paypal" */ val PayPal: typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption.PayPal with String = js.native
  }
  
  @js.native
  sealed trait ButtonShapeOption extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "ButtonShapeOption")
  @js.native
  object ButtonShapeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonShapeOption with String] = js.native
    
    /**
      * Recommended
      * Whenever possible, use the pill-shaped button.
      * Its unique and powerful shape signifies PayPal in people’s minds.
      */
    @js.native
    sealed trait Pill extends ButtonShapeOption
    /* "pill" */ val Pill: typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Pill with String = js.native
    
    /**
      * Use the rectangular button as an alternative for media such as mobile
      * where pill-shaped buttons might pose design challenges.
      */
    @js.native
    sealed trait Rect extends ButtonShapeOption
    /* "rect" */ val Rect: typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption.Rect with String = js.native
  }
  
  @js.native
  sealed trait ButtonSizeOption extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "ButtonSizeOption")
  @js.native
  object ButtonSizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonSizeOption with String] = js.native
    
    /**
      * 350 pixels by 40 pixels
      */
    @js.native
    sealed trait Large extends ButtonSizeOption
    /* "large" */ val Large: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Large with String = js.native
    
    /**
      * 250 pixels by 35 pixels
      */
    @js.native
    sealed trait Medium extends ButtonSizeOption
    /* "medium" */ val Medium: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Medium with String = js.native
    
    /**
      * Dynamic
      * Matches the width of the container element, height is decided dynamically based on width.
      * Minimum width is 150px, maximum width is 500px.
      */
    @js.native
    sealed trait Responsive extends ButtonSizeOption
    /* "responsive" */ val Responsive: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Responsive with String = js.native
    
    /**
      * Recommended. Default.
      * 150 pixels by 25 pixels
      */
    @js.native
    sealed trait Small extends ButtonSizeOption
    /* "small" */ val Small: typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption.Small with String = js.native
  }
  
  @js.native
  sealed trait Environment extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "Environment")
  @js.native
  object Environment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Environment with String] = js.native
    
    @js.native
    sealed trait Production extends Environment
    /* "production" */ val Production: typings.paypalCheckoutComponents.configurationMod.Environment.Production with String = js.native
    
    @js.native
    sealed trait Sandbox extends Environment
    /* "sandbox" */ val Sandbox: typings.paypalCheckoutComponents.configurationMod.Environment.Sandbox with String = js.native
  }
  
  @js.native
  trait ButtonStyle extends StObject {
    
    var color: ButtonColorOption = js.native
    
    var label: ButtonLabelOption = js.native
    
    var shape: ButtonShapeOption = js.native
    
    var size: ButtonSizeOption = js.native
    
    var tagline: Boolean = js.native
  }
  object ButtonStyle {
    
    @scala.inline
    def apply(
      color: ButtonColorOption,
      label: ButtonLabelOption,
      shape: ButtonShapeOption,
      size: ButtonSizeOption,
      tagline: Boolean
    ): ButtonStyle = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonStyle]
    }
    
    @scala.inline
    implicit class ButtonStyleMutableBuilder[Self <: ButtonStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ButtonColorOption): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: ButtonLabelOption): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: ButtonShapeOption): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: ButtonSizeOption): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagline(value: Boolean): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    }
  }
}
