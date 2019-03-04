package typings
package atOracleOraclejetLib.ojmessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessageSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var displayOptions: atOracleOraclejetLib.ojmessageMod.ojMessageNs.DisplayOptions
  var message: atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message
  var translations: atOracleOraclejetLib.Anon_Categories
}

object ojMessageSettableProperties {
  @scala.inline
  def apply(
    displayOptions: atOracleOraclejetLib.ojmessageMod.ojMessageNs.DisplayOptions,
    message: atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message,
    translations: atOracleOraclejetLib.Anon_Categories
  ): ojMessageSettableProperties = {
    val __obj = js.Dynamic.literal(displayOptions = displayOptions, message = message, translations = translations)
  
    __obj.asInstanceOf[ojMessageSettableProperties]
  }
}

