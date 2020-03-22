package typings.oracleOraclejet.ojfilmstripMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonId
import typings.oracleOraclejet.AnonLabelAccArrowNextPage
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojfilmstrip.ojFilmStripSettableProperties> */
trait ojFilmStripSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var arrowPlacement: js.UndefOr[adjacent | overlay] = js.undefined
  var arrowVisibility: js.UndefOr[visible | hidden | hover | auto] = js.undefined
  var currentItem: js.UndefOr[AnonId] = js.undefined
  var looping: js.UndefOr[off | page] = js.undefined
  var maxItemsPerPage: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var translations: js.UndefOr[AnonLabelAccArrowNextPage] = js.undefined
}

object ojFilmStripSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    arrowPlacement: adjacent | overlay = null,
    arrowVisibility: visible | hidden | hover | auto = null,
    currentItem: AnonId = null,
    looping: off | page = null,
    maxItemsPerPage: Int | Double = null,
    orientation: horizontal | vertical = null,
    translations: AnonLabelAccArrowNextPage = null
  ): ojFilmStripSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (arrowPlacement != null) __obj.updateDynamic("arrowPlacement")(arrowPlacement.asInstanceOf[js.Any])
    if (arrowVisibility != null) __obj.updateDynamic("arrowVisibility")(arrowVisibility.asInstanceOf[js.Any])
    if (currentItem != null) __obj.updateDynamic("currentItem")(currentItem.asInstanceOf[js.Any])
    if (looping != null) __obj.updateDynamic("looping")(looping.asInstanceOf[js.Any])
    if (maxItemsPerPage != null) __obj.updateDynamic("maxItemsPerPage")(maxItemsPerPage.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilmStripSettablePropertiesLenient]
  }
}

