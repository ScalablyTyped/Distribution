package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardLogoDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardLogoStyleProps extends js.Object {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IDocumentCardLogoStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IDocumentCardLogoStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IDocumentCardLogoStyleProps]
  }
}

