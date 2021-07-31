package typings.pixiJs.mod

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
@JSImport("pixi.js", "System")
@js.native
class System protected ()
  extends StObject
     with typings.pixiJs.PIXI.System {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
  
  /**
    * Generic destroy methods to be overridden by the subclass
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The renderer this manager works for.
    *
    * @member {PIXI.Renderer} PIXI.System#renderer
    */
  /* CompleteClass */
  var renderer: typings.pixiJs.PIXI.Renderer = js.native
}
