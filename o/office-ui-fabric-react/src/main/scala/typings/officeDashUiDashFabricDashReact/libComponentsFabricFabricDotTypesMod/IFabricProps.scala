package typings.officeDashUiDashFabricDashReact.libComponentsFabricFabricDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFabricProps extends HTMLAttributes[HTMLDivElement] {
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
  var styles: js.UndefOr[IStyleFunctionOrObject[IFabricStyleProps, IFabricStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IFabricProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    componentRef: IRefObject[js.Object] = null,
    styles: IStyleFunctionOrObject[IFabricStyleProps, IFabricStyles] = null,
    theme: ITheme = null
  ): IFabricProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IFabricProps]
  }
}

