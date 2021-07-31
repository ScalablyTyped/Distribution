package typings.playcanvas.pc

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new pc.ElementInput instance.
  * @param domElement - The DOM element.
  * @param [options] - Optional arguments.
  * @param [options.useMouse] - Whether to allow mouse input. Defaults to true.
  * @param [options.useTouch] - Whether to allow touch input. Defaults to true.
  * @param [options.useXr] - Whether to allow XR input sources. Defaults to true.
  */
trait ElementInput extends StObject {
  
  /**
    * Add a {@link pc.ElementComponent} to the internal list of ElementComponents that are being checked for input.
    * @param element - The ElementComponent.
    */
  def addElement(element: ElementComponent): Unit
  
  /**
    * Attach mouse and touch events to a DOM element.
    * @param domElement - The DOM element.
    */
  def attach(domElement: Element): Unit
  
  /**
    * Remove mouse and touch events from the DOM element that it is attached to.
    */
  def detach(): Unit
  
  /**
    * Remove a {@link pc.ElementComponent} from the internal list of ElementComponents that are being checked for input.
    * @param element - The ElementComponent.
    */
  def removeElement(element: ElementComponent): Unit
}
object ElementInput {
  
  @scala.inline
  def apply(
    addElement: ElementComponent => Unit,
    attach: Element => Unit,
    detach: () => Unit,
    removeElement: ElementComponent => Unit
  ): ElementInput = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction1(addElement), attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), removeElement = js.Any.fromFunction1(removeElement))
    __obj.asInstanceOf[ElementInput]
  }
  
  @scala.inline
  implicit class ElementInputMutableBuilder[Self <: ElementInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddElement(value: ElementComponent => Unit): Self = StObject.set(x, "addElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttach(value: Element => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveElement(value: ElementComponent => Unit): Self = StObject.set(x, "removeElement", js.Any.fromFunction1(value))
  }
}
