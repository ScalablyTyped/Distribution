package typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.react.reactMod.AllHTMLAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagItemSuggestionProps extends AllHTMLAttributes[HTMLElement] {
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITagItemSuggestionStyleProps, ITagItemSuggestionStyles]] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ITagItemSuggestionProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    styles: IStyleFunctionOrObject[ITagItemSuggestionStyleProps, ITagItemSuggestionStyles] = null,
    theme: ITheme = null
  ): ITagItemSuggestionProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagItemSuggestionProps]
  }
}

