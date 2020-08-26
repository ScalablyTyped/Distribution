package typings.oracleOraclejet.ojmessageMod

import typings.oracleOraclejet.anon.CategoriesLabelCloseIcon
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typings.oracleOraclejet.ojmessageMod.ojMessage.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMessageSettableProperties extends JetSettableProperties {
  var displayOptions: DisplayOptions = js.native
  var message: Message = js.native
  var translations: CategoriesLabelCloseIcon = js.native
}

object ojMessageSettableProperties {
  @scala.inline
  def apply(displayOptions: DisplayOptions, message: Message, translations: CategoriesLabelCloseIcon): ojMessageSettableProperties = {
    val __obj = js.Dynamic.literal(displayOptions = displayOptions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMessageSettableProperties]
  }
  @scala.inline
  implicit class ojMessageSettablePropertiesOps[Self <: ojMessageSettableProperties] (val x: Self) extends AnyVal {
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
    def setDisplayOptions(value: DisplayOptions): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: CategoriesLabelCloseIcon): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

