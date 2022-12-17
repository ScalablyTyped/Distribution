package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The forward renderer renders {@link Scene}s.
  *
  * @ignore
  */
@JSGlobal("pc.ForwardRenderer")
@js.native
open class ForwardRenderer protected ()
  extends typings.playcanvas.mod.ForwardRenderer {
  /**
    * Create a new ForwardRenderer instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device used by the renderer.
    * @hideconstructor
    */
  def this(graphicsDevice: typings.playcanvas.mod.GraphicsDevice) = this()
}
object ForwardRenderer {
  
  @JSGlobal("pc.ForwardRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("pc.ForwardRenderer.skipRenderAfter")
  @js.native
  def skipRenderAfter: Double = js.native
  inline def skipRenderAfter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipRenderAfter")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("pc.ForwardRenderer.skipRenderCamera")
  @js.native
  def skipRenderCamera: Any = js.native
  inline def skipRenderCamera_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipRenderCamera")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("pc.ForwardRenderer._skipRenderCounter")
  @js.native
  def skipRenderCounter: Double = js.native
  
  inline def skipRenderCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_skipRenderCounter")(x.asInstanceOf[js.Any])
}
