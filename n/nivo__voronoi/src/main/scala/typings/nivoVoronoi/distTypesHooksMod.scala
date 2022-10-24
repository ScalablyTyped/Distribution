package typings.nivoVoronoi

import typings.nivoVoronoi.anon.Data
import typings.nivoVoronoi.anon.Delaunay
import typings.nivoVoronoi.anon.Height
import typings.nivoVoronoi.anon.Voronoi
import typings.nivoVoronoi.distTypesTypesMod.VoronoiCustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/voronoi/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useVoronoi(param0: Data): Voronoi = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoi")(param0.asInstanceOf[js.Any]).asInstanceOf[Voronoi]
  
  inline def useVoronoiLayerContext(param0: VoronoiCustomLayerProps): VoronoiCustomLayerProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoiLayerContext")(param0.asInstanceOf[js.Any]).asInstanceOf[VoronoiCustomLayerProps]
  
  inline def useVoronoiMesh[Datum](param0: Height[Datum]): Delaunay = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoiMesh")(param0.asInstanceOf[js.Any]).asInstanceOf[Delaunay]
}
