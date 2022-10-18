package typings.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatTextpathMod {
  
  @JSImport("ol/geom/flat/textpath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawTextOnPath(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    text: String,
    startM: Double,
    maxAngle: Double,
    scale: Double,
    measureAndCacheTextWidth: js.Function3[/* p0 */ String, /* p1 */ String, /* p2 */ StringDictionary[Double], Double],
    font: String,
    cache: StringDictionary[Double],
    rotation: Double
  ): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTextOnPath")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], text.asInstanceOf[js.Any], startM.asInstanceOf[js.Any], maxAngle.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], measureAndCacheTextWidth.asInstanceOf[js.Any], font.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
}
