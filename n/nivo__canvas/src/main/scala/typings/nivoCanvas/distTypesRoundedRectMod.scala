package typings.nivoCanvas

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoundedRectMod {
  
  @JSImport("@nivo/canvas/dist/types/roundedRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def roundedRect(ctx: CanvasRenderingContext2D, x: Double, y: Double, width: Double, height: Double, radius: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("roundedRect")(ctx.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
