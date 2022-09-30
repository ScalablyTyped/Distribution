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
  def this(geometry: typings.pixiGraphics.mod.GraphicsGeometry) = this()
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
  def _TEMP_POINT: typings.pixiMath.mod.Point = js.native
  inline def _TEMP_POINT_=(x: typings.pixiMath.mod.Point): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TEMP_POINT")(x.asInstanceOf[js.Any])
  
  /**
    * New rendering behavior for rounded rectangles: circular arcs instead of quadratic bezier curves.
    * In the next major release, we'll enable this by default.
    */
  @JSImport("pixi.js", "Graphics.nextRoundedRectBehavior")
  @js.native
  def nextRoundedRectBehavior: Boolean = js.native
  inline def nextRoundedRectBehavior_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextRoundedRectBehavior")(x.asInstanceOf[js.Any])
}
