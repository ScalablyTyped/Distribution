package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatLinechunkMod {
  
  @JSImport("ol/geom/flat/linechunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lineChunk(
    chunkLength: Double,
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double
  ): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lineChunk")(chunkLength.asInstanceOf[js.Any], flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
}
