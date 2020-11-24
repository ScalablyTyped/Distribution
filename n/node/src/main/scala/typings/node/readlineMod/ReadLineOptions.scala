package typings.node.readlineMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadLineOptions extends js.Object {
  
  var completer: js.UndefOr[Completer | AsyncCompleter] = js.native
  
  var crlfDelay: js.UndefOr[Double] = js.native
  
  var escapeCodeTimeout: js.UndefOr[Double] = js.native
  
  var historySize: js.UndefOr[Double] = js.native
  
  var input: ReadableStream = js.native
  
  var output: js.UndefOr[WritableStream] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var removeHistoryDuplicates: js.UndefOr[Boolean] = js.native
  
  var tabSize: js.UndefOr[Double] = js.native
  
  var terminal: js.UndefOr[Boolean] = js.native
}
object ReadLineOptions {
  
  @scala.inline
  def apply(input: ReadableStream): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLineOptions]
  }
  
  @scala.inline
  implicit class ReadLineOptionsOps[Self <: ReadLineOptions] (val x: Self) extends AnyVal {
    
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
    def setInput(value: ReadableStream): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleterFunction2(
      value: (/* line */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit]) => js.Any
    ): Self = this.set("completer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompleterFunction1(value: /* line */ String => CompleterResult): Self = this.set("completer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleter(value: Completer | AsyncCompleter): Self = this.set("completer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleter: Self = this.set("completer", js.undefined)
    
    @scala.inline
    def setCrlfDelay(value: Double): Self = this.set("crlfDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrlfDelay: Self = this.set("crlfDelay", js.undefined)
    
    @scala.inline
    def setEscapeCodeTimeout(value: Double): Self = this.set("escapeCodeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeCodeTimeout: Self = this.set("escapeCodeTimeout", js.undefined)
    
    @scala.inline
    def setHistorySize(value: Double): Self = this.set("historySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistorySize: Self = this.set("historySize", js.undefined)
    
    @scala.inline
    def setOutput(value: WritableStream): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setRemoveHistoryDuplicates(value: Boolean): Self = this.set("removeHistoryDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveHistoryDuplicates: Self = this.set("removeHistoryDuplicates", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTerminal(value: Boolean): Self = this.set("terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
  }
}
