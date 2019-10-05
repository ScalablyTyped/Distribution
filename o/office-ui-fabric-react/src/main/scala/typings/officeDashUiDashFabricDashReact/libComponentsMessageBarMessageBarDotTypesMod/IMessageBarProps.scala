package typings.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libButtonMod.BaseButton
import typings.officeDashUiDashFabricDashReact.libButtonMod.Button
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageBarProps extends HTMLAttributes[HTMLElement] {
  /**
    * The actions you want to show on the other side.
    */
  var actions: js.UndefOr[Element] = js.undefined
  /**
    * A description of the message bar for the benefit of screen readers.
    * @deprecated Use native prop `aria-label` instead.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IMessageBar interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IMessageBar]] = js.undefined
  /**
    * Aria label on dismiss button if onDismiss is defined.
    */
  var dismissButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Custom icon prop to replace the dismiss icon.
    * If unset, default will be the Fabric Clear icon.
    */
  var dismissIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Determines if the message bar is multi lined.
    * If false, and the text overflows over buttons or to another line, it is clipped.
    * @defaultvalue true
    */
  var isMultiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom icon prop to replace the message bar icon.
    * If unset, default will be the icon set by messageBarType.
    */
  var messageBarIconProps: js.UndefOr[IIconProps] = js.undefined
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
      /* ev */ js.UndefOr[MouseEvent[HTMLElement | BaseButton | Button, NativeMouseEvent]], 
      _
    ]
  ] = js.undefined
  /**
    * Aria label on overflow button if truncated is defined.
    */
  var overflowButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Determines if the message bar text is truncated.
    * If true, a button will render to toggle between a single line view and multiline view.
    * This prop is for single line message bars with no buttons only in a limited space scenario.
    * @defaultvalue false
    */
  var truncated: js.UndefOr[Boolean] = js.undefined
}

object IMessageBarProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    actions: Element = null,
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IMessageBar] = null,
    dismissButtonAriaLabel: String = null,
    dismissIconProps: IIconProps = null,
    isMultiline: js.UndefOr[Boolean] = js.undefined,
    messageBarIconProps: IIconProps = null,
    messageBarType: MessageBarType = null,
    onDismiss: /* ev */ js.UndefOr[MouseEvent[HTMLElement | BaseButton | Button, NativeMouseEvent]] => _ = null,
    overflowButtonAriaLabel: String = null,
    styles: IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles] = null,
    theme: ITheme = null,
    truncated: js.UndefOr[Boolean] = js.undefined
  ): IMessageBarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (dismissButtonAriaLabel != null) __obj.updateDynamic("dismissButtonAriaLabel")(dismissButtonAriaLabel)
    if (dismissIconProps != null) __obj.updateDynamic("dismissIconProps")(dismissIconProps)
    if (!js.isUndefined(isMultiline)) __obj.updateDynamic("isMultiline")(isMultiline)
    if (messageBarIconProps != null) __obj.updateDynamic("messageBarIconProps")(messageBarIconProps)
    if (messageBarType != null) __obj.updateDynamic("messageBarType")(messageBarType)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (overflowButtonAriaLabel != null) __obj.updateDynamic("overflowButtonAriaLabel")(overflowButtonAriaLabel)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated)
    __obj.asInstanceOf[IMessageBarProps]
  }
}

