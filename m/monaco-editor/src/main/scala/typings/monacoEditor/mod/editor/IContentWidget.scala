package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContentWidget extends StObject {
  
  /**
    * Render this content widget in a location where it could overflow the editor's view dom node.
    */
  var allowEditorOverflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Get the dom node of the content widget.
    */
  def getDomNode(): HTMLElement
  
  /**
    * Get a unique identifier of the content widget.
    */
  def getId(): String
  
  /**
    * Get the placement of the content widget.
    * If null is returned, the content widget will be placed off screen.
    */
  def getPosition(): IContentWidgetPosition | Null
  
  var suppressMouseDown: js.UndefOr[Boolean] = js.undefined
}
object IContentWidget {
  
  inline def apply(
    getDomNode: () => HTMLElement,
    getId: () => String,
    getPosition: () => IContentWidgetPosition | Null
  ): IContentWidget = {
    val __obj = js.Dynamic.literal(getDomNode = js.Any.fromFunction0(getDomNode), getId = js.Any.fromFunction0(getId), getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[IContentWidget]
  }
  
  extension [Self <: IContentWidget](x: Self) {
    
    inline def setAllowEditorOverflow(value: Boolean): Self = StObject.set(x, "allowEditorOverflow", value.asInstanceOf[js.Any])
    
    inline def setAllowEditorOverflowUndefined: Self = StObject.set(x, "allowEditorOverflow", js.undefined)
    
    inline def setGetDomNode(value: () => HTMLElement): Self = StObject.set(x, "getDomNode", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => IContentWidgetPosition | Null): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setSuppressMouseDown(value: Boolean): Self = StObject.set(x, "suppressMouseDown", value.asInstanceOf[js.Any])
    
    inline def setSuppressMouseDownUndefined: Self = StObject.set(x, "suppressMouseDown", js.undefined)
  }
}
