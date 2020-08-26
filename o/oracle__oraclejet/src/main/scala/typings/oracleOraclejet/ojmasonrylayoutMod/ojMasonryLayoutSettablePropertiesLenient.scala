package typings.oracleOraclejet.ojmasonrylayoutMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelCut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmasonrylayout.ojMasonryLayoutSettableProperties> */
@js.native
trait ojMasonryLayoutSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var reorderHandle: js.UndefOr[String | Null] = js.native
  var translations: js.UndefOr[LabelCut] = js.native
}

object ojMasonryLayoutSettablePropertiesLenient {
  @scala.inline
  def apply(): ojMasonryLayoutSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojMasonryLayoutSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojMasonryLayoutSettablePropertiesLenientOps[Self <: ojMasonryLayoutSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def setReorderHandle(value: String): Self = this.set("reorderHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReorderHandle: Self = this.set("reorderHandle", js.undefined)
    @scala.inline
    def setReorderHandleNull: Self = this.set("reorderHandle", null)
    @scala.inline
    def setTranslations(value: LabelCut): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

