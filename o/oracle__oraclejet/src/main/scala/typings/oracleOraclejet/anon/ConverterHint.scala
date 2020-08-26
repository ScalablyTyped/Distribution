package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`inline`
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.notewindow
import typings.oracleOraclejet.oracleOraclejetStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterHint extends js.Object {
  var converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none = js.native
  var helpInstruction: (js.Array[notewindow | none]) | notewindow | none = js.native
  var messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none = js.native
  var validatorHint: (js.Array[notewindow | none]) | notewindow | none = js.native
}

object ConverterHint {
  @scala.inline
  def apply(
    converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none,
    helpInstruction: (js.Array[notewindow | none]) | notewindow | none,
    messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none,
    validatorHint: (js.Array[notewindow | none]) | notewindow | none
  ): ConverterHint = {
    val __obj = js.Dynamic.literal(converterHint = converterHint.asInstanceOf[js.Any], helpInstruction = helpInstruction.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], validatorHint = validatorHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterHint]
  }
  @scala.inline
  implicit class ConverterHintOps[Self <: ConverterHint] (val x: Self) extends AnyVal {
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
    def setConverterHintVarargs(value: (placeholder | notewindow | none)*): Self = this.set("converterHint", js.Array(value :_*))
    @scala.inline
    def setConverterHint(value: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none): Self = this.set("converterHint", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpInstructionVarargs(value: (notewindow | none)*): Self = this.set("helpInstruction", js.Array(value :_*))
    @scala.inline
    def setHelpInstruction(value: (js.Array[notewindow | none]) | notewindow | none): Self = this.set("helpInstruction", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: (`inline` | notewindow | none)*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatorHintVarargs(value: (notewindow | none)*): Self = this.set("validatorHint", js.Array(value :_*))
    @scala.inline
    def setValidatorHint(value: (js.Array[notewindow | none]) | notewindow | none): Self = this.set("validatorHint", value.asInstanceOf[js.Any])
  }
  
}

