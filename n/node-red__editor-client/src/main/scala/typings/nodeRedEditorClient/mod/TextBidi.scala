package typings.nodeRedEditorClient.mod

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBidi extends StObject {
  
  /**
    * Enforces the text direction of a given string by adding
    * UCC (Unicode Control Characters)
    * @param value - the string
    */
  def enforceTextDirectionWithUCC(value: String): String
  
  /**
    * Adds event listeners to the Input to ensure its text-direction attribute
    * is properly set based on its content.
    * @param input - the input field
    */
  def prepareInput(input: HTMLInputElement): Unit
  
  /**
    * Determines the text direction of a given string.
    * @param value - the string
    */
  def resolveBaseTextDir(value: String): String
  
  /**
    * Sets the text direction preference
    * @param dir - the text direction preference
    */
  def setTextDirection(dir: String): Unit
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
  implicit class TextBidiMutableBuilder[Self <: TextBidi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforceTextDirectionWithUCC(value: String => String): Self = StObject.set(x, "enforceTextDirectionWithUCC", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrepareInput(value: HTMLInputElement => Unit): Self = StObject.set(x, "prepareInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveBaseTextDir(value: String => String): Self = StObject.set(x, "resolveBaseTextDir", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTextDirection(value: String => Unit): Self = StObject.set(x, "setTextDirection", js.Any.fromFunction1(value))
  }
}
