package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBar extends StObject {
  
  def add(options: Align): Unit
  
  def init(): Unit
}
object StatusBar {
  
  inline def apply(add: Align => Unit, init: () => Unit): StatusBar = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[StatusBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusBar] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Align => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
  }
}
