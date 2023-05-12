package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The graphics device manages the underlying graphics context. It is responsible for submitting
  * render state changes and graphics primitives to the hardware. A graphics device is tied to a
  * specific canvas HTML element. It is valid to have more than one canvas element per page and
  * create a new graphics device against each.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.GraphicsDevice")
@js.native
open class GraphicsDevice protected ()
  extends typings.playcanvas.mod.GraphicsDevice {
  def this(canvas: Any, options: Any) = this()
}
object GraphicsDevice {
  
  @JSGlobal("pc.GraphicsDevice")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("pc.GraphicsDevice.EVENT_RESIZE")
  @js.native
  def EVENT_RESIZE: String = js.native
  inline def EVENT_RESIZE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RESIZE")(x.asInstanceOf[js.Any])
}
