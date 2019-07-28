package typings.atOracleOraclejet.ojmasonrylayoutMod

import typings.atOracleOraclejet.Anon_LabelCut
import typings.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMasonryLayoutSettableProperties extends baseComponentSettableProperties {
  var reorderHandle: String | Null
  @JSName("translations")
  var translations_ojMasonryLayoutSettableProperties: Anon_LabelCut
}

object ojMasonryLayoutSettableProperties {
  @scala.inline
  def apply(translations: Anon_LabelCut, reorderHandle: String = null): ojMasonryLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(translations = translations)
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle)
    __obj.asInstanceOf[ojMasonryLayoutSettableProperties]
  }
}

