package typings.officeUiFabricReact.documentCardTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardStyleProps extends js.Object {
  /**
    * True when the card has a click action.
    */
  var actionable: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Compact variant of the card.
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  /**
    * Accept theme prop.
    */
  var theme: ITheme
}

object IDocumentCardStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    actionable: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined
  ): IDocumentCardStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(actionable)) __obj.updateDynamic("actionable")(actionable.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardStyleProps]
  }
}

