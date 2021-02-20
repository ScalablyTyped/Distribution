package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Collapsible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackInstance extends StObject {
  
  def add(entry: Collapsible): StackInstanceEntry = js.native
  
  def hide(): StackInstance = js.native
  
  def resize(): Unit = js.native
  
  def show(): StackInstance = js.native
}
object StackInstance {
  
  @scala.inline
  def apply(
    add: Collapsible => StackInstanceEntry,
    hide: () => StackInstance,
    resize: () => Unit,
    show: () => StackInstance
  ): StackInstance = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), hide = js.Any.fromFunction0(hide), resize = js.Any.fromFunction0(resize), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[StackInstance]
  }
  
  @scala.inline
  implicit class StackInstanceMutableBuilder[Self <: StackInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Collapsible => StackInstanceEntry): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => StackInstance): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => StackInstance): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
