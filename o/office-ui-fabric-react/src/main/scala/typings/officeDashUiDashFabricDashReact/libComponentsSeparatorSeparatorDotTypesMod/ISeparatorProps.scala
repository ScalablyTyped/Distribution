package typings.officeDashUiDashFabricDashReact.libComponentsSeparatorSeparatorDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.center
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.end
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.start
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeparatorProps extends HTMLAttributes[HTMLElement] {
  /**
    * Where the content should be aligned in the separator.
    * @defaultValue 'center'
    */
  var alignContent: js.UndefOr[start | center | end] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISeparatorStyleProps, ISeparatorStyles]] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether the element is a vertical separator.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ISeparatorProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    alignContent: start | center | end = null,
    styles: IStyleFunctionOrObject[ISeparatorStyleProps, ISeparatorStyles] = null,
    theme: ITheme = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ISeparatorProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ISeparatorProps]
  }
}

