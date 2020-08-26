package typings.oracleOraclejet.ojmessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.CategoriesLabelCloseIcon
import typings.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typings.oracleOraclejet.ojmessageMod.ojMessage.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmessage.ojMessageSettableProperties> */
@js.native
trait ojMessageSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var displayOptions: js.UndefOr[DisplayOptions] = js.native
  var message: js.UndefOr[Message] = js.native
  var translations: js.UndefOr[CategoriesLabelCloseIcon] = js.native
}

object ojMessageSettablePropertiesLenient {
  @scala.inline
  def apply(): ojMessageSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojMessageSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojMessageSettablePropertiesLenientOps[Self <: ojMessageSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setTranslations(value: CategoriesLabelCloseIcon): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

