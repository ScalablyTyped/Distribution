package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActivityStyleProps extends js.Object {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Indicates if multiple people are being shown.
    */
  var multiplePeople: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IDocumentCardActivityStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null, multiplePeople: js.UndefOr[Boolean] = js.undefined): IDocumentCardActivityStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(multiplePeople)) __obj.updateDynamic("multiplePeople")(multiplePeople.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActivityStyleProps]
  }
}

