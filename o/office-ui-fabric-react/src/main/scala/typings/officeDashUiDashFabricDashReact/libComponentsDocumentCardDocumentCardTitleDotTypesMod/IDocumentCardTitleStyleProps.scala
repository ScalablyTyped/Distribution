package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardTitleDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardTitleStyleProps extends js.Object {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Is this a secondary title?
    */
  var showAsSecondaryTitle: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IDocumentCardTitleStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null, showAsSecondaryTitle: js.UndefOr[Boolean] = js.undefined): IDocumentCardTitleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(showAsSecondaryTitle)) __obj.updateDynamic("showAsSecondaryTitle")(showAsSecondaryTitle)
    __obj.asInstanceOf[IDocumentCardTitleStyleProps]
  }
}

