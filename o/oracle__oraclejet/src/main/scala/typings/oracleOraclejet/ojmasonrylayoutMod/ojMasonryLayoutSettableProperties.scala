package typings.oracleOraclejet.ojmasonrylayoutMod

import typings.oracleOraclejet.anon.LabelCut
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMasonryLayoutSettableProperties extends baseComponentSettableProperties {
  var reorderHandle: String | Null = js.native
  @JSName("translations")
  var translations_ojMasonryLayoutSettableProperties: LabelCut = js.native
}

object ojMasonryLayoutSettableProperties {
  @scala.inline
  def apply(translations: LabelCut): ojMasonryLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMasonryLayoutSettableProperties]
  }
  @scala.inline
  implicit class ojMasonryLayoutSettablePropertiesOps[Self <: ojMasonryLayoutSettableProperties] (val x: Self) extends AnyVal {
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
    def setTranslations(value: LabelCut): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setReorderHandle(value: String): Self = this.set("reorderHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setReorderHandleNull: Self = this.set("reorderHandle", null)
  }
  
}

