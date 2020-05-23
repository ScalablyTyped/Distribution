package typings.oracleOraclejet.ojfilmstripMod

import typings.oracleOraclejet.anon.Id
import typings.oracleOraclejet.anon.LabelAccArrowNextPage
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.adjacent
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.hidden
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.hover
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.overlay
import typings.oracleOraclejet.oracleOraclejetStrings.page
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import typings.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilmStripSettableProperties extends baseComponentSettableProperties {
  var arrowPlacement: adjacent | overlay
  var arrowVisibility: visible | hidden | hover | auto
  var currentItem: Id
  var looping: off | page
  var maxItemsPerPage: Double
  var orientation: horizontal | vertical
  @JSName("translations")
  var translations_ojFilmStripSettableProperties: LabelAccArrowNextPage
}

object ojFilmStripSettableProperties {
  @scala.inline
  def apply(
    arrowPlacement: adjacent | overlay,
    arrowVisibility: visible | hidden | hover | auto,
    currentItem: Id,
    looping: off | page,
    maxItemsPerPage: Double,
    orientation: horizontal | vertical,
    translations: LabelAccArrowNextPage
  ): ojFilmStripSettableProperties = {
    val __obj = js.Dynamic.literal(arrowPlacement = arrowPlacement.asInstanceOf[js.Any], arrowVisibility = arrowVisibility.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], maxItemsPerPage = maxItemsPerPage.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilmStripSettableProperties]
  }
}

