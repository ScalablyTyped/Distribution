package typings
package officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPersonaSharedProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotBaseMod.PersonaBase
    ] {
  /**
       * Whether initials are calculated for phone numbers and number sequences.
       * Example: Set property to true to get initials for project names consisting of numbers only.
       * @defaultvalue false
       */
  var allowPhoneInitials: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional HTML element props for Persona coin.
       */
  var coinProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  /**
       * Optional custom persona coin size in pixel.
       */
  var coinSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether to not render persona details, and just render the persona image/initials.
       */
  var hidePersonaDetails: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Alt text for the image to use. Defaults to an empty string.
       */
  var imageAlt: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The user's initials to display in the image area when there is no image.
       * @defaultvalue [Derived from text]
       */
  var imageInitials: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true, adds the css class 'is-fadeIn' to the image.
       */
  var imageShouldFadeIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
       * it is successfully loaded. This disables imageShouldFadeIn.
       * @defaultvalue false
       */
  var imageShouldStartVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
       */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The background color when the user's initials are displayed.
       * @defaultvalue [Derived from text]
       */
  var initialsColor: js.UndefOr[PersonaInitialsColor | java.lang.String] = js.undefined
  /**
       * Optional callback for when loading state of the photo changes
       */
  var onPhotoLoadingStateChange: js.UndefOr[
    js.Function1[
      /* newImageLoadState */ officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.ImageLoadState, 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Optional custom renderer for the coin
       */
  var onRenderCoin: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPersonaSharedProps]
  ] = js.undefined
  /**
       * Optional custom renderer for the initials
       */
  var onRenderInitials: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPersonaSharedProps]
  ] = js.undefined
  /**
       * Optional text to display, usually a custom message set.
       */
  var optionalText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Presence of the person to display - will not display presence if undefined.
       * @defaultvalue PersonaPresence.none
       */
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  /**
       * Primary text to display, usually the name of the person.
       * @deprecated Use 'text' instead.
       */
  var primaryText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Secondary text to display, usually the role of the user.
       */
  var secondaryText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true renders the initials while the image is loading.
       * This only applies when an imageUrl is provided.
       * @defaultvalue false
       */
  var showInitialsUntilImageLoads: js.UndefOr[scala.Boolean] = js.undefined
  var showSecondaryText: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, show the special coin for unknown persona.
       * It has '?' in place of initials, with static font and background colors
       */
  var showUnknownPersonaCoin: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Decides the size of the control.
       * @defaultvalue PersonaSize.size48
       */
  var size: js.UndefOr[PersonaSize] = js.undefined
  /**
       * Tertiary text to display, usually the status of the user.
       */
  var tertiaryText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Primary text to display, usually the name of the person.
       */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

