package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetText extends StObject {
  
  def getText(): Unit
  
  // Orion Editor
  def setText(): Unit
}
object GetText {
  
  inline def apply(getText: () => Unit, setText: () => Unit): GetText = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction0(getText), setText = js.Any.fromFunction0(setText))
    __obj.asInstanceOf[GetText]
  }
  
  extension [Self <: GetText](x: Self) {
    
    inline def setGetText(value: () => Unit): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setSetText(value: () => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction0(value))
  }
}
