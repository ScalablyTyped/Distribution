package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelAccArrowNextPage extends js.Object {
  var labelAccArrowNextPage: js.UndefOr[String] = js.native
  var labelAccArrowPreviousPage: js.UndefOr[String] = js.native
  var labelAccFilmStrip: js.UndefOr[String] = js.native
  var tipArrowNextPage: js.UndefOr[String] = js.native
  var tipArrowPreviousPage: js.UndefOr[String] = js.native
}

object LabelAccArrowNextPage {
  @scala.inline
  def apply(): LabelAccArrowNextPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelAccArrowNextPage]
  }
  @scala.inline
  implicit class LabelAccArrowNextPageOps[Self <: LabelAccArrowNextPage] (val x: Self) extends AnyVal {
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
    def setLabelAccArrowNextPage(value: String): Self = this.set("labelAccArrowNextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAccArrowNextPage: Self = this.set("labelAccArrowNextPage", js.undefined)
    @scala.inline
    def setLabelAccArrowPreviousPage(value: String): Self = this.set("labelAccArrowPreviousPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAccArrowPreviousPage: Self = this.set("labelAccArrowPreviousPage", js.undefined)
    @scala.inline
    def setLabelAccFilmStrip(value: String): Self = this.set("labelAccFilmStrip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAccFilmStrip: Self = this.set("labelAccFilmStrip", js.undefined)
    @scala.inline
    def setTipArrowNextPage(value: String): Self = this.set("tipArrowNextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTipArrowNextPage: Self = this.set("tipArrowNextPage", js.undefined)
    @scala.inline
    def setTipArrowPreviousPage(value: String): Self = this.set("tipArrowPreviousPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTipArrowPreviousPage: Self = this.set("tipArrowPreviousPage", js.undefined)
  }
  
}

