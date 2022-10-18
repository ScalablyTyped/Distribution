package typings.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.anon.Available
import typings.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState
import typings.officeUiFabricReact.libComponentsPersonaPersonaCoinPersonaCoinDotbaseMod.PersonaCoinBase
import typings.officeUiFabricReact.libComponentsPersonaPersonaDotbaseMod.PersonaBase
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaSharedProps
  extends StObject
     with HTMLAttributes[PersonaBase | PersonaCoinBase | HTMLDivElement] {
  
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @default false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional HTML element props for Persona coin.
    */
  var coinProps: js.UndefOr[IPersonaCoinProps] = js.undefined
  
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to not render persona details, and just render the persona image/initials.
    */
  var hidePersonaDetails: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Alt text for the image to use. Defaults to an empty string.
    */
  var imageAlt: js.UndefOr[String] = js.undefined
  
  /**
    * The user's initials to display in the image area when there is no image.
    * @default [Derived from text]
    */
  var imageInitials: js.UndefOr[String] = js.undefined
  
  /**
    * If true, adds the css class 'is-fadeIn' to the image.
    */
  var imageShouldFadeIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables imageShouldFadeIn.
    * @default false
    */
  var imageShouldStartVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The background color when the user's initials are displayed.
    * @default [Derived from text]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.undefined
  
  /**
    * The text color when the user's initials are displayed
    */
  var initialsTextColor: js.UndefOr[String] = js.undefined
  
  /**
    * This flag can be used to signal the persona is out of office.
    * This will change the way the presence icon looks for statuses that support dual-presence.
    */
  var isOutOfOffice: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional callback for when loading state of the photo changes
    */
  var onPhotoLoadingStateChange: js.UndefOr[js.Function1[/* newImageLoadState */ ImageLoadState, Unit]] = js.undefined
  
  /**
    * Optional custom renderer for the coin
    * @deprecated Use `onRenderPersonaCoin` for custom rendering instead
    */
  var onRenderCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  
  /**
    * Optional custom renderer for the initials
    */
  var onRenderInitials: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  
  /**
    * Optional custom renderer for the coin
    */
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.undefined
  
  /**
    * Optional text to display, usually a custom message set. The optional text will only be shown when using size100.
    */
  var optionalText: js.UndefOr[String] = js.undefined
  
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @default PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  
  /** The colors to be used for the presence-icon and it's background */
  var presenceColors: js.UndefOr[Available] = js.undefined
  
  /**
    * Presence title to be shown as a tooltip on hover over the presence icon.
    */
  var presenceTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Primary text to display, usually the name of the person.
    * @deprecated Use `text` instead.
    */
  var primaryText: js.UndefOr[String] = js.undefined
  
  /**
    * Secondary text to display, usually the role of the user.
    */
  var secondaryText: js.UndefOr[String] = js.undefined
  
  /**
    * If true renders the initials while the image is loading.
    * This only applies when an imageUrl is provided.
    * @default false
    */
  var showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether clipped overflow text should render in a tooltip.
    * @default true
    */
  var showOverflowTooltip: js.UndefOr[Boolean] = js.undefined
  
  var showSecondaryText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, show the special coin for unknown persona.
    * It has '?' in place of initials, with static font and background colors
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Decides the size of the control.
    * @default PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.undefined
  
  /**
    * Tertiary text to display, usually the status of the user.
    * The tertiary text will only be shown when using size72 or size100.
    */
  var tertiaryText: js.UndefOr[String] = js.undefined
  
  /**
    * Primary text to display, usually the name of the person.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}
object IPersonaSharedProps {
  
  inline def apply(): IPersonaSharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaSharedProps]
  }
  
  extension [Self <: IPersonaSharedProps](x: Self) {
    
    inline def setAllowPhoneInitials(value: Boolean): Self = StObject.set(x, "allowPhoneInitials", value.asInstanceOf[js.Any])
    
    inline def setAllowPhoneInitialsUndefined: Self = StObject.set(x, "allowPhoneInitials", js.undefined)
    
    inline def setCoinProps(value: IPersonaCoinProps): Self = StObject.set(x, "coinProps", value.asInstanceOf[js.Any])
    
    inline def setCoinPropsUndefined: Self = StObject.set(x, "coinProps", js.undefined)
    
    inline def setCoinSize(value: Double): Self = StObject.set(x, "coinSize", value.asInstanceOf[js.Any])
    
    inline def setCoinSizeUndefined: Self = StObject.set(x, "coinSize", js.undefined)
    
    inline def setHidePersonaDetails(value: Boolean): Self = StObject.set(x, "hidePersonaDetails", value.asInstanceOf[js.Any])
    
    inline def setHidePersonaDetailsUndefined: Self = StObject.set(x, "hidePersonaDetails", js.undefined)
    
    inline def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
    
    inline def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
    
    inline def setImageInitials(value: String): Self = StObject.set(x, "imageInitials", value.asInstanceOf[js.Any])
    
    inline def setImageInitialsUndefined: Self = StObject.set(x, "imageInitials", js.undefined)
    
    inline def setImageShouldFadeIn(value: Boolean): Self = StObject.set(x, "imageShouldFadeIn", value.asInstanceOf[js.Any])
    
    inline def setImageShouldFadeInUndefined: Self = StObject.set(x, "imageShouldFadeIn", js.undefined)
    
    inline def setImageShouldStartVisible(value: Boolean): Self = StObject.set(x, "imageShouldStartVisible", value.asInstanceOf[js.Any])
    
    inline def setImageShouldStartVisibleUndefined: Self = StObject.set(x, "imageShouldStartVisible", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setInitialsColor(value: PersonaInitialsColor | String): Self = StObject.set(x, "initialsColor", value.asInstanceOf[js.Any])
    
    inline def setInitialsColorUndefined: Self = StObject.set(x, "initialsColor", js.undefined)
    
    inline def setInitialsTextColor(value: String): Self = StObject.set(x, "initialsTextColor", value.asInstanceOf[js.Any])
    
    inline def setInitialsTextColorUndefined: Self = StObject.set(x, "initialsTextColor", js.undefined)
    
    inline def setIsOutOfOffice(value: Boolean): Self = StObject.set(x, "isOutOfOffice", value.asInstanceOf[js.Any])
    
    inline def setIsOutOfOfficeUndefined: Self = StObject.set(x, "isOutOfOffice", js.undefined)
    
    inline def setOnPhotoLoadingStateChange(value: /* newImageLoadState */ ImageLoadState => Unit): Self = StObject.set(x, "onPhotoLoadingStateChange", js.Any.fromFunction1(value))
    
    inline def setOnPhotoLoadingStateChangeUndefined: Self = StObject.set(x, "onPhotoLoadingStateChange", js.undefined)
    
    inline def setOnRenderCoin(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderCoin", js.Any.fromFunction2(value))
    
    inline def setOnRenderCoinUndefined: Self = StObject.set(x, "onRenderCoin", js.undefined)
    
    inline def setOnRenderInitials(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderInitials", js.Any.fromFunction2(value))
    
    inline def setOnRenderInitialsUndefined: Self = StObject.set(x, "onRenderInitials", js.undefined)
    
    inline def setOnRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderPersonaCoin", js.Any.fromFunction2(value))
    
    inline def setOnRenderPersonaCoinUndefined: Self = StObject.set(x, "onRenderPersonaCoin", js.undefined)
    
    inline def setOptionalText(value: String): Self = StObject.set(x, "optionalText", value.asInstanceOf[js.Any])
    
    inline def setOptionalTextUndefined: Self = StObject.set(x, "optionalText", js.undefined)
    
    inline def setPresence(value: PersonaPresence): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setPresenceColors(value: Available): Self = StObject.set(x, "presenceColors", value.asInstanceOf[js.Any])
    
    inline def setPresenceColorsUndefined: Self = StObject.set(x, "presenceColors", js.undefined)
    
    inline def setPresenceTitle(value: String): Self = StObject.set(x, "presenceTitle", value.asInstanceOf[js.Any])
    
    inline def setPresenceTitleUndefined: Self = StObject.set(x, "presenceTitle", js.undefined)
    
    inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    inline def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
    
    inline def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
    
    inline def setShowInitialsUntilImageLoads(value: Boolean): Self = StObject.set(x, "showInitialsUntilImageLoads", value.asInstanceOf[js.Any])
    
    inline def setShowInitialsUntilImageLoadsUndefined: Self = StObject.set(x, "showInitialsUntilImageLoads", js.undefined)
    
    inline def setShowOverflowTooltip(value: Boolean): Self = StObject.set(x, "showOverflowTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowOverflowTooltipUndefined: Self = StObject.set(x, "showOverflowTooltip", js.undefined)
    
    inline def setShowSecondaryText(value: Boolean): Self = StObject.set(x, "showSecondaryText", value.asInstanceOf[js.Any])
    
    inline def setShowSecondaryTextUndefined: Self = StObject.set(x, "showSecondaryText", js.undefined)
    
    inline def setShowUnknownPersonaCoin(value: Boolean): Self = StObject.set(x, "showUnknownPersonaCoin", value.asInstanceOf[js.Any])
    
    inline def setShowUnknownPersonaCoinUndefined: Self = StObject.set(x, "showUnknownPersonaCoin", js.undefined)
    
    inline def setSize(value: PersonaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTertiaryText(value: String): Self = StObject.set(x, "tertiaryText", value.asInstanceOf[js.Any])
    
    inline def setTertiaryTextUndefined: Self = StObject.set(x, "tertiaryText", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
