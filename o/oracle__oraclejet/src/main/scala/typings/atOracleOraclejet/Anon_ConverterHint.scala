package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.`inline`
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.notewindow
import typings.atOracleOraclejet.atOracleOraclejetStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterHint extends js.Object {
  var converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none
  var helpInstruction: (js.Array[notewindow | none]) | notewindow | none
  var messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none
  var validatorHint: (js.Array[notewindow | none]) | notewindow | none
}

object Anon_ConverterHint {
  @scala.inline
  def apply(
    converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none,
    helpInstruction: (js.Array[notewindow | none]) | notewindow | none,
    messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none,
    validatorHint: (js.Array[notewindow | none]) | notewindow | none
  ): Anon_ConverterHint = {
    val __obj = js.Dynamic.literal(converterHint = converterHint.asInstanceOf[js.Any], helpInstruction = helpInstruction.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], validatorHint = validatorHint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConverterHint]
  }
}

