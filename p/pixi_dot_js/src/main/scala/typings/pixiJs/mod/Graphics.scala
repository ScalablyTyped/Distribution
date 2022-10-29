package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Graphics")
@js.native
/**
  * @param geometry - Geometry to use, if omitted will create a new GraphicsGeometry instance.
  */
open class Graphics ()
  extends typings.pixiGraphics.mod.Graphics {
  def this(geometry: typings.pixiGraphics.libGraphicsGeometryMod.GraphicsGeometry) = this()
}
/* static members */
object Graphics {
  
  @JSImport("pixi.js", "Graphics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Temporary point to use for containsPoint.
    * @private
    */
  @JSImport("pixi.js", "Graphics._TEMP_POINT")
  @js.native
  def _TEMP_POINT: typings.pixiCore.mod.Point = js.native
  inline def _TEMP_POINT_=(x: typings.pixiCore.mod.Point): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TEMP_POINT")(x.asInstanceOf[js.Any])
}
