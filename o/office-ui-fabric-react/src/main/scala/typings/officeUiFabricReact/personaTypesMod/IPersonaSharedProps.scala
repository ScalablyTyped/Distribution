package typings.officeUiFabricReact.personaTypesMod

import typings.officeUiFabricReact.anon.Available
import typings.officeUiFabricReact.imageTypesMod.ImageLoadState
import typings.officeUiFabricReact.personaBaseMod.PersonaBase
import typings.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaSharedProps extends HTMLAttributes[PersonaBase | PersonaCoinBase | HTMLDivElement] {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.native
  /**
    * Optional HTML element props for Persona coin.
    */
  var coinProps: js.UndefOr[IPersonaCoinProps] = js.native
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.native
  /**
    * Whether to not render persona details, and just render the persona image/initials.
    */
  var hidePersonaDetails: js.UndefOr[Boolean] = js.native
  /**
    * Alt text for the image to use. Defaults to an empty string.
    */
  var imageAlt: js.UndefOr[String] = js.native
  /**
    * The user's initials to display in the image area when there is no image.
    * @defaultvalue [Derived from text]
    */
  var imageInitials: js.UndefOr[String] = js.native
  /**
    * If true, adds the css class 'is-fadeIn' to the image.
    */
  var imageShouldFadeIn: js.UndefOr[Boolean] = js.native
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables imageShouldFadeIn.
    * @defaultvalue false
    */
  var imageShouldStartVisible: js.UndefOr[Boolean] = js.native
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue [Derived from text]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.native
  /**
    * This flag can be used to signal the persona is out of office.
    * This will change the way the presence icon looks for statuses that support dual-presence.
    */
  var isOutOfOffice: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback for when loading state of the photo changes
    */
  var onPhotoLoadingStateChange: js.UndefOr[js.Function1[/* newImageLoadState */ ImageLoadState, Unit]] = js.native
  /**
    * Optional custom renderer for the coin
    * @deprecated Use `onRenderPersonaCoin` for custom rendering instead
    */
  var onRenderCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.native
  /**
    * Optional custom renderer for the initials
    */
  var onRenderInitials: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.native
  /**
    * Optional custom renderer for the coin
    */
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.native
  /**
    * Optional text to display, usually a custom message set. The optional text will only be shown when using size100.
    */
  var optionalText: js.UndefOr[String] = js.native
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @defaultvalue PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.native
  /** The colors to be used for the presence-icon and it's background */
  var presenceColors: js.UndefOr[Available] = js.native
  /**
    * Presence title to be shown as a tooltip on hover over the presence icon.
    */
  var presenceTitle: js.UndefOr[String] = js.native
  /**
    * Primary text to display, usually the name of the person.
    * @deprecated Use `text` instead.
    */
  var primaryText: js.UndefOr[String] = js.native
  /**
    * Secondary text to display, usually the role of the user.
    */
  var secondaryText: js.UndefOr[String] = js.native
  /**
    * If true renders the initials while the image is loading.
    * This only applies when an imageUrl is provided.
    * @defaultvalue false
    */
  var showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.native
  var showSecondaryText: js.UndefOr[Boolean] = js.native
  /**
    * If true, show the special coin for unknown persona.
    * It has '?' in place of initials, with static font and background colors
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.native
  /**
    * Decides the size of the control.
    * @defaultvalue PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.native
  /**
    * Tertiary text to display, usually the status of the user.
    * The tertiary text will only be shown when using size72 or size100.
    */
  var tertiaryText: js.UndefOr[String] = js.native
  /**
    * Primary text to display, usually the name of the person.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IPersonaSharedProps {
  @scala.inline
  def apply(): IPersonaSharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaSharedProps]
  }
  @scala.inline
  implicit class IPersonaSharedPropsOps[Self <: IPersonaSharedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowPhoneInitials(value: Boolean): Self = this.set("allowPhoneInitials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPhoneInitials: Self = this.set("allowPhoneInitials", js.undefined)
    @scala.inline
    def setCoinProps(value: IPersonaCoinProps): Self = this.set("coinProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoinProps: Self = this.set("coinProps", js.undefined)
    @scala.inline
    def setCoinSize(value: Double): Self = this.set("coinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoinSize: Self = this.set("coinSize", js.undefined)
    @scala.inline
    def setHidePersonaDetails(value: Boolean): Self = this.set("hidePersonaDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePersonaDetails: Self = this.set("hidePersonaDetails", js.undefined)
    @scala.inline
    def setImageAlt(value: String): Self = this.set("imageAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageAlt: Self = this.set("imageAlt", js.undefined)
    @scala.inline
    def setImageInitials(value: String): Self = this.set("imageInitials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageInitials: Self = this.set("imageInitials", js.undefined)
    @scala.inline
    def setImageShouldFadeIn(value: Boolean): Self = this.set("imageShouldFadeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageShouldFadeIn: Self = this.set("imageShouldFadeIn", js.undefined)
    @scala.inline
    def setImageShouldStartVisible(value: Boolean): Self = this.set("imageShouldStartVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageShouldStartVisible: Self = this.set("imageShouldStartVisible", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setInitialsColor(value: PersonaInitialsColor | String): Self = this.set("initialsColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialsColor: Self = this.set("initialsColor", js.undefined)
    @scala.inline
    def setIsOutOfOffice(value: Boolean): Self = this.set("isOutOfOffice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOutOfOffice: Self = this.set("isOutOfOffice", js.undefined)
    @scala.inline
    def setOnPhotoLoadingStateChange(value: /* newImageLoadState */ ImageLoadState => Unit): Self = this.set("onPhotoLoadingStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPhotoLoadingStateChange: Self = this.set("onPhotoLoadingStateChange", js.undefined)
    @scala.inline
    def setOnRenderCoin(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderCoin", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderCoin: Self = this.set("onRenderCoin", js.undefined)
    @scala.inline
    def setOnRenderInitials(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderInitials", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderInitials: Self = this.set("onRenderInitials", js.undefined)
    @scala.inline
    def setOnRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderPersonaCoin", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderPersonaCoin: Self = this.set("onRenderPersonaCoin", js.undefined)
    @scala.inline
    def setOptionalText(value: String): Self = this.set("optionalText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalText: Self = this.set("optionalText", js.undefined)
    @scala.inline
    def setPresence(value: PersonaPresence): Self = this.set("presence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresence: Self = this.set("presence", js.undefined)
    @scala.inline
    def setPresenceColors(value: Available): Self = this.set("presenceColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresenceColors: Self = this.set("presenceColors", js.undefined)
    @scala.inline
    def setPresenceTitle(value: String): Self = this.set("presenceTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresenceTitle: Self = this.set("presenceTitle", js.undefined)
    @scala.inline
    def setPrimaryText(value: String): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    @scala.inline
    def setSecondaryText(value: String): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    @scala.inline
    def setShowInitialsUntilImageLoads(value: Boolean): Self = this.set("showInitialsUntilImageLoads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInitialsUntilImageLoads: Self = this.set("showInitialsUntilImageLoads", js.undefined)
    @scala.inline
    def setShowSecondaryText(value: Boolean): Self = this.set("showSecondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSecondaryText: Self = this.set("showSecondaryText", js.undefined)
    @scala.inline
    def setShowUnknownPersonaCoin(value: Boolean): Self = this.set("showUnknownPersonaCoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowUnknownPersonaCoin: Self = this.set("showUnknownPersonaCoin", js.undefined)
    @scala.inline
    def setSize(value: PersonaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTertiaryText(value: String): Self = this.set("tertiaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTertiaryText: Self = this.set("tertiaryText", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

