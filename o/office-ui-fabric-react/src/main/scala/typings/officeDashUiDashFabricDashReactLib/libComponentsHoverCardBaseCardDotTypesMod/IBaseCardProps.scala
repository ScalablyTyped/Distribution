package typings
package officeDashUiDashFabricDashReactLib.libComponentsHoverCardBaseCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBaseCardProps[TComponent, TStyles, TStyleProps]
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
       * Optional callback to access the TComponent interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[TComponent]] = js.undefined
  /**
       * How the element should be positioned
       * @defaultvalue DirectionalHint.bottomLeftEdge
       */
  var directionalHint: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * Make callout content show on the set side
       * @defaultvalue true
       */
  var directionalHintFixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Focus on first element by default on card or not
       */
  var firstFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The gap between the card and the target
       * @defaultvalue 0
       */
  var gapSpace: js.UndefOr[scala.Double] = js.undefined
  /**
       * Callback upon focus or mouse enter event
       */
  var onEnter: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
       * Callback upon blur or mouse leave event
       */
  var onLeave: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
       *  Item to be returned with onRender functions
       */
  var renderData: js.UndefOr[js.Any] = js.undefined
  /**
       * Custom styles for this component
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[
      TStyleProps, 
      officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.IBaseCardProps with js.Any
    ]
  ] = js.undefined
  /**
       * Element to anchor the card to.
       */
  var targetElement: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Trap focus or not
       */
  var trapFocus: js.UndefOr[scala.Boolean] = js.undefined
}

