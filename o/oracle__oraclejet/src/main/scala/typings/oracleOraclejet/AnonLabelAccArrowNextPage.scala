package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelAccArrowNextPage extends js.Object {
  var labelAccArrowNextPage: js.UndefOr[String] = js.undefined
  var labelAccArrowPreviousPage: js.UndefOr[String] = js.undefined
  var labelAccFilmStrip: js.UndefOr[String] = js.undefined
  var tipArrowNextPage: js.UndefOr[String] = js.undefined
  var tipArrowPreviousPage: js.UndefOr[String] = js.undefined
}

object AnonLabelAccArrowNextPage {
  @scala.inline
  def apply(
    labelAccArrowNextPage: String = null,
    labelAccArrowPreviousPage: String = null,
    labelAccFilmStrip: String = null,
    tipArrowNextPage: String = null,
    tipArrowPreviousPage: String = null
  ): AnonLabelAccArrowNextPage = {
    val __obj = js.Dynamic.literal()
    if (labelAccArrowNextPage != null) __obj.updateDynamic("labelAccArrowNextPage")(labelAccArrowNextPage.asInstanceOf[js.Any])
    if (labelAccArrowPreviousPage != null) __obj.updateDynamic("labelAccArrowPreviousPage")(labelAccArrowPreviousPage.asInstanceOf[js.Any])
    if (labelAccFilmStrip != null) __obj.updateDynamic("labelAccFilmStrip")(labelAccFilmStrip.asInstanceOf[js.Any])
    if (tipArrowNextPage != null) __obj.updateDynamic("tipArrowNextPage")(tipArrowNextPage.asInstanceOf[js.Any])
    if (tipArrowPreviousPage != null) __obj.updateDynamic("tipArrowPreviousPage")(tipArrowPreviousPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelAccArrowNextPage]
  }
}

