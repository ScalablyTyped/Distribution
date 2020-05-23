package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoriesLabelCloseIcon extends js.Object {
  var categories: js.UndefOr[Confirmation] = js.undefined
  var labelCloseIcon: js.UndefOr[String] = js.undefined
}

object CategoriesLabelCloseIcon {
  @scala.inline
  def apply(categories: Confirmation = null, labelCloseIcon: String = null): CategoriesLabelCloseIcon = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (labelCloseIcon != null) __obj.updateDynamic("labelCloseIcon")(labelCloseIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesLabelCloseIcon]
  }
}

