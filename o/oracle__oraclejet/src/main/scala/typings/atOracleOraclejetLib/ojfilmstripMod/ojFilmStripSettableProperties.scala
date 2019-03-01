package typings
package atOracleOraclejetLib.ojfilmstripMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilmStripSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var arrowPlacement: atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay
  var arrowVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.hover | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var currentItem: atOracleOraclejetLib.Anon_Id
  var looping: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.page
  var maxItemsPerPage: scala.Double
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  @JSName("translations")
  var translations_ojFilmStripSettableProperties: atOracleOraclejetLib.Anon_LabelAccArrowNextPage
}

object ojFilmStripSettableProperties {
  @scala.inline
  def apply(
    arrowPlacement: atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay,
    arrowVisibility: atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.hover | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    currentItem: atOracleOraclejetLib.Anon_Id,
    looping: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.page,
    maxItemsPerPage: scala.Double,
    orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical,
    translations: atOracleOraclejetLib.Anon_LabelAccArrowNextPage
  ): ojFilmStripSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrowPlacement")(arrowPlacement.asInstanceOf[js.Any])
    __obj.updateDynamic("arrowVisibility")(arrowVisibility.asInstanceOf[js.Any])
    __obj.updateDynamic("currentItem")(currentItem)
    __obj.updateDynamic("looping")(looping.asInstanceOf[js.Any])
    __obj.updateDynamic("maxItemsPerPage")(maxItemsPerPage)
    __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojFilmStripSettableProperties]
  }
}

