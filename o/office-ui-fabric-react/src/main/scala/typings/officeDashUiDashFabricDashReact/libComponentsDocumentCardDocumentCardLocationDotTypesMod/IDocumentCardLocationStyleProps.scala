package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardLocationDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardLocationStyleProps extends js.Object {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IDocumentCardLocationStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IDocumentCardLocationStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardLocationStyleProps]
  }
}

