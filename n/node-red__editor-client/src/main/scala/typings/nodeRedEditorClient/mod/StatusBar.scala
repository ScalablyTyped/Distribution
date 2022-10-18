package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.AlignElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBar extends StObject {
  
  def add(options: AlignElement): Unit
  
  def init(): Unit
}
object StatusBar {
  
  inline def apply(add: AlignElement => Unit, init: () => Unit): StatusBar = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[StatusBar]
  }
  
  extension [Self <: StatusBar](x: Self) {
    
    inline def setAdd(value: AlignElement => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
  }
}
