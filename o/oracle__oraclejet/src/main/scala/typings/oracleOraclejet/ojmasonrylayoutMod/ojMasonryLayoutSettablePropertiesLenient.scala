package typings.oracleOraclejet.ojmasonrylayoutMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelCut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmasonrylayout.ojMasonryLayoutSettableProperties> */
trait ojMasonryLayoutSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var reorderHandle: js.UndefOr[String] = js.undefined
  var translations: js.UndefOr[LabelCut] = js.undefined
}

object ojMasonryLayoutSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    reorderHandle: String = null,
    translations: LabelCut = null
  ): ojMasonryLayoutSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMasonryLayoutSettablePropertiesLenient]
  }
}

