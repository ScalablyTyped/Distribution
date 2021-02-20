package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetText extends StObject {
  
  def getText(): Unit = js.native
  
  // Orion Editor
  def setText(): Unit = js.native
}
object GetText {
  
  @scala.inline
  def apply(getText: () => Unit, setText: () => Unit): GetText = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction0(getText), setText = js.Any.fromFunction0(setText))
    __obj.asInstanceOf[GetText]
  }
  
  @scala.inline
  implicit class GetTextMutableBuilder[Self <: GetText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetText(value: () => Unit): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetText(value: () => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction0(value))
  }
}
