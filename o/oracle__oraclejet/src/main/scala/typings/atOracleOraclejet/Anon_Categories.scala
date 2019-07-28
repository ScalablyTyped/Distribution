package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Categories extends js.Object {
  var categories: js.UndefOr[Anon_Confirmation] = js.undefined
  var labelCloseIcon: js.UndefOr[String] = js.undefined
}

object Anon_Categories {
  @scala.inline
  def apply(categories: Anon_Confirmation = null, labelCloseIcon: String = null): Anon_Categories = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (labelCloseIcon != null) __obj.updateDynamic("labelCloseIcon")(labelCloseIcon)
    __obj.asInstanceOf[Anon_Categories]
  }
}

