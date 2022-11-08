package typings.paypalCheckoutComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesConfigurationMod {
  
  @js.native
  sealed trait ButtonColorOption extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "ButtonColorOption")
  @js.native
  object ButtonColorOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonColorOption & String] = js.native
    
    /**
      * Third alternate
      * If your website demands a monochromatic button experience, try the black button.
      * Because black is a common website color and less capable of drawing people's attention,
      * we recommend this button as a third alternative.
      */
    @js.native
    sealed trait Black
      extends StObject
         with ButtonColorOption
    /* "black" */ val Black: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Black & String = js.native
    
    /**
      * First alternate
      * If gold is not an option for your site, try the PayPal blue button.
      * Research shows that people know it is our brand color,
      * which provides a halo of trust and security to your experience.
      */
    @js.native
    sealed trait Blue
      extends StObject
         with ButtonColorOption
    /* "blue" */ val Blue: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Blue & String = js.native
    
    /**
      * Recommended
      * People around the world know us for the color gold and research confirms it.
      * Extensive testing determined just the right shade and shape that help increase conversion.
      * Use it on your website to leverage PayPal’s recognition and preference.
      */
    @js.native
    sealed trait Gold
      extends StObject
         with ButtonColorOption
    /* "gold" */ val Gold: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Gold & String = js.native
    
    /**
      * Second alternate
      * If gold or blue do not work for your site design or aesthetic, try the silver button.
      * Because this color is a bit recessive and less capable of drawing people’s attention,
      * we recommend this button color as a second alternative.
      */
    @js.native
    sealed trait Silver
      extends StObject
         with ButtonColorOption
    /* "silver" */ val Silver: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption.Silver & String = js.native
  }
  
  @js.native
  sealed trait ButtonLabelOption extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "ButtonLabelOption")
  @js.native
  object ButtonLabelOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonLabelOption & String] = js.native
    
    /**
      * The Buy Now button. Initializes the checkout flow.
      * The default Buy Now button is unbranded. To include PayPal branding, set branding: true.
      */
    @js.native
    sealed trait BuyNow
      extends StObject
         with ButtonLabelOption
    /* "buynow" */ val BuyNow: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.BuyNow & String = js.native
    
    /**
      * The PayPal Checkout button. The default button.
      */
    @js.native
    sealed trait Checkout
      extends StObject
         with ButtonLabelOption
    /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Checkout & String = js.native
    
    /**
      * The PayPal Credit button. Initializes the credit flow. Cannot be used with any custom color option.
      */
    @js.native
    sealed trait Credit
      extends StObject
         with ButtonLabelOption
    /* "credit" */ val Credit: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Credit & String = js.native
    
    /**
      * The Pay With PayPal button. Initializes the checkout flow.
      */
    @js.native
    sealed trait Pay
      extends StObject
         with ButtonLabelOption
    /* "pay" */ val Pay: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.Pay & String = js.native
    
    /**
      * The generic PayPal button. Initializes the checkout flow. This button contains only the PayPal brand logo.
      */
    @js.native
    sealed trait PayPal
      extends StObject
         with ButtonLabelOption
    /* "paypal" */ val PayPal: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption.PayPal & String = js.native
  }
  
  @js.native
  sealed trait ButtonShapeOption extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "ButtonShapeOption")
  @js.native
  object ButtonShapeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonShapeOption & String] = js.native
    
    /**
      * Recommended
      * Whenever possible, use the pill-shaped button.
      * Its unique and powerful shape signifies PayPal in people’s minds.
      */
    @js.native
    sealed trait Pill
      extends StObject
         with ButtonShapeOption
    /* "pill" */ val Pill: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption.Pill & String = js.native
    
    /**
      * Use the rectangular button as an alternative for media such as mobile
      * where pill-shaped buttons might pose design challenges.
      */
    @js.native
    sealed trait Rect
      extends StObject
         with ButtonShapeOption
    /* "rect" */ val Rect: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption.Rect & String = js.native
  }
  
  @js.native
  sealed trait ButtonSizeOption extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "ButtonSizeOption")
  @js.native
  object ButtonSizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonSizeOption & String] = js.native
    
    /**
      * 350 pixels by 40 pixels
      */
    @js.native
    sealed trait Large
      extends StObject
         with ButtonSizeOption
    /* "large" */ val Large: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Large & String = js.native
    
    /**
      * 250 pixels by 35 pixels
      */
    @js.native
    sealed trait Medium
      extends StObject
         with ButtonSizeOption
    /* "medium" */ val Medium: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Medium & String = js.native
    
    /**
      * Dynamic
      * Matches the width of the container element, height is decided dynamically based on width.
      * Minimum width is 150px, maximum width is 500px.
      */
    @js.native
    sealed trait Responsive
      extends StObject
         with ButtonSizeOption
    /* "responsive" */ val Responsive: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Responsive & String = js.native
    
    /**
      * Recommended. Default.
      * 150 pixels by 25 pixels
      */
    @js.native
    sealed trait Small
      extends StObject
         with ButtonSizeOption
    /* "small" */ val Small: typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption.Small & String = js.native
  }
  
  @js.native
  sealed trait Environment extends StObject
  @JSImport("paypal-checkout-components/modules/configuration", "Environment")
  @js.native
  object Environment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Environment & String] = js.native
    
    @js.native
    sealed trait Production
      extends StObject
         with Environment
    /* "production" */ val Production: typings.paypalCheckoutComponents.modulesConfigurationMod.Environment.Production & String = js.native
    
    @js.native
    sealed trait Sandbox
      extends StObject
         with Environment
    /* "sandbox" */ val Sandbox: typings.paypalCheckoutComponents.modulesConfigurationMod.Environment.Sandbox & String = js.native
  }
  
  trait ButtonStyle extends StObject {
    
    var color: ButtonColorOption
    
    var height: js.UndefOr[Double] = js.undefined
    
    var label: ButtonLabelOption
    
    var shape: ButtonShapeOption
    
    var size: ButtonSizeOption
    
    var tagline: Boolean
  }
  object ButtonStyle {
    
    inline def apply(
      color: ButtonColorOption,
      label: ButtonLabelOption,
      shape: ButtonShapeOption,
      size: ButtonSizeOption,
      tagline: Boolean
    ): ButtonStyle = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonStyle]
    }
    
    extension [Self <: ButtonStyle](x: Self) {
      
      inline def setColor(value: ButtonColorOption): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabel(value: ButtonLabelOption): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setShape(value: ButtonShapeOption): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setSize(value: ButtonSizeOption): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTagline(value: Boolean): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
    }
  }
}
