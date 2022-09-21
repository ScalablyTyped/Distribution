package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRenderableObject extends StObject {
  
  /** After method for transform updates */
  def disableTempParent(parent: IRenderableContainer): Unit
  
  /** Before method for transform updates */
  def enableTempParent(): IRenderableContainer
  
  /** Object must have a parent container */
  var parent: IRenderableContainer
  
  /** Render object directly */
  def render(renderer: Renderer): Unit
  
  /** Update the transforms */
  def updateTransform(): Unit
}
object IRenderableObject {
  
  inline def apply(
    disableTempParent: IRenderableContainer => Unit,
    enableTempParent: () => IRenderableContainer,
    parent: IRenderableContainer,
    render: Renderer => Unit,
    updateTransform: () => Unit
  ): IRenderableObject = {
    val __obj = js.Dynamic.literal(disableTempParent = js.Any.fromFunction1(disableTempParent), enableTempParent = js.Any.fromFunction0(enableTempParent), parent = parent.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), updateTransform = js.Any.fromFunction0(updateTransform))
    __obj.asInstanceOf[IRenderableObject]
  }
  
  extension [Self <: IRenderableObject](x: Self) {
    
    inline def setDisableTempParent(value: IRenderableContainer => Unit): Self = StObject.set(x, "disableTempParent", js.Any.fromFunction1(value))
    
    inline def setEnableTempParent(value: () => IRenderableContainer): Self = StObject.set(x, "enableTempParent", js.Any.fromFunction0(value))
    
    inline def setParent(value: IRenderableContainer): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Renderer => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setUpdateTransform(value: () => Unit): Self = StObject.set(x, "updateTransform", js.Any.fromFunction0(value))
  }
}
