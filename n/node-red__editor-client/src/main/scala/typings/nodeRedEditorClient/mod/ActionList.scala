package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionList extends StObject {
  
  def hide(): Unit = js.native
  
  def init(): Unit = js.native
  
  def show(v: String): Unit = js.native
}
object ActionList {
  
  @scala.inline
  def apply(hide: () => Unit, init: () => Unit, show: String => Unit): ActionList = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[ActionList]
  }
  
  @scala.inline
  implicit class ActionListMutableBuilder[Self <: ActionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: String => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
