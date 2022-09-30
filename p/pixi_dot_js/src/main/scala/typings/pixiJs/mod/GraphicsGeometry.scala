package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "GraphicsGeometry")
@js.native
open class GraphicsGeometry ()
  extends typings.pixiGraphics.mod.GraphicsGeometry
/* static members */
object GraphicsGeometry {
  
  @JSImport("pixi.js", "GraphicsGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The maximum number of points to consider an object "batchable",
    * able to be batched by the renderer's batch system.
    \
    */
  @JSImport("pixi.js", "GraphicsGeometry.BATCHABLE_SIZE")
  @js.native
  def BATCHABLE_SIZE: Double = js.native
  inline def BATCHABLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCHABLE_SIZE")(x.asInstanceOf[js.Any])
}
