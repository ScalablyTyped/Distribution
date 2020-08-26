package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoriesLabelCloseIcon extends js.Object {
  var categories: js.UndefOr[Confirmation] = js.native
  var labelCloseIcon: js.UndefOr[String] = js.native
}

object CategoriesLabelCloseIcon {
  @scala.inline
  def apply(): CategoriesLabelCloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesLabelCloseIcon]
  }
  @scala.inline
  implicit class CategoriesLabelCloseIconOps[Self <: CategoriesLabelCloseIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategories(value: Confirmation): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setLabelCloseIcon(value: String): Self = this.set("labelCloseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCloseIcon: Self = this.set("labelCloseIcon", js.undefined)
  }
  
}

