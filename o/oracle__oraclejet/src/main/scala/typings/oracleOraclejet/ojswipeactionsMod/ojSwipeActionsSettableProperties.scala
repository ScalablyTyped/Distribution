package typings.oracleOraclejet.ojswipeactionsMod

import typings.oracleOraclejet.anon.AriaHideActionsDescription
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojSwipeActionsSettableProperties extends baseComponentSettableProperties {
  @JSName("translations")
  var translations_ojSwipeActionsSettableProperties: AriaHideActionsDescription = js.native
}

object ojSwipeActionsSettableProperties {
  @scala.inline
  def apply(translations: AriaHideActionsDescription): ojSwipeActionsSettableProperties = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSwipeActionsSettableProperties]
  }
  @scala.inline
  implicit class ojSwipeActionsSettablePropertiesOps[Self <: ojSwipeActionsSettableProperties] (val x: Self) extends AnyVal {
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
    def setTranslations(value: AriaHideActionsDescription): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

