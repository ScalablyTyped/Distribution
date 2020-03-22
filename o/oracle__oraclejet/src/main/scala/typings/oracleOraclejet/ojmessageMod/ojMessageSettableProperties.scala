package typings.oracleOraclejet.ojmessageMod

import typings.oracleOraclejet.AnonCategoriesLabelCloseIcon
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typings.oracleOraclejet.ojmessageMod.ojMessage.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessageSettableProperties extends JetSettableProperties {
  var displayOptions: DisplayOptions
  var message: Message
  var translations: AnonCategoriesLabelCloseIcon
}

object ojMessageSettableProperties {
  @scala.inline
  def apply(displayOptions: DisplayOptions, message: Message, translations: AnonCategoriesLabelCloseIcon): ojMessageSettableProperties = {
    val __obj = js.Dynamic.literal(displayOptions = displayOptions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojMessageSettableProperties]
  }
}

