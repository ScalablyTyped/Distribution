package typings.nivoAnnotations

import typings.nivoAnnotations.anon.Annotations
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("@nivo/annotations/dist/types/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderAnnotationsToCanvas[Datum](ctx: CanvasRenderingContext2D, hasAnnotationsTheme: Annotations[Datum]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderAnnotationsToCanvas")(ctx.asInstanceOf[js.Any], hasAnnotationsTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
