package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidebarContext extends StObject {
  
  def init(): Unit
}
object SidebarContext {
  
  inline def apply(init: () => Unit): SidebarContext = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[SidebarContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidebarContext] (val x: Self) extends AnyVal {
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
  }
}
