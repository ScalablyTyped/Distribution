package typings.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaInitialsColor
import typings.react.NativeMouseEvent
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFacepilePersona extends ButtonHTMLAttributes[HTMLButtonElement | HTMLDivElement] {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.undefined
  /**
    * Extra data - not used directly but can be handy for passing additional data to custom event
    * handlers.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The user's initials to display in the image area when there is no image.
    * @defaultvalue [Derived from personaName]
    */
  var imageInitials: js.UndefOr[String] = js.undefined
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue [Derived from personaName]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor] = js.undefined
  /**
    * Optional keytip for this button that is only added when 'onClick' is defined for the persona
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * If provided, persona will be rendered with cursor:pointer and the handler will be
    * called on click.
    */
  @JSName("onClick")
  var onClick_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      Unit
    ]
  ] = js.undefined
  /**
    * If provided, the handler will be called on mouse move.
    */
  @JSName("onMouseMove")
  var onMouseMove_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      Unit
    ]
  ] = js.undefined
  /**
    * If provided, the handler will be called when mouse moves out of the component.
    */
  @JSName("onMouseOut")
  var onMouseOut_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      Unit
    ]
  ] = js.undefined
  /**
    * Name of the person.
    */
  var personaName: js.UndefOr[String] = js.undefined
}

object IFacepilePersona {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: ButtonHTMLAttributes[HTMLButtonElement | HTMLDivElement] = null,
    allowPhoneInitials: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    imageInitials: String = null,
    imageUrl: String = null,
    initialsColor: PersonaInitialsColor = null,
    keytipProps: IKeytipProps = null,
    onClick: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit = null,
    onMouseMove: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit = null,
    onMouseOut: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit = null,
    personaName: String = null
  ): IFacepilePersona = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    if (!js.isUndefined(allowPhoneInitials)) __obj.updateDynamic("allowPhoneInitials")(allowPhoneInitials)
    if (data != null) __obj.updateDynamic("data")(data)
    if (imageInitials != null) __obj.updateDynamic("imageInitials")(imageInitials)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (initialsColor != null) __obj.updateDynamic("initialsColor")(initialsColor)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction2(onMouseOut))
    if (personaName != null) __obj.updateDynamic("personaName")(personaName)
    __obj.asInstanceOf[IFacepilePersona]
  }
}

