package typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotBaseMod.ScrollablePaneBase
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePaneProps extends HTMLAttributes[HTMLElement | ScrollablePaneBase] {
  /**
    * Optional callback to access the IScrollablePane interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IScrollablePane]] = js.undefined
  /**
    * Sets the initial scroll position of the ScrollablePane
    */
  var initialScrollPosition: js.UndefOr[Double] = js.undefined
  var scrollbarVisibility: js.UndefOr[ScrollbarVisibility] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IScrollablePaneStyleProps, IScrollablePaneStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IScrollablePaneProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement | ScrollablePaneBase] = null,
    className: String = null,
    componentRef: IRefObject[IScrollablePane] = null,
    initialScrollPosition: Int | Double = null,
    scrollbarVisibility: ScrollbarVisibility = null,
    styles: IStyleFunctionOrObject[IScrollablePaneStyleProps, IScrollablePaneStyles] = null,
    theme: ITheme = null
  ): IScrollablePaneProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (initialScrollPosition != null) __obj.updateDynamic("initialScrollPosition")(initialScrollPosition.asInstanceOf[js.Any])
    if (scrollbarVisibility != null) __obj.updateDynamic("scrollbarVisibility")(scrollbarVisibility)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IScrollablePaneProps]
  }
}

