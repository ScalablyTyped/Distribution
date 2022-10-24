package typings.nivoVoronoi

import typings.nivoVoronoi.anon.Debug
import typings.nivoVoronoi.anon.Delaunay
import typings.nivoVoronoi.anon.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMeshMod {
  
  @JSImport("@nivo/voronoi/dist/types/computeMesh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeMesh(param0: Debug): Delaunay = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMesh")(param0.asInstanceOf[js.Any]).asInstanceOf[Delaunay]
  
  inline def computeMeshPoints[Datum](param0: Points[Datum]): js.Array[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMeshPoints")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  type NumberPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends number? K : never}[keyof T] */ js.Any
  
  type XYAccessor[Datum] = NumberPropertyNames[Datum] | (js.Function1[/* datum */ Datum, Double])
}
