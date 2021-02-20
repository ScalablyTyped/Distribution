package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System is a base class used for extending systems used by the {@link PIXI.Renderer}
  *
  * @see PIXI.Renderer#addSystem
  * @class
  * @memberof PIXI
  */
@js.native
trait System extends StObject {
  
  /**
    * Generic destroy methods to be overridden by the subclass
    */
  def destroy(): Unit = js.native
  
  /**
    * The renderer this manager works for.
    *
    * @member {PIXI.Renderer} PIXI.System#renderer
    */
  var renderer: Renderer = js.native
}
object System {
  
  @scala.inline
  def apply(destroy: () => Unit, renderer: Renderer): System = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[System]
  }
  
  @scala.inline
  implicit class SystemMutableBuilder[Self <: System] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
