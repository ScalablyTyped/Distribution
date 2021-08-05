package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System is a base class used for extending systems used by the {@link PIXI.Renderer}
  *
  * @see PIXI.Renderer#addSystem
  * @class
  * @memberof PIXI
  */
trait System extends StObject {
  
  /**
    * Generic destroy methods to be overridden by the subclass
    */
  def destroy(): Unit
  
  /**
    * The renderer this manager works for.
    *
    * @member {PIXI.Renderer} PIXI.System#renderer
    */
  var renderer: Renderer
}
object System {
  
  inline def apply(destroy: () => Unit, renderer: Renderer): System = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
  
  extension [Self <: System](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
