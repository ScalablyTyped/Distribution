package typings.nivoVoronoi

import typings.d3Delaunay.mod.Delaunay.Point
import typings.d3Delaunay.mod.Voronoi
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMeshCanvasMod {
  
  @JSImport("@nivo/voronoi/dist/types/meshCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderVoronoiCellToCanvas(ctx: CanvasRenderingContext2D, voronoi: Voronoi[Point], index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderVoronoiCellToCanvas")(ctx.asInstanceOf[js.Any], voronoi.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderVoronoiToCanvas(ctx: CanvasRenderingContext2D, voronoi: Voronoi[Point]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderVoronoiToCanvas")(ctx.asInstanceOf[js.Any], voronoi.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
