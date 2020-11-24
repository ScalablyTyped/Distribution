package typings.nodeRedEditorClient.mod

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBidi extends js.Object {
  
  /**
    * Enforces the text direction of a given string by adding
    * UCC (Unicode Control Characters)
    * @param value - the string
    */
  def enforceTextDirectionWithUCC(value: String): String = js.native
  
  /**
    * Adds event listeners to the Input to ensure its text-direction attribute
    * is properly set based on its content.
    * @param input - the input field
    */
  def prepareInput(input: HTMLInputElement): Unit = js.native
  
  /**
    * Determines the text direction of a given string.
    * @param value - the string
    */
  def resolveBaseTextDir(value: String): String = js.native
  
  /**
    * Sets the text direction preference
    * @param dir - the text direction preference
    */
  def setTextDirection(dir: String): Unit = js.native
}
object TextBidi {
  
  @scala.inline
  def apply(
    enforceTextDirectionWithUCC: String => String,
    prepareInput: HTMLInputElement => Unit,
    resolveBaseTextDir: String => String,
    setTextDirection: String => Unit
  ): TextBidi = {
    val __obj = js.Dynamic.literal(enforceTextDirectionWithUCC = js.Any.fromFunction1(enforceTextDirectionWithUCC), prepareInput = js.Any.fromFunction1(prepareInput), resolveBaseTextDir = js.Any.fromFunction1(resolveBaseTextDir), setTextDirection = js.Any.fromFunction1(setTextDirection))
    __obj.asInstanceOf[TextBidi]
  }
  
  @scala.inline
  implicit class TextBidiOps[Self <: TextBidi] (val x: Self) extends AnyVal {
    
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
    def setEnforceTextDirectionWithUCC(value: String => String): Self = this.set("enforceTextDirectionWithUCC", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrepareInput(value: HTMLInputElement => Unit): Self = this.set("prepareInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveBaseTextDir(value: String => String): Self = this.set("resolveBaseTextDir", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTextDirection(value: String => Unit): Self = this.set("setTextDirection", js.Any.fromFunction1(value))
  }
}
