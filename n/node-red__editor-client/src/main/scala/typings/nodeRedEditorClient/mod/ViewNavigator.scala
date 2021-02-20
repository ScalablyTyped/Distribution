package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewNavigator extends StObject {
  
  def init(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def resize(): Unit = js.native
  
  def toggle(): Unit = js.native
}
object ViewNavigator {
  
  @scala.inline
  def apply(init: () => Unit, refresh: () => Unit, resize: () => Unit, toggle: () => Unit): ViewNavigator = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), refresh = js.Any.fromFunction0(refresh), resize = js.Any.fromFunction0(resize), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[ViewNavigator]
  }
  
  @scala.inline
  implicit class ViewNavigatorMutableBuilder[Self <: ViewNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
