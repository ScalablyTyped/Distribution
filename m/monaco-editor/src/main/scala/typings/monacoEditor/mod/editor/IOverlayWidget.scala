package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOverlayWidget extends StObject {
  
  /**
    * Get the dom node of the overlay widget.
    */
  def getDomNode(): HTMLElement
  
  /**
    * Get a unique identifier of the overlay widget.
    */
  def getId(): String
  
  /**
    * Get the placement of the overlay widget.
    * If null is returned, the overlay widget is responsible to place itself.
    */
  def getPosition(): IOverlayWidgetPosition | Null
}
object IOverlayWidget {
  
  inline def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IOverlayWidgetPosition | Null
  ): IOverlayWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[IOverlayWidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOverlayWidget] (val x: Self) extends AnyVal {
    
    inline def setGetDomNode(value: () => HTMLElement): Self = StObject.set(x, "getDomNode", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => IOverlayWidgetPosition | Null): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
  }
}
