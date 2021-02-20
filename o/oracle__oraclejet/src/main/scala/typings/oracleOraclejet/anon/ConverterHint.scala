package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`inline`
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.notewindow
import typings.oracleOraclejet.oracleOraclejetStrings.placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterHint extends StObject {
  
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
  implicit class ConverterHintMutableBuilder[Self <: ConverterHint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverterHint(value: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none): Self = StObject.set(x, "converterHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConverterHintVarargs(value: (placeholder | notewindow | none)*): Self = StObject.set(x, "converterHint", js.Array(value :_*))
    
    @scala.inline
    def setHelpInstruction(value: (js.Array[notewindow | none]) | notewindow | none): Self = StObject.set(x, "helpInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpInstructionVarargs(value: (notewindow | none)*): Self = StObject.set(x, "helpInstruction", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: (`inline` | notewindow | none)*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setValidatorHint(value: (js.Array[notewindow | none]) | notewindow | none): Self = StObject.set(x, "validatorHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorHintVarargs(value: (notewindow | none)*): Self = StObject.set(x, "validatorHint", js.Array(value :_*))
  }
}
