package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategoriesLabelCloseIcon extends js.Object {
  var categories: js.UndefOr[AnonConfirmation] = js.undefined
  var labelCloseIcon: js.UndefOr[String] = js.undefined
}

object AnonCategoriesLabelCloseIcon {
  @scala.inline
  def apply(categories: AnonConfirmation = null, labelCloseIcon: String = null): AnonCategoriesLabelCloseIcon = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (labelCloseIcon != null) __obj.updateDynamic("labelCloseIcon")(labelCloseIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategoriesLabelCloseIcon]
  }
}

