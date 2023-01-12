package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailComposer extends StObject {
  
  def addHeader(name: String, value: String): Unit
  
  def pipe(stream: Any): Unit
  
  def setMessageOption(from: String, to: String, body: String, html: String): Unit
  
  def streamMessage(): Unit
}
object MailComposer {
  
  inline def apply(
    addHeader: (String, String) => Unit,
    pipe: Any => Unit,
    setMessageOption: (String, String, String, String) => Unit,
    streamMessage: () => Unit
  ): MailComposer = {
    val __obj = js.Dynamic.literal(addHeader = js.Any.fromFunction2(addHeader), pipe = js.Any.fromFunction1(pipe), setMessageOption = js.Any.fromFunction4(setMessageOption), streamMessage = js.Any.fromFunction0(streamMessage))
    __obj.asInstanceOf[MailComposer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MailComposer] (val x: Self) extends AnyVal {
    
    inline def setAddHeader(value: (String, String) => Unit): Self = StObject.set(x, "addHeader", js.Any.fromFunction2(value))
    
    inline def setPipe(value: Any => Unit): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
    
    inline def setSetMessageOption(value: (String, String, String, String) => Unit): Self = StObject.set(x, "setMessageOption", js.Any.fromFunction4(value))
    
    inline def setStreamMessage(value: () => Unit): Self = StObject.set(x, "streamMessage", js.Any.fromFunction0(value))
  }
}
