package typings
package atOracleOraclejetLib.ojmasonrylayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMasonryLayoutSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var reorderHandle: java.lang.String | scala.Null
  @JSName("translations")
  var translations_ojMasonryLayoutSettableProperties: atOracleOraclejetLib.Anon_LabelCut
}

object ojMasonryLayoutSettableProperties {
  @scala.inline
  def apply(translations: atOracleOraclejetLib.Anon_LabelCut, reorderHandle: java.lang.String = null): ojMasonryLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(translations = translations)
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle)
    __obj.asInstanceOf[ojMasonryLayoutSettableProperties]
  }
}

