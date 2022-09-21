package typings.nivoVoronoi

import typings.nivoVoronoi.anon.Data
import typings.nivoVoronoi.anon.Delaunay
import typings.nivoVoronoi.anon.Height
import typings.nivoVoronoi.anon.Voronoi
import typings.nivoVoronoi.typesMod.VoronoiCustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/voronoi/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useVoronoi(hasDataWidthHeightXDomainYDomain: Data): Voronoi = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoi")(hasDataWidthHeightXDomainYDomain.asInstanceOf[js.Any]).asInstanceOf[Voronoi]
  
  inline def useVoronoiLayerContext(hasPointsDelaunayVoronoi: VoronoiCustomLayerProps): VoronoiCustomLayerProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoiLayerContext")(hasPointsDelaunayVoronoi.asInstanceOf[js.Any]).asInstanceOf[VoronoiCustomLayerProps]
  
  inline def useVoronoiMesh[Datum](hasPointsXYWidthHeightDebug: Height[Datum]): Delaunay = ^.asInstanceOf[js.Dynamic].applyDynamic("useVoronoiMesh")(hasPointsXYWidthHeightDebug.asInstanceOf[js.Any]).asInstanceOf[Delaunay]
}
