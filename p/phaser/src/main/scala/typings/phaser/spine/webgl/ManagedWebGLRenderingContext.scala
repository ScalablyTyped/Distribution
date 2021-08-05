package typings.phaser.spine.webgl

import typings.phaser.spine.Restorable
import typings.std.HTMLCanvasElement
import typings.std.OffscreenCanvas
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedWebGLRenderingContext extends StObject {
  
  def addRestorable(restorable: Restorable): Unit
  
  var canvas: HTMLCanvasElement | OffscreenCanvas
  
  var gl: WebGLRenderingContext
  
  def removeRestorable(restorable: Restorable): Unit
  
  /* private */ var restorables: js.Any
}
object ManagedWebGLRenderingContext {
  
  inline def apply(
    addRestorable: Restorable => Unit,
    canvas: HTMLCanvasElement | OffscreenCanvas,
    gl: WebGLRenderingContext,
    removeRestorable: Restorable => Unit,
    restorables: js.Any
  ): ManagedWebGLRenderingContext = {
    val __obj = js.Dynamic.literal(addRestorable = js.Any.fromFunction1(addRestorable), canvas = canvas.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], removeRestorable = js.Any.fromFunction1(removeRestorable), restorables = restorables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedWebGLRenderingContext]
  }
  
  extension [Self <: ManagedWebGLRenderingContext](x: Self) {
    
    inline def setAddRestorable(value: Restorable => Unit): Self = StObject.set(x, "addRestorable", js.Any.fromFunction1(value))
    
    inline def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setRemoveRestorable(value: Restorable => Unit): Self = StObject.set(x, "removeRestorable", js.Any.fromFunction1(value))
    
    inline def setRestorables(value: js.Any): Self = StObject.set(x, "restorables", value.asInstanceOf[js.Any])
  }
}
