package typings.officeDashUiDashFabricDashReact.libComponentsSpinnerSpinnerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.assertive
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.off
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.polite
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinnerProps extends HTMLAttributes[HTMLElement] {
  /**
    * Alternative status label for screen reader
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Politeness setting for label update announcement.
    * @defaultvalue polite
    */
  var ariaLive: js.UndefOr[assertive | polite | off] = js.undefined
  /**
    * Optional callback to access the ISpinner interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISpinner]] = js.undefined
  /**
    * The label to show next to the Spinner. Label updates will be announced to the screen readers.
    * Use ariaLive to control politeness level.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The position of the label in regards of the spinner animation.
    * @defaultvalue SpinnerLabelPosition.bottom
    */
  var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.undefined
  /**
    * The size of Spinner to render. \{ extraSmall, small, medium, large \}
    * @defaultvalue SpinnerType.medium
    */
  var size: js.UndefOr[SpinnerSize] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles]] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize` instead.
    * @deprecated Use `SpinnerSize` instead.
    */
  var `type`: js.UndefOr[SpinnerType] = js.undefined
}

object ISpinnerProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    ariaLabel: String = null,
    ariaLive: assertive | polite | off = null,
    className: String = null,
    componentRef: IRefObject[ISpinner] = null,
    label: String = null,
    labelPosition: SpinnerLabelPosition = null,
    size: SpinnerSize = null,
    styles: IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles] = null,
    theme: ITheme = null,
    `type`: SpinnerType = null
  ): ISpinnerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaLive != null) __obj.updateDynamic("ariaLive")(ariaLive.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition)
    if (size != null) __obj.updateDynamic("size")(size)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISpinnerProps]
  }
}

