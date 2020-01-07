package typings.ol

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/textpath", JSImport.Namespace)
@js.native
object geomFlatTextpathMod extends js.Object {
  def drawTextOnPath(
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
    cache: StringDictionary[Double]
  ): js.Array[js.Array[_]] = js.native
}

