package typings
package officeDashUiDashFabricDashReactLib.libComponentsFacepileFacepileDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFacepilePersona
  extends reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement | reactLib.HTMLDivElement] {
  /**
       * Whether initials are calculated for phone numbers and number sequences.
       * Example: Set property to true to get initials for project names consisting of numbers only.
       * @defaultvalue false
       */
  var allowPhoneInitials: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Extra data - not used directly but can be handy for passing additional data to custom event
       * handlers.
       */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
       * The user's initials to display in the image area when there is no image.
       * @defaultvalue [Derived from personaName]
       */
  var imageInitials: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
       */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The background color when the user's initials are displayed.
       * @defaultvalue [Derived from personaName]
       */
  var initialsColor: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.PersonaInitialsColor
  ] = js.undefined
  /**
       * If provided, persona will be rendered with cursor:pointer and the handler will be
       * called on click.
       */
  @JSName("onClick")
  var onClick_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * If provided, the handler will be called on mouse move.
       */
  @JSName("onMouseMove")
  var onMouseMove_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * If provided, the handler will be called when mouse moves out of the component.
       */
  @JSName("onMouseOut")
  var onMouseOut_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Name of the person.
       */
  var personaName: js.UndefOr[java.lang.String] = js.undefined
}

