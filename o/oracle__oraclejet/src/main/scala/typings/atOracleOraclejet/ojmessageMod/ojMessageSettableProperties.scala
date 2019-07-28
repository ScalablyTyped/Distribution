package typings.atOracleOraclejet.ojmessageMod

import typings.atOracleOraclejet.Anon_Categories
import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.ojmessageMod.ojMessageNs.DisplayOptions
import typings.atOracleOraclejet.ojmessageMod.ojMessageNs.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessageSettableProperties extends JetSettableProperties {
  var displayOptions: DisplayOptions
  var message: Message
  var translations: Anon_Categories
}

object ojMessageSettableProperties {
  @scala.inline
  def apply(displayOptions: DisplayOptions, message: Message, translations: Anon_Categories): ojMessageSettableProperties = {
    val __obj = js.Dynamic.literal(displayOptions = displayOptions, message = message, translations = translations)
  
    __obj.asInstanceOf[ojMessageSettableProperties]
  }
}

