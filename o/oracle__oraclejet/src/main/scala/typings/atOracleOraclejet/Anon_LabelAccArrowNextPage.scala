package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelAccArrowNextPage extends js.Object {
  var labelAccArrowNextPage: js.UndefOr[String] = js.undefined
  var labelAccArrowPreviousPage: js.UndefOr[String] = js.undefined
  var labelAccFilmStrip: js.UndefOr[String] = js.undefined
  var tipArrowNextPage: js.UndefOr[String] = js.undefined
  var tipArrowPreviousPage: js.UndefOr[String] = js.undefined
}

object Anon_LabelAccArrowNextPage {
  @scala.inline
  def apply(
    labelAccArrowNextPage: String = null,
    labelAccArrowPreviousPage: String = null,
    labelAccFilmStrip: String = null,
    tipArrowNextPage: String = null,
    tipArrowPreviousPage: String = null
  ): Anon_LabelAccArrowNextPage = {
    val __obj = js.Dynamic.literal()
    if (labelAccArrowNextPage != null) __obj.updateDynamic("labelAccArrowNextPage")(labelAccArrowNextPage)
    if (labelAccArrowPreviousPage != null) __obj.updateDynamic("labelAccArrowPreviousPage")(labelAccArrowPreviousPage)
    if (labelAccFilmStrip != null) __obj.updateDynamic("labelAccFilmStrip")(labelAccFilmStrip)
    if (tipArrowNextPage != null) __obj.updateDynamic("tipArrowNextPage")(tipArrowNextPage)
    if (tipArrowPreviousPage != null) __obj.updateDynamic("tipArrowPreviousPage")(tipArrowPreviousPage)
    __obj.asInstanceOf[Anon_LabelAccArrowNextPage]
  }
}

