package typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsImageImageDotTypesMod.ImageLoadState
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaCoinPersonaCoinDotBaseMod.PersonaCoinBase
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotBaseMod.PersonaBase
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaSharedProps extends HTMLAttributes[PersonaBase | PersonaCoinBase | HTMLDivElement] {
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
    * Optional text to display, usually a custom message set. The optional text will only be shown when using Size100.
    */
  var optionalText: js.UndefOr[String] = js.undefined
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @defaultvalue PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.undefined
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
    * Tertiary text to display, usually the status of the user. The tertiary text will only be shown when using Size72 or Size100.
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
  def apply(
    HTMLAttributes: HTMLAttributes[PersonaBase | PersonaCoinBase | HTMLDivElement] = null,
    allowPhoneInitials: js.UndefOr[Boolean] = js.undefined,
    coinProps: IPersonaCoinProps = null,
    coinSize: Int | Double = null,
    hidePersonaDetails: js.UndefOr[Boolean] = js.undefined,
    imageAlt: String = null,
    imageInitials: String = null,
    imageShouldFadeIn: js.UndefOr[Boolean] = js.undefined,
    imageShouldStartVisible: js.UndefOr[Boolean] = js.undefined,
    imageUrl: String = null,
    initialsColor: PersonaInitialsColor | String = null,
    isOutOfOffice: js.UndefOr[Boolean] = js.undefined,
    onPhotoLoadingStateChange: /* newImageLoadState */ ImageLoadState => Unit = null,
    onRenderCoin: IRenderFunction[IPersonaSharedProps] = null,
    onRenderInitials: IRenderFunction[IPersonaSharedProps] = null,
    onRenderPersonaCoin: IRenderFunction[IPersonaSharedProps] = null,
    optionalText: String = null,
    presence: PersonaPresence = null,
    presenceTitle: String = null,
    primaryText: String = null,
    secondaryText: String = null,
    showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.undefined,
    showSecondaryText: js.UndefOr[Boolean] = js.undefined,
    showUnknownPersonaCoin: js.UndefOr[Boolean] = js.undefined,
    size: PersonaSize = null,
    tertiaryText: String = null,
    text: String = null,
    theme: ITheme = null
  ): IPersonaSharedProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(allowPhoneInitials)) __obj.updateDynamic("allowPhoneInitials")(allowPhoneInitials)
    if (coinProps != null) __obj.updateDynamic("coinProps")(coinProps)
    if (coinSize != null) __obj.updateDynamic("coinSize")(coinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePersonaDetails)) __obj.updateDynamic("hidePersonaDetails")(hidePersonaDetails)
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt)
    if (imageInitials != null) __obj.updateDynamic("imageInitials")(imageInitials)
    if (!js.isUndefined(imageShouldFadeIn)) __obj.updateDynamic("imageShouldFadeIn")(imageShouldFadeIn)
    if (!js.isUndefined(imageShouldStartVisible)) __obj.updateDynamic("imageShouldStartVisible")(imageShouldStartVisible)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (initialsColor != null) __obj.updateDynamic("initialsColor")(initialsColor.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutOfOffice)) __obj.updateDynamic("isOutOfOffice")(isOutOfOffice)
    if (onPhotoLoadingStateChange != null) __obj.updateDynamic("onPhotoLoadingStateChange")(js.Any.fromFunction1(onPhotoLoadingStateChange))
    if (onRenderCoin != null) __obj.updateDynamic("onRenderCoin")(onRenderCoin)
    if (onRenderInitials != null) __obj.updateDynamic("onRenderInitials")(onRenderInitials)
    if (onRenderPersonaCoin != null) __obj.updateDynamic("onRenderPersonaCoin")(onRenderPersonaCoin)
    if (optionalText != null) __obj.updateDynamic("optionalText")(optionalText)
    if (presence != null) __obj.updateDynamic("presence")(presence)
    if (presenceTitle != null) __obj.updateDynamic("presenceTitle")(presenceTitle)
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText)
    if (!js.isUndefined(showInitialsUntilImageLoads)) __obj.updateDynamic("showInitialsUntilImageLoads")(showInitialsUntilImageLoads)
    if (!js.isUndefined(showSecondaryText)) __obj.updateDynamic("showSecondaryText")(showSecondaryText)
    if (!js.isUndefined(showUnknownPersonaCoin)) __obj.updateDynamic("showUnknownPersonaCoin")(showUnknownPersonaCoin)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText)
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IPersonaSharedProps]
  }
}

