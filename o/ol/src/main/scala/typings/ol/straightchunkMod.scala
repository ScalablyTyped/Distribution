package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object straightchunkMod {
  
  @JSImport("ol/geom/flat/straightchunk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchingChunk(maxAngle: Double, flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchingChunk")(maxAngle.asInstanceOf[js.Any], flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
