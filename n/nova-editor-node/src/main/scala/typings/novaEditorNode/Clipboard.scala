package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/clipboard/
trait Clipboard extends StObject {
  
  def readText(): js.Promise[String]
  
  def writeText(text: String): js.Promise[Unit]
}
object Clipboard {
  
  @scala.inline
  def apply(readText: () => js.Promise[String], writeText: String => js.Promise[Unit]): Clipboard = {
    val __obj = js.Dynamic.literal(readText = js.Any.fromFunction0(readText), writeText = js.Any.fromFunction1(writeText))
    __obj.asInstanceOf[Clipboard]
  }
  
  @scala.inline
  implicit class ClipboardMutableBuilder[Self <: Clipboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadText(value: () => js.Promise[String]): Self = StObject.set(x, "readText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteText(value: String => js.Promise[Unit]): Self = StObject.set(x, "writeText", js.Any.fromFunction1(value))
  }
}
