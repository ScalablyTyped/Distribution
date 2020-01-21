package typings.officeUiFabricReact.documentCardTitleTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
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
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(showAsSecondaryTitle)) __obj.updateDynamic("showAsSecondaryTitle")(showAsSecondaryTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardTitleStyleProps]
  }
}

