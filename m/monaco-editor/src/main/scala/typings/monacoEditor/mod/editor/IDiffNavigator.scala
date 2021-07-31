package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffNavigator extends StObject {
  
  def canNavigate(): Boolean
  
  def dispose(): Unit
  
  def next(): Unit
  
  def previous(): Unit
}
object IDiffNavigator {
  
  @scala.inline
  def apply(canNavigate: () => Boolean, dispose: () => Unit, next: () => Unit, previous: () => Unit): IDiffNavigator = {
    val __obj = js.Dynamic.literal(canNavigate = js.Any.fromFunction0(canNavigate), dispose = js.Any.fromFunction0(dispose), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
    __obj.asInstanceOf[IDiffNavigator]
  }
  
  @scala.inline
  implicit class IDiffNavigatorMutableBuilder[Self <: IDiffNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanNavigate(value: () => Boolean): Self = StObject.set(x, "canNavigate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
  }
}
