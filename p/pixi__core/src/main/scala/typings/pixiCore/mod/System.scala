package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "System")
@js.native
open class System protected ()
  extends StObject
     with ISystem {
  /**
    * @param renderer - Reference to Renderer
    */
  def this(renderer: Renderer) = this()
  
  /** Generic destroy methods to be overridden by the subclass */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /** Reference to the main renderer */
  var renderer: Renderer = js.native
}
