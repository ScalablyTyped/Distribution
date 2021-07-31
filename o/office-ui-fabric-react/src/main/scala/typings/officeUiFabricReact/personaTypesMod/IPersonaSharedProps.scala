package typings.officeUiFabricReact.personaTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.Available
import typings.officeUiFabricReact.imageTypesMod.ImageLoadState
import typings.officeUiFabricReact.personaBaseMod.PersonaBase
import typings.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaSharedProps
  extends StObject
     with HTMLAttributes[PersonaBase | PersonaCoinBase | HTMLDivElement] {
  
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
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
    * @defaultvalue [Derived from text]
    */
  var imageInitials: js.UndefOr[String] = js.undefined
  
  /**
    * If true, adds the css class 'is-fadeIn' to the image.
    */
  var imageShouldFadeIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables imageShouldFadeIn.
    * @defaultvalue false
    */
  var imageShouldStartVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue [Derived from text]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.undefined
  
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
    * @defaultvalue PersonaPresence.none
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
    * @defaultvalue false
    */
  var showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.undefined
  
  var showSecondaryText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, show the special coin for unknown persona.
    * It has '?' in place of initials, with static font and background colors
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Decides the size of the control.
    * @defaultvalue PersonaSize.size48
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
  
  @scala.inline
  def apply(): IPersonaSharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaSharedProps]
  }
  
  @scala.inline
  implicit class IPersonaSharedPropsMutableBuilder[Self <: IPersonaSharedProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPhoneInitials(value: Boolean): Self = StObject.set(x, "allowPhoneInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPhoneInitialsUndefined: Self = StObject.set(x, "allowPhoneInitials", js.undefined)
    
    @scala.inline
    def setCoinProps(value: IPersonaCoinProps): Self = StObject.set(x, "coinProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoinPropsUndefined: Self = StObject.set(x, "coinProps", js.undefined)
    
    @scala.inline
    def setCoinSize(value: Double): Self = StObject.set(x, "coinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoinSizeUndefined: Self = StObject.set(x, "coinSize", js.undefined)
    
    @scala.inline
    def setHidePersonaDetails(value: Boolean): Self = StObject.set(x, "hidePersonaDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidePersonaDetailsUndefined: Self = StObject.set(x, "hidePersonaDetails", js.undefined)
    
    @scala.inline
    def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
    
    @scala.inline
    def setImageInitials(value: String): Self = StObject.set(x, "imageInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageInitialsUndefined: Self = StObject.set(x, "imageInitials", js.undefined)
    
    @scala.inline
    def setImageShouldFadeIn(value: Boolean): Self = StObject.set(x, "imageShouldFadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageShouldFadeInUndefined: Self = StObject.set(x, "imageShouldFadeIn", js.undefined)
    
    @scala.inline
    def setImageShouldStartVisible(value: Boolean): Self = StObject.set(x, "imageShouldStartVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageShouldStartVisibleUndefined: Self = StObject.set(x, "imageShouldStartVisible", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setInitialsColor(value: PersonaInitialsColor | String): Self = StObject.set(x, "initialsColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialsColorUndefined: Self = StObject.set(x, "initialsColor", js.undefined)
    
    @scala.inline
    def setIsOutOfOffice(value: Boolean): Self = StObject.set(x, "isOutOfOffice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOutOfOfficeUndefined: Self = StObject.set(x, "isOutOfOffice", js.undefined)
    
    @scala.inline
    def setOnPhotoLoadingStateChange(value: /* newImageLoadState */ ImageLoadState => Unit): Self = StObject.set(x, "onPhotoLoadingStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPhotoLoadingStateChangeUndefined: Self = StObject.set(x, "onPhotoLoadingStateChange", js.undefined)
    
    @scala.inline
    def setOnRenderCoin(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderCoin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderCoinUndefined: Self = StObject.set(x, "onRenderCoin", js.undefined)
    
    @scala.inline
    def setOnRenderInitials(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderInitials", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderInitialsUndefined: Self = StObject.set(x, "onRenderInitials", js.undefined)
    
    @scala.inline
    def setOnRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderPersonaCoin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderPersonaCoinUndefined: Self = StObject.set(x, "onRenderPersonaCoin", js.undefined)
    
    @scala.inline
    def setOptionalText(value: String): Self = StObject.set(x, "optionalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalTextUndefined: Self = StObject.set(x, "optionalText", js.undefined)
    
    @scala.inline
    def setPresence(value: PersonaPresence): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceColors(value: Available): Self = StObject.set(x, "presenceColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceColorsUndefined: Self = StObject.set(x, "presenceColors", js.undefined)
    
    @scala.inline
    def setPresenceTitle(value: String): Self = StObject.set(x, "presenceTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceTitleUndefined: Self = StObject.set(x, "presenceTitle", js.undefined)
    
    @scala.inline
    def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    @scala.inline
    def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
    
    @scala.inline
    def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
    
    @scala.inline
    def setShowInitialsUntilImageLoads(value: Boolean): Self = StObject.set(x, "showInitialsUntilImageLoads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInitialsUntilImageLoadsUndefined: Self = StObject.set(x, "showInitialsUntilImageLoads", js.undefined)
    
    @scala.inline
    def setShowSecondaryText(value: Boolean): Self = StObject.set(x, "showSecondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSecondaryTextUndefined: Self = StObject.set(x, "showSecondaryText", js.undefined)
    
    @scala.inline
    def setShowUnknownPersonaCoin(value: Boolean): Self = StObject.set(x, "showUnknownPersonaCoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUnknownPersonaCoinUndefined: Self = StObject.set(x, "showUnknownPersonaCoin", js.undefined)
    
    @scala.inline
    def setSize(value: PersonaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTertiaryText(value: String): Self = StObject.set(x, "tertiaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTertiaryTextUndefined: Self = StObject.set(x, "tertiaryText", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
