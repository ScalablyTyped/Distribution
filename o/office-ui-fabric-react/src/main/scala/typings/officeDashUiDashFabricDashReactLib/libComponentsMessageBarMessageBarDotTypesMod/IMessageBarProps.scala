package typings
package officeDashUiDashFabricDashReactLib.libComponentsMessageBarMessageBarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageBarProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] {
  /**
    * The actions you want to show on the other side.
    */
  var actions: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * A description of the message bar for the benefit of screen readers.
    * @deprecated Use native prop `aria-label` instead.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback to access the IMessageBar interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IMessageBar]] = js.undefined
  /**
    * Aria label on dismiss button if onDismiss is defined.
    */
  var dismissButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines if the message bar is multi lined.
    * If false, and the text overflows over buttons or to another line, it is clipped.
    * @defaultvalue true
    */
  var isMultiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The type of MessageBar to render.
    * @defaultvalue MessageBarType.info
    */
  var messageBarType: js.UndefOr[MessageBarType] = js.undefined
  /**
    * Whether the message bar has a dismiss button and its callback.
    * If null, we don't show a dismiss button.
    * @defaultvalue null
    */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[
          reactLib.HTMLButtonElement | officeDashUiDashFabricDashReactLib.libButtonMod.BaseButton | reactLib.HTMLAnchorElement | reactLib.HTMLDivElement | officeDashUiDashFabricDashReactLib.libButtonMod.Button, 
          reactLib.NativeMouseEvent
        ]
      ], 
      _
    ]
  ] = js.undefined
  /**
    * Aria label on overflow button if truncated is defined.
    */
  var overflowButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]
  ] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * Determines if the message bar text is truncated.
    * If true, a button will render to toggle between a single line view and multiline view.
    * This prop is for single line message bars with no buttons only in a limited space scenario.
    * @defaultvalue false
    */
  var truncated: js.UndefOr[scala.Boolean] = js.undefined
}

