package typings.officeDashUiDashFabricDashReact.libComponentsOverlayOverlayDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayProps extends HTMLAttributes[HTMLElement] {
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IOverlay]] = js.undefined
  /**
    * Whether to use the dark-themed overlay.
    * @defaultvalue false
    */
  var isDarkThemed: js.UndefOr[Boolean] = js.undefined
  @JSName("onClick")
  var onClick_IOverlayProps: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IOverlayProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    className: String = null,
    componentRef: IRefObject[IOverlay] = null,
    isDarkThemed: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null,
    styles: IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles] = null,
    theme: ITheme = null
  ): IOverlayProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isDarkThemed)) __obj.updateDynamic("isDarkThemed")(isDarkThemed)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IOverlayProps]
  }
}

