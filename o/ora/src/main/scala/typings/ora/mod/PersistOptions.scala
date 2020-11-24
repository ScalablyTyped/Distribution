package typings.ora.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistOptions extends js.Object {
  
  /**
  		Text or a function that returns text to be persisted before the symbol. No prefix text will be displayed if set to an empty string.
  		Default: Current `prefixText`.
  		*/
  val prefixText: js.UndefOr[String | PrefixTextGenerator] = js.native
  
  /**
  		Symbol to replace the spinner with.
  		@default ' '
  		*/
  val symbol: js.UndefOr[String] = js.native
  
  /**
  		Text to be persisted after the symbol.
  		Default: Current `text`.
  		*/
  val text: js.UndefOr[String] = js.native
}
object PersistOptions {
  
  @scala.inline
  def apply(): PersistOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistOptions]
  }
  
  @scala.inline
  implicit class PersistOptionsOps[Self <: PersistOptions] (val x: Self) extends AnyVal {
    
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
    def setPrefixTextFunction0(value: () => String): Self = this.set("prefixText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixText(value: String | PrefixTextGenerator): Self = this.set("prefixText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixText: Self = this.set("prefixText", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
