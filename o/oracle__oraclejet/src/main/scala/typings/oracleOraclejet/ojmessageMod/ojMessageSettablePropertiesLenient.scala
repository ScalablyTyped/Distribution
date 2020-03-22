package typings.oracleOraclejet.ojmessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonCategoriesLabelCloseIcon
import typings.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typings.oracleOraclejet.ojmessageMod.ojMessage.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmessage.ojMessageSettableProperties> */
trait ojMessageSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var displayOptions: js.UndefOr[DisplayOptions] = js.undefined
  var message: js.UndefOr[Message] = js.undefined
  var translations: js.UndefOr[AnonCategoriesLabelCloseIcon] = js.undefined
}

object ojMessageSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    displayOptions: DisplayOptions = null,
    message: Message = null,
    translations: AnonCategoriesLabelCloseIcon = null
  ): ojMessageSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (displayOptions != null) __obj.updateDynamic("displayOptions")(displayOptions.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMessageSettablePropertiesLenient]
  }
}

